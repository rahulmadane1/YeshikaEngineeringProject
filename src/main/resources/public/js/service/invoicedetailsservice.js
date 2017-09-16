app.factory('invoicedetailsservice', ['$http', function ($http) {

 var urlBase = 'http://localhost:8080/demoSpring';
 invoicedetailsservice.getinvoicedetails = function () {
	 console.log("calling invoicedetailsservice.......")
        return $http.post(urlBase + '/invoicedetails');
    };

}]);