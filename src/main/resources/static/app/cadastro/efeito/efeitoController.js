angular.module('UserApp')
    .controller('EfeitoController', 
    		function ($scope, $rootScope, $location, $cookieStore, EfeitoService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarEfeito = function(efeito) {
    		$scope.efeito = efeito;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.efeito.sistema = sistema;
    	}
    	
    	$scope.limparEfeito = function() {
    		init();
    	}
    	
    	$scope.inativarEfeito = function(efeito) {
    		$scope.efeito = efeito;
    		$scope.efeito.flagAtivo = false;
    		
    		EfeitoService.atualizarEfeito(
	    		{},
	    		$scope.efeito,
				function(efeito) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Efeito inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar efeito');
				});
    	}
    	
    	$scope.buscarEfeito = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.atributo.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		EfeitoService.buscarEfeito(
	    	    		{efeito : $scope.efeito},
	    				function(efeitos){
	    					$scope.efeitos = efeitos;
	    					
	    				}, function(){
	    					console.log("Erro: buscar efeito");
	    				});
    		}
    	}
    	
    	$scope.salvarEfeito = function() {
    		EfeitoService.salvarEfeito(
	    		{},
	    		$scope.efeito,
				function(efeito) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Efeito salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar efeito');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.efeitos = [];
    		
    		$scope.efeito = {};
    		$scope.efeito.sistema = {};
        	$scope.efeito.flagAtivo = true;
        	
        	buscarSistemas();
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