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
			alert('User Registered Successfully.Please Sign in')
			$window.location.reload();
			//$timeout(, 2000);

		}).error(function(error) {
			$scope.status = 'Unable to insert user: ' + error.message;
		});
	};
	
});