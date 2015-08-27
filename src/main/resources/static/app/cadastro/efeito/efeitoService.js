angular.module('UserApp')
    .factory('EfeitoService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'efeito', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var e = {};

    	e.buscarEfeito = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	e.atualizarEfeito = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	e.salvarEfeito = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	e.deletarEfeito = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return e;
    });