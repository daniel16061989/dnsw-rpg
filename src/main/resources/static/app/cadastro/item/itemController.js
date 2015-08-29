angular.module('UserApp')
    .controller('ItemController', 
    		function ($scope, $rootScope, $location, $cookieStore, ItemService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarItem = function(item) {
    		$scope.item = item;
    	}
    	
    	$scope.limparItem = function() {
    		init();
    	}
    	
    	$scope.inativarItem = function(item) {
    		$scope.item = item;
    		$scope.item.flagAtivo = false;
    		
    		ItemService.atualizarItem(
	    		{},
	    		$scope.item,
				function(item) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Item inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar item');
				});
    	}
    	
    	$scope.buscarItem = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.item.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		ItemService.buscarItem(
	    	    		{item : $scope.item},
	    				function(items){
	    					$scope.items = items;
	    					
	    				}, function(){
	    					console.log("Erro: buscar item");
	    				});
    		}
    	}
    	
    	$scope.salvarItem = function() {
    		ItemService.salvarItem(
	    		{},
	    		$scope.item,
				function(item) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Item salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar item');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.items = [];
    		
    		$scope.item = {};
    		$scope.item.sistema = {};
        	$scope.item.flagAtivo = true;
        	
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