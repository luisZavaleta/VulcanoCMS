package mx.vulcanosw.sacsa.bootstrap

import mx.vulcanosw.cms.html.*

class BootstrapHelper {



	def preloadHeader(){

		if(!Img.findByWebpageIdAndSelector("index", ".sacsa-logo")) {
			new Img(webpageId: "index", selector: ".sacsa-logo", src: "img/sacsa/logo2.png", relativePath: true ).save(failOnError:true)
		}

		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-titulo-uno")){
			new Span(webpageId: "index", selector: ".sacsa-titulo-uno",html: "SERVICIOS ADMINISTRATIVOS").save(failOnError:true)
		}


		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-titulo-dos")){
			new Span(webpageId: "index", selector:".sacsa-titulo-dos", html:"Y DE CONSTRUCCIÓN").save(failOnError:true)
		}
		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-titulo-tres")) {
			new Span(webpageId: "index", selector: ".sacsa-titulo-tres",html: "SA DE CV").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-inicio")) {
			new A(webpageId: "index", selector: ".sacsa-inicio",html: "Inicio").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-servicios")) {
			new A(webpageId: "index", selector: ".sacsa-servicios",html: "Servicios").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-terrestres")) {
			new A(webpageId: "index", selector: ".sacsa-terrestres",html: "Obras de Vías Terrestres").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-hidraulicos")) {
			new A(webpageId: "index", selector: ".sacsa-hidraulicos",html: "Desarrollos Hidráulicos").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-industriales")) {
			new A(webpageId: "index", selector: ".sacsa-industriales",html: "Obras Industriales y Comerciales").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-subcontratacion")) {
			new A(webpageId: "index", selector: ".sacsa-subcontratacion",html: "Sub Contratación").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-maquinarias")) {
			new A(webpageId: "index", selector: ".sacsa-maquinarias",html: "Maquinaria").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-nosotros")) {
			new A(webpageId: "index", selector: ".sacsa-nosotros",html: "Nosotros").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-contacto")) {
			new A(webpageId: "index", selector: ".sacsa-contacto",html: "Contacto").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-empleo")) {
			new A(webpageId: "index", selector: ".sacsa-empleo",html: "Empleo").save(failOnError:true)
		}
	}



	def preloadCarrusel(){


		if(!Ul.findByWebpageIdAndSelector("index", ".sacsa-carruseles")){



			if(!Li.findByWebpageIdAndSelectorAndIndex("index", ".sacsa-carrusel-item", 0)){

				def parent =  new Li(webpageId: "index",selector: ".sacsa-carrusel-item", index:0).save(failOnError:true)

				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-fondo", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-fondo",
					parentId:  parent.id, src: "img/sacsa/terrestresBig.jpg",
					relativePath: true ).save(failOnError:true)
				}

				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-center", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-center",
					parentId:  parent.id, src: "img/sacsa/terrestresSmall.jpg",
					relativePath: true ).save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-pretitle", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-pretitle",
					parentId: parent.id, html:"CONSTRUCCIÓN DE").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-title", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-title",
					parentId: parent.id, html:"OBRAS DE VÍA TERRESTRE").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-text", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-text",parentId: parent.id,
					html:BootstrapHelperHelper.carruselText0).save(failOnError:true)
				}
			}

			if(!Li.findByWebpageIdAndSelectorAndIndex("index", ".sacsa-carrusel-item", 1)){
				def parent = new Li(webpageId: "index",selector: ".sacsa-carrusel-item", index:1).save(failOnError:true)


				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-fondo", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-fondo",
					parentId:  parent.id, src: "img/sacsa/HidraulicosBig.jpg",
					relativePath: true ).save(failOnError:true)
				}



				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-center", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-center",
					parentId:  parent.id, src: "img/sacsa/hidraulicosSmall.jpg",
					relativePath: true ).save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-pretitle", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-pretitle",
					parentId: parent.id, html:"DESARROLLOS").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-title", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-title",
					parentId: parent.id, html:"HIDRÁULICOS").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-text", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-text",parentId: parent.id,
					html:BootstrapHelperHelper.carruselText1).save(failOnError:true)
				}
			}
			if(!Li.findByWebpageIdAndSelectorAndIndex("index", ".sacsa-carrusel-item", 2)){
				def parent = new Li(webpageId: "index",selector: ".sacsa-carrusel-item", index:2).save(failOnError:true)


				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-fondo", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-fondo",
					parentId:  parent.id, src: "img/sacsa/IndustrialesBig.jpg",
					relativePath: true ).save(failOnError:true)
				}

				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-center", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-center",
					parentId:  parent.id, src: "img/sacsa/IndustrialesSmall.jpg",
					relativePath: true ).save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-pretitle", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-pretitle",
					parentId: parent.id, html:"DESARROLLOS Y RESTAURACIONES").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-title", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-title",
					parentId: parent.id, html:"INDUSTRIALES Y COMERCIALES").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-text", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-text",parentId: parent.id,
					html:BootstrapHelperHelper.carruselText2).save(failOnError:true)
				}
			}
			if(!Li.findByWebpageIdAndSelectorAndIndex("index", ".sacsa-carrusel-item", 3)){
				def parent =	new Li(webpageId: "index",selector: ".sacsa-carrusel-item", index:3).save(failOnError:true)


				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-fondo", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-fondo",
					parentId:  parent.id, src: "img/sacsa/subcontratacionBig.jpg",
					relativePath: true ).save(failOnError:true)
				}



				if(!Img.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-image-center", parent.id)){
					new Img(webpageId: "index", selector: ".sacsa-carrusel-image-center",
					parentId:  parent.id, src: "img/sacsa/subcontratacionSmall3.jpg",
					relativePath: true ).save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-pretitle", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-pretitle",
					parentId: parent.id, html:"SUB-").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-title", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-title",
					parentId: parent.id, html:"CONTRATACIÓN").save(failOnError:true)
				}

				if(!Div.findByWebpageIdAndSelectorAndParentId("index", ".sacsa-carrusel-text", parent.id)){
					new Div(webpageId: "index",selector: ".sacsa-carrusel-text",parentId: parent.id,
					html:BootstrapHelperHelper.carruselText3).save(failOnError:true)
				}
			}

			new Ul(webpageId: "index",selector: ".sacsa-carruseles").save(failOnError:true)
		}
	}




	def preloadService(){

		if(!Div.findByWebpageIdAndSelector("index", ".sacsa-index-servicios")){

			def service0 = new Div(webpageId: "index", selector: ".sacsa-index-service-item", index:0).save(failOnError:true)
			def service1 = new Div(webpageId: "index", selector: ".sacsa-index-service-item", index:1).save(failOnError:true)
			def service2 = new Div(webpageId: "index", selector: ".sacsa-index-service-item", index:2).save(failOnError:true)


			new I(webpageId: "index", selector: ".sacsa-service-item-icon", parentId:service0.id, clase: "fa-check-square-o").save(failOnError:true)
			new I(webpageId: "index", selector: ".sacsa-service-item-icon", parentId:service1.id, clase: "fa-thumbs-o-up").save(failOnError:true)
			new I(webpageId: "index", selector: ".sacsa-service-item-icon", parentId:service2.id, clase: "fa-smile-o").save(failOnError:true)


			new H4(webpageId: "index", selector: ".sacsa-service-item-title", parentId:service0.id, html: "Calidad").save(failOnError:true)
			new H4(webpageId: "index", selector: ".sacsa-service-item-title", parentId:service1.id, html: "Integridad").save(failOnError:true)
			new H4(webpageId: "index", selector: ".sacsa-service-item-title", parentId:service2.id, html: "Confiabilidad").save(failOnError:true)


			new P(webpageId: "index", selector: ".sacsa-service-item-text", parentId:service0.id, html: BootstrapHelperHelper.serviceText0).save(failOnError:true)
			new P(webpageId: "index", selector: ".sacsa-service-item-text", parentId:service1.id, html: BootstrapHelperHelper.serviceText1).save(failOnError:true)
			new P(webpageId: "index", selector: ".sacsa-service-item-text", parentId:service2.id, html: BootstrapHelperHelper.serviceText2).save(failOnError:true)


			new Div(webpageId: "index", selector: ".sacsa-index-servicios").save(failOnError:true)



			//Contrucción de planta potabilizadora de Chetumal Quintana Roo


		}
	}



	def preloadTrabajosRecientes(){

		if(!Div.findByWebpageIdAndSelector("index", ".sacsa-trabajos-recientes")){
			new Div(webpageId: "index", selector: ".sacsa-trabajos-recientes").save(failOnError:true)


			def item0 = new Div(webpageId: "index", selector: ".sacsa-trabajos-recientes-item", index: 0).save(failOnError:true)
			def item1 = new Div(webpageId: "index", selector: ".sacsa-trabajos-recientes-item", index: 1).save(failOnError:true)
			def item2 = new Div(webpageId: "index", selector: ".sacsa-trabajos-recientes-item", index: 2).save(failOnError:true)
			def item3 = new Div(webpageId: "index", selector: ".sacsa-trabajos-recientes-item", index: 3).save(failOnError:true)


			new Img(webpageId: "index", selector: ".sacsa-recientes-item-img", parentId: item0.id,
			src: "img/sacsa/reciente1.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: "index", selector: ".sacsa-recientes-item-img", parentId: item1.id,
			src: "img/sacsa/reciente2.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: "index", selector: ".sacsa-recientes-item-img", parentId: item2.id,
			src: "img/sacsa/reciente3.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: "index", selector: ".sacsa-recientes-item-img", parentId: item3.id,
			src: "img/sacsa/reciente4.jpg" , relativePath: true).save(failOnError:true)


			new H5(webpageId: "index", selector: ".sacsa-recientes-item-titulo", parentId: item0.id,
			html:"Construcción de planta potabilizadora de Chetumal Quintana Roo").save(failOnError:true)
			new H5(webpageId: "index", selector: ".sacsa-recientes-item-titulo", parentId: item1.id,
			html:"Construcción del puente cuatro caminos en Nautla Veracruz").save(failOnError:true)
			new H5(webpageId: "index", selector: ".sacsa-recientes-item-titulo", parentId: item2.id,
			html:"Construcción de explanada en la escuela primaria Carlos A. Carrillo ").save(failOnError:true)
			new H5(webpageId: "index", selector: ".sacsa-recientes-item-titulo", parentId: item3.id,
			html:"Construcción de colector pluvial, guarniciones y protección de taludes.").save(failOnError:true)

			new P(webpageId: "index", selector: ".sacsa-recientes-item-texto", parentId: item0.id,
			html:BootstrapHelperHelper.recientesTexto0).save(failOnError:true)
			new P(webpageId: "index", selector: ".sacsa-recientes-item-texto", parentId: item1.id,
			html:BootstrapHelperHelper.recientesTexto1).save(failOnError:true)
			new P(webpageId: "index", selector: ".sacsa-recientes-item-texto", parentId: item2.id,
			html:BootstrapHelperHelper.recientesTexto2).save(failOnError:true)
			new P(webpageId: "index", selector: ".sacsa-recientes-item-texto", parentId: item3.id,
			html:BootstrapHelperHelper.recientesTexto3).save(failOnError:true)
		}
	}



	def preloadClientes(){

		if(!Div.findByWebpageIdAndSelector("index", ".sacsa-clients-container")){
			new Div(webpageId:"index", selector:  ".sacsa-clients-container").save(failOnError:true)

			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 0, src:"img/sacsa/logo/cae.png", relativePath: true).save(failOnError:true)
			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 1, src:"img/sacsa/logo/coatza.png", relativePath: true).save(failOnError:true)
			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 2, src:"img/sacsa/logo/jym.png", relativePath: true).save(failOnError:true)
			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 3, src:"img/sacsa/logo/myv.png", relativePath: true).save(failOnError:true)
			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 4, src:"img/sacsa/logo/pemexexploracion.png", relativePath: true).save(failOnError:true)
			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 5, src:"img/sacsa/logo/pemexpetroquimica.png", relativePath: true).save(failOnError:true)
			new Img(webpageId:"index", selector:".sacsa-clients-logo",
			index: 6, src:"img/sacsa/logo/ridisa.png", relativePath: true).save(failOnError:true)
		}
	}



	def preloadFooter(){

		if(!Strong.findByWebpageIdAndSelector("index", ".sacsa-rfc")){
			new Strong(webpageId: "index", selector: ".sacsa-rfc", html:"RFC SAC – 071010 - E83").save(failOnError:true)
		}

		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-direccion0")){
			new Span(webpageId: "index", selector: ".sacsa-direccion0", html:"PLATON SANCHEZ 602").save(failOnError:true)
		}
		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-direccion1")){
			new Span(webpageId: "index", selector: ".sacsa-direccion1", html:"COL. PUERTO MÉXICO, CP 96510").save(failOnError:true)
		}
		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-direccion2")){
			new Span(webpageId: "index", selector: ".sacsa-direccion2", html:"COATZACOALCOS, VER").save(failOnError:true)
		}
		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-telefono")){
			new Span(webpageId: "index", selector: ".sacsa-telefono", html:"(921) 21 39487").save(failOnError:true)
		}
		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-fax")){
			new Span(webpageId: "index", selector: ".sacsa-fax", html:"(921) 21 89487").save(failOnError:true)
		}
		if(!A.findByWebpageIdAndSelector("index", ".sacsa-correo")){
			new Span(webpageId: "index", selector: ".sacsa-correo", html:"contacto@sacsa.mx").save(failOnError:true)
		}
		if(!Span.findByWebpageIdAndSelector("index", ".sacsa-derechos-reservados")){
			new Span(webpageId: "index", selector: ".sacsa-derechos-reservados",
			html:"SACSA © 2014. Todos los derechos reservados ").save(failOnError:true)
		}






		if(!Ul.findByWebpageIdAndSelector("index", ".sacsa-etiquetas")){
			new Ul(webpageId: "index", selector:".sacsa-etiquetas").save(failOnError:true)


			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 0, html:"Construcción").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 1, html:"Hidráulicas").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 2, html:"Industriales").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 3, html:"Comerciales").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 4, html:"Vía terrestre").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 5, html:"Constructora").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 6, html:"Licitaciones").save(failOnError:true)
			new A(webpageId: "index", selector:".sacsa-etiqueta-seo", index: 7, html:"Construcciones").save(failOnError:true)
		}
	}




	def preloadObrasViasTerrestres(){


		//sacsa-servicio-siguiente & sacsa-servicio-anterior will be set dinamically in the controller

		def servicioWebpageId = "servicio/terrestres"

		Div.findByWebpageIdAndSelectorAndName("servicio", ".sacsa-servicio",servicioWebpageId) ?:
			new Div(webpageId: "servicio", selector:".sacsa-servicio", name:servicioWebpageId).save(failOnError:true )

		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-titulo",html: "Obras de vía terrestre" ).save(failOnError:true)

		Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-texto") ?:
			new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-texto", html:BootstrapHelperHelper.textoServicioTerrestre).save(failOnError:true )



		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-carrusel")){
			Div carruselParent = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel").save(failOnError:true )

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:0,
			src:"img/vulcano/servicios/terrestre/terrestre0.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item", parentId: carruselParent.id,index:1,
			src:"img/vulcano/servicios/terrestre/terrestre1.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:2,
			src:"img/vulcano/servicios/terrestre/terrestre2.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:3,
			src:"img/vulcano/servicios/terrestre/terrestre3.jpg", relativePath: true).save(failOnError:true)
		}



		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-titulo",
			html:"Principales proyectos de vías terrestres realizados.").save(failOnError:true)


		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-carrusel")){
			new  Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel").save(failOnError:true)


			def item0 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 0).save(failOnError:true)
			def item1 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 1).save(failOnError:true)
			def item2 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 2).save(failOnError:true)





			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item0.id,
			src: "img/vulcano/proyectos/puenteNautla.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item1.id,
			src: "img/vulcano/proyectos/pavimentacionUrbana.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item2.id,
			src: "img/vulcano/proyectos/autopistas.jpg" , relativePath: true).save(failOnError:true)



			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item0.id,
			html:"Construcción del puente Cuatro Caminos en el Municipio de Nautla, Veracruz").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item1.id,
			html:"Pavimentación").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item2.id,
			html:"Ingeniería de Transporte e Infraestructura Vial").save(failOnError:true)

			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item0.id,
			html:BootstrapHelperHelper.puente4Camino).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item1.id,
			html:BootstrapHelperHelper.pavimentacion).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item2.id,
			html:BootstrapHelperHelper.ingenieriaVial).save(failOnError:true)
		}





	}






	def preloadDesarrollosHidraulicos(){


		//sacsa-servicio-siguiente & sacsa-servicio-anterior will be set dinamically in the controller

		def servicioWebpageId = "servicio/hidraulicos"


		Div.findByWebpageIdAndSelectorAndName("servicio", ".sacsa-servicio",servicioWebpageId) ?:
			new Div(webpageId: "servicio", selector:".sacsa-servicio", name:servicioWebpageId).save(failOnError:true )

		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-titulo",html: "Desarrollos hidráulicos" ).save(failOnError:true)

		Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-texto") ?:
			new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-texto", html:BootstrapHelperHelper.textoServicioHidraulicos).save(failOnError:true )



		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-carrusel")){

			Div carruselParent = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel").save(failOnError:true )

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:0,
			src:"img/vulcano/servicios/hidraulicos/hidraulicos0.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item", parentId: carruselParent.id,index:1,
			src:"img/vulcano/servicios/hidraulicos/hidraulicos1.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:2,
			src:"img/vulcano/servicios/hidraulicos/hidraulicos2.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:3,
			src:"img/vulcano/servicios/hidraulicos/hidraulicos3.jpg", relativePath: true).save(failOnError:true)
		}



		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-titulo",
			html:"Desarrollos hidráulicos realizados por SACSA").save(failOnError:true)


		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-carrusel")){
			new  Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel").save(failOnError:true)


			def item0 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 0).save(failOnError:true)
			def item1 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 1).save(failOnError:true)
			def item2 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 2).save(failOnError:true)





			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item0.id,
			src: "img/vulcano/proyectos/pozosAIPA.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item1.id,
			src: "img/vulcano/proyectos/colectorPluvial.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item2.id,
			src: "img/vulcano/proyectos/plantaPotabilizadora.jpg" , relativePath: true).save(failOnError:true)



			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item0.id,
			html:"Reparación y mantenimiento de pozos en el activo integral Poza Rica").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item1.id,
			html:"Construcción de colector pluvial, guarniciones, escalinatas, etc., en la ciudad de Coatzacoalcos.").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item2.id,
			html:"Construcción de planta potabilizadora de Chetumal, Quintana Roo.").save(failOnError:true)

			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item0.id,
			html:BootstrapHelperHelper.reparacionPozo).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item1.id,
			html:BootstrapHelperHelper.colectorPluvial).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item2.id,
			html:BootstrapHelperHelper.plantaPotabilizadora).save(failOnError:true)
		}





	}



	def preloadObrasIndustrialesYComerciales(){


		def servicioWebpageId = "servicio/industriales"

		//sacsa-servicio-siguiente & sacsa-servicio-anterior will be set dinamically in the controller



		Div.findByWebpageIdAndSelectorAndName("servicio", ".sacsa-servicio",servicioWebpageId) ?:
			new Div(webpageId: "servicio", selector:".sacsa-servicio", name:servicioWebpageId).save(failOnError:true )

		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-titulo",
			html: "Desarrollos y restauraciones industriales, comerciales y residenciales" ).save(failOnError:true)

		Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-texto") ?:
			new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-texto", html:BootstrapHelperHelper.textoServicioIndustriales).save(failOnError:true )



		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-carrusel")){
			Div carruselParent = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel").save(failOnError:true )

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:0,
			src:"img/vulcano/servicios/industriales/industriales0.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item", parentId: carruselParent.id,index:1,
			src:"img/vulcano/servicios/industriales/industriales1.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:2,
			src:"img/vulcano/servicios/industriales/industriales2.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:3,
			src:"img/vulcano/servicios/industriales/industriales3.jpg", relativePath: true).save(failOnError:true)
		}



		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-titulo",
			html:"Desarrollos y restauraciones realizados por SACSA").save(failOnError:true)


		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-carrusel")){
			new  Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel").save(failOnError:true)


			def item0 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 0).save(failOnError:true)
			def item1 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 1).save(failOnError:true)
			def item2 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 2).save(failOnError:true)
			def item3 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 3).save(failOnError:true)





			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item0.id,
			src: "img/vulcano/proyectos/tv308.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item1.id,
			src: "img/vulcano/proyectos/tanquesDosBocas.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item2.id,
			src: "img/vulcano/proyectos/explanadaEscuela.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item3.id,
			src: "img/vulcano/proyectos/chapodeo.jpg" , relativePath: true).save(failOnError:true)



			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item0.id,
			html:"Restauración de tanque atmosferico de cúpula fija para almacenamiento de kerosina amarga.").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item1.id,
			html:"Terminación de 2 tanques de almacenamiento en la terminal marítima de dos bocas.").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item2.id,
			html:"Construcción de explanada de la escuela primaria Carlos A. Carrillo").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item3.id,
			html:"Chapodeo, retiro de maleza y desazolve de quemadores de emergencia y rack exterior.").save(failOnError:true)


			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item0.id,
			html:BootstrapHelperHelper.tanqueAtmosferico).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item1.id,
			html:BootstrapHelperHelper.tanquesDosBocas).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item2.id,
			html:BootstrapHelperHelper.explanadaPrimaria).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item3.id,
			html:BootstrapHelperHelper.chapodeo).save(failOnError:true)
		}





	}


	def preloadSubcontratacion(){

		def servicioWebpageId = "servicio/subcontratacion"

		//sacsa-servicio-siguiente & sacsa-servicio-anterior will be set dinamically in the controller



		Div.findByWebpageIdAndSelectorAndName("servicio", ".sacsa-servicio",servicioWebpageId) ?:
			new Div(webpageId: "servicio", selector:".sacsa-servicio", name:servicioWebpageId).save(failOnError:true )

		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-titulo",html: "Sub-contratación" ).save(failOnError:true)

		Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-texto") ?:
			new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-texto", html:BootstrapHelperHelper.textoServicioSubcontratacion).save(failOnError:true )



		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicio-carrusel")){
			Div carruselParent = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel").save(failOnError:true )

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:0,
			src:"img/vulcano/servicios/subcontratacion/sub0.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item", parentId: carruselParent.id,index:1,
			src:"img/vulcano/servicios/subcontratacion/sub1.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:2,
			src:"img/vulcano/servicios/subcontratacion/sub2.jpg", relativePath: true).save(failOnError:true)

			new Img(webpageId: servicioWebpageId, selector: ".sacsa-servicio-carrusel-item",  parentId: carruselParent.id,index:3,
			src:"img/vulcano/servicios/subcontratacion/sub3.jpg", relativePath: true).save(failOnError:true)
		}



		H5.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-titulo") ?:
			new H5(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-titulo",
			html:"Proyectos de sub-contratación SACSA").save(failOnError:true)


		if(!Div.findByWebpageIdAndSelector(servicioWebpageId, ".sacsa-servicios-proyectos-carrusel")){
			new  Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel").save(failOnError:true)


			def item0 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 0).save(failOnError:true)
			def item1 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 1).save(failOnError:true)
			def item2 = new Div(webpageId: servicioWebpageId, selector: ".sacsa-servicios-proyectos-carrusel-item", index: 2).save(failOnError:true)





			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item0.id,
			src: "img/vulcano/proyectos/plantaPotabilizadora.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item1.id,
			src: "img/vulcano/proyectos/recursosHumanos.jpg" , relativePath: true).save(failOnError:true)
			new Img(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-image", parentId: item2.id,
			src: "img/vulcano/proyectos/activoPRA.jpg" , relativePath: true).save(failOnError:true)



			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item0.id,
			html:"Construcción de planta potabilizadora de Chetumal, Quintana Roo.").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item1.id,
			html:"Suministro de recursos humanos técnicos y administrativos para el activo integral Poza Rica - Altamira").save(failOnError:true)
			new H5(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-title", parentId: item2.id,
			html:"Rehabilitación de infraestructura en instalaciones de producción del activo integral Poza Rica - Altamira").save(failOnError:true)

			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item0.id,
			html:BootstrapHelperHelper.potabilizadoraChetumal).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item1.id,
			html:BootstrapHelperHelper.recursosHumanosPozaRica).save(failOnError:true)
			new P(webpageId: servicioWebpageId, selector: ".servicios-proyectos-carrusel-item-text", parentId: item2.id,
			html:BootstrapHelperHelper.reabilitacionActivoIntegral).save(failOnError:true)
		}


	}


	def preloadPortafolio(){


		def bootstrapHelperHelper = new BootstrapHelperHelper()

		def servicioWebpageId = "portafolio"

		if(!A.findByWebpageIdAndSelector("portafolio", ".sacsa-portafolio-item")){

			new A(webpageId: servicioWebpageId, selector: ".sacsa-portafolio-category", html:"Autos y Camiones",
			index:0, customParameter: ["data-filter":".autos"]).save(failOnError:true)

			new A(webpageId: servicioWebpageId, selector: ".sacsa-portafolio-category", html:"Tractores", index:1,
			customParameter: ["data-filter":".tractores"]).save(failOnError:true)


			new A(webpageId: servicioWebpageId, selector: ".sacsa-portafolio-category", html:"Maquinaria", index:2,
			customParameter: ["data-filter":".maquinaria"]).save(failOnError:true)


			new A(webpageId: servicioWebpageId, selector: ".sacsa-portafolio-category", html:"Otras Herramientas", index:3,
			customParameter: ["data-filter":".otras"]).save(failOnError:true).save(failOnError:true)






			def args = [:]

			args["webpageId"] = servicioWebpageId
			args["parentSelector"] = ".sacsa-maquinaria-item"
			args["clase"] = "autos"
			args["index"] = 0
			args["imageSelector"] = ".sacsa-maquinaria-image"
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/autos/3TonFord2011.jpg"
			args["titleSelector"] = ".sacsa-maquinaria-titulo"
			args["title"] = "Camión de 3 Toneladas"
			args["textSelector"] = ".sacsa-maquinaria-texto"
			args["text"] = "Marca Ford; Modelo 2008"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "autos"
			args["index"] = 1
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/autos/explorer2010.jpg"
			args["title"] = "Camioneta Explorer Spotrac"
			args["text"] = "Marca Ford; Modelo 2010"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "autos"
			args["index"] = 2
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/autos/Silverado2006.jpg"
			args["title"] = "Camioneta Silverado 1500"
			args["text"] = "Marca Chevrolet; Modelo 2006"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "autos"
			args["index"] = 3
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/autos/tornado.jpg"
			args["title"] = "Camioneta tornado"
			args["text"] = "Marca Chevrolet; Modelo 2006"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "autos"
			args["index"] = 4
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/autos/VolteoFreightlines.jpg"
			args["title"] = "Volteo 14 M3"
			args["text"] = "Marca Freightliner; Modelo 2006"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "tractores"
			args["index"] = 5
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/tractores/cargadorFrontal.jpg"
			args["title"] = "Cargador frontal de 1 tonelada"
			args["text"] = "Marca Bisonte"
			bootstrapHelperHelper.createPortafolioItem(args)



			args["clase"] = "tractores"
			args["index"] = 6
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/tractores/chapeadora.jpg"
			args["title"] = "Chapeadora mecánica"
			args["text"] = "Marca azteca6"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "tractores"
			args["index"] = 7
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/tractores/cuchilla.jpg"
			args["title"] = "Cuchilla niveladora de 2.5 mts"
			args["text"] = "Marca Azteca"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "tractores"
			args["index"] = 8
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/tractores/desvaradora.jpg"
			args["title"] = "Desvaradora de Clutch"
			args["text"] = "Marca Bisonte"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "tractores"
			args["index"] = 9
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/tractores/retroexcabadora.jpg"
			args["title"] = "Retroexcavadora"
			args["text"] = "Marca JBC; Modelo 3C extensión 2009"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "tractores"
			args["index"] = 10
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/tractores/tractorMF545.jpg"
			args["title"] = "Tractor agrícola"
			args["text"] = "Marca Massey Ferguson; Modelo 2008"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "maquinaria"
			args["index"] = 11
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/maquinaria/generador.jpg"
			args["title"] = "Generador eléctrico"
			args["text"] = "7500 Watts; Motor a gasolina de 5hp"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "maquinaria"
			args["index"] = 12
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/maquinaria/hidrolavadora.jpg"
			args["title"] = "Hidrolavadora"
			args["text"] = "Marca Karcher; 8 HP Motor a gasolina"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "maquinaria"
			args["index"] = 13
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/maquinaria/revolvedora.jpg"
			args["title"] = "Revolvedora"
			args["text"] = "Marca Mpower; ½ saco, 8 HP"
			bootstrapHelperHelper.createPortafolioItem(args)



			args["clase"] = "maquinaria"
			args["index"] = 14
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/maquinaria/soldadora.jpg"
			args["title"] = "Máquina de soldar"
			args["text"] = "Marca miller, Modelo trail blazer"
			bootstrapHelperHelper.createPortafolioItem(args)



			args["clase"] = "maquinaria"
			args["index"] = 15
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/maquinaria/vibradorConcreto.jpg"
			args["title"] = "Vibrador para concreto"
			args["text"] = "Marca Mpower; 4 HP"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "otras"
			args["index"] = 16
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/otros/desblozadora.jpg"
			args["title"] = "Desbrozadora"
			args["text"] = "Marca Stilh; Motor a gasolina"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "otras"
			args["index"] = 17
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/otros/herramientasDiversas.jpg"
			args["title"] = "Lote de herramientas diversas"
			args["text"] = ""
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "otras"
			args["index"] = 18
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/otros/hidrolavadora.jpg"
			args["title"] = "Hidrolavadora"
			args["text"] = "Marca Karcher; 1 HP motor eléctrico"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "otras"
			args["index"] = 19
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/otros/motosierraEvans.jpg"
			args["title"] = 'Motosierra de 16"'
			args["text"] = "Marca Evans"
			bootstrapHelperHelper.createPortafolioItem(args)

			args["clase"] = "otras"
			args["index"] = 20
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/otros/motosietrraSithl.jpg"
			args["title"] = 'Motosierra de 21"'
			args["text"] = "Marca Stihl"
			bootstrapHelperHelper.createPortafolioItem(args)


			args["clase"] = "otras"
			args["index"] = 21
			args["imgSrc"] = "img/vulcano/servicios/maquinaria/otros/podadoraGasolina.jpg"
			args["title"] = "Podadora con motor a gasolina"
			args["text"] = "Marca Briggs & Stratton; 4HP"
			bootstrapHelperHelper.createPortafolioItem(args)


		}

	}



	def preloadNosotros(){
		def webpageId = "nosotros"



		if(!Img.findByWebpageIdAndSelector(webpageId, ".sacsa-nosotros-imagen")){
			new Img(webpageId: webpageId, selector: ".sacsa-nosotros-imagen", index: 0,
			src:"img/vulcano/nosotros/logo.jpg", relativePath: true).save(failOnError:true)
			new Img(webpageId: webpageId, selector: ".sacsa-nosotros-imagen", index: 1,
			src:"img/vulcano/nosotros/sacsaOficina.jpg", relativePath: true).save(failOnError:true)
			new Img(webpageId: webpageId, selector: ".sacsa-nosotros-imagen", index: 2,
			src:"img/vulcano/nosotros/ejemplo.jpg", relativePath: true).save(failOnError:true)
		}


		H5.findByWebpageIdAndSelector(webpageId, ".sacsa-nosotros-titulo") ?:
			new H5(webpageId: webpageId, selector: ".sacsa-nosotros-titulo", html:"¿Quiénes somos?").save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".quienes-somos-contenido") ?:
			new Div(webpageId: webpageId, selector: ".quienes-somos-contenido", html:BootstrapHelperHelper.quienesSomos).save(failOnError:true)

		A.findByWebpageIdAndSelector(webpageId, ".sacsa-mision") ?:
			new A(webpageId: webpageId, selector: ".sacsa-mision", html: " Misión").save(failOnError:true)

		A.findByWebpageIdAndSelector(webpageId, ".sacsa-vision") ?:
			new A(webpageId: webpageId, selector: ".sacsa-vision", html: " Visión").save(failOnError:true)

		A.findByWebpageIdAndSelector(webpageId, ".sacsa-valores") ?:
			new A(webpageId: webpageId, selector: ".sacsa-valores", html: " Valores").save(failOnError:true)


		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-mision-texto") ?:
			new Div(webpageId: webpageId, selector: ".sacsa-mision-texto", html:BootstrapHelperHelper.mision).save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-vision-texto") ?:
			new Div(webpageId: webpageId, selector: ".sacsa-vision-texto", html:BootstrapHelperHelper.vision).save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-valores-texto") ?:
			new Div(webpageId: webpageId, selector: ".sacsa-valores-texto", html:BootstrapHelperHelper.valores).save(failOnError:true)

		H5.findByWebpageIdAndSelector(webpageId, ".sacsa-tipo-obras") ?:
			new H5(webpageId: webpageId, selector: ".sacsa-tipo-obras", html:"Tipos de Obras desarrolladas").save(failOnError:true)


		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-terrestre") ?:
			new  Div(webpageId: webpageId, selector: ".sacsa-progressbar-terrestre", html: "Obras de vías Terrestres 30%",
			customParameter: ["width": "100%"]).save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-hidraulico") ?:
			new  Div(webpageId: webpageId, selector: ".sacsa-progressbar-hidraulico", html: "Desarrollos hidráulicos 20%",
			customParameter: ["width": "70%"]).save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-industriales") ?:
			new  Div(webpageId: webpageId, selector: ".sacsa-progressbar-industriales", html: "Obras Industriales y Comerciales 30%",
			customParameter: ["width": "100%"]).save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-progressbar-subcontratacion") ?:
			new  Div(webpageId: webpageId, selector: ".sacsa-progressbar-subcontratacion", html: "Sub-Contratación 20%",
			customParameter: ["width": "70%"]).save(failOnError:true)

		Div.findByWebpageIdAndSelector(webpageId, ".sacsa-equipo-trabajo") ?:
			new H5(webpageId: webpageId, selector: ".sacsa-equipo-trabajo", html:"Conoce a nuestro equipo").save(failOnError:true)

		if(!H5.findByWebpageIdAndSelector(webpageId, ".sacsa-equipo-item")){

			def teamMember0 = new Div(webpageId: webpageId, selector: ".sacsa-equipo-item", index: 0).save(failOnError:true)
			def teamMember1 = new Div(webpageId: webpageId, selector: ".sacsa-equipo-item", index: 1).save(failOnError:true)
			def teamMember2 = new Div(webpageId: webpageId, selector: ".sacsa-equipo-item", index: 2).save(failOnError:true)


			new Img(webpageId: webpageId, selector: ".sacsa-equipo-item-imagen", parentId:teamMember0.id,
			src:"img/smiling-group/photo (1).jpg", relativePath: true).save(failOnError:true)
			new H4(webpageId: webpageId, selector: ".sacsa-equipo-item-nombre", html:"Nombre director",
			parentId:teamMember0.id).save(failOnError:true)
			new Span(webpageId: webpageId, selector: ".sacsa-equipo-item-posicion", html:"Director general",
			parentId:teamMember0.id).save(failOnError:true)
			new P(webpageId: webpageId, selector: ".sacsa-equipo-item-descripcion", html: BootstrapHelperHelper.director,
			parentId:teamMember0.id).save(failOnError:true)


			new Img(webpageId: webpageId, selector: ".sacsa-equipo-item-imagen", parentId:teamMember1.id,
			src:"img/smiling-group/photo (2).jpg", relativePath: true).save(failOnError:true)
			new H4(webpageId: webpageId, selector: ".sacsa-equipo-item-nombre", html:"Nombre administrador",
			parentId:teamMember1.id).save(failOnError:true)
			new Span(webpageId: webpageId, selector: ".sacsa-equipo-item-posicion", html:"Jefe de servicios administrativos",
			parentId:teamMember1.id).save(failOnError:true)
			new P(webpageId: webpageId, selector: ".sacsa-equipo-item-descripcion", html: BootstrapHelperHelper.administrador,
			parentId:teamMember1.id).save(failOnError:true)


			new Img(webpageId: webpageId, selector: ".sacsa-equipo-item-imagen", parentId:teamMember2.id,
			src:"img/smiling-group/photo (3).jpg", relativePath: true).save(failOnError:true)
			new H4(webpageId: webpageId, selector: ".sacsa-equipo-item-nombre", html:"Nombre jefe de obras",
			parentId:teamMember2.id).save(failOnError:true)
			new Span(webpageId: webpageId, selector: ".sacsa-equipo-item-posicion", html:"Jefe de obras",
			parentId:teamMember2.id).save(failOnError:true)
			new P(webpageId: webpageId, selector: ".sacsa-equipo-item-descripcion", html: BootstrapHelperHelper.jefeOperaciones,
			parentId:teamMember2.id).save(failOnError:true)
		}
	}



	def preloadEmpleos(){

		def webpageId = "empleo"


		if(!H5.findByWebpageIdAndSelector(webpageId, ".sacsa-puesto-disponible")) {
			new Div(webpageId: webpageId, selector: ".sacsa-puesto-disponibles").save(failOnError:true)

			def empleo0 = new Div(webpageId: webpageId, selector: ".sacsa-empleo-item", index:0).save(failOnError:true)
			def empleo1 = new Div(webpageId: webpageId, selector: ".sacsa-empleo-item", index:1).save(failOnError:true)
			def empleo2 = new Div(webpageId: webpageId, selector: ".sacsa-empleo-item", index:2).save(failOnError:true)

			new A(webpageId: webpageId, selector: ".sacsa-empleo-titulo", html: "Puesto: Valar morghulis", parentId:empleo0.id).save(failOnError:true)
			new Div(webpageId: webpageId, selector: ".sacsa-empleo-texto", html: BootstrapHelperHelper.valyrian, parentId:empleo0.id).save(failOnError:true)

			new A(webpageId: webpageId, selector: ".sacsa-empleo-titulo", html: "Puesto: Valar dohaeris", parentId:empleo1.id).save(failOnError:true)
			new Div(webpageId: webpageId, selector: ".sacsa-empleo-texto", html: BootstrapHelperHelper.valyrian, parentId:empleo1.id).save(failOnError:true)

			new A(webpageId: webpageId, selector: ".sacsa-empleo-titulo", html: "Puesto: Kesir gīmī", parentId:empleo2.id).save(failOnError:true)
			new Div(webpageId: webpageId, selector: ".sacsa-empleo-texto", html: BootstrapHelperHelper.valyrian, parentId:empleo2.id).save(failOnError:true)
		}


	}




}
