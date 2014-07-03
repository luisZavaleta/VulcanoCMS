
<div id="contact-1" class="main-wrapper">
	<!-- /.page-title-wrapper -->
	<section id="google-map" class="section google-map pad-top-0">
		<iframe
			src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3791.3413074245686!2d-94.45097285000001!3d18.148184649999997!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x85e9830fa65fe349%3A0xa74791c9c4d2e8d5!2sServcios+Administrativos+y+de+Construcci%C3%B3n!5e0!3m2!1ses!2s!4v1394399751299"
			width="100%" height="350" frameborder="0" scrolling="no"
			marginheight="0" marginwidth="0"></iframe>
	</section>
	<!-- /#google-map -->
	<section id="contact-us" class="pad-25">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="visit-us pad-top-25">
						<div class="subpage-title">
							<h5>
								<i class="fa fa-compass"></i>
								Dirección
							</h5>
						</div>
						<address>
							<strong class="sacsa-rfc" data-id="${model?.footer?.rfc?.id}">
								${model?.footer?.rfc?.html}
							</strong>
							<br>
							<span class="sacsa-direccion0"
								data-id="${model?.footer?.rfc?.id}">
								${model?.footer?.direccion0?.html}
							</span>
							<br>
							<span class="sacsa-direccion1"
								data-id="${model?.footer?.direccion1?.id}">
								${model?.footer?.direccion1?.html}
							</span>
							<br>
							<span class="sacsa-direccion2"
								data-id="${model?.footer?.direccion2?.id}">
								${model?.footer?.direccion2?.html}
							</span>
						</address>
					</div>
					<div class="contact-numbers pad-top-25">
						<div class="subpage-title">
							<h5>
								<i class="fa fa-phone"></i>
								Contactos
							</h5>
						</div>
						<address>
							Teléfono:
							<span class="sacsa-telefono"
								data-id="${model?.footer?.telefono?.id}">
								${model?.footer?.telefono?.html}
							</span>
							<br>
							Fax:
							<span class="sacsa-fax" data-id="${model?.footer?.fax?.id}">
								${model?.footer?.fax?.html}
							</span>
							<br>
							<a href="mailto:${model?.footer?.correo?.html}"
								class="sacsa-correo" data-id="${model?.footer?.correo?.id}">
								${model?.footer?.correo?.html}
							</a>
						</address>
					</div>
				</div>
				<div class="col-md-8">
					<form class="contact-form pad-25" >
						<div class="subpage-title">
							<h5>Envíanos un mensaje</h5>
						</div>
						<div class="row">
							<div class="col-md-4">
								<input class="form-control" placeholder="Nombre (requerido)" id="contacto-nombre" name="contacto-nombre"
									type="text">
							</div>
							<div class="col-md-4">
								<input class="form-control" placeholder="Correo (requerido)"  id="contacto-correo" name="contacto-correo"
									type="text">
							</div>
							<div class="col-md-4">
								<input class="form-control" placeholder="Título (requerido)"  id="contacto-titulo" name="contacto-titulo"
									type="text">
							</div>
						</div>
						<!-- row-fluid -->
						<textarea class="form-control" id="contacto-texto" name="contacto-texto"
							placeholder="Tú mensaje (requerido)" rows="3"></textarea>
						<button class="btn btn-flat flat-color btn-rounded enviar-contacto">Enviar</button>
					</form>
					<!-- /.contact-form -->
				</div>
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>
	<!-- /#contact-us -->
	<input id="baseURL" type="hidden" value ="${resource()}">
</div>