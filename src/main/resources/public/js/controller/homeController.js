app.controller('homeController', function($scope,homeService, $state,$window,
		$timeout) {
	$scope.status;
	$scope.users;
	// getUsers();

	function getUsers() {
		homeService.getUsers().success(function(users) {
			$scope.users = users;
			console.log($scope.users);
		}).error(function(error) {
			$scope.status = 'Unable to load user data: ' + error.message;
		});
	}

	$scope.registerUser = function() {
		var user = {
			//userId: 145,
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
           $state.go('login');
        	   
        }, function(error) {
        	console.log(response)
        	//$window.location.href='/log?username='+username;
        });
	};
});