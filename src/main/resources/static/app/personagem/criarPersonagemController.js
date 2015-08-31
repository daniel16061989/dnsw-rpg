angular.module('UserApp')
    .controller('CriarPersonagemController', function ($scope, $rootScope, $location, $cookieStore, 
    		PersonagemService, CabecalhoFichaService, AtributoService, VantagemService, DesvantagemService, PericiaService, 
    		RacaService, ClasseService,
    		RegraSistemaService, ValidacaoService) {
//    		, PericiaService, MagiaService, 
//    		VantagemService, DesvantagemService, RacaService, ClasseService, ProfissaoService) {
    	
    	init();
    	
    	$scope.salvarFicha = function() {
    		console.log($scope.cabecalhoResult);
    		console.log($scope.atributoResult);
    		console.log($scope.vantagemResult);
    		console.log($scope.desvantagemResult);
    		console.log($scope.periciaResult);
    	}
    	
    	function init() {
    		$scope.sistema = $cookieStore.get('sistemaBatalha');
    		
    		$scope.cabecalhos = [];
    		$scope.atributos = [];
    		$scope.vantagens = [];
    		$scope.desvantagens = [];
    		$scope.pericias = [];
    		$scope.regrasSistema = [];
    		
    		$scope.racas = [];
    		$scope.classes = [];
    		$scope.tendencias = [];
    		$scope.divindades = [];
    		
//    		$scope.magias = [];
//    		$scope.classes = [];
//    		$scope.profissoes = [];
    		
    		buscarCabecalhoFicha();
    		buscarAtributos();
    		console.log($scope.atributos);
    		buscarVantagens();
    		buscarDesvantagens();
    		buscarPericias();

    		buscarRacas();
    		buscarClasses();
//    		buscarMagias();
//    		buscarProfissao();
    		
    		$scope.cabecalhoResult = {};
    		$scope.atributoResult = {};
    		$scope.vantagemResult = {};
    		$scope.desvantagemResult = {};
    		$scope.periciaResult = {};
    	}
    	
    	function buscarCabecalhoFicha() {
    		$scope.cabecalhoFicha = {};
    		$scope.cabecalhoFicha.flagAtivo = true;
    		$scope.cabecalhoFicha.sistema = $scope.sistema;
    		
    		CabecalhoFichaService.buscarCabecalhoFicha(
	    		{cabecalhoFicha : $scope.cabecalhoFicha},
				function(cabecalhos){
	    			$scope.cabecalhos = cabecalhos;
					
				}, function(){
					console.log("Erro: buscar cabecalho");
				});
    	}
    	
    	function buscarAtributos() {
    		$scope.atributo = {};
    		$scope.atributo.flagAtivo = true;
    		$scope.atributo.sistema = $scope.sistema;
    		
    		AtributoService.buscarAtributo(
	    		{atributo : $scope.atributo},
				function(atributos){
	    			$scope.atributos = atributos;
					
				}, function(){
					console.log("Erro: buscar atributos");
				});
    	}
    	
    	function buscarVantagens() {
    		$scope.vantagem = {};
    		$scope.vantagem.flagAtivo = true;
    		$scope.vantagem.sistema = $scope.sistema;
    		
    		VantagemService.buscarVantagem(
	    		{vantagem : $scope.vantagem},
				function(vantagens){
	    			$scope.vantagens = vantagens;
					
				}, function(){
					console.log("Erro: buscar vantagens");
				});
    	}
    	
    	function buscarDesvantagens() {
    		$scope.desvantagem = {};
    		$scope.desvantagem.flagAtivo = true;
    		$scope.desvantagem.sistema = $scope.sistema;
    		
    		DesvantagemService.buscarDesvantagem(
	    		{desvantagem : $scope.desvantagem},
				function(desvantagens){
	    			$scope.desvantagens = desvantagens;
					
				}, function(){
					console.log("Erro: buscar vantagens");
				});
    	}
    	
    	function buscarPericias() {
    		$scope.pericia = {};
    		$scope.pericia.flagAtivo = true;
    		$scope.pericia.sistema = $scope.sistema;
    		
    		PericiaService.buscarPericia(
	    		{pericia : $scope.pericia},
				function(pericias){
	    			$scope.pericias = pericias;
					
				}, function(){
					console.log("Erro: buscar pericias");
				});
    	}
    	
    	function buscarRacas() {
    		buscarRegraSistema('RACA_CABECALHO');
    		
    		if(ValidacaoService.validaObjetoVazio($scope.regrasSistema)) {
    			if($scope.regrasSistema.valor = 'true') {
		    		$scope.raca = {};
		    		$scope.raca.flagAtivo = true;
		    		$scope.raca.sistema = $scope.sistema;
		    		$scope.raca.inicial = true;
				
					RacaService.buscarRaca(
			    		{raca : $scope.raca},
						function(racas){
			    			$scope.racas = racas;
							
						}, function(){
							console.log("Erro: buscar racas");
						});
    			}
    		}
    	}
    	
    	function buscarClasses() {
    		buscarRegraSistema('RACA_CABECALHO');
    		
    		if(ValidacaoService.validaObjetoVazio($scope.regrasSistema)) {
    			if($scope.regrasSistema.valor = 'true') {
		    		$scope.classe = {};
		    		$scope.classe.flagAtivo = true;
		    		$scope.classe.sistema = $scope.sistema;
		    		$scope.classe.inicial = true;
				
					ClasseService.buscarClasse(
			    		{classe : $scope.classe},
						function(racas){
			    			$scope.classes = classes;
							
						}, function(){
							console.log("Erro: buscar racas");
						});
    			}
    		}
    	}
    	
    	function buscarRegraSistema(nomeRegra) {
    		$scope.regraSistema = {};
    		$scope.regraSistema.flagAtivo = true;
    		$scope.regraSistema.sistema = $scope.sistema;
    		$scope.regraSistema.nome = nomeRegra;
    		
    		RegraSistemaService.buscarRegraSistema(
	    		{regraSistema : $scope.regraSistema},
				function(regrasSistema){
	    			$scope.regrasSistema = regrasSistema;
					
				}, function(){
					console.log("Erro: buscar regra");
				});
    	}
//    	
//    	function buscarMagias() {
//    		var sistema = $scope.sistemaBatalha;
//    		
//    		MagiaService.buscarMagia(
//	    		{sistema : sistema},
//				function(magias){
//	    			$scope.magias = magias;
//					
//				}, function(){
//					console.log("Erro: buscar magias");
//				});
//    	}
//    	
//    	function buscarProfissao() {
//    		var sistema = $scope.sistemaBatalha;
//    		
//    		ProfissaoService.buscarProfissao(
//	    		{sistema : sistema},
//				function(profissoes){
//	    			$scope.profissoes = profissoes;
//					
//				}, function(){
//					console.log("Erro: buscar racas");
//				});
//    	}
//    	
    });