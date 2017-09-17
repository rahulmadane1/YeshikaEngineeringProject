app.factory('invoicedetailsservice', ['$http', function ($http) {

 var urlBase = 'http://localhost:8080/demoSpring';
 var inviocedetailsService = {};
 inviocedetailsService.getinvoicedetails = function (invoicedetails) {
	 
        return $http.post(urlBase + '/invoicedetailsdata',invoicedetails);
    };

    return inviocedetailsService;
}]);