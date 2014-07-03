
<!-- /#header -->
<div id="about-us" class="main-wrapper">
	<!-- /.page-title-wrapper -->
	<section id="our-story" class="pad-top-25">
		<div class="container">
			<div class="row">
				<div class="col-md-6 pad-25">
					<div id="carousel-example-generic" class="carousel slide"
						data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<g:each var="${img}" in="${model.nosotros?.images}"
								status="status">
								<g:if test="${status == 0 }">
									<li data-target="#carousel-example-generic" data-slide-to="0"
										class="active"></li>
								</g:if>
								<g:else>
									<li data-target="#carousel-example-generic"
										data-slide-to="${status}"></li>
								</g:else>
							</g:each>
						</ol>
						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<g:each var="${img}" in="${model.nosotros?.images}"
								status="status">
								<g:if test="${status == 0 }">
									<div class="item active">
										<img src="${img?.src}"
											class="img-responsive sacsa-nosotros-imagen"
											alt="Carousel Image" data-id="${img?.id}">
									</div>
								</g:if>
								<g:else>
									<div class="item">
										<img src="${img?.src}"
											class="img-responsive sacsa-nosotros-imagen"
											alt="Carousel Image" data-id="${img?.id}">
									</div>
								</g:else>
							</g:each>
						</div>
						<!-- Controls -->
						<a class="left carousel-control" href="#carousel-example-generic"
							data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left"></span>
						</a>
						<a class="right carousel-control" href="#carousel-example-generic"
							data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"></span>
						</a>
					</div>
				</div>
				<div class="col-md-6 pad-25">
					<div class="subpage-title">
						<h5 class="sacsa-nosotros-titulo"
							data-id="${model.nosotros?.title?.id}">
							${model.nosotros?.title?.html}
						</h5>
					</div>
					<div class="quienes-somos-contenido"
						data-id="${model.nosotros?.contenido?.id}">
						${model.nosotros?.contenido?.html}
					</div>
				</div>
			</div>
		</div>
		<!-- /.container -->
	</section>
	<!-- /#our-story -->
	<section id="we-and-our-skills" class="pad-0">
		<div class="container">
			<div class="row">
				<div class="col-md-6 pad-25">
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a class="accordion-toggle sacsa-mision" data-toggle="collapse"
										data-parent="#accordion" href="#collapseOne"
										data-id="${model.nosotros?.mision?.id}">
										${model.nosotros?.mision?.html}
									</a>
								</h4>
							</div>
							<div id="collapseOne" class="panel-collapse collapse in">
								<div class="panel-body sacsa-mision-texto"
									data-id="${model.nosotros?.misionTexto?.id}">
									${model.nosotros?.misionTexto?.html}
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a class="accordion-toggle collapsed sacsa-vision"
										data-toggle="collapse" data-parent="#accordion"
										href="#collapseTwo" data-id="${model.nosotros?.vision?.id}">
										${model.nosotros?.vision?.html}
									</a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse ">
								<div class="panel-body sacsa-vision-texto"
									data-id="${model.nosotros?.visionTexto?.id}">
									${model.nosotros?.visionTexto?.html}
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a class="accordion-toggle collapsed sacsa-valores"
										data-toggle="collapse" data-parent="#accordion"
										href="#collapseThree" data-id="${model.nosotros?.valores?.id}">
										${model.nosotros?.valores?.html}
									</a>
								</h4>
							</div>
							<div id="collapseThree" class="panel-collapse collapse">
								<div class="panel-body">
									<ul class="sacsa-valores-texto"
										data-id="${model.nosotros?.valoresTexto?.id}">
										${model.nosotros?.valoresTexto?.html}
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6 pad-25">
					<div class="subpage-title">
						<h5 class="sacsa-tipo-obras"
							data-id="${model.nosotros?.tipodDeObra?.id}">
							${model.nosotros?.tipodDeObra?.html}
						</h5>
					</div>
					<div class="progress">
						<div class="progress-bar sacsa-progressbar-terrestre"
							role="progressbar" aria-valuenow="100" aria-valuemin="0"
							aria-valuemax="100" style="width: 100%;"
							data-id="${model.nosotros?.terrestre?.id}">
							${model.nosotros?.terrestre?.html}
						</div>
					</div>
					<div class="progress">
						<div class="progress-bar sacsa-progressbar-hidraulico"
							role="progressbar" aria-valuenow="70" aria-valuemin="0"
							aria-valuemax="100" style="width: 70%;"
							data-id="${model.nosotros?.hidraulicos?.id}">
							${model.nosotros?.hidraulicos?.html}
						</div>
					</div>
					<div class="progress">
						<div class="progress-bar sacsa-progressbar-industriales"
							role="progressbar" aria-valuenow="100" aria-valuemin="0"
							aria-valuemax="100" style="width: 100%;"
							data-id="${model.nosotros?.industriales?.id}">
							${model.nosotros?.industriales?.html}
						</div>
					</div>
					<div class="progress">
						<div class="progress-bar sacsa-progressbar-subcontratacion"
							role="progressbar" aria-valuenow="70" aria-valuemin="0"
							aria-valuemax="100" style="width: 70%;"
							data-id="${model.nosotros?.subcontratacion?.id}">
							${model.nosotros?.subcontratacion?.html}
						</div>
					</div>
				</div>
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>
	<!-- /#we-and-our-skills -->
	<section id="team-3-columns" class="pad-top-25">
		<div class="container">
			<div class="subpage-title">
				<h5 class="sacsa-equipo-trabajo"
					data-id="${model.nosotros?.equipoTitulo?.id}">
					${model.nosotros?.equipoTitulo?.html}
				</h5>
			</div>
			<div class="row">
				<g:each in="${model.nosotros?.equipo}">
					<div class="col-sm-6 col-md-4 team-member-wrap">
						<div class="team-member sacsa-equipo-item"
							data-id="${it.item?.id }">
							<div class="member-thumb">
								<img src="${it.image?.src}"
									class="img-responsive sacsa-equipo-item-imagen"
									alt="Member Image" data-id="${it.image?.id}">
							</div>
							<div class="member-details">
								<h4 class="member-name sacsa-equipo-item-nombre"
									data-id="${it.nombres?.id}">
									${it.nombres?.html}
								</h4>
								<span class="position sacsa-equipo-item-posicion"
									data-id="${it.posicion?.id}">
									${it.posicion?.html}
								</span>
								<p class="sacsa-equipo-item-descripcion"
									data-id="${it.descripcion?.id}">
									${it.descripcion?.html}
								</p>
							</div>
						</div>
					</div>
				</g:each>
				<!-- /.col-md-4 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>
	<!-- /#team-3-columns -->
	<g:render template="/main/index/clientes" />
	<!-- /#our-clients -->
</div>
<g:javascript>
		setEqualHeight(".sacsa-equipo-item-descripcion", true)
		modifyWidthInProgressBar()
</g:javascript>
<!-- Custom Script For This Template -->