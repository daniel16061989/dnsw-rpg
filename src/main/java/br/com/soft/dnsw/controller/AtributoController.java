package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Atributo;
import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.repository.AtributoRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/atributo")
public class AtributoController {

	@Autowired
	private AtributoRepository atributoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Atributo> findByExample(@PathParam(value = "atributo") String atributo) {
		Gson gson = new Gson();
		Atributo a = new Atributo();
		
		a = gson.fromJson(atributo, Atributo.class);
		
		if(a == null) {
			a = new Atributo();
		}
		if(a.getNome() == null) {
			a.setNome("");
		}
		if(a.getSigla() == null) {
			a.setSigla("");
		}
		if(a.getDescricao() == null) {
			a.setDescricao("");
		}
		if(a.getSistema() == null) {
			Sistema s = new Sistema();
			s.setIdSistema(0);
			
			a.setSistema(s);
		}
		if(a.getFlagAtivo() == null) {
			a.setFlagAtivo(Boolean.TRUE);
		}
		
		return atributoRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSigla(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Atributo update(@RequestBody String atributo) {
		Gson gson = new Gson();
		Atributo a = new Atributo();
		
		a = gson.fromJson(atributo, Atributo.class);
		
		return atributoRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Atributo save(@RequestBody String atributo) {
		Gson gson = new Gson();
		Atributo a = new Atributo();
		
		a = gson.fromJson(atributo, Atributo.class);
		
		return atributoRepository.save(a);
	}

}