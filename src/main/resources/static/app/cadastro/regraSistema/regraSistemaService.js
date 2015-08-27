angular.module('UserApp')
    .factory('RegraSistemaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'regraSistema', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var r = {};

    	r.buscarRegraSistema = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	r.atualizarRegraSistema = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	r.salvarRegraSistema = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	r.deletarRegraSistema = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return r;
    });