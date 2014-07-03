$(document).ready(function() {
	initCMS(siteConfig)
	initCMS(empleoConfig)
	console.log(JSON.stringify(empleoConfig))

});

var empleoConfig = {}

empleoConfig.id = "empleo"

var structure = {}
empleoConfig.structure = structure

structure.parent = "html"
structure.parentType = "Html"
structure.id = "body"
structure.type = "Body"
structure.storable = false // Indicates if will be stored in the DB
structure.skipModal = true

var empleosContainer = {}
structure.childStructures = [ empleosContainer ]

empleosContainer.id = ".sacsa-puestos-disponibles-container"
empleosContainer.type = "Div"
empleosContainer.storable = false

empleosContainer.addItem = {
	item : ".sacsa-empleo-item",
	clazz : "fa fa-plus-circle",
	customAddFunction : customAddItemAcordion,
	css : {
		"position" : "absolute",
		"font-size" : "47px",
		"right" : "30px",
		"top" : "15px",
		"color" : "#0000FF"
	}
}

empleosContainer.relocateChilds = [ ".sacsa-empleo-item" ]

var empleos = {}
empleosContainer.childStructures = [ empleos ]

empleos.id = ".sacsa-empleo-item"
empleos.type = "Div"
empleos.storable = true
empleos.collection = true
empleos.addIndex = true

empleos.deleteItem = {
	clazz : "fa fa-times-circle",
	min : 1,
	customDeleteFunction : customDeleteItemAcordion,
	css : {
		"position" : "absolute",
		"font-size" : "25px",
		"right" : "0",
		"top" : "0",
		"color" : "#FF0000"
	}
}

var empleoTitulo = {}
var empleoTexto = {}

empleos.childStructures = [ empleoTitulo, empleoTexto ]

empleoTitulo.id = ".sacsa-empleo-titulo"
empleoTitulo.type = "A"
empleoTitulo.addParent = true
addAllAttributes(empleoTitulo, contentEditable)

empleoTexto.id = ".sacsa-empleo-texto"
empleoTexto.type = "Div"
empleoTexto.addParent = true
addAllAttributes(empleoTexto, contentEditable)

fillAllMisingParameters(structure)

// accordion

function refreshAcordion() {

}

function customDeleteItemAcordion(tobeDeletedElement) {
	tobeDeletedElement.remove()
	$("#accordion").collapse()
}

function customAddItemAcordion(html, wrapper) {
	var tempDiff = new Date().getTime()

	console.log("wrapper")
	console.log(wrapper)
	// alert("nananana")
	html.find(".sacsa-empleo-titulo").attr("href", "#"+tempDiff)
	var txtDiv = html.find(".sacsa-empleo-texto").parent()
	
	txtDiv.attr("id", tempDiff)
	txtDiv.removeClass("in")
	txtDiv.addClass("collapse")
	wrapper.find("#accordion").append(html)
	$("#accordion").collapse()
}
