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

import br.com.soft.dnsw.model.Vantagem;
import br.com.soft.dnsw.repository.VantagemRepository;

@RestController
@RequestMapping("/vantagem")
public class VantagemController {

	@Autowired
	private VantagemRepository vantagemRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Vantagem> findByExample(@PathParam(value = "vantagem") String vantagem) {
		Gson gson = new Gson();
		Vantagem a = new Vantagem();
		
		a = gson.fromJson(vantagem, Vantagem.class);
		
		if(a == null) {
			a = new Vantagem();
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
		
		return vantagemRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Vantagem update(@RequestBody String vantagem) {
		Gson gson = new Gson();
		Vantagem a = new Vantagem();
		
		a = gson.fromJson(vantagem, Vantagem.class);
		
		return vantagemRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Vantagem save(@RequestBody String vantagem) {
		Gson gson = new Gson();
		Vantagem a = new Vantagem();
		
		a = gson.fromJson(vantagem, Vantagem.class);
		
		return vantagemRepository.save(a);
	}

}