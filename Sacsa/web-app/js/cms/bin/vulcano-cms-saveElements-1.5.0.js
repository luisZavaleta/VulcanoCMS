function getSaveElement(structure, element, parentElement) {
	if (!!element) {
		return element // for collection
	}
	if (!!parentElement) {
		return (parentElement.find(structure.id)) // for elements inside collections
	}
	return $(structure.id) // for independent elements editando----->
}

/**
 * @param structure
 * @param id:
 *        Unique identifier for the web-page (a website might have many webpages)
 */
function saveCMS(structure, id, element, parentElement, index) {

	if (structure.storable) {
		saveVCMSElement(id, structure, element, parentElement, index)
	}

	if (!structure.childStructures) {
		return;
		alert("last")
	}

	if (!!structure.relocateChilds) {
		reloacateIndexes(structure.id, element, parentElement, index, structure.relocateChilds)
	}

	var childStructures = structure.childStructures

	$.each(childStructures, function(index, childStructure) { // normal

		// element becomes parent and parent becomes obsolete (so sad U_U)

		if (childStructure.collection) {

			var elements = null;

			if (!!element) {// ya antes creamos un elemento de JQuery, osea que ya
				// estámos en un
				// contexto relativo
				elements = $(element).find(childStructure.id)
			} else {// si es el primer collection entes de esto todos son elementos
				// independientes
				elements = $(childStructure.parent).find(childStructure.id)
			}

			$.each(elements, function(indexCE, childElement) { // for collections
				/*
				 * for collections first time, the parent is null 'cause the parent will be
				 * relative, we will get the closest element with the parent selector
				 */
				saveCMS(childStructure, id, $(childElement), null, indexCE)
			})

		} else {

			if (!!element) {
				saveCMS(childStructure, id, null, $(element))
			} else {
				saveCMS(childStructure, id, null, null)
			}

		}

	})

}

function saveBodyVCMS(id, structure, element, parentElement, index) {
	alert("not implemented yet")
}

function saveNavVCMS(id, structure, element, parentElement, index) {
	alert("not implemented yet")
}
/**
 * @param id
 * @param structure
 * @param element
 * @param parentElement
 * @param index
 */
function saveVCMSElement(id, structure, element, parentElement, index) {

	/** TEMPORAL HACKING checkForId TEMPORAL HACKING CHECK ONCE WE HAVE TIME* */

	var element = getSaveElement(structure, element, parentElement)

	if (!!element && element.hasClass("edited")) {

		var commonAttributeParams = {}
		commonAttributeParams.id = id

		commonAttributeParams.selector = structure.id
		commonAttributeParams.addIndex = structure.addIndex
		commonAttributeParams.addParent = structure.addParent
		commonAttributeParams.parent = structure.parent
		commonAttributeParams.type = structure.type

		commonAttributeParams.element = element
		commonAttributeParams.index = index

		commonAttributeParams.parentElement = parentElement
		commonAttributeParams.parentType = structure.parentType

		var data = saveElementInServer(commonAttributeParams, structure, data, element)

		// secondHalfSaveVCMSElement(structure, data, element)

	}

}

/*
 * no importa si se actualiza antes o después de que los otros elementos se hayn actualizado ya que
 * en caso de ser antes, a los elementos nuevos se cambiarán el index cuando se actualicen después y
 * si es después pues simplemente se estaría cambiando el index por el mismo número es decir
 * prácticamente no habría cambio alguno.
 * 
 * We won't send the selector, because we already know the selector, the index, the parent, etc,
 * that is stored in the database and we can retrieve that information from any of the elements
 * given
 */
function reloacateIndexes(idSelector, element, parentElement, index, relocateChilds) {

	var relocateParent = getCMSElement(idSelector, element, parentElement, index)

	if (relocateParent.hasClass("edited")) {

		$.each(relocateChilds, function(index, value) {

			var toBeRelocatedElements = relocateParent.find(value)

			toBeRelocatedElements = $.makeArray(toBeRelocatedElements)

			var returnedElements = $.map(toBeRelocatedElements, function(tbrElement, tbrIndex) {

				return {
					index : tbrIndex,
					elementId : $(tbrElement).attr("data-id")
				}
				// return [ tbrIndex, $(tbrElement).attr("data-id") ]

			})

			var data = {}
			data.id = JSON.stringify(returnedElements)

			$.post(getAbsolutePath("/CMSSave/relocate"), data).done(function(dataServer) {

				if (dataServer.errors && dataServer.errors.length > 0) {
					addError("Error al guardar el elemento" + element.attr("name"))
				} else {

				}

			}).fail(function() {
				var elementName = ""
				if (!!element.attr("name")) {
					elementName = element.attr("name")
				}
				addError("Error al guardar  el elemento " + elementName)
			})

		})
	}
}
