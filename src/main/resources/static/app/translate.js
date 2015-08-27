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
		    'ATTRIBUTE': 'Attribute',
		    'BATTLE': 'Battle',
		    'MAGIC_CIRCLE': 'Magic Circle',
		    'CLASS': 'Class',
		    'DRAWBACK': 'Drawback',
		    'EFFECT': 'Effect',
		    'ITEM': 'Item',
		    'MAGIC': 'Magic',
		    'MONSTER': 'Monster',
		    'RULE_SYSTEM': 'Rule System',
		    'USER': 'User',
		    'PROFESSION': 'Profession',
		    'SKILL': 'Skill',
		    'BREED': 'Breed',
		    'ADVANTAGE': 'Advantage',
		    
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
		    'ATTRIBUTE': 'Atributo',
		    'BATTLE': 'Batalha',
		    'MAGIC_CIRCLE': 'Círculo Mágico',
		    'CLASS': 'Classe',
		    'DRAWBACK': 'Desvantagem',
		    'EFFECT': 'Efeito',
		    'ITEM': 'Item',
		    'MAGIC': 'Magia',
		    'MONSTER': 'Monstro',
		    'RULE_SYSTEM': 'Regra de Sistema',
		    'USER': 'Usuário',
		    'PROFESSION': 'Profissão',
		    'SKILL': 'Perícia',
		    'BREED': 'Raça',
		    'ADVANTAGE': 'Vantagem',
		    
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