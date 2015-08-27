angular.module('UserApp')
    .factory('ValidacaoService', function() {
        
    	var v = {};
    	
    	v.validaObjetoVazio = function(obj) {
        	for (var i in obj) {
        	    if(obj.hasOwnProperty(i)) {
        	        return false;
        	    }
        	}
        	return true;
        }
    	
    	return v;
    });