package mx.vulcanosw.cms.html

class Section  extends HtmlElement{
	List<HtmlElement> elements
	static belongsTo = [page: WebPage]
}
