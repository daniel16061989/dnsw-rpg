angular.module('UserApp')
    .factory('CombateService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'combate', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var c = {};

    	c.buscarCombate = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	c.atualizarCombate = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	c.salvarCombate = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	c.deletarCombate = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return c;
    });