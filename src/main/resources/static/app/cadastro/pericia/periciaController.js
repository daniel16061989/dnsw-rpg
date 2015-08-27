angular.module('UserApp')
    .controller('PericiaController', 
    		function ($scope, $rootScope, $location, $cookieStore, PericiaService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarPericia = function(pericia) {
    		$scope.pericia = pericia;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.pericia.sistema = sistema;
    	}
    	
    	$scope.limparPericia = function() {
    		init();
    	}
    	
    	$scope.inativarPericia = function(pericia) {
    		$scope.pericia = pericia;
    		$scope.pericia.flagAtivo = false;
    		
    		PericiaService.atualizarPericia(
	    		{},
	    		$scope.pericia,
				function(pericia) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Pericia inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar pericia');
				});
    	}
    	
    	$scope.buscarPericia = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.atributo.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		PericiaService.buscarPericia(
	    	    		{pericia : $scope.pericia},
	    				function(pericias){
	    					$scope.pericias = pericias;
	    					
	    				}, function(){
	    					console.log("Erro: buscar pericia");
	    				});
    		}
    	}
    	
    	$scope.salvarPericia = function() {
    		PericiaService.salvarPericia(
	    		{},
	    		$scope.pericia,
				function(pericia) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Pericia salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar pericia');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.pericias = [];
    		
    		$scope.pericia = {};
    		$scope.pericia.sistema = {};
        	$scope.pericia.flagAtivo = true;
        	
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