package mx.vulcanosw.sacsa.html

import mx.vulcanosw.cms.html.*




class WebPageHelperService {

	def grailsApplication


	def setImageAbsolutePath(Img img){

		if(img?.relativePath){
			def g = grailsApplication.mainContext.getBean('org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib')
			img.src = g.resource(dir: '/', file:img.src )
			img.relativePath = false
			img.save(failOnError:true)
		}
	}


	def getCarruselData(){

		def carrusel = []
		def carrusel0 = [:]
		def carrusel1 = [:]
		def carrusel2 = [:]
		def carrusel3 = [:]

		carrusel.push(carrusel0)
		carrusel.push(carrusel1)
		carrusel.push(carrusel2)
		carrusel.push(carrusel3)


		carrusel0["preTitulo"] = new Div(html:"CONTRUCCI�N DE ")
		carrusel0["titulo"] = new Div(html:"OBRAS DE V�A TERRESTRE")
		carrusel0["descripcion"] = new Div(html:" Amplia experiencia en el desarrollo y rehabilitaci�n de puentes, caminos y carreteras.<br>Contamos con la tecnolog�a y los conocimientos para la conclusi�n de proyectos en tiempo, dentro de presupuesto y cumpliendo con los m�s altos estandares de calidad. ")
		carrusel0["imagenPrincipal"] = new Img(src: "sacsa/fondo1.jpg")
		carrusel0["imagenSecundaria"] = new Img(src: "sacsa/completo1.jpg")


		carrusel1["preTitulo"] = new Div(html:"CONTRUCCI�N DE ")
		carrusel1["titulo"] = new Div(html:"OBRAS DE V�A TERRESTRE")
		carrusel1["descripcion"] = new Div(html:" Amplia experiencia en el desarrollo y rehabilitaci�n de puentes, caminos y carreteras.<br>Contamos con la tecnolog�a y los conocimientos para la conclusi�n de proyectos en tiempo, dentro de presupuesto y cumpliendo con los m�s altos estandares de calidad. ")
		carrusel1["imagenPrincipal"] = new Img(src: "sacsa/fondo1.jpg")
		carrusel1["imagenSecundaria"] = new Img(src: "sacsa/completo1.jpg")


		carrusel2["preTitulo"] = new Div(html:"CONTRUCCI�N DE ")
		carrusel2["titulo"] = new Div(html:"OBRAS DE V�A TERRESTRE")
		carrusel2["descripcion"] = new Div(html:" Amplia experiencia en el desarrollo y rehabilitaci�n de puentes, caminos y carreteras.<br>Contamos con la tecnolog�a y los conocimientos para la conclusi�n de proyectos en tiempo, dentro de presupuesto y cumpliendo con los m�s altos estandares de calidad. ")
		carrusel2["imagenPrincipal"] = new Img(src: "sacsa/fondo1.jpg")
		carrusel2["imagenSecundaria"] = new Img(src: "sacsa/completo1.jpg")


		carrusel3["preTitulo"] = new Div(html:"CONTRUCCI�N DE ")
		carrusel3["titulo"] = new Div(html:"OBRAS DE V�A TERRESTRE")
		carrusel3["descripcion"] = new Div(html:" Amplia experiencia en el desarrollo y rehabilitaci�n de puentes, caminos y carreteras.<br>Contamos con la tecnolog�a y los conocimientos para la conclusi�n de proyectos en tiempo, dentro de presupuesto y cumpliendo con los m�s altos estandares de calidad. ")
		carrusel3["imagenPrincipal"] = new Img(src: "sacsa/fondo1.jpg")
		carrusel3["imagenSecundaria"] = new Img(src: "sacsa/completo1.jpg")
	}
}
