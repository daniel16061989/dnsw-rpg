angular.module('UserApp')
    .controller('SistemaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	$scope.sistemas = [];
    	$scope.sistema = {};
    	
    	SistemaService.buscarTodosSistemas(
				{},
				function(sistemas){
    				$scope.sistemas = sistemas;
    			}, function(){
    				console.log("Erro: buscar filmes");
    		});
    	
    	$scope.editarSistema = function(sistema) {
    		$scope.sistema = sistema;
    	}
    	
    	$scope.excluirSistema = function(sistema) {
    		
    	}
    	
    	$scope.limparSistema = function() {
    		$scope.sistema = {};
    	}
    	
    	$scope.buscarSistema = function(sistema) {
    		
    	}
    	
    	$scope.salvarSistema = function(sistema) {
    		
    	}

    });