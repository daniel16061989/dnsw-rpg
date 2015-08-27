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

import br.com.soft.dnsw.model.Monstro;
import br.com.soft.dnsw.repository.MonstroRepository;

@RestController
@RequestMapping("/monstro")
public class MonstroController {

	@Autowired
	private MonstroRepository monstroRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Monstro> findByExample(@PathParam(value = "monstro") String monstro) {
		Gson gson = new Gson();
		Monstro a = new Monstro();
		
		a = gson.fromJson(monstro, Monstro.class);
		
		if(a == null) {
			a = new Monstro();
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
		
		return monstroRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Monstro update(@RequestBody String monstro) {
		Gson gson = new Gson();
		Monstro a = new Monstro();
		
		a = gson.fromJson(monstro, Monstro.class);
		
		return monstroRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Monstro save(@RequestBody String monstro) {
		Gson gson = new Gson();
		Monstro a = new Monstro();
		
		a = gson.fromJson(monstro, Monstro.class);
		
		return monstroRepository.save(a);
	}

}