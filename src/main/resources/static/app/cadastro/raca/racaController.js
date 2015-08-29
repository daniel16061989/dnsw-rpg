angular.module('UserApp')
    .controller('RacaController', 
    		function ($scope, $rootScope, $location, $cookieStore, RacaService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarRaca = function(raca) {
    		$scope.raca = raca;
    	}

    	$scope.limparRaca = function() {
    		init();
    	}
    	
    	$scope.inativarRaca = function(raca) {
    		$scope.raca = raca;
    		$scope.raca.flagAtivo = false;
    		
    		RacaService.atualizarRaca(
	    		{},
	    		$scope.raca,
				function(raca) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Raca inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar raca');
				});
    	}
    	
    	$scope.buscarRaca = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.raca.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		RacaService.buscarRaca(
	    	    		{raca : $scope.raca},
	    				function(racas){
	    					$scope.racas = racas;
	    					
	    				}, function(){
	    					console.log("Erro: buscar raca");
	    				});
    		}
    	}
    	
    	$scope.salvarRaca = function() {
    		RacaService.salvarRaca(
	    		{},
	    		$scope.raca,
				function(raca) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Raca salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar raca');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.racas = [];
    		
    		$scope.raca = {};
    		$scope.raca.sistema = {};
        	$scope.raca.flagAtivo = true;
        	
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