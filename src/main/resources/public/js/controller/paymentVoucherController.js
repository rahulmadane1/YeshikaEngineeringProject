app.controller('paymentVoucherController', function($scope,paymentVoucherService, $state,$window,
		$timeout) {
	
	$scope.registerUser = function() {
		var paymentVoucher = {
			productDesc : $scope.productDesc,
			hcsACN : $scope.hcsAcn,
			taxableValue : $scope.taxableValue,
			gst : $scope.gst,
			amoutPaid :$scope.amountPaid
		};
		console.log(paymentVoucher);
		paymentVoucherService.generatePaymentVoucher(paymentVoucher).success(function() {
			console.log("success");
			//$window.location.reload();
			//$timeout(, 2000);

		}).error(function(error) {
			$scope.status = 'Unable to insert record: ' + error.message;
		});
	};
	
});