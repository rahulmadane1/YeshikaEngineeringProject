app.controller('deliverychallensCntrl', function($scope,$state,deliverychallensservice,$window,$timeout) {	
		
	$scope.delivery_challen = [
        {
        	 'product': "", 
             'challan_No': "",
             'quantity': ""
        	
        }];
    
        $scope.addNew = function(delivery_challen){
        	console.log("calling addNew Function.....");
            $scope.delivery_challen.push({ 
            	'product': "", 
                'challan_No': "",
                'quantity': ""
            });
            $scope.PD = {};
        };
    
        $scope.remove = function(){
        	console.log("calling remove Function.....");
            var newDataList=[];
            $scope.selectedAll = false;
            angular.forEach($scope.delivery_challen, function(selected){
                if(!selected.selected){
                    newDataList.push(selected);
                }
            }); 
            $scope.delivery_challen = newDataList;
        };
    
        $scope.checkAll = function () {
        	console.log("calling checkAll Function.....");
            if (!$scope.selectedAll) {
                $scope.selectedAll = true;
            } else {
                $scope.selectedAll = false;
            }
            angular.forEach($scope.delivery_challen, function (delivery_challen) {
            	delivery_challen.selected = $scope.selectedAll;
            });
        };
	
        $scope.invoiceContext={};
	$scope.createdeliverychallen=function () {	
		$scope.invoiceContext.deliveryChallanList=$scope.delivery_challen;
		$scope.invoiceContext.customer=$scope.customer;
		console.log($scope.invoiceContext);
	
		deliverychallensservice.getdeliverychallen($scope.invoiceContext)
		.success(function() {
			
		}).error(function(error) {
			console.log("Unable to insert delivery challen data: " + error);
		});
	}

});