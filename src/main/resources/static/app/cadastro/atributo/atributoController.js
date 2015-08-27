angular.module('UserApp')
    .controller('AtributoController', 
    		function ($scope, $rootScope, $location, $cookieStore, AtributoService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarAtributo = function(atributo) {
    		$scope.atributo = atributo;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.atributo.sistema = sistema;
    	}
    	
    	$scope.limparAtributo = function() {
    		init();
    	}
    	
    	$scope.inativarAtributo = function(atributo) {
    		$scope.atributo = atributo;
    		$scope.atributo.flagAtivo = false;
    		
    		AtributoService.atualizarAtributo(
	    		{},
	    		$scope.atributo,
				function(atributo) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Atributo inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar atributo');
				});
    	}
    	
    	$scope.buscarAtributo = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.atributo.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		AtributoService.buscarAtributo(
	    	    		{atributo : $scope.atributo},
	    				function(atributos){
	    					$scope.atributos = atributos;
	    					
	    				}, function(){
	    					console.log("Erro: buscar atributo");
	    				});
    		}
    	}
    	
    	$scope.salvarAtributo = function() {
    		AtributoService.salvarAtributo(
	    		{},
	    		$scope.atributo,
				function(atributo) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Atributo salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar atributo');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.atributos = [];
    		
    		$scope.atributo = {};
    		$scope.atributo.sistema = {};
        	$scope.atributo.flagAtivo = true;
        	
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