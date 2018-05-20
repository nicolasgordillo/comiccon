(function() {
	var app = angular.module('app', ['ui.router', 'navController', 'ngAnimate', 'ui.bootstrap', 'ngResource', 'app.controllers', 'app.services'])

	// define for requirejs loaded modules
	define('app', [], function() { return app; });

	// function for dynamic load with requirejs of a javascript module for use with a view
	// in the state definition call add property `resolve: req('/views/ui.js')`
	// or `resolve: req(['/views/ui.js'])`
	// or `resolve: req('views/ui')`
	function req(deps) {
		if (typeof deps === 'string') deps = [deps];
		return {
			deps: function ($q, $rootScope) {
				var deferred = $q.defer();
				require(deps, function() {
					$rootScope.$apply(function () {
						deferred.resolve();
					});
					deferred.resolve();
				});
				return deferred.promise;
			}
		}
	}

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
				data: {
					pageTitle: 'Home'
				}
			})
			.state('proyectos',{
	        url:'/proyectos',
	        templateUrl: viewsPrefix + 'proyectos.html',
	        controller:'ProyectoListController'
	    }).state('viewProyecto',{
	       url:'/proyectos/:id/view',
	       templateUrl: viewsPrefix + 'proyecto-view.html',
	       controller:'ProyectoViewController'
	    }).state('newProyecto',{
	        url:'/proyectos/new',
	        templateUrl: viewsPrefix + 'proyecto-add.html',
	        controller:'ProyectoCreateController'
	    }).state('editProyecto',{
	        url:'/proyectos/:id/edit',
	        templateUrl: viewsPrefix + 'proyecto-edit.html',
	        controller:'ProyectoEditController'
	    })
	    /* SUBSIDIO */
	    .state('subsidios',{
	       url:'/subsidios',
	       templateUrl: viewsPrefix + 'subsidio/subsidios.html',
	       controller:'SubsidioListController'
	    }).state('viewSubsidio',{
	       url:'/subsidios/:id/view',
	       templateUrl: viewsPrefix + 'subsidio/view.html',
	       controller:'SubsidioViewController'
	    }).state('newSubsidio',{
	        url:'/subsidios/new',
	        templateUrl: viewsPrefix + 'subsidio/add.html',
	        controller:'SubsidioCreateController'
	    }).state('editSubsidio',{
	        url:'/subsidios/:id/edit',
	        templateUrl: viewsPrefix + 'subsidio/edit.html',
	        controller:'SubsidioEditController'
	    })
	})
	.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {
			return {
				link: function(scope, element) {
					var listener = function(event, toState) {
						var title = 'Sistema de subsidios';
						if (toState.data && toState.data.pageTitle) title = toState.data.pageTitle + ' - ' + title;
						$timeout(function() {
							element.text(title);
						}, 0, false);
					};

					$rootScope.$on('$stateChangeSuccess', listener);
				}
			};
		}
	]);
}());
