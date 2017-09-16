app.controller('paymentVoucherController', function($scope, $state,$window,
		$timeout) {
	
	 $scope.paymentVoucher = [
	        {
	            'productDesc':'Roy',
	            'productDesc':'Mathew',
	            'taxableValue':'roy@roy.com',
	            'gst': "18",
                'amountPaid': "12345"
	        }];
	    
	        $scope.addNew = function(paymentVoucher){
	            $scope.paymentVoucher.push({ 
	                'productDesc': "", 
	                'productDesc': "",
	                'taxableValue': "",
	                'gst': "",
	                'amountPaid': ""
	            });
	            $scope.PD = {};
	        };
	    
	        $scope.remove = function(){
	            var newDataList=[];
	            $scope.selectedAll = false;
	            angular.forEach($scope.paymentVoucher, function(selected){
	                if(!selected.selected){
	                    newDataList.push(selected);
	                }
	            }); 
	            $scope.paymentVoucher = newDataList;
	        };
	    
	        $scope.checkAll = function () {
	            if (!$scope.selectedAll) {
	                $scope.selectedAll = true;
	            } else {
	                $scope.selectedAll = false;
	            }
	            angular.forEach($scope.paymentVoucher, function (paymentVoucher) {
	                paymentVoucher.selected = $scope.selectedAll;
	            });
	        };
	
	$scope.registerUser = function() {
		var paymentVoucher = {
			productDesc : $scope.productDesc,
			hcsACN : $scope.hcsAcn,
			taxableValue : $scope.taxableValue,
			gst : $scope.gst,
			amoutPaid :$scope.amountPaid
		};
		console.log(paymentVoucher);
		paymentVoucherService.generatePaymentVoucher(paymentVoucher).success(function() {
			console.log("success");
			//$window.location.reload();
			//$timeout(, 2000);

		}).error(function(error) {
			$scope.status = 'Unable to insert record: ' + error.message;
		});
	};
	
});