angular.module('UserApp')
    .factory('DivindadeService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'divindade', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var d = {};

    	d.buscarDivindade = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	d.atualizarDivindade = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	d.salvarDivindade = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	d.deletarDivindade = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return d;
    });