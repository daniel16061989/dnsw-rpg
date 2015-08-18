angular.module('UserApp')
    .factory('LoginService', function($resource) {
        
        var resource = $resource('http://localhost:8080/usuario', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var u = {};

    	u.buscarUsuario = function(params, successFn, errorFn){
    		resource.get(params, successFn, errorFn);
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