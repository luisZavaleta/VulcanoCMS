<r:require modules="fileupload" />
<div id="contact-1" class="main-wrapper">
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
					<g:form id="upload" method="post"
						url="[action:'mail',controller:'main']"
						class="contact-form pad-25" enctype="multipart/form-data">
						<%--<form id="upload" method="post" action="../main/mail"
							class="contact-form pad-25" enctype="multipart/form-data">
						
					<form class="contact-form pad-25" name="envioCurriculum">
					 --%>
						<div class="subpage-title">
							<h5>ENVIANOS TU CURRICULUM</h5>
						</div>
						<div class="row">
							<div class="col-md-4">
								<input class="form-control" name="nombre" id="nombre"
									placeholder="Nombre (requerido)" type="text">
							</div>
							<div class="col-md-4">
								<input class="form-control" name="correo" id="correo"
									placeholder="Correo (requerido)" type="text">
							</div>
							<div class="col-md-4">
								<input class="form-control" name="titulo" id="titulo"
									placeholder="Título (requerido)" type="text">
							</div>
						</div>
						<!-- row-fluid -->
						<div class="row">
							<div class="col-md-12">
								<textarea class="form-control" name="mensaje" id="mensaje"
									placeholder="Tú mensaje (requerido)" rows="3"></textarea>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12" style="text-align: center">
								<ul class="file-name">
									<!-- The file uploads will be shown here -->
								</ul>
								<div id="drop">
									<a>Subir Curriculum</a>
									<input type="file" name="upl" multiple />
								</div>
								<%-- 
								<input type="file" id="curriculum" name="curriculum" size="40">
								<%--  Latta,
								<div class="fileinput fileinput-new" data-provides="fileinput">
									<span class="btn btn-default btn-file">
										<span class="fileinput-new">Subir Curriculum</span>
										<span class="fileinput-exists">Cambiar Archivo</span>
										<input type="file" name="...">
									</span>
									<span class="fileinput-filename"></span>
									<a href="#" class="close fileinput-exists"
										data-dismiss="fileinput" style="float: none">&times;</a>
								</div>
								
								--%>
							</div>
						</div>
						<button
							class="btn btn-flat flat-color btn-rounded enviar-curriculum">Enviar</button>
					</g:form>
					<!-- /.contact-form -->
				</div>
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>
	<section>
		<div class="col-md-12 pad-25  sacsa-puestos-disponibles-container">
			<div class="subpage-title sacsa-puesto-disponibles">
				<h5>Puestos disponibles</h5>
			</div>
			<div class="panel-group" id="accordion">
				<g:each in="${model?.empleos}" status="j" var="empleo">
					<g:set var="inBitch" value="" />
					<g:if test="${j == 0 }">
						<g:set var="inBitch" value="in" />
					</g:if>
					<div class="panel panel-default sacsa-empleo-item"
						data-id="${empleo.item?.id}">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a class="accordion-toggle sacsa-empleo-titulo"
									data-toggle="collapse" data-parent="#accordion"
									href="#collapse${j}" data-id="${empleo.title?.id}">
									${empleo.title?.html}
								</a>
							</h4>
						</div>
						<div id="collapse${j}" class="panel-collapse collapse ${inBitch} ">
							<div class="panel-body sacsa-empleo-texto"
								data-id="${empleo.description?.id}">
								${empleo.description?.html}
							</div>
						</div>
					</div>
				</g:each>
			</div>
		</div>
	</section>
	<!-- /#contact-us  (921) 21 89487  -->
	<input id="baseURL" type="hidden" value="${resource()}">
</div>