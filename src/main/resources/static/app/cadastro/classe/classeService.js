angular.module('UserApp')
    .factory('ClasseService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'classe', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var c = {};

    	c.buscarClasse = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	c.atualizarClasse = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	c.salvarClasse = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	c.deletarClasse = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return c;
    });