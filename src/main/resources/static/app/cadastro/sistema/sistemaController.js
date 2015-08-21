angular.module('UserApp')
    .controller('SistemaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	init();
    	
    	$scope.editarSistema = function(sistema) {
    		$scope.sistema = sistema;
    	}
    	
    	$scope.excluirSistema = function(sistema) {
    		SistemaService.deletarSistema(
	    		{},
	    		$scope.sistema,
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
    	    		$scope.sistema,
    				function(sistema) {
    					console.log(sistema);
    					
    					
    				}, function() {
    					console.log('Erro ao salvar sistema');
    				});
    	}
    	
    	function buscarTodos() {
    		SistemaService.buscarTodosSistemas(
    				{},
    				function(sistemas){
        				$scope.sistemas = sistemas;
        				
        				console.log(1);
        			}, function(){
        				console.log("Erro: buscar sistema");
        		});
    	}
    	
    	function init() {
    		$scope.sistemas = [];
    		
    		$scope.sistema = {};
        	$scope.sistema.flagAtivo = true;
        	
        	buscarTodos();
    	}

    });