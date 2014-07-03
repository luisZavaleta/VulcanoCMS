package mx.vulcanosw.sacsa.cms

import grails.converters.JSON
import mx.vulcanosw.cms.html.*

import org.codehaus.groovy.grails.web.converters.exceptions.ConverterException
import org.hibernate.SessionFactory

class CMSSaveController {

	SessionFactory sessionFactory

	def img(){

		Img img;

		if(params.id){
			img = Img.findById(params.id)
		}else{
			img = new Img()
		}


		if(img == null || !params.selector || !params.webpageId){
			response.sendError(400)
			return
		}

		img.selector = params.selector
		img.webpageId = params.webpageId

		if(params.index){
			img.index = params.index
		}

		if(params. parent){
			img.parent = params.parent
		}


		if(params.src){
			img.src = params.src
		}

		img.save()

		render img.errors as JSON
	}



	def save(){


		if(!params.type){
			response.sendError(400)
			return
		}

		def parentElement;
		def htmlElement = Class.forName("mx.vulcanosw.cms.html."+params.type, true, Thread.currentThread().getContextClassLoader()).newInstance() //HtmlElement

		if(params.id){
			def idElement = params.id

			if(!idElement.isNumber()){
				response.sendError(400)
				return
			}

			htmlElement = htmlElement.class.findById(idElement.toLong()) //findById Called using instance 'because we don't know the class name

			if(!htmlElement){
				response.sendError(400)
			}
		}

		bindData(htmlElement, params)

		if(htmlElement.save()){
			render htmlElement as JSON
			return
		}else{
			render htmlElement.errors as JSON
			return
		}

	}


	def relocate(){
		def hibSession = sessionFactory.getCurrentSession()
		def json = params.id
		def newIdsAndIndexes;

		try{
			newIdsAndIndexes = JSON.parse(json)

		}catch(ConverterException ce){
			response.sendError(400)
			return;
		}catch(IllegalArgumentException iae){
			response.sendError(400)
			return;
		}

		if(newIdsAndIndexes.size() < 1){
			//if we have only one element we can't delete a shit
			response.sendError(400)
			return;
		}

		def firstElement = newIdsAndIndexes[0]

		def elementIdFirstElement = firstElement.elementId

		if(!elementIdFirstElement || !elementIdFirstElement.isLong()){
			response.sendError(400)
			return;
		}



		newIdsAndIndexes = newIdsAndIndexes.findAll{ it?.elementId?.isLong()}
		newIdsAndIndexes = newIdsAndIndexes.sort{ it.elementId.toLong()}

		def htmlElement = HtmlElement.findById(elementIdFirstElement.toLong())
		def allElements;

		if(htmlElement.parentId){
			allElements = htmlElement.class.findAllBySelectorAndParentId(htmlElement.selector, htmlElement.parentId, [sort:"id", order: "asc"]) //seems silly but we are lookin for all silbing elements, including itself
		}else{
			allElements = htmlElement.class.findAllBySelector(htmlElement.selector, [sort:"id", order: "asc"])
		}


		hibSession.flush()

		def cont = 0;

		for(def element: allElements){
			if(newIdsAndIndexes[cont] != null){
				if(element.id == newIdsAndIndexes[cont].elementId.toLong()){
					element.index = newIdsAndIndexes[cont].index
					element.save(flush:true)
					cont ++
				}else if(element.id < newIdsAndIndexes[cont].elementId.toLong()){
					element.delete(flush:true)
				}else{
					cont ++
				}
			}else{
				element.delete(flush:true)

			}
		}
		render "ok"
		return
	}

	def index() {
	}
}

//

