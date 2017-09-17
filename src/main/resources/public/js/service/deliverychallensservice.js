app.factory('deliverychallensservice', ['$http', function ($http) {

 var urlBase = 'http://localhost:8080/demoSpring';
 var deliverychallensService = {};
 deliverychallensService.getdeliverychallen = function (deliverydata) {
	 
        return $http.post(urlBase + '/deliveryChallan',deliverydata);
    };

    return deliverychallensService;
}]);