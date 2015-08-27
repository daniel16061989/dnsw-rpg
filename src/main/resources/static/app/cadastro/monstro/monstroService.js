angular.module('UserApp')
    .factory('MonstroService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'monstro', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var m = {};

    	m.buscarMonstro = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	m.atualizarMonstro = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	m.salvarMonstro = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	m.deletarMonstro = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return m;
    });