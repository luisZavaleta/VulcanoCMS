package mx.vulcanosw.sacsa




class AdminController {
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


	def servicio(){
		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()
		model["servicio"] = indexHelperService.getServicio(params.id)

		[model:model]
	}

	def portafolio(){

		def model = [:]
		model["navbar"] =  layoutHelperService.getNavBar()
		model["footer"] = indexHelperService.getFooter()
		model["portafolio"] = indexHelperService.getPortafolio()

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



}

//DESARROLLOS Y RESTAURACIONES