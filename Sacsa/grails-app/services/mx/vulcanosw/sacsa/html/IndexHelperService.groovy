package mx.vulcanosw.sacsa.html

import mx.vulcanosw.cms.html.*


class IndexHelperService {


	def webPageHelperService

	def getCarrusel(){

		def data = []



		def carruseles = Li.findAllByWebpageIdAndSelector("index", ".sacsa-carrusel-item", [sort: "index", order: "asc"])

		for(Li carrusel : carruseles){

			def item = [:]
			item["carrusel"] = carrusel

			def fondo = Img.findBySelectorAndParentId(".sacsa-carrusel-image-fondo", carrusel.id)
			webPageHelperService.setImageAbsolutePath(fondo)
			item["fondo"] = fondo

			def centro = Img.findBySelectorAndParentId(".sacsa-carrusel-image-center", carrusel.id)
			webPageHelperService.setImageAbsolutePath(centro)
			item["centro"] = centro

			item["pretitle"] = Div.findBySelectorAndParentId(".sacsa-carrusel-pretitle", carrusel.id)
			item["title"] = Div.findBySelectorAndParentId(".sacsa-carrusel-title", carrusel.id)
			item["text"] = Div.findBySelectorAndParentId(".sacsa-carrusel-text", carrusel.id)


			data.push(item)
		}

		return data
	}



	def getServices(){
		def services = Div.findAllByWebpageIdAndSelector("index",".sacsa-index-service-item",[sort:"index", order: "asc"])

		def servicios = []

		for(Div servicio: services){
			def item = [:]

			item["service"] = servicio
			item["icon"] = I.findBySelectorAndParentId(".sacsa-service-item-icon", servicio.id)
			item["title"] = H4.findBySelectorAndParentId(".sacsa-service-item-title", servicio.id)
			item["text"] = P.findBySelectorAndParentId(".sacsa-service-item-text", servicio.id)

			servicios.push(item)
		}

		return servicios
	}


	def getTrabajosRecientes(){

		def trabajosRecientes =  Div.findAllByWebpageIdAndSelector("index",".sacsa-trabajos-recientes-item",[sort:"index", order: "asc"])
		def recientes = []


		for(Div trabajoReciente : trabajosRecientes){
			def item = [:]

			item["trabajo"] = trabajoReciente

			def imagen = Img.findBySelectorAndParentId(".sacsa-recientes-item-img", trabajoReciente.id)
			webPageHelperService.setImageAbsolutePath(imagen)
			item["imagen"] = imagen

			item["titulo"] = H5.findBySelectorAndParentId(".sacsa-recientes-item-titulo", trabajoReciente.id)
			item["texto"] = P.findBySelectorAndParentId(".sacsa-recientes-item-texto", trabajoReciente.id)

			recientes.push(item)
		}

		return recientes
	}


	def getClientesLogos(){

		def imagenes = Img.findAllByWebpageIdAndSelector("index",".sacsa-clients-logo",[sort:"index", order: "asc"])

		imagenes.each(){ webPageHelperService.setImageAbsolutePath(it) }

		return imagenes
	}



	def getFooter(){
		def footer = [:]


		footer["rfc"] = Strong.findBySelector(".sacsa-rfc")
		footer["direccion0"] = Span.findBySelector(".sacsa-direccion0")
		footer["direccion1"] = Span.findBySelector(".sacsa-direccion1")
		footer["direccion2"] = Span.findBySelector(".sacsa-direccion2")
		footer["telefono"] = Span.findBySelector(".sacsa-telefono")
		footer["fax"] = Span.findBySelector(".sacsa-fax")
		footer["correo"] = Span.findBySelector(".sacsa-correo")
		footer["derechos"] = Span.findBySelector(".sacsa-derechos-reservados")


		footer["etiquetas"] = A.findAllBySelector(".sacsa-etiqueta-seo", [sort:"index", order: "asc"])



		return footer
	}




	def getServicio(idx){

		def webpageId = "servicio/"+idx



		def service = Div.findByWebpageIdAndSelectorAndName("servicio", ".sacsa-servicio", webpageId)


		def data =[:]
		if(service){
			def allServices = Div.findAllByWebpageIdAndSelector("servicio", ".sacsa-servicio",  [sort:"name", order: "asc"])

			assert(allServices != null && allServices.size() > 0)

			def index = allServices.indexOf(service)

			def prevIndex = index - 1
			def nextIndex = index + 1

			if(prevIndex < 1){
				prevIndex = allServices.size() - 1
			}

			if(nextIndex >= allServices.size()){
				nextIndex = 0
			}


			def prevWebpageId = allServices.get(prevIndex).name
			def nextWebpageId = allServices.get(nextIndex).name




			data["prev"] = H5.findByWebpageIdAndSelector(prevWebpageId, ".sacsa-servicios-titulo")
			data["prevPath"] = prevWebpageId


			data["nxt"] = H5.findByWebpageIdAndSelector(nextWebpageId, ".sacsa-servicios-titulo")
			data["nxtPath"] = nextWebpageId



			data["titulo"] = H5.findByWebpageIdAndSelector(webpageId, ".sacsa-servicios-titulo")
			data["texto"] =  Div.findByWebpageIdAndSelector(webpageId, ".sacsa-servicio-texto")

			def carrusel = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-servicio-carrusel")


			data["carrusel"] =  carrusel




			def imagenesc  =  Img.findAllByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-servicio-carrusel-item", carrusel.id, [sort:"index", order: "asc"])



			imagenesc.each(){ webPageHelperService.setImageAbsolutePath(it) }
			data["imagenes"] = imagenesc

			data["proyectosTitulo"] = H5.findByWebpageIdAndSelector(webpageId, ".sacsa-servicios-proyectos-titulo")

			//data["proyectosTitulo"] = H5.findByWebpageIdAndSelector(webpageId, ".sacsa-servicios-proyectos-titulo")

			def proyectos = []
			data["proyectos"] = proyectos

			data["proyectosParent"] = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-servicios-proyectos-carrusel")


			def proyectosBD = Div.findAllByWebpageIdAndSelector(webpageId, ".sacsa-servicios-proyectos-carrusel-item")

			for(Div proyecto: proyectosBD){
				def item = [:]
				item["proyecto"] = proyecto

				def imgx = Img.findByWebpageIdAndSelectorAndParentId(webpageId, ".servicios-proyectos-carrusel-item-image", proyecto.id)
				webPageHelperService.setImageAbsolutePath(imgx)
				item["imagen"] =imgx



				item["titulo"] = H5.findByWebpageIdAndSelectorAndParentId(webpageId, ".servicios-proyectos-carrusel-item-title", proyecto.id)
				item["texto"] = P.findByWebpageIdAndSelectorAndParentId(webpageId, ".servicios-proyectos-carrusel-item-text", proyecto.id)

				proyectos.push(item)
			}

			return data
		}
	}



	def getPortafolio(){

		def webpageId = "portafolio"

		def categorias = A.findAllByWebpageIdAndSelector( webpageId, ".sacsa-portafolio-category",[sort: "index", order: "asc"])
		def items = Div.findAllByWebpageIdAndSelector( webpageId, ".sacsa-maquinaria-item",[sort: "index", order: "asc"])


		def maquinarias = []
		items.each(){

			def maquinaria = [:]
			maquinaria["item"] = it

			def img = Img.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-maquinaria-image", it.id)
			webPageHelperService.setImageAbsolutePath(img)
			maquinaria["image"] = img

			maquinaria["title"] = H5.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-maquinaria-titulo", it.id)
			maquinaria["text"] =  P.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-maquinaria-texto", it.id)

			maquinarias.push(maquinaria)
		}


		[categorias: categorias, maquinarias:maquinarias]


	}


	def getNosotros(){

		def webpageId = "nosotros"


		def imagenes = Img.findAllByWebpageIdAndSelector(webpageId, ".sacsa-nosotros-imagen",[sort: "index", order: "asc"])
		imagenes.each(){ webPageHelperService.setImageAbsolutePath(it) }

		def images = imagenes

		def title = H5.findByWebpageIdAndSelector(webpageId, ".sacsa-nosotros-titulo")
		def contenido = Div.findByWebpageIdAndSelector(webpageId, ".quienes-somos-contenido")

		def mision = A.findByWebpageIdAndSelector(webpageId, ".sacsa-mision")
		def misionTexto = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-mision-texto")
		def vision = A.findByWebpageIdAndSelector(webpageId, ".sacsa-vision")
		def visionTexto = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-vision-texto")

		def valores = A.findByWebpageIdAndSelector(webpageId, ".sacsa-valores")
		def valoresTexto = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-valores-texto")

		def tipodDeObra =  H5.findByWebpageIdAndSelector(webpageId, ".sacsa-tipo-obras")

		def progressBarTerrestre =  Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-terrestre")
		def progressBarHidraulicos = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-hidraulico")
		def progressBarIndustriales = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-industriales")
		def progressBarSubcontratacion = Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-subcontratacion")

		def equipoTitulo =  H5.findByWebpageIdAndSelector(webpageId, ".sacsa-equipo-trabajo")


		def equipoItems = Div.findAllByWebpageIdAndSelector(webpageId, ".sacsa-equipo-item", [sort: "index", order: "asc"])


		def equipo = []

		equipoItems.each(){

			def item = [:]
			item["item"] = it

			//item["image"] =  Div.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-equipo-item-imagen", it.id)
			def imgx = Img.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-equipo-item-imagen", it.id)
			webPageHelperService.setImageAbsolutePath(imgx)
			item["image"] =  imgx
			item["nombres"] =  H4.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-equipo-item-nombre", it.id)
			item["posicion"] =  Span.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-equipo-item-posicion", it.id)
			item["descripcion"] =  P.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-equipo-item-descripcion", it.id)

			equipo.push(item)
		}



		[
			images: images,
			title: title,
			contenido: contenido,
			mision: mision,
			misionTexto: misionTexto,
			vision: vision,
			visionTexto: visionTexto,
			valores: valores,
			valoresTexto: valoresTexto,
			tipodDeObra: tipodDeObra,
			terrestre: progressBarTerrestre,
			hidraulicos: progressBarHidraulicos,
			industriales: progressBarIndustriales,
			subcontratacion: progressBarSubcontratacion,
			equipoTitulo: equipoTitulo,
			equipo:equipo
		]


	}



	def getEmpleo(){

		def webpageId = "empleo"

		def empleosDisponibles = Div.findAllByWebpageIdAndSelector(webpageId, ".sacsa-empleo-item", [sort:"index", order: "asc"])

		def empleos = []


		empleosDisponibles.each(){

			def item = [:]
			item["item"] = it
			item["title"] =  A.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-empleo-titulo", it.id)

			item["description"] = Div.findByWebpageIdAndSelectorAndParentId(webpageId, ".sacsa-empleo-texto", it.id)

			empleos.push(item)
		}


		return empleos

	}
}






