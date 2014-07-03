package sacsa

class SacsaTagLib {
	static defaultEncodeAs = 'html'
	//static encodeAsForTags = [tagName: 'raw']


	def hola = { attrs, body ->


		def textos = attrs.textos
		def index = attrs.indx

		for(texto in textos){

			if(texto.contains("%")){

				def textoArray = texto.split("%")
				textoArray = textoArray[0]
				textoArray = textoArray.split(" ")

				def percent = textoArray[textoArray.size() - 1]


				if(percent.isNumber()){

				}
			}

		}


	}
}
