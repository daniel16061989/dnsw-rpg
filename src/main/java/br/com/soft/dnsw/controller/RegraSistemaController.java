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

import br.com.soft.dnsw.model.RegraSistema;
import br.com.soft.dnsw.repository.RegraSistemaRepository;

@RestController
@RequestMapping("/regraSistema")
public class RegraSistemaController {

	@Autowired
	private RegraSistemaRepository regraSistemaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<RegraSistema> findByExample(@PathParam(value = "regraSistema") String regraSistema) {
		Gson gson = new Gson();
		RegraSistema a = new RegraSistema();
		
		a = gson.fromJson(regraSistema, RegraSistema.class);
		
		if(a == null) {
			a = new RegraSistema();
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
		
		return regraSistemaRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody RegraSistema update(@RequestBody String regraSistema) {
		Gson gson = new Gson();
		RegraSistema a = new RegraSistema();
		
		a = gson.fromJson(regraSistema, RegraSistema.class);
		
		return regraSistemaRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody RegraSistema save(@RequestBody String regraSistema) {
		Gson gson = new Gson();
		RegraSistema a = new RegraSistema();
		
		a = gson.fromJson(regraSistema, RegraSistema.class);
		
		return regraSistemaRepository.save(a);
	}

}