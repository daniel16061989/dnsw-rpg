angular.module('UserApp')
    .controller('CriarPersonagemController', function ($scope, $rootScope, $location, $cookieStore, 
    		PersonagemService, CabecalhoFichaService, AtributoService, PericiaService, MagiaService, 
    		VantagemService, DesvantagemService, RacaService, ClasseService, ProfissaoService) {
    	
    	init();
    	
    	function init() {
    		$scope.cabecalhos = [];
    		$scope.atributos = [];
    		$scope.pericias = [];
    		$scope.magias = [];
    		$scope.vantagens = [];
    		$scope.desvantagens = [];
    		$scope.racas = [];
    		$scope.classes = [];
    		$scope.profissoes = [];
    		
    		buscarCabecalhoFicha();
    		buscarAtributos();
    		buscarPericias();
    		buscarMagias();
    		buscarVantagens();
    		buscarDesvantagens();
    		buscarRacas();
    		buscarClasses();
    		buscarProfissao();
    	}
    	
    	function buscarCabecalhoFicha() {
    		var sistema = $scope.sistemaBatalha;
    		
    		CabecalhoFichaService.buscarCabecalhoFicha(
	    		{sistema : sistema},
				function(cabecalhos){
	    			$scope.cabecalhos = cabecalhos;
					
				}, function(){
					console.log("Erro: buscar cabecalho");
				});
    	}
    	
    	function buscarAtributos() {
    		var sistema = $scope.sistemaBatalha;
    		
    		AtributoService.buscarAtributo(
	    		{sistema : sistema},
				function(atributos){
	    			$scope.atributos = atributos;
					
				}, function(){
					console.log("Erro: buscar atributos");
				});
    	}
    	
    	function buscarPericias() {
    		var sistema = $scope.sistemaBatalha;
    		
    		PericiaService.buscarPericia(
	    		{sistema : sistema},
				function(pericias){
	    			$scope.pericias = pericias;
					
				}, function(){
					console.log("Erro: buscar pericias");
				});
    	}
    	
    	function buscarMagias() {
    		var sistema = $scope.sistemaBatalha;
    		
    		MagiaService.buscarMagia(
	    		{sistema : sistema},
				function(magias){
	    			$scope.magias = magias;
					
				}, function(){
					console.log("Erro: buscar magias");
				});
    	}
    	
    	function buscarVantagens() {
    		var sistema = $scope.sistemaBatalha;
    		
    		VantagemService.buscarVantagem(
	    		{sistema : sistema},
				function(vantagens){
	    			$scope.vantagens = vantagens;
					
				}, function(){
					console.log("Erro: buscar vantagens");
				});
    	}
    	
    	function buscarDesvantagens() {
    		var sistema = $scope.sistemaBatalha;
    		
    		DesvantagemService.buscarDesvantagem(
	    		{sistema : sistema},
				function(desvantagens){
	    			$scope.desvantagens = desvantagens;
					
				}, function(){
					console.log("Erro: buscar vantagens");
				});
    	}
    	
    	function buscarRacas() { 
    		var sistema = $scope.sistemaBatalha;
		
    		RacaService.buscarRaca(
	    		{sistema : sistema},
				function(racas){
	    			$scope.racas = racas;
					
				}, function(){
					console.log("Erro: buscar racas");
				});
    	}
    	
    	function buscarClasses() {
    		var sistema = $scope.sistemaBatalha;
    		
    		ClasseService.buscarRaca(
	    		{sistema : sistema},
				function(classes){
	    			$scope.classes = classes;
					
				}, function(){
					console.log("Erro: buscar racas");
				});
    	}
    	
    	function buscarProfissao() {
    		var sistema = $scope.sistemaBatalha;
    		
    		ProfissaoService.buscarProfissao(
	    		{sistema : sistema},
				function(profissoes){
	    			$scope.profissoes = profissoes;
					
				}, function(){
					console.log("Erro: buscar racas");
				});
    	}
    	
    });