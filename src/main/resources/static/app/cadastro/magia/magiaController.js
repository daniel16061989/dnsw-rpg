angular.module('UserApp')
    .controller('MagiaController', 
    		function ($scope, $rootScope, $location, $cookieStore, MagiaService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarMagia = function(magia) {
    		$scope.magia = magia;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.magia.sistema = sistema;
    	}
    	
    	$scope.limparMagia = function() {
    		init();
    	}
    	
    	$scope.inativarMagia = function(magia) {
    		$scope.magia = magia;
    		$scope.magia.flagAtivo = false;
    		
    		MagiaService.atualizarMagia(
	    		{},
	    		$scope.magia,
				function(magia) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Magia inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar magia');
				});
    	}
    	
    	$scope.buscarMagia = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.atributo.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		MagiaService.buscarMagia(
	    	    		{magia : $scope.magia},
	    				function(magias){
	    					$scope.magias = magias;
	    					
	    				}, function(){
	    					console.log("Erro: buscar magia");
	    				});
    		}
    	}
    	
    	$scope.salvarMagia = function() {
    		MagiaService.salvarMagia(
	    		{},
	    		$scope.magia,
				function(magia) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Magia salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar magia');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.magias = [];
    		
    		$scope.magia = {};
    		$scope.magia.sistema = {};
        	$scope.magia.flagAtivo = true;
        	
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