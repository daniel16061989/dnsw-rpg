angular.module('UserApp')
    .factory('DesvantagemService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'desvantagem', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var d = {};

    	d.buscarDesvantagem = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	d.atualizarDesvantagem = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	d.salvarDesvantagem = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	d.deletarDesvantagem = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return d;
    });