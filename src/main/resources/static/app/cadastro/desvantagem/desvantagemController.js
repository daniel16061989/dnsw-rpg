angular.module('UserApp')
    .controller('DesvantagemController', 
    		function ($scope, $rootScope, $location, $cookieStore, DesvantagemService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarDesvantagem = function(desvantagem) {
    		$scope.desvantagem = desvantagem;
    	}
    	    	
    	$scope.limparDesvantagem = function() {
    		init();
    	}
    	
    	$scope.inativarDesvantagem = function(desvantagem) {
    		$scope.desvantagem = desvantagem;
    		$scope.desvantagem.flagAtivo = false;
    		
    		DesvantagemService.atualizarDesvantagem(
	    		{},
	    		$scope.desvantagem,
				function(desvantagem) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Desvantagem inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar desvantagem');
				});
    	}
    	
    	$scope.buscarDesvantagem = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.desvantagem.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		DesvantagemService.buscarDesvantagem(
	    	    		{desvantagem : $scope.desvantagem},
	    				function(desvantagems){
	    					$scope.desvantagems = desvantagems;
	    					
	    				}, function(){
	    					console.log("Erro: buscar desvantagem");
	    				});
    		}
    	}
    	
    	$scope.salvarDesvantagem = function() {
    		DesvantagemService.salvarDesvantagem(
	    		{},
	    		$scope.desvantagem,
				function(desvantagem) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Desvantagem salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar desvantagem');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.desvantagems = [];
    		
    		$scope.desvantagem = {};
    		$scope.desvantagem.sistema = {};
        	$scope.desvantagem.flagAtivo = true;
        	
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