angular.module('UserApp')
    .factory('CirculoMagicoService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'circuloMagico', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var c = {};

    	c.buscarCirculoMagico = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	c.atualizarCirculoMagico = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	c.salvarCirculoMagico = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	c.deletarCirculoMagico = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return c;
    });