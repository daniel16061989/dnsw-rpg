angular.module('UserApp')
    .directive('mensagemDirective', function() {
    		return {
    			restrict: 'AE',
    			templateUrl: 'app/mensagem/template/mensagem.html'
			};
    }
)