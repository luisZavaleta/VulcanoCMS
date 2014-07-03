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
var siteConfigDos = {}

var idSite = window.location.pathname
idSite = idSite.split("admin/")
idSite = idSite[idSite.length - 1]

siteConfigDos.id = idSite

var structure = {}
siteConfigDos.structure = structure

structure.parent = "html"
structure.parentType = "Html"
structure.id = "body"
structure.type = "Body"
structure.storable = false // Indicates if will be stored in the DB
structure.skipModal = true

var childStructures = []
structure.childStructures = childStructures

/** ===================================BEGIN CARRUSEL=================================* */
var carrusel = {}
childStructures.push(carrusel)

carrusel.id = ".sacsa-servicio-carrusel"
carrusel.type = "Div"
carrusel.storable = true

var carruselImages = {}
var titulo = {}
var texto = {}
carrusel.childStructures = [ carruselImages, titulo, texto ]

carruselImages.id = ".sacsa-servicio-carrusel-item"
addAllAttributes(carruselImages, jQuery.extend(true, {}, imageEditable))
carruselImages.addParent = true
carruselImages.collection = true
carruselImages.addIndex = true

carruselImages.fixedAttributes = [ {
	"name" : "relativePath",
	"value" : false
} ]

carruselImages.customParameters.modalWidth = 395
carruselImages.customParameters.modalHeight = 378

carruselImages.customParameters.css = {
	width : 'auto',
	'max-width' : '100%'
}

/** ===================================END CARRUSEL=================================* */
/** ===================================BEGIN TITULO=================================* */

titulo.id = ".sacsa-servicios-titulo"
titulo.type = "H5"
addAllAttributes(titulo, contentEditable)

texto.id = ".sacsa-servicio-texto"
texto.type = "Div"
addAllAttributes(texto, contentEditable)
/** ===================================END TITULO=================================* */
/** ===========================BEGIN PRINCIPALES PROYECTOS========================* */
var trabajosRecientesItems = {}
childStructures.push(trabajosRecientesItems)

trabajosRecientesItems.id = ".sacsa-servicios-proyectos-carrusel-item"
trabajosRecientesItems.type = "Div"
trabajosRecientesItems.storable = true
trabajosRecientesItems.collection = true
trabajosRecientesItems.addIndex = true

var recientesImage = {}
var recientesTitle = {}
var recientesSubtitle = {}

trabajosRecientesItems.childStructures = [ recientesImage, recientesTitle, recientesSubtitle ]

recientesImage.id = ".servicios-proyectos-carrusel-item-image"
addAllAttributes(recientesImage, jQuery.extend(true, {}, imageEditable))
recientesImage.addParent = true

recientesImage.customParameters.css = {
	height : '100%'

}

recientesImage.customParameters.modalWidth = 330
recientesImage.customParameters.modalHeight = 220

recientesTitle.id = ".servicios-proyectos-carrusel-item-title"
recientesTitle.type = "H5"
recientesTitle.addParent = true
addAllAttributes(recientesTitle, contentEditable)

recientesSubtitle.id = ".servicios-proyectos-carrusel-item-text"
recientesSubtitle.type = "P"
recientesSubtitle.addParent = true
addAllAttributes(recientesSubtitle, contentEditable)

/** ============================END PRINCIPALES PROYECTOS=========================* */

fillAllMisingParameters(structure)

