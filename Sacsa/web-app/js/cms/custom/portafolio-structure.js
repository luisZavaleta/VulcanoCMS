/**
 * @storable:Boolean - Indicates if the element should be stored in the data base.
 * @storeableAttributes:Array - Indicates the data that must be stored in the database, is
 *                            completely dependent of the type of the element. Optional, if not
 *                            presented we assume that we want to store all the storable attributes
 * @addSelector: Store selector in the database.
 * @addIndex: Store index in the database.
 * @addParent: Store parent in the database.
 */
// form-message
var portafolioStructure = {}

var idSite = window.location.pathname
idSite = idSite.split("admin/")
idSite = idSite[idSite.length - 1]

portafolioStructure.id = idSite

var structure = {}
portafolioStructure.structure = structure

structure.parent = "html"
structure.parentType = "Html"
structure.id = "body"
structure.type = "Body"
structure.storable = false // Indicates if will be stored in the DB
structure.skipModal = true

var childStructures = []
structure.childStructures = childStructures

/** ===================================BEGIN CARRUSEL=================================* */
var maquinarias = {}
childStructures.push(maquinarias)

maquinarias.id = "#portfolio-3 .container.portafolio"
maquinarias.type = "Div"
maquinarias.strotable = false

var item = {}
maquinarias.childStructures = [ item ]

maquinarias.addItem = {
	custom : true,
	item : ".sacsa-maquinaria-item",
	clazz : "fa fa-plus-circle",
	customAddFunction : customIsotopeAdd,
	css : {
		"position" : "absolute",
		"font-size" : "47px",
		"right" : "10px",
		"top" : "0",
		"color" : "#0000FF"
	}
}

maquinarias.relocateChilds = [ ".sacsa-maquinaria-item" ]

item.id = ".sacsa-maquinaria-item"
item.type = "Div"
item.storable = true
item.collection = true
item.addIndex = true
item.storeableAttributes = [ "claseInList" ]
item.claseList = [ "autos", "tractores", "maquinaria", "otras" ]

item.deleteItem = {
	custom : true,
	clazz : "fa fa-times-circle",
	min : 1,
	customDeleteFunction : customIsotopeDelete,
	css : {
		"position" : "absolute",
		"font-size" : "35px",
		"right" : "0",
		"top" : "0",
		"color" : "#FF0000"
	}
}

var image = {}
var title = {}
var text = {}

item.childStructures = [ image, title, text ]

image.id = ".sacsa-maquinaria-image"
addAllAttributes(image, jQuery.extend(true, {}, imageEditable))
image.addParent = true

/*image.customParameters.css = {
	height : '100%'
}*/

image.fixedAttributes = [ {
	"name" : "relativePath",
	"value" : false
} ]

image.customParameters.modalWidth = 330
image.customParameters.modalHeight = 220

title.id = ".sacsa-maquinaria-titulo"
title.type = "H5"
title.addParent = true
addAllAttributes(title, contentEditable)

text.id = ".sacsa-maquinaria-texto"
text.type = "P"
text.addParent = true
addAllAttributes(text, contentEditable)



fillAllMisingParameters(structure)

function customIsotopeAdd(elementTobeAdd) {

	elementTobeAdd.removeClass("autos tractores maquinaria otras")
	var category = $("li.active .sacsa-portafolio-category").attr("data-filter")

	if (category == "*" || !category) {
		category = "otras"
	} else {
		category = category.substring(1, category.length);
	}

	elementTobeAdd.addClass(category)

	var $container = $('#isotope-portfolio-container');

	$container.isotope('insert', $(elementTobeAdd));

	$container.isotope('reLayout');
}

function customIsotopeDelete(elementToBeDeleted) {

	// $container.html('');
	// var toRemove = $container.data('isotope').$filteredAtoms;
	var $container = $('#isotope-portfolio-container');
	$container.isotope('remove', elementToBeDeleted);

}

