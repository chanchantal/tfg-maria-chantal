(function($){
	
	$(document).ready(function() {
		if (window.FB != undefined) {
			$(".sgshare-facebook-share").on('click', function(e) {
				e.preventDefault();
				FB.ui({
					method : 'share',
					href : window.location.href
				},
				function(response) {
					console.log(response);
				});
			});
			
			$(".sgshare-facebook-like").on('click', function(e) {
				e.preventDefault();
				FB.ui({
					method: 'share_open_graph',
					action_type: 'og.likes',
					action_properties: JSON.stringify({
						object : window.location.href,
					})
				}, function(response){
					console.log(response)
				});
			});
		}
	});
}(jQuery))