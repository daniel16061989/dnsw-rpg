angular.module('UserApp')
    .controller('SistemaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	
    	init();
    	
    	$scope.editarSistema = function(sistema) {
    		$scope.sistema = sistema;
    	}
    	
    	$scope.inativarSistema = function(sistema) {
    		$scope.sistema = sistema;
    		$scope.sistema.flagAtivo = false;
    		
    		SistemaService.atualizarSistema(
	    		{},
	    		$scope.sistema,
				function(sistema) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Sistema inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar sistema');
				});
    	}
    	
    	$scope.limparSistema = function() {
    		init();
    	}
    	
    	$scope.buscarSistema = function() {
    		buscarSistemas();
    	}
    	
    	$scope.salvarSistema = function() {
    		SistemaService.salvarSistema(
	    		{},
	    		$scope.sistema,
				function(sistema) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Sistema salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar sistema');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.sistemas = [];
    		
    		$scope.sistema = {};
        	$scope.sistema.flagAtivo = true;
        	
        	buscarSistemas();
    	}
    	
    	function buscarSistemas() {
    		SistemaService.buscarSistema(
	    		{sistema : $scope.sistema},
				function(sistemas){
					$scope.sistemas = sistemas;
					
				}, function(){
					console.log("Erro: buscar sistema");
				});
    	}

    });