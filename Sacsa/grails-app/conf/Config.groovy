// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.use.accept.header = false
grails.mime.types = [
	all:           '*/*',
	atom:          'application/atom+xml',
	css:           'text/css',
	csv:           'text/csv',
	form:          'application/x-www-form-urlencoded',
	html:          [
		'text/html',
		'application/xhtml+xml'
	],
	js:            'text/javascript',
	json:          [
		'application/json',
		'text/json'
	],
	multipartForm: 'multipart/form-data',
	rss:           'application/rss+xml',
	text:          'text/plain',
	xml:           [
		'text/xml',
		'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// What URL patterns should be processed by the resources plugin
grails.resources.adhoc.patterns = [
	'/images/*',
	'/css/*',
	'/js/*',
	'/plugins/*'
]

// The default codec used to encode data with ${}
grails.views.default.codec = "none" // none, html, base64
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
// enable Sitemesh preprocessing of GSP pages
grails.views.gsp.sitemesh.preprocess = true
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

environments {
	development {
		grails.logging.jul.usebridge = true
	}
	production {
		grails.logging.jul.usebridge = false
		// TODO: grails.serverURL = "http://www.changeme.com"
	}
}

// log4j configuration
log4j = {
	// Example of changing the log pattern for the default console appender:
	//
	//appenders {
	//    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
	//}

	error  'org.codehaus.groovy.grails.web.servlet',        // controllers
		'org.codehaus.groovy.grails.web.pages',          // GSP
		'org.codehaus.groovy.grails.web.sitemesh',       // layouts
		'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
		'org.codehaus.groovy.grails.web.mapping',        // URL mapping
		'org.codehaus.groovy.grails.commons',            // core / classloading
		'org.codehaus.groovy.grails.plugins',            // plugins
		'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
		'org.springframework',
		'org.hibernate',
		'net.sf.ehcache.hibernate'
}



grails {
	mail {
		host = "smtp.gmail.com"
		port = 465
		username = "apps@vulcanosw.mx"
		password = "5zX5M7wUBMPf60"
		props = ["mail.smtp.auth":"true",
			"mail.smtp.socketFactory.port":"465",
			"mail.smtp.socketFactory.class":"javax.net.ssl.SSLSocketFactory",
			"mail.smtp.socketFactory.fallback":"false"]

	}
}


// Uncomment and edit the following lines to start using Grails encoding & escaping improvements

/* remove this line
 // GSP settings
 grails {
 views {
 gsp {
 encoding = 'UTF-8'
 htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
 codecs {
 expression = 'html' // escapes values inside null
 scriptlet = 'none' // escapes output from scriptlets in GSPs
 taglib = 'none' // escapes output from taglibs
 staticparts = 'none' // escapes output from static template parts
 }
 }
 // escapes all not-encoded output at final stage of outputting
 filteringCodecForContentType {
 //'text/html' = 'html'
 }
 }
 }
 remove this line */

grails.resources.modules = {


	vulcanoutil{ resource url:"js/cms/vulcano/vulcano-util-1.5.0.js" }

	jquery{
		resource url:"js/jquery-2.0.3.min.js"
		resource url:"js/jquery-migrate-1.2.1.min.js"

	}

	indexadmin{
		resource url:"js/cms/custom/index-structure.js"
		resource url:"js/cms/custom/index-main.js"

	}

	headerfooteradmin{ resource url:"js/cms/custom/header-footer-structure.js" }


	sacsacustom { resource url:"js/vulcano-sacsa-custom.js" }

	servicioadmin{
		dependsOn "headerfooteradmin"
		resource url:"js/cms/custom/servicio-structure.js"
		resource url:"js/cms/custom/servicio-main.js"
	}



	portafolioadmin{
		dependsOn "headerfooteradmin"
		resource url:"js/cms/custom/portafolio-structure.js"
		resource url:"js/cms/custom/portafolio-main.js"
	}


	nosotrosadmin{
		dependsOn "headerfooteradmin, sacsacustom"
		resource url:"js/cms/custom/nosotros-structure.js"
		resource url:"js/cms/custom/nosotros-main.js"
	}


	contactoadmin{
		dependsOn "headerfooteradmin"
		resource url:"js/cms/custom/contacto-main.js"
	}



	empleoadmin{
		dependsOn "headerfooteradmin"
		resource url:"js/cms/custom/empleo-main.js"
	}


	contacto{
		dependsOn "vulcanoutil"
		resource url:"js/pages/contacto.js"
	}


	fileupload{
		dependsOn : "jquery, vulcanoutil"
		resource url:"js/fileUpload/jquery.ui.widget.js"
		resource url:"js/fileUpload/jquery.fileupload.js"
		resource url:"js/fileUpload/jquery.iframe-transport.js"
		resource url:"js/fileUpload/custom.js"


		resource url:"css/fileUpload/style.css"


	}



}



// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'mx.vulcanosw.security.Usuario'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'mx.vulcanosw.security.UsuarioRol'
grails.plugin.springsecurity.authority.className = 'mx.vulcanosw.security.Rol'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [

	'/servicio/*':                          ['permitAll'],
	'/main/portafolio':                     ['permitAll'],
	'/main/nosotros':                       ['permitAll'],
	'/main/contacto':                  		['permitAll'],
	'/main/empleo':                    		['permitAll'],
	'/main/index':                          ['permitAll'],
	'/main/contactoMail':                   ['permitAll'],
	'/':                              		['permitAll'],
//	'/main/index':                              		['permitAll'],
//	'/main/index.gsp':                              	['permitAll'],
//	'/vcalendar/getAvailableAppointments':				['permitAll'],
//	'/vcalendar/createEvent':							['permitAll'],
//	'/main/mail':										['permitAll'],
//	'/main/mail2':										['permitAll'],
//	'/':                              					['permitAll'],
//	'/index':                         					['permitAll'],
//	'/index.gsp':                     					['permitAll'],
	'/**/js/**':                      					['permitAll'],
	'/**/css/**':                     					['permitAll'],
	'/**/images/**':                  					['permitAll'],
	'/**/img/**':                  						['permitAll'],
	'/**/favicon.ico':                					['permitAll'],
	'/**': 												['ROLE_ADMIN']
	]