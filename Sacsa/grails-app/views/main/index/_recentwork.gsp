
<section id="recent-works" class="pad-0">
	<div class="container">
		<div class="subpage-title">
			<h5>Trabajos recientes</h5>
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
				class="sacsa-trabajos-recientes" data-id="">
				<g:render template="/main/index/recentwork/item"
					collection="${model?.recientes}" />
			</div>
			<!-- /.caroufredsel-portfolio-container Folsom Ave Image -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container -->
</section>