import mx.vulcanosw.cms.html.*
import mx.vulcanosw.sacsa.bootstrap.BootstrapHelper



class BootStrap {




	def init = { servletContext ->

		BootstrapHelper helper= new BootstrapHelper()

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
	def destroy = {
	}
}


//caroufredsel-blog-posts-container
