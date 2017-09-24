app.factory('invoicedetailsservice', ['$http', function ($http) {

 var urlBase = 'http://localhost:8080/demoSpring';
 var inviocedetailsService = {};
 inviocedetailsService.getinvoicedetails = function (invoicedetailContext) {
	 
        return $http.post(urlBase + '/invoicedetailsdata',invoicedetailContext);
    };
    
    return inviocedetailsService;
}]);