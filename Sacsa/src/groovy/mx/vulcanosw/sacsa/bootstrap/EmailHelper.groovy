package mx.vulcanosw.sacsa.bootstrap

class EmailHelper {


	static getCorreoTexto(nombre, correo, titulo, mensaje){
		return """\
		<span style='font-weight: bold'> Nombre: </span>
			${nombre}
		<br />
		<span style='font-weight: bold'> Correo: </span>
			${correo}
		<br />
		<span style='font-weight: bold'> Título: </span>
			${titulo}
		<br />
		<span style='font-weight: bold'> Texto: </span>
			${mensaje}
		<br />
		"""
	}
}



