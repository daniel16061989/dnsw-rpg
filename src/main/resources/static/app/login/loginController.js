angular.module('UserApp')
    .controller('LoginController', function ($scope, $rootScope, $location, $cookieStore, LoginService) {
    	$scope.logar = function(usuario) {
    		console.log($scope.usuario)
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
		}
    });