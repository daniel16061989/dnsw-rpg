angular.module('UserApp')
    .controller('CombateController', 
    		function ($scope, $rootScope, $location, $cookieStore, CombateService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarCombate = function(combate) {
    		$scope.combate = combate;
    	}
    	
    	$scope.limparCombate = function() {
    		init();
    	}
    	
    	$scope.inativarCombate = function(combate) {
    		$scope.combate = combate;
    		$scope.combate.flagAtivo = false;
    		
    		CombateService.atualizarCombate(
	    		{},
	    		$scope.combate,
				function(combate) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Combate inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar combate');
				});
    	}
    	
    	$scope.buscarCombate = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.combate.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		CombateService.buscarCombate(
	    	    		{combate : $scope.combate},
	    				function(combates){
	    					$scope.combates = combates;
	    					
	    				}, function(){
	    					console.log("Erro: buscar combate");
	    				});
    		}
    	}
    	
    	$scope.salvarCombate = function() {
    		CombateService.salvarCombate(
	    		{},
	    		$scope.combate,
				function(combate) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Combate salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar combate');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.combates = [];
    		
    		$scope.combate = {};
    		$scope.combate.sistema = {};
        	$scope.combate.flagAtivo = true;
        	
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