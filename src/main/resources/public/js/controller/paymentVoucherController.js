app.controller('paymentVoucherController', function($scope, $state,$window,
		$timeout,paymentVoucherService) {
		
	 $scope.paymentVoucher = [
	        {
	            'productDesc':'',
	            'hcsAcn':'',
	            'taxableValue':'',
	            'gst': "18",
                'amountPaid': ""
	        }];
	    
	        $scope.addNew = function(paymentVoucher){
	            $scope.paymentVoucher.push({ 
	                'productDesc': "", 
	                'hcsAcn': "",
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
	
	
	        $scope.generatePaymentVoucher = function() {
	    		console.log($scope.paymentVoucher);
	    		paymentVoucherService.generatePaymentVoucher(paymentVoucher).success(function() {
	    			console.log("success");
	    			//$window.location.reload();
	    			//$timeout(, 2000);

	    		}).error(function(error) {
	    			$scope.status = 'Unable to insert record: ' + error.message;
	    		});
	    	};
});