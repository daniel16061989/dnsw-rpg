angular.module('UserApp')
    .controller('VantagemController', 
    		function ($scope, $rootScope, $location, $cookieStore, VantagemService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarVantagem = function(vantagem) {
    		$scope.vantagem = vantagem;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.vantagem.sistema = sistema;
    	}
    	
    	$scope.limparVantagem = function() {
    		init();
    	}
    	
    	$scope.inativarVantagem = function(vantagem) {
    		$scope.vantagem = vantagem;
    		$scope.vantagem.flagAtivo = false;
    		
    		VantagemService.atualizarVantagem(
	    		{},
	    		$scope.vantagem,
				function(vantagem) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Vantagem inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar vantagem');
				});
    	}
    	
    	$scope.buscarVantagem = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.atributo.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		VantagemService.buscarVantagem(
	    	    		{vantagem : $scope.vantagem},
	    				function(vantagems){
	    					$scope.vantagems = vantagems;
	    					
	    				}, function(){
	    					console.log("Erro: buscar vantagem");
	    				});
    		}
    	}
    	
    	$scope.salvarVantagem = function() {
    		VantagemService.salvarVantagem(
	    		{},
	    		$scope.vantagem,
				function(vantagem) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Vantagem salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar vantagem');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.vantagems = [];
    		
    		$scope.vantagem = {};
    		$scope.vantagem.sistema = {};
        	$scope.vantagem.flagAtivo = true;
        	
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