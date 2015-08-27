package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Efeito;
import br.com.soft.dnsw.repository.EfeitoRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/efeito")
public class EfeitoController {

	@Autowired
	private EfeitoRepository efeitoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Efeito> findByExample(@PathParam(value = "efeito") String efeito) {
		Gson gson = new Gson();
		Efeito a = new Efeito();
		
		a = gson.fromJson(efeito, Efeito.class);
		
		if(a == null) {
			a = new Efeito();
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
		
		return efeitoRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Efeito update(@RequestBody String efeito) {
		Gson gson = new Gson();
		Efeito a = new Efeito();
		
		a = gson.fromJson(efeito, Efeito.class);
		
		return efeitoRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Efeito save(@RequestBody String efeito) {
		Gson gson = new Gson();
		Efeito a = new Efeito();
		
		a = gson.fromJson(efeito, Efeito.class);
		
		return efeitoRepository.save(a);
	}

}