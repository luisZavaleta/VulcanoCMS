/**
 * @param id
 * @param selector
 * @param addIndex
 * @param addParent
 * @param parent
 * @param type
 * @param element
 * @param index
 * @param parentElement
 * @param parentType
 */

function saveElementInServer(params, structure, data, element) {// getVCMSCommonAttributes
	if (!!params.addParent) {
		var contCi = 0;
		checkForId(params, contCi, structure)
	} else {
		var data = getData(params)
		saveElementInServerHelper(structure, data, params.element)
	}

}

function saveElementInServerHelper(structure, data, element) { // secondHalfSaveVCMSElement

	if (!!structure.storeableAttributes) {

		$.each(structure.storeableAttributes, function(index, attribute) {
			switch (attribute) {
				case "src":
					data.src = element.attr("src")
					break;
				case "html":
					data.html = element.html()
					break;

				case "claseInList":
					$.each(structure.claseList, function(index, value) {

						if (element.hasClass(value)) {
							data.clase = value;
							return;
						}

					});

					break;
				default:
					throw ("Atribute " + attribute + " is unknown in method vulcano-cmx-saveElements.saveVCMSElement ")

			}

		})
	}

	if (!!structure.fixedAttributes) {

		$.each(structure.fixedAttributes, function(index, attribute) {

			data[attribute.name] = attribute.value

		})
	}

	$.post(getAbsolutePath("/CMSSave/save"), data).done(function(dataServer) {

		if (dataServer.errors && dataServer.errors.length > 0) {
			addError("Error al guardar el elemento" + element.attr("name"))
		} else {

			element.attr("data-id", dataServer.id)
			addMessage("info", element.attr("name") + "se guardó correctamente.")

		}

	}).fail(function() {
		addError("Error al guardar  el elemento " + element.attr("name"))
	})
}

function getData(params) {
	var data = {}
	if (!!params.element.attr("data-id")) {
		data.id = params.element.attr("data-id")
	}
	data.webpageId = params.id
	data.selector = params.selector
	if (!!params.addIndex) {

		data.index = params.index
	}
	data.type = params.type
	if (!!params.addParent) {
		data.parentType = params.parentType;
	}
	return data

}

function checkForId(params, contCi, structure) {

	var parentElement = params.parentElement

	/**
	 * TEMPORAL HACK BEGIN, WE HAVE TO RE-STRUCTURE EVERITHING HERE we should already have the
	 * element parent here *
	 */
	if (!parentElement && structure.addIndex && structure.addParent && !!params.element) {
		parentElement = $(params.element).closest(params.parent)
	}
	/** TEMPORAL HACK END, PLEASE, DO NOT FORGET IT * */

	var parentId = $(parentElement).attr("data-id")
	if (!!parentId) {
		var data = getData(params)
		data.parentId = parentId
		saveElementInServerHelper(structure, data, params.element)
		return;
	}

	if (contCi >= 100) {
		addError("No se pudo obtener el parent id del elemento-->");
		var data = getData(params)
		data.parentId = parentId
		data.parentId = -1
		saveElementInServerHelper(structure, data, params.element)
		return;
	}

	setTimeout(function() {
		checkForId(params, ++contCi, structure)

	}, 100);

}

function getCMSElement(selector, element, parentElement, index) {

	if (!!element) {
		return element
	} else if (!!parentElement) {
		if (!!index) {
			return $(parentElement).find(selector).eq(index) // Parent AND INDEX
		} else {
			return $(parentElement).find(selector) // Parent but NO INDEX
		}
	} else if (!!index) {
		return $(selector).eq(index) // Index but NO PARENT
	} else {
		return $(selector) // Neither index NOR Parent
	}

}

// getDeleteItem

