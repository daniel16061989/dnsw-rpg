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

import br.com.soft.dnsw.model.Magia;
import br.com.soft.dnsw.repository.MagiaRepository;

@RestController
@RequestMapping("/magia")
public class MagiaController {

	@Autowired
	private MagiaRepository magiaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Magia> findByExample(@PathParam(value = "magia") String magia) {
		Gson gson = new Gson();
		Magia a = new Magia();
		
		a = gson.fromJson(magia, Magia.class);
		
		if(a == null) {
			a = new Magia();
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
		
		return magiaRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Magia update(@RequestBody String magia) {
		Gson gson = new Gson();
		Magia a = new Magia();
		
		a = gson.fromJson(magia, Magia.class);
		
		return magiaRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Magia save(@RequestBody String magia) {
		Gson gson = new Gson();
		Magia a = new Magia();
		
		a = gson.fromJson(magia, Magia.class);
		
		return magiaRepository.save(a);
	}

}