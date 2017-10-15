app.factory('paymentVoucherService', ['$http', function ($http,$rootScope) {

    var urlBase = 'http://localhost:8080/demoSpring';
    var paymentVoucherService = {};
	var paymentVoucherPDf={};
    paymentVoucherService.generatePaymentVoucher = function (invoiceContext) {
    	paymentVoucherPDf =invoiceContext;
        return $http.post(urlBase + '/generatePaymentVoucher', invoiceContext);
    };
    
    paymentVoucherService.getPaymentVoucherDetails = function () {
        return $http.get(urlBase + '/getPaymentVoucherDetails');
    };
    
    paymentVoucherService.generatePaymentVoucherPDF = function () {
        return $http.get(urlBase + '/generatePaymentVoucherPDF');
    };
   
    /*paymentVoucherService.getInvoiceContextObj = function () {
    	console.log($rootScope.paymentVoucherPdfObj);
        return $rootScope.paymentVoucherPdfObj;
    };*/
    return paymentVoucherService;

}]);