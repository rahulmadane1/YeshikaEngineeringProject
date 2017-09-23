app.controller('homeController', function($scope,homeService,$state,$rootScope,$window,
		$timeout) {
	
	$rootScope.loggedInUserName = $state.params.userName;
	
	$scope.invoicebtn = function() {
		 $state.go('invoicedetails');
	};
	
	$scope.goToPaymentVoucher = function() {
		 $state.go('paymentVoucher');
	};
	
	$scope.goTodeliverychallen = function() {
		 $state.go('delivery_challan');
	};
	
	$scope.goToHomePage = function() {
		 $state.go('home');
	};
	
});