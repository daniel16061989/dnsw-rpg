angular.module('UserApp')
    .controller('UsuarioController', 
    		function ($scope, $rootScope, $location, $cookieStore, UsuarioService, SistemaService, ValidacaoService) {
    	
    	init();
    	
    	$scope.editarUsuario = function(usuario) {
    		$scope.usuario = usuario;
    	}
    	
    	$scope.adicionarSistema = function(sistema) {
    		$scope.usuario.sistema = sistema;
    	}
    	
    	$scope.limparUsuario = function() {
    		init();
    	}
    	
    	$scope.inativarUsuario = function(usuario) {
    		$scope.usuario = usuario;
    		$scope.usuario.flagAtivo = false;
    		
    		UsuarioService.atualizarUsuario(
	    		{},
	    		$scope.usuario,
				function(usuario) {
	    			init();
	    			
	    			$scope.mensagem.info = true;
    				$scope.mensagem.texto = 'Usuario inativo com sucesso';
				}, function() {
					console.log('Erro ao atualizar usuario');
				});
    	}
    	
    	$scope.buscarUsuario = function() {
    		buscarUsuario();
    	}
    	
    	$scope.salvarUsuario = function() {
    		UsuarioService.salvarUsuario(
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
    		
    		$scope.usuarios = [];
    		
    		$scope.usuario = {};
        	$scope.usuario.flagAtivo = true;
        	
        	buscarUsuario();
    	}
    	
    	function buscarUsuario() {
    		UsuarioService.buscarUsuario(
    	    		{usuario : $scope.usuario},
    				function(usuarios){
    					$scope.usuarios = usuarios;
    					
    				}, function(){
    					console.log("Erro: buscar usuario");
    				});
    	}

    });