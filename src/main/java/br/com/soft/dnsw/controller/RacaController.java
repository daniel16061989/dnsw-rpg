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

import br.com.soft.dnsw.model.Raca;
import br.com.soft.dnsw.repository.RacaRepository;

@RestController
@RequestMapping("/raca")
public class RacaController {

	@Autowired
	private RacaRepository racaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Raca> findByExample(@PathParam(value = "raca") String raca) {
		Gson gson = new Gson();
		Raca a = new Raca();
		
		a = gson.fromJson(raca, Raca.class);
		
		if(a == null) {
			a = new Raca();
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
		
		return racaRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Raca update(@RequestBody String raca) {
		Gson gson = new Gson();
		Raca a = new Raca();
		
		a = gson.fromJson(raca, Raca.class);
		
		return racaRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Raca save(@RequestBody String raca) {
		Gson gson = new Gson();
		Raca a = new Raca();
		
		a = gson.fromJson(raca, Raca.class);
		
		return racaRepository.save(a);
	}

}