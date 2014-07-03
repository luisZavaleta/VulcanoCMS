package mx.vulcanosw.cms.html

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includeFields=true)
class HtmlElement {



	//this is an html selector, will be used to put
	//automatically the value in the HTML WebPage
	//basically what we have to do is to create programatically a
	//representation of a web page so it can fill all the data
	// by itselft, with no other human interaciotn.



	/**
	 * Ok  after a lot of thinking about how to represent groups of elements this is what will happen; we have 3 fields: selector, index and parent
	 *depending in the content of those fields we're gonna infer the type of element according to the following rules:
	 *
	 * @selector: A strong independent element who don't need no other identifier.
	 * @selector & @index: independent groups (groups which elements doesn't have  child elements)
	 * @selector & @parent: child elements with predifined structure inside the parent (for example independent carousel slides)
	 * @selector & @index & @parent: Complex elements for example slides inside slides.
	 *
	 *
	 *Al momento que se va a guardar un elemento, lo único que se puede y debe modificar de los elementos "hermanos" es el index, todo lo demás permanece intacto
	 *cuando modificamos un elemento con index, se tienen que mandar el selector y/o parent de los elementos hermanos, eto con el fin demodificar el index de todos.
	 **/

	String webpageId
	String selector
	Long index
	Long parentId
	String name
	String html

	//used to add posible custom parameters
	Map customParameter


	List<HtmlElement> childElements






	static constraints = {

		webpageId(unique: [
			'selector',
			'parentId',
			'index'
		], nullable:false,blank:false)
		selector ( nullable:false,blank:false)
		index (nullable:true,blank:true)
		parentId (nullable:true,blank:true)
		name(nullable:true,blank:true)
		html(nullable:true, blank:true)
		childElements(nullable:true,blank:true)
		customParameter(nullable:true,blank:true)

	}


	static mapping = {
		group column: "grupo"
		html type:'text'
	}



}
