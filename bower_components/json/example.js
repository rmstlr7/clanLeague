$(document).ready(function(){

	var worksheets = [
		'', // defaults to first worksheet without id
		'ouab0ad'];

	worksheets.forEach(function(worksheet){
		alert(worksheet);
 		$.googleSheetToJSON('1QM54MW6ln97i1deyeVP-nGjNFO8Gy-FXErTPuzAHN1Y', worksheet)
			.done(function(rows){

				var $container = $('<div>');
				$container.append('<h1>' + (worksheet || 'default') + '</h1>');
				rows.forEach(function(row){
					$dl = $('<dl>');
					Object.getOwnPropertyNames(row).forEach(function(name){
						var val = [].concat(row[name]).join(' / ');
						$dl.append('<dt>' + name + '</dt><dd>' + val + '</dd>');
					});
					$container.append($dl);
				});
				$(document.body).append($container);
			})
			.fail(function(err){
				console.log('error!', err);
			});
	});
});