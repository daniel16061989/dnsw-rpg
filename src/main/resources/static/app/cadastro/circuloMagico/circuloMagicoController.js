angular.module('UserApp')
    .controller('CirculoMagicoController', 
    		function ($scope, $rootScope, $location, $cookieStore, CirculoMagicoService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarCirculoMagico = function(circuloMagico) {
    		$scope.circuloMagico = circuloMagico;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.circuloMagico.sistema = sistema;
    	}
    	
    	$scope.limparCirculoMagico = function() {
    		init();
    	}
    	
    	$scope.inativarCirculoMagico = function(circuloMagico) {
    		$scope.circuloMagico = circuloMagico;
    		$scope.circuloMagico.flagAtivo = false;
    		
    		CirculoMagicoService.atualizarCirculoMagico(
	    		{},
	    		$scope.circuloMagico,
				function(circuloMagico) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'CirculoMagico inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar circuloMagico');
				});
    	}
    	
    	$scope.buscarCirculoMagico = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.circuloMagico.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		CirculoMagicoService.buscarCirculoMagico(
	    	    		{circuloMagico : $scope.circuloMagico},
	    				function(circuloMagicos){
	    					$scope.circuloMagicos = circuloMagicos;
	    					
	    				}, function(){
	    					console.log("Erro: buscar circuloMagico");
	    				});
    		}
    	}
    	
    	$scope.salvarCirculoMagico = function() {
    		CirculoMagicoService.salvarCirculoMagico(
	    		{},
	    		$scope.circuloMagico,
				function(circuloMagico) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'CirculoMagico salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar circuloMagico');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.circuloMagicos = [];
    		
    		$scope.circuloMagico = {};
    		$scope.circuloMagico.sistema = {};
        	$scope.circuloMagico.flagAtivo = true;
        	
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