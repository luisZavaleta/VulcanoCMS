<!-- /#header -->
<div id="portfolio" class="main-wrapper">
	<!-- /.page-title-wrapper -->
	<section id="portfolio-3" class="pad-25">
		<div class="container portafolio">
			<ul class="portfolio-filter nav nav-pills">
				<li class="active">
					<a href="#" data-filter="*">Todo</a>
				</li>
				<g:each in="${model?.portafolio?.categorias}">
					<li>
						<a href="#" data-filter="${ it?.customParameter['data-filter']}"
							class="sacsa-portafolio-category" data-id="${ it.id}">
							${ it.html}
						</a>
					</li>
				</g:each>
			</ul>
			<!-- /.portfolio-filter -->
			<div class="row">
				<div id="isotope-portfolio-container">
					<g:each in="${model?.portafolio?.maquinarias}">
						<div
							class="col-xs-12 col-sm-6 col-md-4 portfolio-item-wrapper ${it.item?.clase} sacsa-maquinaria-item"
							data-id="${it.item?.id}">
							<div class="portfolio-item">
								<div class="portfolio-thumb">
									<img src="${it.image?.src}"
										class="img-responsive sacsa-maquinaria-image"
										alt="1st Portfolio Thumb" data-id="${it.image?.id}">
									<div class="image-overlay"></div>
									<a href="${it.image?.src}" rel="prettyPhoto[pp_gal]"
										class="portfolio-zoom">
										<i class="fa fa-eye"></i>
									</a>
								</div>
								<div class="portfolio-details">
									<h5 class="sacsa-maquinaria-titulo" data-id="${it.title?.id}">
										${it.title?.html}
									</h5>
									<p class="sacsa-maquinaria-texto" data-id="${it.text?.id}">
										${it.text?.html}
									</p>
								</div>
							</div>
						</div>
					</g:each>
					<!-- /.portfolio-item-wrapper -->
					<!-- /.portfolio-item-wrapper -->
				</div>
				<!-- /.isotope-portfolio-container -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>
	<!-- /#portfolio-3 -->

</div>
<!-- /#utter-wrapper -->
<!-- Bootstrap JS & Others JavaScript Plugins
            ================================================== portfolio-filter -->
<!-- Placed At The End Of The Document So Page Loads Faster -->
<!-- Custom Script For This Template -->