package mx.vulcanosw.cms.html

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class WebSite {


	String name

	static hasMany = [webpages: WebPage]


	static constraints = { name(unique:true) }



	@Override
	boolean equals(other) {
		if (is(other)) {
			return true
		}
		if (!(other instanceof WebSite)) {
			return false
		}

		new EqualsBuilder()
			.append(this.name, other.name)
			.isEquals()
	}


	@Override
	int hashCode() {
		new HashCodeBuilder()
			.append(this.name)
			.toHashCode()
	}
}
