angular.module('UserApp')
    .controller('EscolherFichaBatalhaController', function ($scope, $rootScope, $location, $cookieStore, PersonagemService) {
    	
    	init();
    	
    	$scope.escolherFicha = function(personagem) {
    		console.log(persoagem);
    	}
    	
    	$scope.criarPersonagem = function() {
    		$location.path("/criar-personagem");
    	}
    	
    	function init() {
    		$scope.personagens = [];
    		
    		$scope.personagem = {};
    		$scope.personagem.usuario = {};
    		$scope.personagem.sistema = {};
    		
    		buscarPersonagens();
    	}
    	
    	function buscarPersonagens() {
    		var usuario = $cookieStore.get('usuarioLogado');
    		var sistema = $cookieStore.get('sistemaBatalha');
    		
    		PersonagemService.buscarPersonagem(
	    		{usuario : usuario, sistema : sistema},
				function(personagens){
					$scope.personagens = personagens;
					
				}, function(){
					console.log("Erro: buscar personagem");
				});
    	}
    });