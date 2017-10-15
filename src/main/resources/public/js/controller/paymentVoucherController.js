app
		.controller(
				'paymentVoucherController',
				function($scope, $rootScope, paymentVoucherService, $state,
						$window, $timeout) {

					$scope.paymentVoucher = [ {
						'product_desc' : '',
						'hcs_Acs' : '',
						'taxable_value' : '',
						'gst' : "18",
						'total_amount' : ""
					} ];

					$scope.addNew = function(paymentVoucher) {
						$scope.paymentVoucher.push({
							'product_desc' : "",
							'hcs_Acs' : "",
							'taxable_value' : "",
							'gst' : "",
							'total_amount' : ""
						});
						$scope.PD = {};
					};

					$scope.remove = function() {
						var newDataList = [];
						$scope.selectedAll = false;
						angular.forEach($scope.paymentVoucher, function(
								selected) {
							if (!selected.selected) {
								newDataList.push(selected);
							}
						});
						$scope.paymentVoucher = newDataList;
					};

					$scope.checkAll = function() {
						if (!$scope.selectedAll) {
							$scope.selectedAll = true;
						} else {
							$scope.selectedAll = false;
						}
						angular.forEach($scope.paymentVoucher, function(
								paymentVoucher) {
							paymentVoucher.selected = $scope.selectedAll;
						});
					};

					$scope.paymentVoucherDetails = {};
					$scope.invoiceContext = {};
					$scope.customer = {};
					$scope.showMainDiv = true;
					
					
					$scope.generatePaymentVoucher = function() {

						$scope.invoiceContext.paymentVoucherlist = $scope.paymentVoucher;
						$scope.invoiceContext.customer = $scope.customer;
						
						paymentVoucherService.generatePaymentVoucher($scope.invoiceContext)
								.success(
										function() {
											$scope.showMainDiv = false;
											$scope.paymentVoucherDetails = $scope.invoiceContext;
											console
													.log("success"
															+ $scope.paymentVoucherDetails.customer.customerName);
											//$scope.exportAction('pdf');
											//$state.go('home');
										})
								.error(
										function(error) {
											$scope.status = 'Unable to insert record: '
													+ error;
											$state.go('errorPage');
										});
					};
					
					//function to generate pdf
					$scope.generatePaymentVoucherPDF = function() {
						console.log("<<<<" + "in generate PDF");
						paymentVoucherService.generatePaymentVoucherPDF()
						.success(
								function() {
									console.log("success");
									$state.go('home');
								})
						.error(
								function(error) {
									$scope.status = 'Unable to generate Payment Voucher '
											+ error;
									$state.go('errorPage');
								});
					};
					
					
					

					$scope.exportAction = function(option) {
						switch (option) {
						case 'pdf':
							$scope.$broadcast('export-pdf', {});
							break;
						case 'excel':
							$scope.$broadcast('export-excel', {});
							break;
						case 'doc':
							$scope.$broadcast('export-doc', {});
							break;
						case 'csv':
							$scope.$broadcast('export-csv', {});
							break;
						default:
							console.log('no event caught');
						}
					}
				});

app.directive('exportTable', function() {
	var link = function($scope, elm, attr) {
		$scope.$on('export-pdf', function(e, d) {
			elm.tableExport({
				type : 'pdf',
				escape : false
			});
		});
		$scope.$on('export-excel', function(e, d) {
			elm.tableExport({
				type : 'excel',
				escape : false
			});
		});
		$scope.$on('export-doc', function(e, d) {
			elm.tableExport({
				type : 'doc',
				escape : false
			});
		});
		$scope.$on('export-csv', function(e, d) {
			elm.tableExport({
				type : 'csv',
				escape : false
			});
		});
	}
	return {
		restrict : 'C',
		link : link
	}
});
