function getBottonGuardarHtml() {

	var html = ''
	html += '<div class="vulcano-cms guardar-webpage">';
	html += '<button type="button" style="width:100%;height:100%"  class="btn btn-danger">Guardar</button>';
	html += '</div>';

	return html

}

function getModalHtml() {

	var html = '';

	html += '<div id="vulcano-cms-modal" class="modal fade" tabindex="-1" data-width="auto" style="display: none;">';
	html += '	<div class="modal-body modal-body-vcms">Este texto se modificará de forma dinámica</div>';
	html += '	<div class="modal-footer">';
	html += '		<button type="button" data-dismiss="modal" class="btn btn-default">Cerrar</button>';
	html += '		<button type="button" class="btn btn-primary guardar-modal-vcms">Guardar</button>';
	html += '	</div>';
	html += '</div>';

	return html;

}

// Falta width, bitch

function generateHtmlImageEditor(params) {

	var html = ''

	html += '<div class="fileinput fileinput-new" data-provides="fileinput" style="max-width:100%">'
	html += '	<div class="fileinput-new thumbnail">'
	html += '		<img style="' + JSON.toCssString(params.css) + '" src="' + params.image + '" alt="..." />'
	html += '	</div>'
	html += '	<div class="fileinput-preview fileinput-exists thumbnail"  />'
	html += '	<div>'
	html += '		<span class="btn btn-default btn-file">'
	html += '			<span class="fileinput-new">Select image</span>'
	html += '			<span class="fileinput-exists">Change</span>'
	html += '			<input type="file" name="..." />'
	html += '		</span>'
	html += '		<a href="#" class="btn btn-default fileinput-exists" data-dismiss="fileinput">Remove</a>'
	html += '	</div>'
	html += '</div>'

	return html;
}

/**
 * @param css :
 *        MUST be a string with the css e.g. width:100px; height:200px
 * @returns {String}
 */
function getAddButton(css) {
	var html = ''
	html += '<div class="slider-add">'
	html += '<i class="icon-plus vicon-button btn-success"></i>'
	html += '</div>'
	return html

}

function getIconItem(params) {
	var html = ''
	html += '<i class="' + params.clazz + '" style="' + JSON.toCssString(params.css) + '"></i>'
	return html
}

/*
 * add repettitive parameter to a cuple of elements (parent, child) in a a structure json
 */
function fillParameters(parent, child) {

	child.parent = parent.id
	child.parentType = parent.type
	if (!parent.childIds) {
		parent.childIds = []
	}
	parent.childIds.push(child.id)
}

/* add repetitive parameters to the structure json */
function fillAllMisingParameters(structure) {
	if (!!structure.childStructures) {
		for ( var child in structure.childStructures) {
			fillParameters(structure, structure.childStructures[child])
			fillAllMisingParameters(structure.childStructures[child])
		}
	}
}

/*
 * Add attributes to a elements, used to when we put the same attributes to different many times
 */
function addAllAttributes(element, attributes) {
	$.each(attributes, function(indexAttr, attr) {
		element[attr.name] = attr.value
	})

}

var contentEditable = jQuery.extend(true, {},[ {
	name : "storable",
	value : true
}, {
	name : "storeableAttributes",
	value : [ "html" ]
}, {
	name : "customParameters",
	value : {
		"editable" : true
	}
} ])







var imageEditable = [ {
	name : "type",
	value : "Img"
}, {
	name : "storable",
	value : true
}, {
	name : "storeableAttributes",
	value : [ "src" ]
}, {
	name : "customParameters",
	value : {
		"redirect" : false,
		"event" : "click",
		"refreshImage" : true,
	}
} ]


