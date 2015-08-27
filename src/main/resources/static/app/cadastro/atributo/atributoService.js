angular.module('UserApp')
    .factory('AtributoService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'atributo', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var a = {};

    	a.buscarAtributo = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	a.atualizarAtributo = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	a.salvarAtributo = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	a.deletarAtributo = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return a;
    });