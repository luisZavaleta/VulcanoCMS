$(document).ready(function() {

	console.log("siteConfig---->" + JSON.stringify(siteConfig))
	initCMS(siteConfig) // cms/bin/vulcano-cms.js
	carruselClientes()

	$('.sacsa-clients-logo').bind('modal.setImage.after', function(event) {

		carruselClientes()

	});

});

$(document).on("click", ".guardar-modal-vcms", function() {

	// change height for auto doesn't work, so we have to do
	var style = $(".sacsa-carrusel-image-fondo").attr("style")
	var reg = /\s*height\s*:\s.*?;/g;
	style = style.replace(reg, "height: auto;")
	$(".sacsa-carrusel-image-fondo").attr("style", style)

})

$(document).on("focusout", ".guardar-modal-vcmssad", function() {
	var revMainSlider = tpj('.fullwidthbanner').revolution({
		delay : 9000,
		startwidth : 1200,
		startheight : 700,

		onHoverStop : "on",

		thumbWidth : 100,
		thumbHeight : 50,
		thumbAmount : 3,

		hideThumbs : 0,

		navigationType : "none",
		navigationArrows : "solo",
		navigationStyle : "round",
		navigationHAlign : "left",
		navigationVAlign : "bottom",
		navigationHOffset : 30,
		navigationVOffset : 30,

		soloArrowLeftHalign : "left",
		soloArrowLeftValign : "center",
		soloArrowLeftHOffset : 0,
		soloArrowLeftVOffset : 0,

		soloArrowRightHalign : "right",
		soloArrowRightValign : "center",
		soloArrowRightHOffset : 0,
		soloArrowRightVOffset : 0,

		stopAtSlide : -1,
		stopAfterLoops : -1,
		hideCaptionAtLimit : 0,
		hideAllCaptionAtLilmit : 0,
		hideSliderAtLimit : 0,

		fullWidth : "on",
		fullScreen : "off",
		fullScreenOffsetContainer : "#topheader-to-offset",

		shadow : 3
	});
})


