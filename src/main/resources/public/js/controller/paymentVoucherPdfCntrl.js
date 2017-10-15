app.controller('paymentVoucherPdfCntrl', function($scope, $rootScope,paymentVoucherService,$state,$window,
		$timeout) {
	$scope.generatePaymentVoucherPdf = function() {
		console.log(">>>>>"+ $rootScope.paymentVoucherPdfObj);
		paymentVoucherService.getInvoiceContextObj().success(function(response) {
			console.log("success" + response);
		}).error(function(error) {
			$state.go('errorPage');
		});
	};
	
	$scope.generatePaymentVoucherPdf();
});