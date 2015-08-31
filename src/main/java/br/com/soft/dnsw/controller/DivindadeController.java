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

import br.com.soft.dnsw.model.Divindade;
import br.com.soft.dnsw.repository.DivindadeRepository;

@RestController
@RequestMapping("/divindade")
public class DivindadeController {

	@Autowired
    private DivindadeRepository divindadeRepository;

    @RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Divindade> findByExample(@PathParam(value = "divindade") String divindade) {
		Gson gson = new Gson();
		Divindade a = new Divindade();
		
		a = gson.fromJson(divindade, Divindade.class);
		
		if(a == null) {
			a = new Divindade();
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
		
		return divindadeRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Divindade update(@RequestBody String divindade) {
		Gson gson = new Gson();
		Divindade a = new Divindade();
		
		a = gson.fromJson(divindade, Divindade.class);
		
		return divindadeRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Divindade save(@RequestBody String divindade) {
		Gson gson = new Gson();
		Divindade a = new Divindade();
		
		a = gson.fromJson(divindade, Divindade.class);
		
		return divindadeRepository.save(a);
	}
}
