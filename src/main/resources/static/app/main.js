angular.module('UserApp', ['ngRoute', 'ngResource', 'ngMessages', 'ngCookies', 'pascalprecht.translate'])
    .config(function($routeProvider, $locationProvider) {
    	$locationProvider.hashPrefix('!');
    	
        $routeProvider
            .when('/login', {
                controller: 'LoginController',
                templateUrl: 'app/view/login.html'
            })
            .when('/principal', {
                controller: 'PrincipalController',
                templateUrl: 'app/view/principal.html'
            })
            .when('/nova-campanha', {
                controller: 'NovaCampanhaController',
                templateUrl: 'app/view/novaCampanha.html'
            })
            .when('/escolher-ficha-batalha', {
                controller: 'EscolherFichaBatalhaController',
                templateUrl: 'app/view/escolherFichaBatalha.html'
            })
            .when('/cadastro-usuario', {
                controller: 'UsuarioCadastroController',
                templateUrl: 'app/view/cadastroUsuario.html'
            })
            .when('/criar-personagem', {
                controller: 'CriarPersonagemController',
                templateUrl: 'app/view/criarPersonagem.html'
            })
            
            
            
            .when('/atributo', {
                controller: 'AtributoController',
                templateUrl: 'app/view/cadastro/atributo.html'
            })
            .when('/cabecalho-ficha', {
                controller: 'CabecalhoFichaController',
                templateUrl: 'app/view/cadastro/cabecalhoFicha.html'
            })
            .when('/circulo-magico', {
                controller: 'CirculoMagicoController',
                templateUrl: 'app/view/cadastro/circuloMagico.html'
            })
            .when('/classe', {
                controller: 'ClasseController',
                templateUrl: 'app/view/cadastro/classe.html'
            })
            .when('/combate', {
                controller: 'CombateController',
                templateUrl: 'app/view/cadastro/combate.html'
            })
            .when('/desvantagem', {
                controller: 'DesvantagemController',
                templateUrl: 'app/view/cadastro/desvantagem.html'
            })
            .when('/efeito', {
                controller: 'EfeitoController',
                templateUrl: 'app/view/cadastro/efeito.html'
            })
            .when('/item', {
                controller: 'ItemController',
                templateUrl: 'app/view/cadastro/item.html'
            })
            .when('/magia', {
                controller: 'MagiaController',
                templateUrl: 'app/view/cadastro/magia.html'
            })
            .when('/monstro', {
                controller: 'MonstroController',
                templateUrl: 'app/view/cadastro/monstro.html'
            })
            .when('/pericia', {
                controller: 'PericiaController',
                templateUrl: 'app/view/cadastro/pericia.html'
            })
            .when('/profissao', {
                controller: 'ProfissaoController',
                templateUrl: 'app/view/cadastro/profissao.html'
            })
            .when('/raca', {
                controller: 'RacaController',
                templateUrl: 'app/view/cadastro/raca.html'
            })
            .when('/regra-sistema', {
                controller: 'RegraSistemaController',
                templateUrl: 'app/view/cadastro/regraSistema.html'
            })
            .when('/sistema', {
                controller: 'SistemaController',
                templateUrl: 'app/view/cadastro/sistema.html'
            })
            .when('/usuario', {
                controller: 'UsuarioController',
                templateUrl: 'app/view/cadastro/usuario.html'
            })
            .when('/vantagem', {
                controller: 'VantagemController',
                templateUrl: 'app/view/cadastro/vantagem.html'
            })
            .when('/tendencia', {
                controller: 'TendenciaController',
                templateUrl: 'app/view/cadastro/tendencia.html'
            })
            .when('/divindade', {
                controller: 'DivindadeController',
                templateUrl: 'app/view/cadastro/divindade.html'
            })
			.otherwise({
				redirectTo: '/login'
			});
    })
    .controller('MainController', function ($scope, $rootScope, $location, ValidacaoService) {
    	$rootScope.url = 'http://localhost:8080/';
    	
    	$scope.mensagem = {};
    	$scope.mensagem.success = false;
    	$scope.mensagem.info = false;
    	$scope.mensagem.warning = false;
    	$scope.mensagem.danger = false;
    	$scope.mensagem.texto = '';
    	
    	$rootScope.iniciaNavbar = false;

    });