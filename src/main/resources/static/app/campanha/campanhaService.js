angular.module('UserApp')
    .factory('CampanhaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'campanha', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var s = {};

    	s.buscarCampanha = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	s.atualizarCampanha = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	s.salvarCampanha = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	s.deletarCampanha = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return s;
    });