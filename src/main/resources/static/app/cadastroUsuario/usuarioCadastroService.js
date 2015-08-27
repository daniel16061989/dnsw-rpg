angular.module('UserApp')
    .factory('UsuarioCadastroService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'usuario', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var u = {};

    	u.buscarUsuario = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	u.atualizarUsuario = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	u.salvarUsuario = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	u.deletarUsuario = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return u;
    });