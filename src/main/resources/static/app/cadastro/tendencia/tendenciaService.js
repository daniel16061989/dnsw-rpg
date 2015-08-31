angular.module('UserApp')
    .factory('TendenciaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'tendencia', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var i = {};

    	i.buscarTendencia = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	i.atualizarTendencia = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	i.salvarTendencia = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	i.deletarTendencia = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return i;
    });