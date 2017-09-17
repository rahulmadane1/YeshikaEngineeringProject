app.factory('invoicedetailsservice', ['$http', function ($http) {

 var urlBase = 'http://localhost:8080/demoSpring';
 var inviocedetailsService = {};
 inviocedetailsService.getinvoicedetails = function (invoicedata) {
	 
        return $http.post(urlBase + '/invoicedetails',invoicedata);
    };

    return inviocedetailsService;
}]);