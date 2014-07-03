<li data-transition="random" data-slotamount="10" data-masterspeed="500"
	style="" class="sacsa-carrusel-item" data-id="${it.carrusel?.id}">
	<img src="${it.fondo?.src}" alt="Slide Image" style="height:auto"
		class="sacsa-carrusel-image-fondo" data-id="${it.fondo?.id}">
	<div
		class="tp-caption large_black_text sft stt sacsa-carrusel-pretitle"
		data-x="105" data-y="65" data-speed="500" data-start="1000"
		data-easing="easeOutExpo" style="font-size: 25px; color: #00008B;"
		data-id="${it.pretitle?.id}">
		${it.pretitle?.html}
	</div>
	<div
		class="tp-caption very_large_black_text lft ltt sacsa-carrusel-title"
		data-x="105" data-y="100" data-speed="500" data-start="1200"
		data-easing="easeOutExpo" style="font-size: 50px; color: #00008B;"
		data-id="${it.title?.id}">
		${it.title?.html}
	</div>
	<div class="tp-caption theme_caption3 sfl stl sacsa-carrusel-text"
		data-x="105" data-y="180" data-speed="500" data-start="1400"
		data-easing="easeOutExpo" data-id="${it.text?.id}">
		${it.text?.html}
	</div>
	<a href="#" class="caption btn btn-flat flat-color sfb stb"
		data-x="220" data-y="275" data-speed="500" data-start="1800"
		data-easing="easeOutExpo">Más Información</a>
	<div class="caption lfr ltr image-center-container" data-x="750" data-y="50" data-speed="1000"
		data-start="2000" data-easing="easeOutExpo">
		<img src="${it.centro?.src}" alt="Slide Image"
			class="sacsa-carrusel-image-center" data-id="${it.centro?.id}">
	</div>
</li>
