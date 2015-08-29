angular.module('UserApp')
    .controller('NavbarController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	init();
    	
    	function init() {
    		$scope.sistemaBatalha = {};
    		
    		buscarSistemas();
    	}
    	
    	$scope.changeLanguage = function (langKey) {
    		$translate.use(langKey);
    	};
    	
    	$scope.batalha = function(sistema) {
    		$cookieStore.put('sistemaBatalha',sistema);
    		$location.path("/escolher-ficha-batalha");
    	}
    	
    	$scope.logout = function() {
    		$rootScope.iniciaNavbar = false;
    		$cookieStore.remove('usuarioLogado');
    		$location.path("/");
    	}
    	
    	function buscarSistemas() {
    		$scope.sistemas = [];
    		
    		sistema = {};
    		sistema.flagAtivo = true;
    		
    		SistemaService.buscarSistema(
	    		{sistema : sistema},
				function(sistemas){
					$scope.sistemas = sistemas;
					
				}, function(){
					console.log("Erro: buscar sistema");
				});
    	}

    });