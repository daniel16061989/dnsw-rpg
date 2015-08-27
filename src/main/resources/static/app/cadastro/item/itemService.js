angular.module('UserApp')
    .factory('ItemService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'item', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var i = {};

    	i.buscarItem = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	i.atualizarItem = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	i.salvarItem = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	i.deletarItem = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return i;
    });