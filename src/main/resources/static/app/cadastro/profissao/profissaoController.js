angular.module('UserApp')
    .controller('ProfissaoController', 
    		function ($scope, $rootScope, $location, $cookieStore, ProfissaoService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarProfissao = function(profissao) {
    		$scope.profissao = profissao;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.profissao.sistema = sistema;
    	}
    	
    	$scope.limparProfissao = function() {
    		init();
    	}
    	
    	$scope.inativarProfissao = function(profissao) {
    		$scope.profissao = profissao;
    		$scope.profissao.flagAtivo = false;
    		
    		ProfissaoService.atualizarProfissao(
	    		{},
	    		$scope.profissao,
				function(profissao) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Profissao inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar profissao');
				});
    	}
    	
    	$scope.buscarProfissao = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.profissao.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		ProfissaoService.buscarProfissao(
	    	    		{profissao : $scope.profissao},
	    				function(profissaos){
	    					$scope.profissaos = profissaos;
	    					
	    				}, function(){
	    					console.log("Erro: buscar profissao");
	    				});
    		}
    	}
    	
    	$scope.salvarProfissao = function() {
    		ProfissaoService.salvarProfissao(
	    		{},
	    		$scope.profissao,
				function(profissao) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Profissao salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar profissao');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.profissaos = [];
    		
    		$scope.profissao = {};
    		$scope.profissao.sistema = {};
        	$scope.profissao.flagAtivo = true;
        	
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