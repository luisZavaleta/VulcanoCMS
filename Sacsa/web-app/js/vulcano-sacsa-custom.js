
function modifyWidthInProgressBar() {

	var progressBars = $(".progress-bar")

	progressBars = $.makeArray(progressBars)

	var max = 0;
	var percents = $.map(progressBars, function(val, indx) {

		var text = $(val).html()

		if (text.indexOf("%") > -1) {

			text = text.split("%")
			text = text[0]
			text = text.split(" ")
			text = text[text.length - 1]
			text = parseFloat(text)

			if (!isNaN(text)) {
				if (max < text) {
					max = text
				}
				return [ [ indx, text ] ];

			}

		}

	});

	$.each(percents, function(index, value) {

		$(".progress-bar").eq(value[0]).css("width", (value[1] * 100 / max) + "%")

	})

}
