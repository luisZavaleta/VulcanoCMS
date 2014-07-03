<!-- RECENT WORK -->
<div class="col-xs-12 col-sm-6 col-md-4 portfolio-item-wrapper">
	<div class="portfolio-item sacsa-trabajos-recientes-item"
		data-id="${it.trabajo?.id}">
		<div class="portfolio-thumb">
			<img src="${it.imagen?.src}"
				class="img-responsive sacsa-recientes-item-img"
				alt="1st Portfolio Thumb" data-id="${it.imagen?.id}"
				style="height: 100%">
			<div class="image-overlay"></div>
			<a href="${it.imagen?.src}" rel="prettyPhoto[pp_gal]"
				class="portfolio-zoom">
				<i class="fa fa-eye"></i>
			</a>
		</div>
		<div class="portfolio-details">
			<h5 class="sacsa-recientes-item-titulo" data-id="${it.titulo?.id}">
				${it.titulo?.html}
			</h5>
			<p class="sacsa-recientes-item-texto" data-id="${it.texto?.id}">
				${it.texto?.html}
			</p>
		</div>
	</div>
</div>