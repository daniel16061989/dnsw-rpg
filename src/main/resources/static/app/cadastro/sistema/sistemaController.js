angular.module('UserApp')
    .controller('SistemaController', function ($scope, $rootScope, $location, $cookieStore, SistemaService) {
    	$scope.salvar = function(sistema) {
    		LoginService.buscarUsuario(
    				{sistema : $scope.sistema},
    				function(sistema) {
    					console.log('Salvo com sucesso');

    				}, function() {
    					console.log('Erro ao buscar usuarios');
    				}
    		);
		}
    });