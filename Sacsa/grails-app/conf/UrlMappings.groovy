class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}


		"/servicio/$id?"(controller: "main", action:"servicio")


		"/"(controller: "main", action:"index")
		"500"(view:'/error')
	}
}
