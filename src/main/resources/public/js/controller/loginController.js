app.controller('loginController', function($scope,homeService,$state,$rootScope,$window,
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
			console.log('Error occured while registering user. ' + error);
		});
	};

	$scope.loginUser = function() {
		homeService.loginUser($scope.username, $scope.password)
		.then(function(response) {
           console.log(response);
           if(response.data === "Failure"){
				alert('Authentication failed! Please enter correct username and password.');
			}else{
				 $state.go('home',{userName: response.data});
			}
        	   
        }, function(error) {
        	console.log('Authentication failed. ' + error);
        });
	};
});