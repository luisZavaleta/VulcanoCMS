package mx.vulcanosw.sacsa


class MainController {


	def layoutHelperService
	def indexHelperService

	def index() {
		def model = [:]

		model["navbar"] =  layoutHelperService.getNavBar()
		model["carrusel"] = indexHelperService.getCarrusel()
		model["services"] =  indexHelperService.getServices()
		model["recientes"] = indexHelperService.getTrabajosRecientes()
		model["clientes"] = indexHelperService.getClientesLogos()
		model["footer"] = indexHelperService.getFooter()


		return [model:model]
	}

	def portafolio(){

		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()
		model["portafolio"] = indexHelperService.getPortafolio()



		[model:model]
	}

	def contacto(){

		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()

		[model:model]
	}

	def empleo(){
		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()
		model["empleos"] = indexHelperService.getEmpleo()

		[model:model]
	}

	def nosotros(){

		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()
		model["clientes"] = indexHelperService.getClientesLogos()
		model["nosotros"] =  indexHelperService.getNosotros()

		[model:model]
	}

	def mail(){

		sendMail {
			multipart true
			to "luis@vulcanosw.mx"
			subject "Envío de curriculum desde página web"
			html mx.vulcanosw.sacsa.bootstrap.EmailHelper.getCorreoTexto(params.nombre, params.correo, params.titulo, params.mensaje)
			if(params.upl != null){
				attachBytes params.upl.getOriginalFilename(), "text/xml", params.upl.getBytes()
			}
		}


		render "ok"
	}

	def servicio(){
		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()
		model["servicio"] = indexHelperService.getServicio(params.id)

		[model:model]
	}


	def contactoMail(){

		sendMail {
			to "luis@vulcanosw.mx"
			subject "Mensaje de cliente desde página web"
			html mx.vulcanosw.sacsa.bootstrap.EmailHelper.getCorreoTexto(params.nombre, params.correo, params.titulo, params.mensaje)
		}


		render "ok"
	}
}


//sacsa-carrusel-image-fondo defaultimg
