$(function() {

	var ul = $('#upload ul.file-name');

	$('#drop a').click(function() {
		// Simulate a click on the file input button
		// to show the file browser dialog
		$(this).parent().find('input').click();
	});

	// Initialize the jQuery File Upload plugin
	$('#upload')
			.fileupload(
					{

						// This element will accept file drag/drop uploading
						dropZone : $('#drop'),

						// This function is called when a file is added to the queue;
						// either via the browse button, or via drag/drop:
						add : function(e, data) {

							if (data.files[0].size > 1000000) {
								alert("no se pueden enviar archivos de más de 1 MB")
								return false;
							}

							var extn = data.files[0].name
							extn = extn.split(".")
							extn = extn[extn.length - 1]

							if (extn != "doc" && extn != "docx" && extn != "pdf" && extn != "rtf" && extn != "odf") {
								alert("El curriculum debe estar en formato word (doc) o PDF.")
								return false;
							}

							var tpl = $('<li class="working"><input type="text" value="0" data-width="48" data-height="48"'
									+ ' data-fgColor="#0788a5" data-readOnly="1" data-bgColor="#3e4043" /><p></p><span class="remove-btn"></span></li>');

							tpl.find('p').text(data.files[0].name).append(
									'<i>' + formatFileSize(data.files[0].size) + '</i>');

							console.log(data.files[0])
							ul.html(tpl)

							tpl.find('span.remove-btn').click(function() {
								$(".enviar-curriculum").unbind();
								ul.html('')

							});

							// data.submit();
							$(".enviar-curriculum").unbind();
							$(".enviar-curriculum").click(function(event) {
								event.preventDefault();
								data.submit();

							})

						},

						fail : function(e, data) {
							// Something has gone wrong!
							data.context.addClass('error');
						},
						done : function(e, data) {

							resetSendMailForm()
						}

					});
 
	// Prevent the default action when a file is dropped on the window
	$(document).on('drop dragover', function(e) {
		e.preventDefault();
	});

	// Helper function that formats the file sizes
	function formatFileSize(bytes) {
		if (typeof bytes !== 'number') {
			return '';
		}

		if (bytes >= 1000000000) {
			return (bytes / 1000000000).toFixed(2) + ' GB';
		}

		if (bytes >= 1000000) {
			return (bytes / 1000000).toFixed(2) + ' MB';
		}

		return (bytes / 1000).toFixed(2) + ' KB';
	}

});

// envío sin archivo de curriculum
function sendCurriculum() {

	$("form").submit(function(e) {

		e.preventDefault();

		var formData = new FormData(this);

		console.log("form_data")

		var form = this
		alert("ajax")
		$.ajax({
			url : getAbsolutePath("/main/mail"),
			type : "POST",
			data : formData,
			mimeType : "multipart/form-data",
			contentType : false,
			cache : false,
			processData : false,
			success : function(data, textStatus, jqXHR) {

				resetSendMailForm()
			},
			error : function(jqXHR, textStatus, errorThrown) {
			}

		});

	});

}
// admin/probando

$(document).ready(function() {
	sendCurriculum()
})

function resetSendMailForm() {
	$("#nombre").val("")
	$("#correo").val("")
	$("#titulo").val("")
	$("#mensaje").val("")
	$("#upl").val("")
	$(".file-name").html("")
	alert("Corriculum enviado correctamente")
}