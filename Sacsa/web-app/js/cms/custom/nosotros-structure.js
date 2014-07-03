var nosotrosConfig = {}

var idSite = window.location.pathname
idSite = idSite.split("admin/")
idSite = idSite[idSite.length - 1]

nosotrosConfig.id = idSite

var structure = {}
nosotrosConfig.structure = structure

structure.parent = "html"
structure.parentType = "Html"
structure.id = "body"
structure.type = "Body"
structure.storable = false // Indicates if will be stored in the DB
structure.skipModal = true

var childStructures = []
structure.childStructures = childStructures

/** ===================================BEGIN CARRUSEL=================================* */

var images = {}
childStructures.push(images)

images.id = ".sacsa-nosotros-imagen"
images.type = "Img"
images.storable = true
images.collection = true
images.addIndex = true

addAllAttributes(images, jQuery.extend(true, {}, imageEditable))

images.fixedAttributes = [ {
	"name" : "relativePath",
	"value" : false
} ]

images.customParameters.modalWidth = 480
images.customParameters.modalHeight = 287



/** ===================================END CARRUSEL=================================* */
/** ===================================BEGIN CONTENT=================================* */

var title = {}
title.id = ".sacsa-nosotros-titulo"
title.type = "H5"
addAllAttributes(title, contentEditable)

var texto = {}
texto.id = ".quienes-somos-contenido"
texto.type = "Div"
addAllAttributes(texto, contentEditable)

var misionTitulo = {}
misionTitulo.id = ".sacsa-mision"
misionTitulo.type = "A"
addAllAttributes(misionTitulo, contentEditable)

var misionTexto = {}
misionTexto.id = ".sacsa-mision-texto"
misionTexto.type = "Div"
addAllAttributes(misionTexto, contentEditable)

var visionTitulo = {}
visionTitulo.id = ".sacsa-vision"
visionTitulo.type = "A"
addAllAttributes(visionTitulo, contentEditable)

var visionTexto = {}
visionTexto.id = ".sacsa-vision-texto"
visionTexto.type = "Div"
addAllAttributes(visionTexto, contentEditable)

var valoresTitulo = {}
valoresTitulo.id = ".sacsa-valores"
valoresTitulo.type = "A"
addAllAttributes(valoresTitulo, contentEditable)

var valoresTexto = {}
valoresTexto.id = ".sacsa-valores-texto"
valoresTexto.type = "Div"
addAllAttributes(valoresTexto, contentEditable)

var tiposDeObra = {}
tiposDeObra.id = ".sacsa-tipo-obras"
tiposDeObra.type = "H5"
addAllAttributes(tiposDeObra, contentEditable)

var terrestres = {}
terrestres.id = ""
terrestres.type = "Div"
addAllAttributes(terrestres, contentEditable)

terrestres.id = ".sacsa-progressbar-terrestre"
terrestres.type = "Div"
terrestres.customAction = {
	event : "focusout",
	funcion : modifyWidthInProgressBar
}
addAllAttributes(terrestres, contentEditable)

var hidraulicos = {}
hidraulicos.id = ".sacsa-progressbar-hidraulico"
hidraulicos.type = "Div"
hidraulicos.customAction = {
	event : "focusout",
	funcion : modifyWidthInProgressBar
}
addAllAttributes(hidraulicos, contentEditable)

var comerciales = {}
comerciales.id = ".sacsa-progressbar-industriales"
comerciales.type = "Div"
comerciales.customAction = {
	event : "focusout",
	funcion : modifyWidthInProgressBar
}
addAllAttributes(comerciales, contentEditable)

var subContratacion = {}
subContratacion.id = ".sacsa-progressbar-subcontratacion"
subContratacion.type = "Div"
subContratacion.customAction = {
	event : "focusout",
	funcion : modifyWidthInProgressBar
}
addAllAttributes(subContratacion, contentEditable)

childStructures.push(title)
childStructures.push(texto)
childStructures.push(misionTitulo)
childStructures.push(misionTexto)
childStructures.push(visionTitulo)
childStructures.push(visionTexto)
childStructures.push(valoresTitulo)
childStructures.push(valoresTexto)
childStructures.push(tiposDeObra)
childStructures.push(terrestres)
childStructures.push(hidraulicos)
childStructures.push(comerciales)
childStructures.push(subContratacion)

/** ===================================END CONTENT=================================* */
/** ===================================BEGIN EQUIPO=================================* */
var equipo = {}
childStructures.push(equipo)

equipo.id = "#team-3-columns"
equipo.type = "Div"
equipo.storable = false

var equipoTitle = {}
var equipoItem = {}
equipo.childStructures = [ equipoTitle, equipoItem ]

equipoTitle.id = ".sacsa-equipo-trabajo"
equipoTitle.type = "H5"
addAllAttributes(equipoTitle, contentEditable)

equipoItem.id = ".sacsa-equipo-item"
equipoItem.type = "Div"
equipoItem.storable = true
equipoItem.collection = true
equipoItem.addIndex = true

var itemImagen = {}
var itemTitulo = {}
var itemSubtitulo = {}
var itemTexto = {}

equipoItem.childStructures = [ itemImagen, itemTitulo, itemSubtitulo, itemTexto ]

itemImagen.id = ".sacsa-equipo-item-imagen"
itemImagen.addParent = true
addAllAttributes(itemImagen, jQuery.extend(true, {}, imageEditable))

itemImagen.customParameters.modalWidth = 310
itemImagen.customParameters.modalHeight = 217

itemTitulo.id = ".sacsa-equipo-item-nombre"
itemTitulo.type = "H4"
itemTitulo.addParent = true
addAllAttributes(itemTitulo, contentEditable)

itemSubtitulo.id = ".sacsa-equipo-item-posicion"
itemSubtitulo.type = "Span"
itemSubtitulo.addParent = true
addAllAttributes(itemSubtitulo, contentEditable)

itemTexto.id = ".sacsa-equipo-item-descripcion"
itemTexto.type = "P"
itemTexto.addParent = true
addAllAttributes(itemTexto, contentEditable)

/** ===================================END EQUIPO=================================* */

fillAllMisingParameters(structure)


