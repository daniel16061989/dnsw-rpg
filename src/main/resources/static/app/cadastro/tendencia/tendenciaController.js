angular.module('UserApp')
    .controller('TendenciaController', 
    		function ($scope, $rootScope, $location, $cookieStore, TendenciaService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarTendencia = function(tendencia) {
    		$scope.tendencia = tendencia;
    	}
    	
    	$scope.limparTendencia = function() {
    		init();
    	}
    	
    	$scope.inativarTendencia = function(tendencia) {
    		$scope.tendencia = tendencia;
    		$scope.tendencia.flagAtivo = false;
    		
    		TendenciaService.atualizarTendencia(
	    		{},
	    		$scope.tendencia,
				function(tendencia) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Tendencia inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar tendencia');
				});
    	}
    	
    	$scope.buscarTendencia = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.tendencia.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		TendenciaService.buscarTendencia(
	    	    		{tendencia : $scope.tendencia},
	    				function(tendencias){
	    					$scope.tendencias = tendencias;
	    					
	    				}, function(){
	    					console.log("Erro: buscar tendencia");
	    				});
    		}
    	}
    	
    	$scope.salvarTendencia = function() {
    		TendenciaService.salvarTendencia(
	    		{},
	    		$scope.tendencia,
				function(tendencia) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Tendencia salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar tendencia');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.tendencias = [];
    		
    		$scope.tendencia = {};
    		$scope.tendencia.sistema = {};
        	$scope.tendencia.flagAtivo = true;
        	
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