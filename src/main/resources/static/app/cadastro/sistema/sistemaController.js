angular.module('UserApp')
    .controller('SistemaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	$scope.sistemas = [];
    	
    	$scope.sistema = {};
    	$scope.sistema.flagAtivo = true;
    	
    	SistemaService.buscarTodosSistemas(
				{},
				function(sistemas){
    				$scope.sistemas = sistemas;
    			}, function(){
    				console.log("Erro: buscar sistema");
    		});
    	
    	$scope.editarSistema = function(sistema) {
    		$scope.sistema = sistema;
    	}
    	
    	$scope.excluirSistema = function(sistema) {
    		SistemaService.deletarSistema(
	    		{},
	    		sistema,
				function(sistema) {
					console.log(sistema);
				}, function() {
					console.log('Erro ao excluir sistema');
				});
    	}
    	
    	$scope.limparSistema = function() {
    		$scope.sistema = {};
    	}
    	
    	$scope.buscarSistema = function(sistema) {
    		SistemaService.buscarSistema(
	    		{},
				function(sistemas){
					$scope.sistemas = sistemas;
				}, function(){
					console.log("Erro: buscar sistema");
				});
    	}
    	
    	$scope.salvarSistema = function(sistema) {
    		SistemaService.salvarSistema(
    	    		{},
    	    		sistema,
    				function(sistema) {
    					console.log(sistema);
    				}, function() {
    					console.log('Erro ao excluir sistema');
    				});
    	}

    });