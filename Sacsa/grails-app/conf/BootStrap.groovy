import mx.vulcanosw.cms.html.*
import mx.vulcanosw.sacsa.bootstrap.BootstrapHelper
import mx.vulcanosw.security.Usuario



class BootStrap {




	def init = { servletContext ->

		BootstrapHelper helper= new BootstrapHelper()


		if(Usuario.count() <= 0){
			helper.configUser()
			helper.preloadHeader()
			helper.preloadCarrusel()
			helper.preloadService()
			helper.preloadTrabajosRecientes()
			helper.preloadClientes()
			helper.preloadFooter()
			helper.preloadObrasViasTerrestres()
			helper.preloadDesarrollosHidraulicos()
			helper.preloadObrasIndustrialesYComerciales()
			helper.preloadSubcontratacion()
			helper.preloadPortafolio()
			helper.preloadNosotros()
			helper.preloadEmpleos()
		}
	}
	def destroy = {
	}
}


//caroufredsel-blog-posts-container
