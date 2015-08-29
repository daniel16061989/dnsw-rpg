angular.module('UserApp')
    .controller('RegraSistemaController', 
    		function ($scope, $rootScope, $location, $cookieStore, RegraSistemaService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarRegraSistema = function(regraSistema) {
    		$scope.regraSistema = regraSistema;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.regraSistema.sistema = sistema;
    	}
    	
    	$scope.limparRegraSistema = function() {
    		init();
    	}
    	
    	$scope.inativarRegraSistema = function(regraSistema) {
    		$scope.regraSistema = regraSistema;
    		$scope.regraSistema.flagAtivo = false;
    		
    		RegraSistemaService.atualizarRegraSistema(
	    		{},
	    		$scope.regraSistema,
				function(regraSistema) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'RegraSistema inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar regraSistema');
				});
    	}
    	
    	$scope.buscarRegraSistema = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.regraSistema.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		RegraSistemaService.buscarRegraSistema(
	    	    		{regraSistema : $scope.regraSistema},
	    				function(regraSistemas){
	    					$scope.regraSistemas = regraSistemas;
	    					
	    				}, function(){
	    					console.log("Erro: buscar regraSistema");
	    				});
    		}
    	}
    	
    	$scope.salvarRegraSistema = function() {
    		RegraSistemaService.salvarRegraSistema(
	    		{},
	    		$scope.regraSistema,
				function(regraSistema) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'RegraSistema salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar regraSistema');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.regraSistemas = [];
    		
    		$scope.regraSistema = {};
    		$scope.regraSistema.sistema = {};
        	$scope.regraSistema.flagAtivo = true;
        	
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