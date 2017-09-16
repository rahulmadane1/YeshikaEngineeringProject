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
			// you can set this to no template if you just want to use the html in the page
			.state('home', {
				url: "/",
				templateUrl: viewsPrefix + "home.html",
				controller:'homeController',
				pageTitle: 'Home'
			})
			.state('login', {
				url: "/",
				templateUrl: viewsPrefix + "login.html",
				controller:'homeController',
				pageTitle: 'Login'
			})
			
	    
	})
	.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {}
	]);

