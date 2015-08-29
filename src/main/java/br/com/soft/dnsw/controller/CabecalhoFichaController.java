package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.soft.dnsw.model.CabecalhoFicha;
import br.com.soft.dnsw.repository.CabecalhoFichaRepository;

@RestController
@RequestMapping("/cabecalho")
public class CabecalhoFichaController {

	@Autowired
	private CabecalhoFichaRepository cabecalhoFichaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<CabecalhoFicha> findByExample(@PathParam(value = "cabecalhoFicha") String cabecalhoFicha) {
		Gson gson = new Gson();
		CabecalhoFicha a = new CabecalhoFicha();
		
		a = gson.fromJson(cabecalhoFicha, CabecalhoFicha.class);
		
		if(a == null) {
			a = new CabecalhoFicha();
		}
		if(a.getNome() == null) {
			a.setNome("");
		}
		if(a.getDescricao() == null) {
			a.setDescricao("");
		}
		if(a.getFlagAtivo() == null) {
			a.setFlagAtivo(Boolean.TRUE);
		}
		
		return cabecalhoFichaRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody CabecalhoFicha update(@RequestBody String cabecalhoFicha) {
		Gson gson = new Gson();
		CabecalhoFicha a = new CabecalhoFicha();
		
		a = gson.fromJson(cabecalhoFicha, CabecalhoFicha.class);
		
		return cabecalhoFichaRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody CabecalhoFicha save(@RequestBody String cabecalhoFicha) {
		Gson gson = new Gson();
		CabecalhoFicha a = new CabecalhoFicha();
		
		a = gson.fromJson(cabecalhoFicha, CabecalhoFicha.class);
		
		return cabecalhoFichaRepository.save(a);
	}

}