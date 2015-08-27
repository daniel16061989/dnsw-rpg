package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Combate;
import br.com.soft.dnsw.repository.CombateRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/combate")
public class CombateController {

	@Autowired
	private CombateRepository combateRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Combate> findByExample(@PathParam(value = "combate") String combate) {
		Gson gson = new Gson();
		Combate c = new Combate();
		
		c = gson.fromJson(combate, Combate.class);
		
		if(c == null) {
			c = new Combate();
		}
		if(c.getNome() == null) {
			c.setNome("");
		}
		if(c.getDescricao() == null) {
			c.setDescricao("");
		}
		if(c.getFlagAtivo() == null) {
			c.setFlagAtivo(Boolean.TRUE);
		}
		
		return combateRepository.findByExample(c.getNome(), 
				c.getDescricao(), c.getSistema().getIdSistema(), c.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Combate update(@RequestBody String combate) {
		Gson gson = new Gson();
		Combate a = new Combate();
		
		a = gson.fromJson(combate, Combate.class);
		
		return combateRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Combate save(@RequestBody String combate) {
		Gson gson = new Gson();
		Combate a = new Combate();
		
		a = gson.fromJson(combate, Combate.class);
		
		return combateRepository.save(a);
	}
}
