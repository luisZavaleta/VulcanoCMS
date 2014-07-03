package mx.vulcanosw.sacsa.html

import mx.vulcanosw.cms.html.*



class LayoutHelperService {



	def webPageHelperService

	def getNavBar(){

		def navbar = [:]

		def logo = Img.findBySelector(".sacsa-logo")
		webPageHelperService.setImageAbsolutePath(logo)
		navbar["logo"] = logo

		navbar["titulo1"] = Span.findByWebpageIdAndSelector("index", ".sacsa-titulo-uno")
		navbar["titulo2"] = Span.findByWebpageIdAndSelector("index", ".sacsa-titulo-dos")
		navbar["titulo3"] = Span.findByWebpageIdAndSelector("index", ".sacsa-titulo-tres")
		navbar["inicio"] = A.findByWebpageIdAndSelector("index", ".sacsa-inicio")
		navbar["servicios"] = A.findByWebpageIdAndSelector("index", ".sacsa-servicios")
		navbar["terrestres"]  = A.findByWebpageIdAndSelector("index", ".sacsa-terrestres")
		navbar["hidraulicos"]  = A.findByWebpageIdAndSelector("index", ".sacsa-hidraulicos")
		navbar["industriales"]  = A.findByWebpageIdAndSelector("index", ".sacsa-industriales")
		navbar["subcontratacion"]  = A.findByWebpageIdAndSelector("index", ".sacsa-subcontratacion")
		navbar["maquinaria"]  = A.findByWebpageIdAndSelector("index", ".sacsa-maquinarias")
		navbar["nosotros"]  = A.findByWebpageIdAndSelector("index", ".sacsa-nosotros")
		navbar["contacto"]  = A.findByWebpageIdAndSelector("index", ".sacsa-contacto")
		navbar["empleo"]  = A.findByWebpageIdAndSelector("index", ".sacsa-empleo")


		return navbar
	}
}
