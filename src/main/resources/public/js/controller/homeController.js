app.controller('homeController', function($scope,homeService, $state,$window,
		$timeout) {
	
	$scope.registerUser = function() {
		var user = {
			username : $scope.username,
			emailId : $scope.email,
			password : $scope.password,
			role : 'Admin'
		};
		console.log(user);
		homeService.registerUser(user).success(function() {
			console.log("success");
			alert('User Registered Successfully.Please login')
			$window.location.reload();
			//$timeout(, 2000);

		}).error(function(error) {
			$scope.status = 'Unable to insert user: ' + error.message;
		});
	};

	$scope.loginUser = function() {
		homeService.loginUser($scope.username, $scope.password)
		.then(function(response) {
           console.log(response)
           $state.go('home');
        	   
        }, function(error) {
        	console.log(error)
        	//$window.location.href='/log?username='+username;
        });
	};
	
	
	$scope.invoicebtn = function() {
		console.log("calling invoice btn,,,,,,,,,,,,,,,,");
		 $state.go('invoicedetails');
	};
	
	$scope.goToPaymentVoucher = function() {
		 $state.go('paymentVoucher');
	};
	
	
});