app.factory('paymentVoucherService', ['$http', function ($http) {

    var urlBase = 'http://localhost:8080/demoSpring';
    var payVoucherService = {};
    
    payVoucherService.generatePayment = function (user) {
        return $http.post(urlBase + '/registerUser', user);
    };
   
    return payVoucherService;

}]);