$(document).ready(function() {
	// $("").on("click", function(event) {
	$("form.contact-form").submit(function(e) {
		e.preventDefault();

		var formData = new FormData(this);

		console.log("form_data")

		var form = this

		$.ajax({
			url : getAbsolutePath("/main/contactoMail"),
			type : "POST",
			data : getContactoData(),

			success : function(data, textStatus, jqXHR) {
				alert("Información enviada, Gracias")
				resetContactoForm()

			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("Información enviada, Gracias")
			}

		});

	});
	
	/*
	 * window.alert = function(message) { // do something here console.log("overrided--->" +
	 * message) };
	 */

})

function resetContactoForm() {

	$("#contacto-nombre").val("")
	$("#contacto-correo").val("")
	$("#contacto-titulo").val("")
	$("#contacto-texto").val("")
}

function getContactoData() {

	var data = {}

	data.nombre = $("#contacto-nombre").val()
	data.correo = $("#contacto-correo").val()
	data.titulo = $("#contacto-titulo").val()
	data.mensaje = $("#contacto-texto").val()

	return data

}