angular.module('UserApp')
    .controller('ClasseController', 
    		function ($scope, $rootScope, $location, $cookieStore, ClasseService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarClasse = function(classe) {
    		$scope.classe = classe;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.classe.sistema = sistema;
    	}
    	
    	$scope.limparClasse = function() {
    		init();
    	}
    	
    	$scope.inativarClasse = function(classe) {
    		$scope.classe = classe;
    		$scope.classe.flagAtivo = false;
    		
    		ClasseService.atualizarClasse(
	    		{},
	    		$scope.classe,
				function(classe) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Classe inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar classe');
				});
    	}
    	
    	$scope.buscarClasse = function() {
    		if(ValidacaoService.validaObjetoVazio($scope.atributo.sistema)) {
    			$scope.mensagem.danger = true;
				$scope.mensagem.texto = 'Selecione o sistema antes de realizar a busca';
    		} else {
	    		ClasseService.buscarClasse(
	    	    		{classe : $scope.classe},
	    				function(classes){
	    					$scope.classes = classes;
	    					
	    				}, function(){
	    					console.log("Erro: buscar classe");
	    				});
    		}
    	}
    	
    	$scope.salvarClasse = function() {
    		ClasseService.salvarClasse(
	    		{},
	    		$scope.classe,
				function(classe) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Classe salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar classe');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.classes = [];
    		
    		$scope.classe = {};
    		$scope.classe.sistema = {};
        	$scope.classe.flagAtivo = true;
        	
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