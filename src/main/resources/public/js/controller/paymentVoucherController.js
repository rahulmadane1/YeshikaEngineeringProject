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
	
	
	        $scope.invoiceContext={};
	        $scope.generatePaymentVoucher = function() {
	    		console.log($scope.paymentVoucher);
	    		$scope.invoiceContext.paymentVoucherlist=$scope.paymentVoucher;
	    		$scope.invoiceContext.customer=$scope.customer;
	    		console.log($scope.invoiceContext);
	    		paymentVoucherService.generatePaymentVoucher($scope.invoiceContext).success(function() {
	    			console.log("success");
	    			$state.go('home');
	    		}).error(function(error) {
	    			$scope.status = 'Unable to insert record: ' + error;
	    			$state.go('errorPage');
	    		});
	    	};
});