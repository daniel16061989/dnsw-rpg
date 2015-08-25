angular.module('UserApp')
    .controller('NovaCampanhaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService, CampanhaService) {
    	$scope.sistemas = [];
    	
    	init();
    	
    	$scope.salvarCampanha = function() {
    		var usuarioLogado = $cookieStore.get('usuarioLogado');
    		$scope.campanha.mestre = usuarioLogado;
    		
    		CampanhaService.salvarCampanha(
	    		{},
	    		$scope.campanha,
				function(campanha) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Campanha salva com sucesso';
				}, function() {
					console.log('Erro ao salvar campanha');
				});
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.campanha.sistema = sistema;
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.campanha = {};
        	
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