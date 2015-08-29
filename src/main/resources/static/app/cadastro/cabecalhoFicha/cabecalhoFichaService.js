angular.module('UserApp')
    .factory('CabecalhoFichaService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'cabecalho', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var c = {};

    	c.buscarCabecalhoFicha = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	c.atualizarCabecalhoFicha = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	c.salvarCabecalhoFicha = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	c.deletarCabecalhoFicha = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return c;
    });