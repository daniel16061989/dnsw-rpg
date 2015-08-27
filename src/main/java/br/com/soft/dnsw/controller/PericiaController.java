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

import br.com.soft.dnsw.model.Pericia;
import br.com.soft.dnsw.repository.PericiaRepository;

@RestController
@RequestMapping("/pericia")
public class PericiaController {

	@Autowired
	private PericiaRepository periciaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Pericia> findByExample(@PathParam(value = "pericia") String pericia) {
		Gson gson = new Gson();
		Pericia a = new Pericia();
		
		a = gson.fromJson(pericia, Pericia.class);
		
		if(a == null) {
			a = new Pericia();
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
		
		return periciaRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Pericia update(@RequestBody String pericia) {
		Gson gson = new Gson();
		Pericia a = new Pericia();
		
		a = gson.fromJson(pericia, Pericia.class);
		
		return periciaRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Pericia save(@RequestBody String pericia) {
		Gson gson = new Gson();
		Pericia a = new Pericia();
		
		a = gson.fromJson(pericia, Pericia.class);
		
		return periciaRepository.save(a);
	}

}