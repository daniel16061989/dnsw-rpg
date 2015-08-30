angular.module('UserApp')
    .factory('VantagemService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'vantagem', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var a = {};

    	a.buscarVantagem = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	a.atualizarVantagem = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	a.salvarVantagem = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	a.deletarVantagem = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return a;
    });