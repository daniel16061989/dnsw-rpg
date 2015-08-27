angular.module('UserApp')
    .factory('PericiaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'pericia', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var p = {};

    	p.buscarPericia = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	p.atualizarPericia = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	p.salvarPericia = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	p.deletarPericia = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return p;
    });