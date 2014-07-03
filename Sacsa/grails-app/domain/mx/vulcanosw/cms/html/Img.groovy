package mx.vulcanosw.cms.html

class Img extends HtmlElement{



	String src
	Boolean relativePath




	static constraints = {
		src (blank:true, nullable:true)
	}


	static mapping = { src type: "text" }
}
