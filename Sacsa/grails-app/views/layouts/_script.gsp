
<g:javascript src="jquery-2.0.3.min.js" />
<g:javascript src="jquery-migrate-1.2.1.min.js" />
<g:javascript src="bootstrap.min.js" />
<g:javascript src="jquery.themepunch.revolution.min.js" />
<g:javascript src="jquery.carouFredSel-6.2.1.js" />
<g:javascript src="jquery.prettyPhoto.js" />
<g:javascript src="jflickrfeed.min.js" />
<g:javascript src="easing.js" />
<g:javascript src="jquery.ui.totop.min.js" />
<g:javascript src="jquery.isotope.min.js" />
<g:javascript src="jquery.fitvids.js" />
<g:javascript src="jasny-bootstrap.min.js" />
<g:javascript src="cms/vulcano/vulcano-util-1.5.0.js" />
<script type="text/javascript">
	var tpj = jQuery;
	tpj.noConflict();
	tpj(document).ready(function() {
		// Revolution Slider
		if (tpj.fn.cssOriginal != undefined)
			tpj.fn.css = tpj.fn.cssOriginal;
		var revMainSlider = tpj('.fullwidthbanner').revolution({
			delay : 90000,
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

			shadow : 0
		});


		
		/*
		 revMainSlider.bind("revolution.slide.onafterswap", function(e) {*/
		 //alert("after swap");
		/* });
		 */

		 
		// PrettyPhoto
		tpj("a[rel^='prettyPhoto']").prettyPhoto({
			theme : 'light_square',
			social_tools : false
		});
		// FitVids
		tpj(".responsive-video-wrapper").fitVids();
		// jflickrfeed
		tpj('.flickr-photos-list').jflickrfeed({
			limit : 9,
			qstrings : {
				id : '71865026@N00'
			},
			itemTemplate : '<li><a href="{{image_b}}"><img src="{{image_s}}" alt="{{title}}" /></a></li>'
		});
		// jQuery UItoTop
		tpj().UItoTop({
			easingType : 'easeOutQuart'
		});
		// Skin Chooser
		tpj(".skin-chooser-toggle").click(function() {
			tpj(".skin-chooser-wrap").toggleClass("show");
		});
		tpj(".color-skin").click(function() {
			var cls = this.id;
			tpj(".color-skin").removeClass("active");
			tpj(this).addClass("active");
			tpj("#utter-wrapper").removeClass();
			tpj("#utter-wrapper").addClass(cls);
		});
	});
	// jQuery CarouFredSel
	var caroufredsel = function() {
		tpj('#caroufredsel-portfolio-container').carouFredSel({
			responsive : true,
			scroll : 1,
			circular : false,
			infinite : false,
			items : {
				visible : {
					min : 1,
					max : 3
				}
			},
			prev : '#portfolio-prev',
			next : '#portfolio-next',
			auto : {
				play : false
			}
		});
		/*
		tpj('#caroufredsel-blog-posts-container').carouFredSel({
			responsive : true,
			scroll : 1,
			circular : false,
			infinite : false,
			items : {
				visible : {
					min : 1,
					max : 3
				}
			},
			prev : '#blog-posts-prev',
			next : '#blog-posts-next',
			auto : {
				play : false
			}
		});*/
		tpj('#caroufredsel-clients-container').carouFredSel({
			responsive : true,
			scroll : 1,
			circular : false,
			infinite : false,
			items : {
				visible : {
					min : 1,
					max : 4
				}
			},
			prev : '#client-prev',
			next : '#client-next',
			auto : {
				play : false
			}
		});
	};
	tpj(window).load(function() {
		caroufredsel();
	});
	tpj(window).resize(function() {
		caroufredsel();
	});

	var $ = jQuery;
</script>
<script type="text/javascript">
	$(document).ready(function() {
		// PrettyPhoto
		$("a[rel^='prettyPhoto']").prettyPhoto({
			theme : 'light_square',
			social_tools : false
		});
	});

	var isotopePortfolio = function() {

		// Isotope Portfolio
		var $container = $('#isotope-portfolio-container');
		var $filter = $('.portfolio-filter');
		$(window).load(function() {
			// Initialize Isotope
			$container.isotope({
				itemSelector : '.portfolio-item-wrapper'
			});
			$('.portfolio-filter a').click(function() {
				var selector = $(this).attr('data-filter');
				$container.isotope({
					filter : selector
				});
				return false;
			});
			$filter.find('a').click(function() {
				var selector = $(this).attr('data-filter');
				$filter.find('a').parent().removeClass('active');
				$(this).parent().addClass('active');
			});
		});
		$(window).smartresize(function() {
			$container.isotope('reLayout');
		});
	}

	isotopePortfolio()

	function customIsotopeDelete(elementTobeDeleted) {

	}

	/** SAME HEIGHT**/
</script>
