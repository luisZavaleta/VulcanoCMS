
<section id="our-clients" class="pad-25">
	<div class="container">
		<div class="subpage-title">
			<h5>Nuestros clientes</h5>
			<!-- Controls -->
			<div class="controls">
				<span id="client-prev" class="prev">
					<i class="fa fa-angle-left"></i>
				</span>
				<span id="client-next" class="next">
					<i class="fa fa-angle-right"></i>
				</span>
			</div>
		</div>
		<div class="row flush">
			<div id="caroufredsel-clients-container"
				class="sacsa-clients-container">
				<g:render template="/main/index/clientes/item"
					collection="${model?.clientes}" />
				
			</div>
			<!-- /#caroufredsel-clients-container -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container -->
</section>
<!-- /#our-clients -->