app.controller('invoicedetailsCntrl', function($scope,$state,$window,$timeout) {	
	
	$scope.createinvoicedetails=function () {	
		console.log("calling invoicedetailsCntrl..............,");
		$scope.invoicedetailsservice.getinvoicedetails().then(function() {
		}).error(function(error) {
			console.log("Unable to load invoice details data: " + error);
		});
	}

});