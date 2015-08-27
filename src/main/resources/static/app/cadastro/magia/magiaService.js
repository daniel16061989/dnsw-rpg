angular.module('UserApp')
    .factory('MagiaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'magia', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var m = {};

    	m.buscarMagia = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	m.atualizarMagia = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	m.salvarMagia = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	m.deletarMagia = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return m;
    });