app.factory('paymentVoucherService', ['$http', function ($http) {

    var urlBase = 'http://localhost:8080/demoSpring';
    var paymentVoucherService = {};
    
    paymentVoucherService.generatePaymentVoucher = function (paymentVoucher) {
    	console.log(paymentVoucher);
        return $http.post(urlBase + '/generatePaymentVoucher', paymentVoucher);
    };
   
    return paymentVoucherService;

}]);