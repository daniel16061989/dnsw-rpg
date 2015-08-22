angular.module('UserApp')
    .controller('SistemaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	init();
    	
    	$scope.editarSistema = function(sistema) {
    		$scope.sistema = sistema;
    	}
    	
    	$scope.inativarSistema = function() {
    		$scope.sistema.flagAtivo = false;
    		
    		SistemaService.atualizarSistema(
	    		{},
	    		$scope.sistema,
				function(sistema) {
					console.log(sistema);
					
					
				}, function() {
					console.log('Erro ao atualizar sistema');
				});
    	}
    	
    	$scope.limparSistema = function() {
    		$scope.sistema = {};
    	}
    	
    	$scope.buscarSistema = function() {
    		SistemaService.buscarSistema(
	    		{},
				function(sistemas){
					$scope.sistemas = sistemas;
				}, function(){
					console.log("Erro: buscar sistema");
				});
    	}
    	
    	$scope.salvarSistema = function() {
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
        				
        				$scope.mensagem.info = true;
        				$scope.mensagem.texto = 'Busca efetuada com sucesso';
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