angular.module('UserApp')
    .controller('LoginController', function ($scope, $rootScope, $location, $cookieStore, LoginService) {
    	$scope.logar = function(usuario) {
//    		if(usuario.login != 'undefined' && usuario.senha != 'undefined') {
	    		LoginService.buscarUsuario(
	    				{usuario : $scope.usuario},
	    				function(usuario) {
	    					$scope.usuario = usuario;
	    					
	    					$cookieStore.put('usuarioLogado',usuario);
	    					
	    					$location.path("/principal");
	    					
	//    					// Put cookie
	//    					$cookieStore.put('myFavorite','oatmeal');
	//    					// Get cookie
	//    					var favoriteCookie = $cookieStore.get('myFavorite');
	//    					// Removing a cookie
	//    					$cookieStore.remove('myFavorite');
	
	    				}, function() {
	    					console.log('Erro ao buscar usuarios');
	    				}
	    		);
//    		}
		}
    	
    	$scope.registrar = function() {
    		console.log(234);
    		$location.path("/cadastro-usuario");
    	}
    });