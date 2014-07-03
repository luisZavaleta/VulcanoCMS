package mx.vulcanosw.cms.util
import mx.vulcanosw.cms.html.HtmlElement

class CustomParameter {

	String name
	String value


	static belongsTo = [htmlElement: HtmlElement]

	static constraints = {
	}
}
