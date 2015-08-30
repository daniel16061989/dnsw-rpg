angular.module('UserApp')
    .controller('CriarPersonagemController', function ($scope, $rootScope, $location, $cookieStore, 
    		PersonagemService, CabecalhoFichaService, AtributoService, VantagemService, DesvantagemService, PericiaService) {
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
//    		$scope.magias = [];
//    		$scope.racas = [];
//    		$scope.classes = [];
//    		$scope.profissoes = [];
    		
    		buscarCabecalhoFicha();
    		buscarAtributos();
    		console.log($scope.atributos);
    		buscarVantagens();
    		buscarDesvantagens();
    		buscarPericias();
//    		buscarMagias();
//    		buscarRacas();
//    		buscarClasses();
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
	    			console.log(pericias);
	    			$scope.pericias = pericias;
					
				}, function(){
					console.log("Erro: buscar pericias");
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
//    	function buscarRacas() { 
//    		var sistema = $scope.sistemaBatalha;
//		
//    		RacaService.buscarRaca(
//	    		{sistema : sistema},
//				function(racas){
//	    			$scope.racas = racas;
//					
//				}, function(){
//					console.log("Erro: buscar racas");
//				});
//    	}
//    	
//    	function buscarClasses() {
//    		var sistema = $scope.sistemaBatalha;
//    		
//    		ClasseService.buscarRaca(
//	    		{sistema : sistema},
//				function(classes){
//	    			$scope.classes = classes;
//					
//				}, function(){
//					console.log("Erro: buscar racas");
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