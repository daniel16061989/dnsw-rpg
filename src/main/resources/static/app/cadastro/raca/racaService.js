angular.module('UserApp')
    .factory('RacaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'raca', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var r = {};

    	r.buscarRaca = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	r.atualizarRaca = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	r.salvarRaca = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	r.deletarRaca = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return r;
    });