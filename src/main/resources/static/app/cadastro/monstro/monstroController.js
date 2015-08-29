angular.module('UserApp')
    .controller('MonstroController', 
    		function ($scope, $rootScope, $location, $cookieStore, MonstroService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarMonstro = function(monstro) {
    		$scope.monstro = monstro;
    	}

    	$scope.limparMonstro = function() {
    		init();
    	}
    	
    	$scope.inativarMonstro = function(monstro) {
    		$scope.monstro = monstro;
    		$scope.monstro.flagAtivo = false;
    		
    		MonstroService.atualizarMonstro(
	    		{},
	    		$scope.monstro,
				function(monstro) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Monstro inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar monstro');
				});
    	}
    	
    	$scope.buscarMonstro = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.monstro.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		MonstroService.buscarMonstro(
	    	    		{monstro : $scope.monstro},
	    				function(monstros){
	    					$scope.monstros = monstros;
	    					
	    				}, function(){
	    					console.log("Erro: buscar monstro");
	    				});
    		}
    	}
    	
    	$scope.salvarMonstro = function() {
    		MonstroService.salvarMonstro(
	    		{},
	    		$scope.monstro,
				function(monstro) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Monstro salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar monstro');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.monstros = [];
    		
    		$scope.monstro = {};
    		$scope.monstro.sistema = {};
        	$scope.monstro.flagAtivo = true;
        	
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