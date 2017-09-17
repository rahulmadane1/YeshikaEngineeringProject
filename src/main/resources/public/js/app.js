var app = angular.module('app', ['ui.router','ngAnimate', 'ui.bootstrap', 'ngResource'])

	// define for requirejs loaded modules
	define('app', [], function() { return app; });
	
	app.config(function($stateProvider, $urlRouterProvider, $controllerProvider){
		var origController = app.controller
		app.controller = function (name, constructor){
			$controllerProvider.register(name, constructor);
			return origController.apply(this, arguments);
		}
		var viewsPrefix = 'views/';
		// For any unmatched url, send to /
		$urlRouterProvider.otherwise("/")

		$stateProvider
		.state('login', {
			url: "/",
			templateUrl: viewsPrefix + "login.html",
			controller:'homeController',
			pageTitle: 'Login'
		}).state('home', {
			url: "/",
			templateUrl: viewsPrefix + "home.html",
			controller:'homeController',
			pageTitle: 'Home'
		}).state('invoicedetails', {
			url: "/",
			templateUrl: viewsPrefix + "invoicedetails.html",
			controller:'invoicedetailsCntrl',
			pageTitle: 'invoice'
		}).state('paymentVoucher', {
			url: "/",
			templateUrl: viewsPrefix + "paymentVoucher.html",
			controller:'paymentVoucherController',
			pageTitle: 'PaymentVoucher'
		}).state('errorPage', {
			url: "/",
			templateUrl: viewsPrefix + "error.html",
			pageTitle: 'ErrorPage'
		})		
	    
	})
	.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {}
	]);

