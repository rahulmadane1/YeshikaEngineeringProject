app.controller('paymentVoucherController', function($scope, paymentVoucherService,$state,$window,
		$timeout) {
		
	 $scope.paymentVoucher = [
	        {
	            'product_desc':'',
	            'hcs_Acs':'',
	            'taxable_value':'',
	            'gst': "18",
                'total_amount': ""
	        }];
	    
	        $scope.addNew = function(paymentVoucher){
	            $scope.paymentVoucher.push({ 
	                'product_desc': "", 
	                'hcs_Acs': "",
	                'taxable_value': "",
	                'gst': "",
	                'total_amount': ""
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
	    		paymentVoucherService.generatePaymentVoucher($scope.paymentVoucher).success(function() {
	    			console.log("success");
	    			$state.go('home');
		    		/*	paymentVoucherService.getPaymentVoucherDetails(response).success(function() {
			    			console.log("success" +response);	    			
	
			    		}).error(function(error) {
			    			$scope.status = 'Unable to Fetch payment voucher details ' + error;
			    			$state.go('errorPage');
			    		});*/
	    		}).error(function(error) {
	    			$scope.status = 'Unable to insert record: ' + error;
	    			$state.go('errorPage');
	    		});
	    	};
});