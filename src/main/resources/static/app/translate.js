angular.module('UserApp')
	.config(function ($translateProvider) {
		$translateProvider.translations('en', {
			// GERAL
		    'FOOTER': 'All rights reserved',
		    'TITLE': 'System RPG',
		    'PROJECT_NAME': 'Project Name',
		    
		    // NAVBAR
		    'HOME': 'Home',
		    'SYSTEM': 'System RPG',
		    'CAMPAIGN': 'Campaign',
		    'NEW_CAMPAIGN': 'New Campaign',
		    'SEEK_CAMPAIGN': 'Seek Campaign',
		    'REGISTER': 'Register',
		    'SETTINGS': 'Settings',
		    'MASTER': 'Master',
		    'BATTLE': 'Battle',
		    
		    // CAMPANHA
		    'NAME_CAMPAIGN': 'Name Campaign',
		    'DESCRIPTION_CAMPAIGN': 'Description Campaign',
		    'HISTORY_CAMPAIGN': 'History of Campaign',
		    
		    // CADASTRO
		    'ID': 'ID',
		    'NAME': 'Name',
		    'DESCRIPTION': 'Description',
		    'ACTIVE': 'Active',
		    'ACTIONS': 'Actions',
		    'EDIT': 'Edit',
		    'DELETE': 'Delete',
		    'INACTIVATE': 'Inactivate',
		    'PASSWORD': 'Password'
		  });
		  $translateProvider.translations('pt', {
			// GERAL
		    'FOOTER': 'Todos os direitos reservados',
		    'TITLE': 'Sistema RPG',
		    'PROJECT_NAME': 'Nome Projeto',
		    
		    // NAVBAR
		    'HOME': 'Principal',
		    'SYSTEM': 'Sistema RPG',
		    'CAMPAIGN': 'Campanha',
		    'NEW_CAMPAIGN': 'Nova Campanha',
		    'SEEK_CAMPAIGN': 'Buscar Campanha',
		    'REGISTER': 'Cadastro',
		    'SETTINGS': 'Configurações',
		    'MASTER': 'Mestre',
		    'BATTLE': 'Batalha',
		    
		    // CAMPANHA
		    'NAME_CAMPAIGN': 'Nome Campanha',
		    'DESCRIPTION_CAMPAIGN': 'Descrição da Campanha',
		    'HISTORY_CAMPAIGN': 'História da Campanha',
		    
		    // CADASTRO
		    'ID': 'ID',
		    'NAME': 'Nome',
		    'DESCRIPTION': 'Descrição',
		    'ACTIVE': 'Ativo',
		    'ACTIONS': 'Ações',
		    'EDIT': 'Editar',
		    'DELETE': 'Excluir',
		    'INACTIVATE': 'Inativar',
		    'PASSWORD': 'Senha'
		  });
		  $translateProvider.preferredLanguage('pt');
	});