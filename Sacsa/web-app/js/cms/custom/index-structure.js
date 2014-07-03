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
var saveButton = {}
saveButton.html = getBottonGuardarHtml()

var css = []
saveButton.css = {
	'z-index' : '1040',
	'top' : '30px',
	'right' : '10px',
	'width' : '80px',
	'height' : '40px',
	'position' : 'fixed'
}

var siteConfig = {}
siteConfig.id = "index"
siteConfig.saveButton = saveButton

var structure = {}
siteConfig.structure = structure

structure.parent = "html"
structure.parentType = "Html"
structure.id = "body"
structure.type = "Body"
structure.storable = false // Indicates if will be stored in the DB
structure.relocateChilds = [ ".sacsa-clients-logo" ]

var childStructures = []
structure.childStructures = childStructures

/** ===================================BEGIN NAV-BAR=================================* */
var navbar = {}
childStructures.push(navbar)

navbar.type = "Nav"
navbar.storable = false
navbar.id = ".navbar-sacsa"
var navbarChildStructures = []
navbar.childStructures = navbarChildStructures

var logo = {}
var titulo1 = {}
var titulo2 = {}
var titulo3 = {}
var inicio = {}
var servicios = {}
var terrestres = {}
var hidraulicos = {}
var comerciales = {}
var subcontratacion = {}
var maquinaria = {}
var nosotros = {}
var contacto = {}
var empleo = {}

navbarChildStructures.push(logo)
navbarChildStructures.push(titulo1)
navbarChildStructures.push(titulo2)
navbarChildStructures.push(titulo3)
navbarChildStructures.push(inicio)
navbarChildStructures.push(servicios)
navbarChildStructures.push(terrestres)
navbarChildStructures.push(hidraulicos)
navbarChildStructures.push(comerciales)
navbarChildStructures.push(subcontratacion)
navbarChildStructures.push(maquinaria)
navbarChildStructures.push(nosotros)
navbarChildStructures.push(contacto)
navbarChildStructures.push(empleo)

// BEGIN LOGO
logo.type = "Img"
logo.storable = true
logo.id = ".sacsa-logo"
logo.storeableAttributes = [ "src" ]
logo.addIndex = false
logo.addParent = false

customParameters = {} // Parameters for making the elements editable
logo.customParameters = customParameters

customParameters.redirect = false
customParameters.event = "click"

customParameters.css = {
	height : '357px',
	width : '50px',
	'max-height' : '45px',
	'min-width' : '50px'
}

// END LOGO as JSON
// BEGIN TITULO 1

titulo1.id = ".sacsa-titulo-uno"
titulo1.type = "Span"
titulo1.storable = true
titulo1.storeableAttributes = [ "html" ]
titulo1.customParameters = {
	"editable" : true
}

titulo2.id = ".sacsa-titulo-dos"
titulo2.type = "Span"
titulo2.storable = true
titulo2.storeableAttributes = [ "html" ]
titulo2.customParameters = {
	"editable" : true
}

titulo3.id = ".sacsa-titulo-tres"
titulo3.type = "Span"
titulo3.storable = true
titulo3.storeableAttributes = [ "html" ]
titulo3.customParameters = {
	"editable" : true
}

var aContentEditable = [ {
	name : "type",
	value : "A"
}, {
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
} ]

var preventDefaultActions = [ {
	name : "preventDefault",
	value : "click"
}, {
	name : "stopPropagation",
	value : "click"
}, {
	name : "unbind",
	value : true
} ]

inicio.id = ".sacsa-inicio"
addAllAttributes(inicio, aContentEditable)

servicios.id = ".sacsa-servicios"
addAllAttributes(servicios, aContentEditable)

terrestres.id = ".sacsa-terrestres"
addAllAttributes(terrestres, aContentEditable)
addAllAttributes(terrestres, preventDefaultActions)

hidraulicos.id = ".sacsa-hidraulicos"
addAllAttributes(hidraulicos, aContentEditable)
addAllAttributes(hidraulicos, preventDefaultActions)

comerciales.id = ".sacsa-industriales"
addAllAttributes(comerciales, aContentEditable)
addAllAttributes(comerciales, preventDefaultActions)

subcontratacion.id = ".sacsa-subcontratacion"
addAllAttributes(subcontratacion, aContentEditable)
addAllAttributes(subcontratacion, preventDefaultActions)

maquinaria.id = ".sacsa-maquinarias"
addAllAttributes(maquinaria, aContentEditable)
addAllAttributes(maquinaria, preventDefaultActions)

nosotros.id = ".sacsa-nosotros"
addAllAttributes(nosotros, aContentEditable)

contacto.id = ".sacsa-contacto"
addAllAttributes(contacto, aContentEditable)

empleo.id = ".sacsa-empleo"
addAllAttributes(empleo, aContentEditable)

/** ===================================END NAV-BAR=================================* */
/** ===================================BEGIN CARRUSEL=================================* */
var carrusel = {}
childStructures.push(carrusel)

carrusel.id = ".sacsa-carrusel-item"
carrusel.type = "Li"
carrusel.storable = true
carrusel.collection = true
carrusel.addIndex = true
var customParameters = {}
carrusel.customParameters = customParameters
customParameters.editable = false

var pretitle = {}
var title = {}
var contenido = {}
var mainImage = {}
var secondaryImage = {}

carrusel.childStructures = [ pretitle, title, contenido, mainImage, secondaryImage ]

pretitle.id = ".sacsa-carrusel-pretitle"
pretitle.type = "Div"
addAllAttributes(pretitle, contentEditable)

title.id = ".sacsa-carrusel-title"
title.type = "Div"
addAllAttributes(title, contentEditable)

contenido.id = ".sacsa-carrusel-text"
contenido.type = "Div"
addAllAttributes(contenido, contentEditable)

mainImage.id = ".sacsa-carrusel-image-fondo"
addAllAttributes(mainImage, jQuery.extend(true, {}, imageEditable))
mainImage.addParent = true


mainImage.customParameters.css = {
	//width : '1330px',
	height : '100%'

}

mainImage.customParameters.modalWidth = 1330
//mainImage.customParameters.modalHeight = 432

secondaryImage.id = ".sacsa-carrusel-image-center"
addAllAttributes(secondaryImage, jQuery.extend(true, {}, imageEditable))
secondaryImage.addParent = true

secondaryImage.customParameters.css = {
	width : '400px',
	height : '300px'

}
secondaryImage.customParameters.modalWidth = 400
secondaryImage.customParameters.modalHeight = 300
/** ===================================END CARRUSEL=================================* */
/** ===================================BEGIN VENTAJAS=================================* */

var ventajas = {}
childStructures.push(ventajas)

ventajas.id = ".sacsa-index-service-item"
ventajas.type = "Div"
ventajas.collection = true
ventajas.addIndex = true

var ventajasTitle = {}
var ventajasText = {}

ventajas.childStructures = [ ventajasTitle, ventajasText ]

ventajasTitle.id = ".sacsa-service-item-title"
ventajasTitle.type = "H4"
ventajasTitle.addParent = true
addAllAttributes(ventajasTitle, contentEditable)

ventajasText.id = ".sacsa-service-item-text"
ventajasText.type = "P"
ventajasText.addParent = true
addAllAttributes(ventajasText, contentEditable)

/** ===================================END VENTAJAS=================================* */
/** ===================================BEGIN TRABAJOS RECIENTES=================================* */
var trabajosRecientesItems = {}
childStructures.push(trabajosRecientesItems)

trabajosRecientesItems.id = ".sacsa-trabajos-recientes-item"
trabajosRecientesItems.type = "Div"
trabajosRecientesItems.storable = true
trabajosRecientesItems.collection = true
trabajosRecientesItems.addIndex = true

var recientesImage = {}
var recientesTitle = {}
var recientesSubtitle = {}

trabajosRecientesItems.childStructures = [ recientesImage, recientesTitle, recientesSubtitle ]

recientesImage.id = ".sacsa-recientes-item-img"
addAllAttributes(recientesImage, jQuery.extend(true, {}, imageEditable))
recientesImage.addParent = true

recientesImage.customParameters.css = {
	height : '100%'

}

recientesImage.customParameters.modalWidth = 330
recientesImage.customParameters.modalHeight = 220

recientesTitle.id = ".sacsa-recientes-item-titulo"
recientesTitle.type = "H5"
recientesTitle.addParent = true
addAllAttributes(recientesTitle, contentEditable)

recientesSubtitle.id = ".sacsa-recientes-item-texto"
recientesSubtitle.type = "P"
recientesSubtitle.addParent = true
addAllAttributes(recientesSubtitle, contentEditable)

/** ===================================END TRABAJOS RECIENTES=================================* */
/** ===================================BEGIN CLIENTES=================================* */
var clientesContainer = {}
childStructures.push(clientesContainer)

clientesContainer.id = "#our-clients"
clientesContainer.type = "Section"
clientesContainer.storable = false

clientesContainer.addItem = {
	item : ".client-wrapper",
	clazz : "fa fa-plus-circle",
	executeAfter : {
		"event" : "click",
		"onClick" : carruselClientes
	},
	css : {
		"position" : "absolute",
		"font-size" : "47px",
		"right" : "100px",
		"top" : "0",
		"color" : "#0000FF"
	}
}

var clientes = {}
clientesContainer.childStructures = [ clientes ]

clientes.id = ".sacsa-clients-logo"
clientes.collection = true
clientes.addIndex = true
addAllAttributes(clientes, jQuery.extend(true, {}, imageEditable))

clientes.fixedAttributes = [ {
	"name" : "relativePath",
	"value" : false
} ]

clientes.customParameters.modalWidth = 247
clientes.customParameters.modalHeight = 139

clientes.customParameters.css = {
	height : '100%'

}

clientes.deleteItem = {
	wrapper : ".client-wrapper",
	clazz : "fa fa-times-circle",
	min : 4,
	css : {
		"position" : "absolute",
		"font-size" : "35px",
		"right" : "0",
		"top" : "0",
		"color" : "#FF0000"
	}
}

/** ===================================END CLIENTES=================================* */
/** ===================================BEGIN FOOTER=================================* */

var footer = {}
childStructures.push(footer)

footer.id = ".footer .container"
footer.type = "Div"

var rfc = {}
var direccion0 = {}
var direccion1 = {}
var direccion2 = {}
var telefono = {}
var fax = {}
var correo = {}
var etiquetas = {} // 

footer.childStructures = [ rfc, direccion0, direccion1, direccion2, telefono, fax, correo, etiquetas ]

rfc.id = ".sacsa-rfc"
rfc.type = "Strong"
addAllAttributes(rfc, contentEditable)

direccion0.id = ".sacsa-direccion0"
direccion0.type = "Span"
addAllAttributes(direccion0, contentEditable)

direccion1.id = ".sacsa-direccion1"
direccion1.type = "Span"
addAllAttributes(direccion1, contentEditable)

direccion2.id = ".sacsa-direccion2"
direccion2.type = "Span"
addAllAttributes(direccion2, contentEditable)

telefono.id = ".sacsa-telefono"
telefono.type = "Span"
addAllAttributes(telefono, contentEditable)

fax.id = ".sacsa-fax" // correo
fax.type = "Span"
addAllAttributes(fax, contentEditable)

correo.id = ".sacsa-correo" // correo
correo.type = "Span"
addAllAttributes(correo, contentEditable)

etiquetas.id = ".sacsa-etiqueta-seo"
etiquetas.type = "Li"
etiquetas.collection = true
etiquetas.addIndex = true

addAllAttributes(etiquetas, contentEditable)

/** ===================================END FOOTER=================================* */

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * **/

fillAllMisingParameters(structure)

/** ==================FUNCTIONS================== * */
function carruselClientes() {

	$('#caroufredsel-clients-container').carouFredSel({
		responsive : true,
		scroll : 1,
		circular : true,
		infinite : true,
		items : {
			visible : {
				min : 1,
				max : 4
			}
		},
		prev : '#client-prev',
		next : '#client-next',
		auto : {
			play : false
		}
	});
}
// dropdown-menu

