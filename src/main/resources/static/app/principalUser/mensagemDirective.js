angular.module('UserApp')
    .directive('mensagemDirective', function() {
    		return {
    			restrict: 'AE',
    			templateUrl: 'app/principalUser/template/mensagem.html'
			};
    }
)