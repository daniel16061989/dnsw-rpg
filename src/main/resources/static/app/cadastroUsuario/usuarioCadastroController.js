angular.module('UserApp')
    .controller('UsuarioCadastroController', 
    		function ($scope, $rootScope, $location, $cookieStore, UsuarioCadastroService, ValidacaoService) {
    	
    	init();
    	
    	$scope.buscarUsuario = function() {
    		UsuarioCadastroService.buscarUsuario(
    	    		{usuario : $scope.usuario},
    				function(usuarios){
    					$scope.usuarios = usuarios;
    					
    				}, function(){
    					console.log("Erro: buscar usuario");
    				});
    	}
    	
    	$scope.voltar = function() {
    		$location.path("/");
    	}
    	
    	$scope.salvarUsuario = function() {
    		console.log($rootScope.url);
    		UsuarioCadastroService.salvarUsuario(
	    		{},
	    		$scope.usuario,
				function(usuario) {
					init();
					
					$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Usuario salvo com sucesso';
				}, function() {
					console.log('Erro ao salvar usuario');
				});
    	}
    	
    	function init() {
    		$scope.mensagem.info = false;
    		$scope.mensagem.danger = false;
    		
    		$scope.usuario = {};
        	$scope.usuario.flagAtivo = true;
    	}

    });