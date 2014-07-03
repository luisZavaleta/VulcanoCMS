<footer id="footer-1" class="footer">
	<div class="container">
		<div class="col-md-4">
			<div class="visit-us pad-top-25">
				<div class="subpage-title">
					<h5>
						<i class="fa fa-compass"></i>
						Visitanos
					</h5>
				</div>
				<address>
					<strong class="sacsa-rfc" data-id="${model?.footer?.rfc?.id}">
						${model?.footer?.rfc?.html}
					</strong>
					<br>
					<span class="sacsa-direccion0" data-id="${model?.footer?.rfc?.id}">
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
		</div>
		<div class="col-md-4">
			<div class="contact-numbers pad-top-25">
				<div class="subpage-title">
					<h5>
						<i class="fa fa-phone"></i>
						Contacto
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
		<div class="col-md-4">
			<div class="widget tagcloud">
				<div class="subpage-title">
					<h5>Etiquetas</h5>
				</div>
				
				<ul class="tagcloud-list sacsa-etiquetas">
					<g:each in="${model?.footer?.etiquetas}">
						<li>
							<a href="#" class="sacsa-etiqueta-seo" data-id="${it.id }">
								${it.html }
							</a>
						</li>
					</g:each>
					
				</ul>
			</div>
			<!-- /.tagcloud -->
		</div>
	</div>
	<!-- /.container -->
</footer>
<!-- /#footer-1 -->
<footer id="footer-2" class="footer">
	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-6 footer-info-wrapper">
				<span class="sacsa-derechos-reservados"
					data-id="${model?.footer?.derechos?.id}">
					${model?.footer?.derechos?.html}
				</span>
			</div>
			<!-- /.footer-info-wrapper -->
			<div class="col-xs-12 col-sm-6 footer-links-wrapper">
				<ul class="list-inline">
				</ul>
			</div>
			<!-- /.footer-links-wrapper -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container -->
</footer>