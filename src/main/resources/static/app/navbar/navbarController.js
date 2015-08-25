angular.module('UserApp')
    .controller('NavbarController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	init();
    	
    	function init() {
    		$scope.sistemaBatalha = {};
    		
    		buscarSistemas();
    	}
    	
    	$scope.batalha = function(sistema) {
    		$scope.sistemaBatalha = sistema;
    		
    		$location.path("/escolher-ficha-batalha");
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