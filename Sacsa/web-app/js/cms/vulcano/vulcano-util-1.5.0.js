var debug = false
var verbose = false

function exists(object) {
	if (object != null && object != undefined) {

		if (jQuery.isFunction(object)) {
			return true
		}

		if (object.length != undefined && object.length <= 0) {
			return false
		}
		return true
	}
	return false

}

function empty(object) {
	if (object != null && object != undefined && object != "") {
		if (object.length != undefined && object.length <= 0) {
			return true
		}
		return false
	}
	return true
}

function objectOrEmptyString(object) {
	if (exists(object)) {
		return object
	} else {
		return ""
	}
}

function objectOrNull(object) {
	if (empty(object)) {
		return null
	} else {
		return object
	}
}

function objectOrDefault(object, defaultObject) {
	if (exists(object)) {
		return object
	} else {
		return defaultObject
	}
}

function hasEmptyElements(objColletion) {

	for ( var idx in objColletion) {
		if (empty(objColletion[idx])) {
			return true
		}
	}

	return false

}

function allEmpty(objColletion) {

	for ( var idx in objColletion) {
		if (!empty(objColletion[idx])) {
			return false
		}
	}

	return true

}

function rowsSize(tableSelector) {
	return $(tableSelector + ' tr').length
}

Object.byString = function(o, s) {
	s = s.replace(/\[(\w+)\]/g, '.$1'); // convert indexes to properties
	s = s.replace(/^\./, ''); // strip leading dot
	var a = s.split('.');
	while (a.length) {
		var n = a.shift();
		if (n in o) {
			o = o[n];
		} else {
			return;
		}
	}
	return o;
}

function addValToParameter(val, paramName, params, defaultValue) {

	if (exists(defaultValue) && val.trim() == "") {
		val = defaultValue
	}

	if (exists(val)) {
		params[paramName] = val
	}

}

function jsonToHarcodedParams(jsonObject) {

	var retParam = "?"

	for ( var idx in jsonObject) {

		if (!empty(jsonObject[idx])) {

			retParam += idx
			retParam += "="
			retParam += jsonObject[idx]
			retParam += "&"
		}

	}

	return retParam

}

function getRelativeUrlInIndex(url, alwaysSubpage) {

	if (alwaysSubpage == true) {
		return "../" + url
	}

	if ((location.pathname).indexOf("index", (location.pathname).lastIndexOf("/")) == -1) {

		return url

	} else {

		return "../" + url
	}

}

function sumOrNull(a, b) {
	if ($.isNumeric(a) && $.isNumeric(a)) {
		return (parseInt(a) + parseInt(b));
	} else {
		return null;
	}
}

function sumOrFirst(a, b) {
	if ($.isNumeric(a) && $.isNumeric(a)) {
		return (parseInt(a) + parseInt(b));
	} else {
		return a;
	}
}

function restOrNull(a, b) {
	if ($.isNumeric(a) && $.isNumeric(a)) {
		return (parseInt(a) - parseInt(b));
	} else {
		return null;
	}
}

function multiplyOrNull(a, b) {
	if ($.isNumeric(a) && $.isNumeric(a)) {
		return (parseInt(a) * parseInt(b));
	} else {
		return null;
	}
}

function numericOrMinusOne(a) {
	if ($.isNumeric(a)) {
		return parseInt(a)
	} else {
		return -1
	}
}

function numericOrDefault(a, defaultValue) {
	if ($.isNumeric(a)) {
		return parseInt(a)
	} else {
		return defaultValue
	}
}

/*
 * type = //see anexo
 */

/*
 * @param type: {html, val or any attribute} // see ANEXO 1 @param container: selector of the
 * container in which the element will be searched @param selector: selector of the element to be
 * searched
 */

/**
 * @param type:
 *        {val || html || text or any attribute name}
 * @param container:
 *        container selector or container element
 * @param selector:
 *        element selector
 * @param map =
 *        {true || false} default false
 * @DEPRECATED BECAUSE I DON'T FUCKING UNDESTAND WHAT I DID AND I DIDN'T DOCUMENTED IT. use
 *             getDataFromWebPage Instead
 */
function getValueHtmlOrAttribute(params) {
	if (params.map) {
		return getDataFromDOMElementList(params)
	} else {
		return;

		getDataFromDOMElement(params)
	}
}

/**
 * Return always an array could be one item eempty or more, bacause that the fucking way jquery
 * works.
 * 
 * @description: Get data from a HTML Page, the kind of data retrieved is defined by the type
 *               parameter.
 * @param type:
 *        {val || html || text or any attribute name}
 * @param containerSelector
 * @param itemSelector
 */

function getDataFromWebPage(params) {

	var domElements;

	if (empty(params.containerSelector)) {
		domElements = $(params.itemSelector)
	} else {
		domElements = $(params.containerSelector).find(params.itemSelector)
	}

	// var elements = params.container.find(params.selector)

	switch (params.type) {
		case "val":
			return getAllValues(domElements)
			break;
		case "html":
			return getAllHtml(domElements)
			break;
		case "text":
			return getAllTexts(domElements)
			break;
		default:
			return getAllAttr(domElements, params.type)
			break;
	}

}

/**
 * @param json:
 *        json used to store data
 * @param attrName:
 *        example: json.attrName = valorObtenido
 * @param type:
 *        {val || html || text or any attribute name}
 * @param container
 * @param selector
 * @param list:
 *        {true || false}, define if we'll retrieve a single element or a list of elements
 */

function saveDataIfExists(params) {

	if (params.list == true) {

		var data = getDataFromDOMElementList(params)

		if (!empty(data) && data.length > 0) {
			params.json[params.attrName] = data
		}

	} else {

		var data = getDataFromDOMElement(params)

		if (!empty(data)) {
			params.json[params.attrName] = data
		}
	}
}

/**
 * @param type: =
 *        {val | html | text | any attibute name |}
 * @param container:
 * @param selector:
 */

function getDataFromDOMElement(params) {

	var wrapper;

	if (empty(params.container)) {
		wrapper = $(params.selector)
	} else {
		wrapper = $(params.container).find(params.selector)
	}

	switch (params.type) {
		case "val":
			return $.trim(wrapper.val())
			break;
		case "html":
			return $.trim(wrapper.html())
			break;
		case "text":
			return $.trim(wrapper.text())
			break;
		default:
			return $.trim(wrapper.attr(params.type))
			break;

	}

}

function getDataFromDOMElementList(params) {

	var wrapper;

	if (empty(params.container)) {
		wrapper = $(params.selector)
	} else {
		wrapper = $(params.container).find(params.selector)
	}

	// var elements = params.container.find(params.selector)

	switch (params.type) {
		case "val":
			return getAllValues(wrapper)
			break;
		case "html":
			return getAllHtml(wrapper)
			break;
		case "text":
			return getAllTexts(wrapper)
			break;
		default:
			return getAllAttr(wrapper, params.type)
			break;

	}

}

/* @Deprecated use listOfObjectsOrEmptyStrings */
function getAllValues() {

	var retArr = jQuery.map(elements, function(item, index) {
		return objectOrEmptyString($(item).val())
	})

	return retArr

}

/*
 * get an array and check every element to see if it have a valid value, if it doen't substituted it
 * with a empty string
 */
function listOfObjectsOrEmptyStrings() {

	var retArr = jQuery.map(elements, function(item, index) {
		return objectOrEmptyString($(item).val())
	})
	return retArr

}

function getAllHtml(elements) {

	var retArr = jQuery.map(elements, function(item, index) {
		return objectOrEmptyString($(item).html())
	})

	return retArr

}

function getAllTexts(elements) {

	var retArr = jQuery.map(elements, function(item, index) {
		return objectOrEmptyString($(item).text())
	})

	return retArr

}

function getAllAttr(elements, type) {

	var retArr = jQuery.map(elements, function(item, index) {
	
		return objectOrEmptyString($(item).attr(type))
	})

	return retArr

}

function setValueOrAttribute(type, containerx, selector, value) {

	var container = null

	if (containerx instanceof jQuery) {
		container = containerx
	} else {
		container = $(containerx)
	}

	if (type.trim() == "val") {
		return objectOrEmptyString($(container).find(selector).val(value))
	} else if (type.trim() == "html") {
		return objectOrEmptyString($(container).find(selector).html(value))
	} else {
		return objectOrEmptyString($(container).find(selector).attr(type, value))
	}
}

/*
 * FORMAT EXAMPLE: var dParams = []
 * 
 * dParams["hereda"] ={"selector": ".hereda", "value": "html"} dParams["nombre"] ={"selector":
 * ".hereda", "value": "val"} dParams["id"] ={"selector": ".hereda", "value": "val"} dParams["foto"]
 * ={"selector": ".hereda", "value": "val"}
 * 
 */

function getDataFromHtml(jobject, thiz) {

	if (empty(thiz)) {
		thiz = $("body")
	}

	var data = {}

	for ( var key in jobject) {
		data[key] = valueOrAttribute(jobject[key].value, jobject[key].selector, thiz)
	}

	return data
}

function setDataToHtml(jobject, thiz) {

	if (empty(thiz)) {
		thiz = $("body")
	}

	var data = {}

	for ( var key in jobject) {
		data[key] = valueOrAttribute(jobject[key].value, jobject[key].selector, thiz, jobject[key].val)
	}

}

/*
 * var params1 = {} params.fromType = "val" params.fromContainer = ".testData.from"
 * params.fromSelector = ".inputFrom" params.toType = "val" params.toContainer = ".testData.to"
 * params.toSelector = ".inputTo"
 */

function transferData(params) {

	var value = getValueHtmlOrAttribute(params.fromType, params.fromContainer, params.fromSelector)

	if (debug) {
		console.log("transferData BEGIN")
		console.log(params.fromType)
		console.log(params.fromContainer)
		console.log("selector xxx--->" + params.fromSelector)
		console.log(value.substring(0, 100))
		console.log("transferData END")

	}

	if (!(params.blank == false && empty(value))) {
		setValueOrAttribute(params.toType, params.toContainer, params.toSelector, value)
	}

	return value
}

/*
 * First list must be the list in which we're looking for, list2 must contain the values that we're
 * looking
 */
function getRepeatedValues(list1, list2) {
	var lookup = {};
	var vals = {}
	vals.repeated = []
	vals.notRepeated = []

	for ( var j in list2) {
		lookup[list2[j]] = list2[j];
	}

	for ( var i in list1) {
		if (typeof lookup[list1[i]] != 'undefined') {
			vals.repeated.push(list1[i])
		} else {
			vals.notRepeated.push(list1[i])
		}
	}

	return vals;
}

function getRepeatedValuesInOneList(list1, list2) {
	var lookup = {};
	var vals = []

	for ( var j in list2) {
		lookup[list2[j]] = list2[j];
	}

	for ( var i in list1) {
		if (typeof lookup[list1[i]] != 'undefined') {
			vals.push({
				"value" : list1[i],
				"repeated" : true
			})
		} else {
			vals.push({
				"value" : list1[i],
				"repeated" : false
			})
		}
	}

	return vals;
}

function sortArrayNumber(array) {

	array.sort(function(a, b) {
		return a - b
	});

	return array

}

function deleteArrayDuplicates(array) {

	if (array.length < 2) {
		return array
	}

	var arrTemp = array[0]

	var noDuplicatesArray = []

	noDuplicatesArray.push(array[0])

	for ( var i = 1; i < array.length; i++) {

		if (arrTemp != array[i]) {
			noDuplicatesArray.push(array[i])
		}
		arrTemp = array[i]

	}

	return noDuplicatesArray

}

function removeTr(params) {

	$(params.innerTrSelector).unbind()
	$(params.innerTrSelector).on("click", function() {
		$(this).parents("tr").remove()

		if (exists(params.executeFunction)) {
			params.executeFunction()
		}
	})

}

// =====================NOT IN MAIN FILE BEGIN==========================

function appendIfNotExists(selector, itemToAppend) {

	var html = $(selector).html()
	html = safeTrim(html)

	if (html.indexOf(itemToAppend) != (html.length - itemToAppend.length)) {
		$(selector).html(html + itemToAppend)
	}
}

/* return empty string or default value */
function safeTrim(value, defaultValue) {
	if (exists(value)) {
		return value.trim();
	} else {
		if (exists(defaultValue)) {
			return defaultValue;
		} else {
			return "";
		}
	}
}

/**
 * @param element:
 *        json with element data or the selector
 * @param containerSelector:
 *        outermost element to be deleted
 * @param event
 *        default click
 * @param onFinish
 */

function removeElement(params) {

	var event = objectOrDefault(params.event, "click")
	var elementParams = objectOrDefault(params.element, ".icon-remove")
	var containerSelector = objectOrDefault(params.containerSelector, "li")

	var element = getElements(elementParams)

	element = $(params.containerSelector).find(element)

	$(element).unbind(event);
	$(element).on(event, function() {

		var removeOuterMostElement = $(this).closest(params.containerSelector)

		if (exists(params.onFinish)) {
			params.onFinish(removeOuterMostElement)
		}

		(removeOuterMostElement).remove()

	})

}

/**
 * @description: remove a parent element given the father
 * @param inner:
 *        inner element to be deleted
 * @param outter:
 *        selector for the outermost element to be deleted
 * @param onFinish:
 *        function to be executed once the element is removed
 */

function simpleRemoveElement(params) {

	var removableElement = $(params.inner).closest(params.outter)
	removableElement.remove()

	if (exists(params.onFinish)) {
		params.onFinish()
	}

}

function removeLi(removeIconSelector) {

	$(removeIconSelector).unbind("click")
	$(removeIconSelector).on("click", function() {
		$(this).closest("li").remove()
	})
}

function preventLinkRedirect(selector) {

	if (!exists(selector)) {
		selector = "a"
	}

	$(selector).unbind()
	$(selector).on("click", function(event) {
		event.preventDefault();
	})
}

function getLinkTextElement(element, classSelector) {

	if (empty(classSelector)) {

		if (element.is("a")) {
			return element
		} else {
			return element.find("a") // not tested

		}

	} else {
		return element.find("." + classSelector)
	}
}

/**
 * @param containerSelector
 * @param containerIndex
 * @param selector
 * @param selectorIndex
 *        Can send a string as parameter and the function use it as selector
 * @url http://jsfiddle.net/luisZavaleta/a23kH/1/
 */
function getElements(params) {
	var container;
	if (jQuery.type(params) == "string") {
		container = $(params)
	} else {
		if (isValidIndex(params.selectorIndex)) {
			switch (elementStatus(params.containerSelector)) {
				case "undefined":
					// index yes, container no
					var elements = $(params.selector)
					return elements[params.selectorIndex]
					break;
				case "exists":
					// index yes, container, yes
					if (isValidIndex(params.containerIndex)) {
						elements = $(params.containerSelector + ":nth(" + params.containerIndex + ")")
						elements = elements.find(params.selector + ":nth(" + params.selectorIndex + ")")
						return elements

					} else {
						var elements = $(params.containerSelector).find(params.selector)
						return elements[params.selectorIndex]
					}
					break;
				case "empty":
					// index yes, container empty
					return null
					break;
			}
		} else {
			switch (elementStatus(params.containerSelector)) {
				case "undefined":
					// index no, container no
					return $(params.selector)
					break;
				case "exists":
					// index no, container yes
					if (isValidIndex(params.containerIndex)) {
						return $(params.containerSelector + ":nth(" + params.containerIndex + ")").find(params.selector)
					} else {
						return $(params.containerSelector).find(params.selector)
					}
					break;
				case "empty":
					// index no, container empty
					return null
					break;
			}
		}
	}
	return container;
}

/**
 * Verify if the value given exists and is a integer (throw an error if it exists but it's not an
 * integer)
 * 
 * @param index
 * @returns
 */

function isValidIndex(index) {
	if (index == undefined) {
		return false
	} else {
		if (isInt(index)) {
			return true
		} else {

			if (jQuery.type(index) == "string") {
				index = parseInt(index)
				if (isNaN(index)) {
					throw "index-like value exists but it is not a integer"
				} else {

					return isValidIndex(index)

				}

			} else {
				throw "index-like value exists but it is not a integer"
			}
		}

	}
}

/**
 * Posibles states: "undefined", "empty", "exists"
 */

function elementStatus(element) {

	if (element == undefined) {
		return "undefined"
	} else if (exists(element)) {
		return "exists"
	} else {
		return "empty"

	}

}

/**
 * @param containerSelector
 * @param containerIndex
 * @param selector
 * @param subelement
 */
function getSubElements(params) {
	var container;
	if (exists(params.containerSelector)) {
		alert("not tested, none")
		container = $(containerSelector).find(params.selector)
		if (exists(params.containerIndex)) {
			container = container[parseInt(params.containerIndex)]
		}
	} else {
		container = $(params.selector)
		if (exists(params.containerIndex)) {
			alert("not tested")
			container = container[parseInt(params.containerIndex)]
		}
	}
	return container;
}

/**
 * this motherfucker function give me the "empty" space in a div...
 * 
 * @param outerSelector
 * @param innerSelectorsArray
 * @param
 */
function restHeight(params) {
	var usedWidth = 0;

	var outerElement = $(params.outerSelector)

	$.each(params.innerSelectorsArray, function(index, value) {

		usedWidth += (outerElement.find(value)).outerHeight()
	})

	return (outerElement.height() - usedWidth)

}

/**
 * Used to get a json object no mater
 */
function safeParseJson(json) {

	if (json instanceof String) {
		json = $.parseJSON(json);
	}

	return json

}

function numericOrZero(a) {
	if ($.isNumeric(a)) {
		return parseInt(a)
	} else {
		return 0
	}
}

/**
 * @param elements
 * @param container:
 *        Used as pivot to add the new element, default elements itselves
 * @param html
 * @param event:
 *        //default click
 * @param insertPosition:
 *        //default before after or before
 * @param elementEvents
 * @param triggerInput =
 *        {true | false}
 */

function addElement(params) {


	var event = objectOrDefault(params.event, "click")
	var elements = getElements(params.elements)



	if (!empty(params.container)) {
		elements = $(params.container).find(elements)
	}

	$(elements).unbind(event)
	$(elements).on(event, function(evx) {

	
		var containerx = getContainerElement(this, params.container)
		

		switch (params.insertPosition) {

			case "after":
				$(containerx).after(params.html)
				break;
			case "before":
			default:
				$(containerx).before(params.html)

		}

		if (exists(params.elementEvents)) {
			params.elementEvents(this)
		}

		if (params.triggerInput) {
			var tiparams = {}
			tiparams.selector = this

			triggerInput(tiparams)
		}

	})

}

/**
 * @DEPRECATED use getContainerElement2 (there is no getContainerElement2 dumbass)
 */
function getContainerElement(element, container) {
	if (empty(container)) {
		return element
	} else {
		return ($(element).closest(container))
	}
}

function markEditedElements() {

	$(document).on("input", "*:not(edited)", function(event) {
		$(this).addClass("edited")
		$(this).unbind("input")

	})

}

function isInt(n) {
	return +n === n && !(n % 1);
}

function isFloat(n) {
	return +n === n;
}

function assert(condition, message) {
	if (!condition) {
		throw message || "Assertion failed";
	}
}

function triggerInput(elementParams) {

	var elmnt = getElements(elementParams)
	$(elmnt).trigger("input")

}

/**
 * IMPORTANT!!!!: this function asume that you have a hidden input element with the base url; in
 * grails would be something like this: <input id="baseURL" type="hidden" value ="${resource()}"> I
 * know, I'm so fucking lazy
 */
function getBaseURL() {

	return $("#baseURL").val()

}

/**
 * IMPORTANT!!!!: Read getBaseURL() comment
 */
function getAbsolutePath(relative) {
	return getBaseURL() + relative
}

/* Kind of extending jquery on function */
function onx(event, selector, funcion) {
	switch (event) {
		case "enter":
			$(selector).keyup(function(e) {
				if (e.keyCode == 13) {
					funcion(this)
				}
			});
			break;
	}
}

/* Remove empty elements in a list */

function removeEmptyElemetsInList(lista) {

	var retArr = jQuery.map(lista, function(item, index) {

		if (empty(item)) {
			return null
		} else {
			return item
		}

	})

	return retArr

}

/**
 * Fake that the element had been modified
 */

function touch(selector) {
	$(selector).trigger("input")
}

// added 22 Marzo 2014
String.prototype.contains = function(it) {
	return this.indexOf(it) != -1;
};

// error management, use webStorage, only supported in Internet Explorer 8+, Firefox, Opera, Chrome,
// and Safari.

// added Abril 20

function addError(error) {
	if (!!error) {
		var errorsInSession;
		if (!!sessionStorage.errors) {
			errorsInSession = JSON.parse(sessionStorage.errors)
		} else {
			errorsInSession = []
		}

		if (!(errorsInSession instanceof Array)) {
			errorsInSession = []
		}

		errorsInSession.push(error)
		sessionStorage.errors = JSON.stringify(errorsInSession)

	}

}

function getErrors() {

	var errorsInSession;
	if (!!sessionStorage.errors) {
		return JSON.parse(sessionStorage.errors)
	} else {
		return null
	}

}

function cleanErrorMessages() {
	sessionStorage.errors = null
}

String.prototype.replaceAll = function(s, r) {
	return this.split(s).join(r)
}

String.prototype.fixTildes = function() {

	var str = this

	alert(str)
	str = str.replaceAll("á", "\u00e1")

	str = str.replaceAll("é", "\u00e9")
	str = str.replaceAll("í", "\u00ed")
	str = str.replaceAll("ó", "\u00f3")
	str = str.replaceAll("ú", "\u00fa")
	str = str.replaceAll("Á", "\u00c1")
	str = str.replaceAll("É", "\u00c9")
	str = str.replaceAll("Í", "\u00cd")
	str = str.replaceAll("Ó", "\u00d3")
	str = str.replaceAll("Ú", "\u00da")
	str = str.replaceAll("ñ", "\u00f1")
	str = str.replaceAll("Ñ", "\u00d1")
	alert(str)
	return str
}

// Added 23 de Marzo 2014

/**
 * IMPORTANT!!!!: this function asume that you have a hidden alert message; for example: <div
 * class="alert alert-warning fade in vulcano-alert"> <button class="close" aria-hidden="true"
 * data-dismiss="alert" type="button">×</button> <span class="message"> <strong>Holy guacamole!</strong>
 * </span> </div> Also that you're usinf twitter bootstrap 2
 * 
 * @param type:
 *        can be success, info, warning or danger
 */

function showMessage(message, type) {

	var alertDiv = $(".vulcano-alert")
	alertDiv.removeClass("alert-success alert-info alert-warning alert-danger")

	switch (type) {
		case "success":
			alertDiv.addClass("alert-success")
			break;
		case "info":
			alertDiv.addClass("alert-info")
			break;
		case "warning":
			alertDiv.addClass("alert-warning")
			break;
		case "danger":
			alertDiv.addClass("alert-danger")
			break;
		default:
			alertDiv.addClass("alert-info")

	}

	alertDiv.find(".message").html(message)

	$(".vulcano-alert").css("display", "block")

}

function closeMessage() {
	$(".vulcano-alert").css("display", "none")

}

// Added 24 de Marzo 2014

function getDateSubstracionInMinutes(date1, date2) {

	// Check for common problems like passing a String with a number instead of a Long

	if (!(date1 instanceof Date)) {
		date1 = new Date(date1)
	}

	if (!(date2 instanceof Date)) {
		date2 = new Date(date2)
	}

	if (date1 instanceof Date && date2 instanceof Date) {

		var dateMilis = Math.abs(date1 - date2);

		return (dateMilis / 1000 / 60)

	} else {
		return null
	}

}

function changeSelectedByValue(selector, value) {

	$(selector + ' option:contains("' + value + '")').prop('selected', true);

	// chosen hack

	if (!!$(".chosen-single")) {
		$(".chosen-single span").html(value)
	}

}

// Added Marzo 26 2014

/**
 * Used for other kind os messages beside errors that want to be stored in the html5 session
 * addMessage("errors", message) = addError()
 */
function addMessage(type, message) {
	if (!!message) {
		var messageInSession;
		if (!!sessionStorage[type]) {
			messageInSession = JSON.parse(sessionStorage[type])
		} else {
			messageInSession = []
		}

		if (!(messageInSession instanceof Array)) {
			messageInSession = []
		}

		messageInSession.push(message)
		sessionStorage[type] = JSON.stringify(messageInSession)

	}

}

// Added Marzo 27 2014

function getHtmlElement(selector, index, parent) {



	if (!!index && !!parent) {
		return ($(parent).find(selector)).eq(index)
	}

	if (!!index) {
		return $(selector).eq(index)
	}

	if (!!parent) {
		return $(parent).find(selector)
	}

	return $(selector)

}

// Added Mayo 26 2014
/*
 * input also works with contenteditable=true
 */
function setEqualHeight(selector, triggerOnInput, triggerOnResize) {
	var elements = $(selector)
	elements.css("height", "auto")
	var max = Number.NEGATIVE_INFINITY;
	$.each(elements, function(index, item) {
		if ($(item).height() > max) {
			max = $(item).height()
		}
	})
	$(selector).css("height", max + "px")

	if (!!triggerOnInput) {
		$(document).on("input", selector, function() {
			setEqualHeight(selector, false, false)

		})
	}

	if (!!triggerOnResize) {
		$(window).resize(function() {
			setEqualHeight(selector, false, false)
		})
	}
}

// Added Mayo 29 2014

JSON.toCssString = function(jsonObject) {
	var cssString = ""

	for (variable in jsonObject) {
		if (jsonObject.hasOwnProperty(variable)) {
			cssString += variable + ":" + jsonObject[variable] + ";"
		}
	}
	return cssString
}

// Added Mayo 30 2014 http://stackoverflow.com/a/6416527/597786
/*
 * (function($) { $.fn.getStyleObject = function() { var dom = this.get(0); var style; var returns =
 * {}; if (window.getComputedStyle) { var camelize = function(a, b) { return b.toUpperCase(); };
 * style = window.getComputedStyle(dom, null); for ( var i = 0, l = style.length; i < l; i++) { var
 * prop = style[i]; var camel = prop.replace(/\-([a-z])/g, camelize); var val =
 * style.getPropertyValue(prop); returns[camel] = val; } ; return returns; } ; if (style =
 * dom.currentStyle) { for ( var prop in style) { returns[prop] = style[prop]; } ; return returns; } ;
 * return this.css(); } })(jQuery);
 *  // var styles = $(".hola").getStyleObject();
 */