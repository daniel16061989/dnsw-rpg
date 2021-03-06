angular.module('UserApp')
    .factory('SistemaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'sistema', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var s = {};

    	s.buscarSistema = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	s.atualizarSistema = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	s.salvarSistema = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	s.deletarSistema = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return s;
    });