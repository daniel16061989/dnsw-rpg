package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Desvantagem;
import br.com.soft.dnsw.repository.DesvantagemRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/desvantagem")
public class DesvantagemController {

	@Autowired
	private DesvantagemRepository desvantagemRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Desvantagem> findByExample(@PathParam(value = "desvantagem") String desvantagem) {
		Gson gson = new Gson();
		Desvantagem a = new Desvantagem();
		
		a = gson.fromJson(desvantagem, Desvantagem.class);
		
		if(a == null) {
			a = new Desvantagem();
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
		
		return desvantagemRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Desvantagem update(@RequestBody String desvantagem) {
		Gson gson = new Gson();
		Desvantagem a = new Desvantagem();
		
		a = gson.fromJson(desvantagem, Desvantagem.class);
		
		return desvantagemRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Desvantagem save(@RequestBody String desvantagem) {
		Gson gson = new Gson();
		Desvantagem a = new Desvantagem();
		
		a = gson.fromJson(desvantagem, Desvantagem.class);
		
		return desvantagemRepository.save(a);
	}

}
