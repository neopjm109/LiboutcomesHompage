var webPage = require('webpage');
var page = webPage.create();

var url = "http://localhost:8080/LibOutcomesWeb/Pdf";

page.viewportSize = { width: 480, height: 800 };

page.paperSize = {
	format: 'A3',
	orientation: 'portrait',
	margin: '1cm',
	header: {
		height: "1cm",
		contents: phantom.callback(function(pageNum, numPages) {
			return "<h3>Header <span style='float:right'>" + pageNum + " / " + numPages + "</span></h3>";
		})
	},
	footer: {
		height: "1cm",
		contents: phantom.callback(function(pageNum, numPages) {
				return "<h3>Footer <span style='float:right'>" + pageNum + " / " + numPages + "</span></h3>";
		})
	}
}

page.open(url, function(){
	page.render('test.pdf');
	phantom.exit();
});