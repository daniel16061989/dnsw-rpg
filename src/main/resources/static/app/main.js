angular.module('UserApp', ['ngRoute', 'ngResource', 'ngMessages', 'ngCookies', 'pascalprecht.translate'])
    .config(function($routeProvider, $locationProvider) {
    	$locationProvider.hashPrefix('!');
    	
        $routeProvider
            .when('/login', {
                controller: 'LoginController',
                templateUrl: 'app/view/login.html'
            })
            .when('/principal', {
                controller: 'PrincipalController',
                templateUrl: 'app/view/principal.html'
            })
            .when('/sistema', {
                controller: 'SistemaController',
                templateUrl: 'app/view/cadastro/sistema.html'
            })
			.otherwise({
				redirectTo: '/login'
			});
    })
    .controller('MainController', function ($scope, $rootScope, $location) {
    	$scope.mensagem = {};
    	$scope.mensagem.success = false;
    	$scope.mensagem.info = false;
    	$scope.mensagem.warning = false;
    	$scope.mensagem.danger = false;
    	$scope.mensagem.texto = '';
    });