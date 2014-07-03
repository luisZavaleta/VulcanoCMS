<div class="col-xs-12 col-sm-6 col-md-4 portfolio-item-wrapper">
	<div class="portfolio-item sacsa-servicios-proyectos-carrusel-item"
		data-id="${it.proyecto?.id }">
		<div class="portfolio-thumb">
			<img src="${it.imagen?.src }" data-id="${it.imagen?.id }"
				class="img-responsive servicios-proyectos-carrusel-item-image"
				alt="1st Portfolio Thumb">
			<div class="image-overlay"></div>
			<a href="${it.imagen?.src }" rel="prettyPhoto[pp_gal]"
				class="portfolio-zoom">
				<i class="fa fa-eye"></i>
			</a>
		</div>
		<div class="portfolio-details">
			<h5 class="servicios-proyectos-carrusel-item-title"
				data-id="${it.titulo?.id}">
				${it.titulo?.html}
			</h5>
			<p class="servicios-proyectos-carrusel-item-text" data-id="${it.texto?.id}">${it.texto?.html}</p>
		</div>
	</div>
</div>