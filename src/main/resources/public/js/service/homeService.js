
app.factory('homeService', ['$http', function ($http) {

    var urlBase = 'http://localhost:8080/demoSpring';
    var userRegistrationService = {};
    
    userRegistrationService.registerUser = function (user) {
        return $http.post(urlBase + '/registerUser', user);
    };

    userRegistrationService.getUsers = function () {
        return $http.get(urlBase+'/getUsers');
    };
    
    userRegistrationService.loginUser = function (username,password) {
        return $http.get(urlBase + '/loginUser?username='+username+'&password='+password);
    };

   
    return userRegistrationService;

}]);