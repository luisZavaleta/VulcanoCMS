package mx.vulcanosw.cms.html

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder



class WebPage{

	String name


	static hasMany = [sections: Section]

	static belongsTo = [site: WebSite]

	static constraints = {
		name(unique:['site'])
	}

	@Override
	boolean equals(other) {
		if (is(other)) {
			return true
		}
		if (!(other instanceof WebPage)) {
			return false
		}

		new EqualsBuilder()
			.append(this.name, other.name)
			.append(this.site, other.site)
			.isEquals()
	}


	@Override
	int hashCode() {
		new HashCodeBuilder()
			.append(this.name)
			.append(this.site)
			.toHashCode()
	}
}
