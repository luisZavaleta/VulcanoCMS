<!-- /#header -->
<div id="portfolio-item-2" class="main-wrapper">
	<!-- /.page-title-wrapper -->
	<section id="item-content-wrapper" class="pad-top-25">
		<div class="container">
			<div class="portfolio-navigation pad-25">
				<ul class="portfolio-navigation-list">
					<li>
						<a href="../${model?.servicio?.prevPath}"
							class="sacsa-servicio-siguiente">
							<i class="fa fa-long-arrow-left"></i>
							${model?.servicio?.prev?.html }
						</a>
					</li>
					<li>
						<a href="../${model?.servicio?.nxtPath }"
							class="sacsa-servicio-anterior">
							${model?.servicio?.nxt?.html }
							<i class="fa fa-long-arrow-right"></i>
						</a>
					</li>
				</ul>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="portfolio-thumb pad-25">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
							<!-- Indicators -->
							<ol class="carousel-indicators">
								<g:each var="carruselItem" in="${model?.servicio?.imagenes }"
									status="index">
									<g:if test="${index == 0 }">
										<g:set var="clacss" value="active" />
									</g:if>
									<g:else>
										<g:set var="clacss" value="" />
									</g:else>
									<li data-target="#carousel-example-generic"
										data-slide-to="${index}" class="${clacss}"></li>
								</g:each>
							</ol>
							<!-- Wrapper for slides -->
							<div class="carousel-inner sacsa-servicio-carrusel"
								data-id="${model?.servicio?.carrusel?.id }">
								<g:each var="carruselItem" in="${model?.servicio?.imagenes }"
									status="index">
									<g:if test="${index == 0 }">
										<g:set var="clacss" value="item active" />
									</g:if>
									<g:else>
										<g:set var="clacss" value="item" />
									</g:else>
									<div class="${clacss}">
										<img src="${carruselItem.src}" data-id="${carruselItem.id}"
											class="img-responsive sacsa-servicio-carrusel-item"
											alt="Carousel Image">
									</div>
								</g:each>
							</div>
							<!-- Controls -->
							<a class="left carousel-control" href="#carousel-example-generic"
								data-slide="prev">
								<span class="glyphicon glyphicon-chevron-left"></span>
							</a>
							<a class="right carousel-control"
								href="#carousel-example-generic" data-slide="next">
								<span class="glyphicon glyphicon-chevron-right"></span>
							</a>
						</div>
					</div>
				</div>
				<div class="col-md-7">
					<div class="pad-25">
						<div class="subpage-title">
							<h5 class="sacsa-servicios-titulo"
								data-id="${model?.servicio?.titulo?.id }">
								${model?.servicio?.titulo?.html }
							</h5>
						</div>
						<div class="sacsa-servicio-texto"
							data-id="${model?.servicio?.texto?.id }">
							${model?.servicio?.texto?.html }
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section id="releted-works" class="pad-25">
		<div class="container">
			<div class="subpage-title">
				<h5 class="sacsa-servicios-proyectos-titulo"
					data-id="${model?.servicio?.proyectosTitulo?.id}">
					${model?.servicio?.proyectosTitulo?.html}
				</h5>
				<!-- Controls -->
				<div class="controls">
					<span id="portfolio-prev" class="prev black">
						<i class="fa fa-angle-left"></i>
					</span>
					<span id="portfolio-next" class="next black">
						<i class="fa fa-angle-right"></i>
					</span>
				</div>
			</div>
			<div class="row flush">
				<div id="caroufredsel-portfolio-container"
					class="sacsa-servicios-proyectos-carrusel"
					data-id="${model?.servicio?.proyectosParent?.id}">
					<!-- /.portfolio-item-wrapper -->
					<g:render template="/main/servicio/proyectoItem"
						collection="${model?.servicio?.proyectos}" />
				</div>
				<!-- /.caroufredsel-portfolio-container -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>
	<!-- /#releted-works -->
	<g:javascript>
	$( document ).ready(function() {
		setEqualHeight(".servicios-proyectos-carrusel-item-image", true, true);
	});
	</g:javascript>
	
</div>