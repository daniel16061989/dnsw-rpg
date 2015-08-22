angular.module('UserApp')
	.config(function ($translateProvider) {
		$translateProvider.translations('en', {
			// GERAL
		    'FOOTER': 'All rights reserved',
		    
		    // NAVBAR
		    'HOME': 'Home',
		    'SYSTEM': 'System RPG',
		    
		    // CADASTRO
		    'ID': 'ID',
		    'NAME': 'Name',
		    'DESCRIPTION': 'Description',
		    'ACTIVE': 'Active',
		    'ACTIONS': 'Actions',
		    'EDIT': 'Edit',
		    'DELETE': 'Delete',
		    'INACTIVATE': 'Inactivate',
		  });
		  $translateProvider.translations('pt', {
			// GERAL
		    'FOOTER': 'Todos os direitos reservados',
		    
		    // NAVBAR
		    'HOME': 'Principal',
		    'SYSTEM': 'Sistema RPG',
		    
		    // CADASTRO
		    'ID': 'ID',
		    'NAME': 'Nome',
		    'DESCRIPTION': 'Descrição',
		    'ACTIVE': 'Ativo',
		    'ACTIONS': 'Ações',
		    'EDIT': 'Editar',
		    'DELETE': 'Excluir',
		    'INACTIVATE': 'Inativar',
		  });
		  $translateProvider.preferredLanguage('pt');
	});