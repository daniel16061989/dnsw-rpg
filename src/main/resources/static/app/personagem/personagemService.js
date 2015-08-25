angular.module('UserApp')
    .factory('PersonagemService', function($resource) {
        
        var resource = $resource('http://localhost:8080/personagem', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var p = {};

    	p.buscarPersonagem = function(params, successFn, errorFn){
    		resource.get(params, successFn, errorFn);
    	};

    	p.atualizarPersonagem = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	p.salvarPersonagem = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	p.deletarPersonagem = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return p;
    });