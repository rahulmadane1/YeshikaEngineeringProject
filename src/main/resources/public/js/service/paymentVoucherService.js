app.factory('paymentVoucherService', ['$http', function ($http) {

    var urlBase = 'http://localhost:8080/demoSpring';
    var paymentVoucherService = {};
    
    paymentVoucherService.generatePaymentVoucher = function (paymentVoucher) {
        return $http.post(urlBase + '/generatePaymentVoucher', paymentVoucher);
    };
    
    paymentVoucherService.getPaymentVoucherDetails = function () {
        return $http.get(urlBase + '/getPaymentVoucherDetails');
    };
   
    return paymentVoucherService;

}]);