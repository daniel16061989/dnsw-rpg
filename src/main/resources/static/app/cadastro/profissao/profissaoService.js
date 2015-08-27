angular.module('UserApp')
    .factory('ProfissaoService', function($resource, $rootScope) {
        
        var resource = $resource($rootScope.url+'profissao', {}, 
    			{updateNow: {
    				method: 'PUT'
    			}
    	});

    	var p = {};

    	p.buscarProfissao = function(params, successFn, errorFn){
    		resource.query(params, successFn, errorFn);
    	};
    	
    	p.atualizarProfissao = function(params, payLoad, successFn, errorFn){
    		resource.updateNow(params, payLoad, successFn, errorFn);
    	};
    	
    	p.salvarProfissao = function(params, payLoad, successFn, errorFn){
    		resource.save(params, payLoad, successFn, errorFn);
    	};
    	
    	p.deletarProfissao = function(params, payLoad, successFn, errorFn){
    		resource.remove(params, payLoad, successFn, errorFn);
    	};
    	
    	return p;
    });