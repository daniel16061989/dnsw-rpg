angular.module('UserApp')
    .controller('CabecalhoFichaController', 
    		function ($scope, $rootScope, $location, $cookieStore, CabecalhoFichaService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarCabecalhoFicha = function(cabecalhoFicha) {
    		$scope.cabecalhoFicha = cabecalhoFicha;
    	}
    	
    	$scope.limparCabecalhoFicha = function() {
    		init();
    	}
    	
    	$scope.inativarCabecalhoFicha = function(cabecalhoFicha) {
    		$scope.cabecalhoFicha = cabecalhoFicha;
    		$scope.cabecalhoFicha.flagAtivo = false;
    		
    		CabecalhoFichaService.atualizarCabecalhoFicha(
	    		{},
	    		$scope.cabecalhoFicha,
				function(cabecalhoFicha) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'CabecalhoFicha inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar cabecalhoFicha');
				});
    	}
    	
    	$scope.buscarCabecalhoFicha = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.cabecalhoFicha.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		CabecalhoFichaService.buscarCabecalhoFicha(
	    	    		{cabecalhoFicha : $scope.cabecalhoFicha},
	    				function(cabecalhoFichas){
	    					$scope.cabecalhoFichas = cabecalhoFichas;
	    					
	    				}, function(){
	    					console.log("Erro: buscar cabecalhoFicha");
	    				});
    		}
    	}
    	
    	$scope.salvarCabecalhoFicha = function() {
    		CabecalhoFichaService.salvarCabecalhoFicha(
	    		{},
	    		$scope.cabecalhoFicha,
				function(cabecalhoFicha) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'CabecalhoFicha salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar cabecalhoFicha');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.cabecalhoFichas = [];
    		
    		$scope.cabecalhoFicha = {};
    		$scope.cabecalhoFicha.sistema = {};
        	$scope.cabecalhoFicha.flagAtivo = true;
        	
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