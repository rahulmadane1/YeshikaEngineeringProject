app.controller('invoicedetailsCntrl', function($scope,$filter,$state,invoicedetailsservice,$window,$timeout) {	

	$scope.invoicedetails = [
        {
        	
        }];
    
        $scope.addNew = function(invoicedetails){
        	console.log("calling addNew Function.....");
            $scope.invoicedetails.push({ 
                'particular': "", 
                'invoicedate': "",
                'challandnum': "",
                'quantity': "",
                'rate': "",
                'amount': "",
            });
           
            $scope.PD = {};
        };
    
        $scope.remove = function(){
        	console.log("calling remove Function.....");
            var newDataList=[];
            $scope.selectedAll = false;
            angular.forEach($scope.invoicedetails, function(selected){
                if(!selected.selected){
                    newDataList.push(selected);
                }
            }); 
            $scope.invoicedetails = newDataList;
        };
    
        $scope.checkAll = function () {
        	console.log("calling checkAll Function.....");
            if (!$scope.selectedAll) {
                $scope.selectedAll = true;
            } else {
                $scope.selectedAll = false;
            }
            angular.forEach($scope.invoicedetails, function (invoicedetails) {
                invoicedetails.selected = $scope.selectedAll;
            });
        };
        $scope.invoiceContext={};
	$scope.createinvoicedetails=function () {
		$scope.invoiceContext.invoiceDetailsList=$scope.invoicedetails;
		$scope.invoiceContext.customer=$scope.customer;
		console.log($scope.invoiceContext);
		invoicedetailsservice.getinvoicedetails($scope.invoiceContext).success(function() {
		}).error(function(error) {
			console.log("Unable to insert invoice data: " + error);
		});
	}

});