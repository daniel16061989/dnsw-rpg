angular.module('UserApp')
    .controller('DivindadeController', 
    		function ($scope, $rootScope, $location, $cookieStore, DivindadeService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarDivindade = function(divindade) {
    		$scope.divindade = divindade;
    	}
    	
    	$scope.limparDivindade = function() {
    		init();
    	}
    	
    	$scope.inativarDivindade = function(divindade) {
    		$scope.divindade = divindade;
    		$scope.divindade.flagAtivo = false;
    		
    		DivindadeService.atualizarDivindade(
	    		{},
	    		$scope.divindade,
				function(divindade) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Divindade inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar divindade');
				});
    	}
    	
    	$scope.buscarDivindade = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.divindade.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		DivindadeService.buscarDivindade(
	    	    		{divindade : $scope.divindade},
	    				function(divindades){
	    					$scope.divindades = divindades;
	    					
	    				}, function(){
	    					console.log("Erro: buscar divindade");
	    				});
    		}
    	}
    	
    	$scope.salvarDivindade = function() {
    		DivindadeService.salvarDivindade(
	    		{},
	    		$scope.divindade,
				function(divindade) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Divindade salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar divindade');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.divindades = [];
    		
    		$scope.divindade = {};
    		$scope.divindade.sistema = {};
        	$scope.divindade.flagAtivo = true;
        	
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