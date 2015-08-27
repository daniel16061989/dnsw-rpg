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

import br.com.soft.dnsw.model.CirculoMagico;
import br.com.soft.dnsw.repository.CirculoMagicoRepository;

@RestController
@RequestMapping("/circuloMagico")
public class CirculoMagicoController {

	@Autowired
	private CirculoMagicoRepository circuloMagicoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<CirculoMagico> findByExample(@PathParam(value = "circuloMagico") String circuloMagico) {
		Gson gson = new Gson();
		CirculoMagico a = new CirculoMagico();
		
		a = gson.fromJson(circuloMagico, CirculoMagico.class);
		
		if(a == null) {
			a = new CirculoMagico();
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
		
		return circuloMagicoRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody CirculoMagico update(@RequestBody String circuloMagico) {
		Gson gson = new Gson();
		CirculoMagico a = new CirculoMagico();
		
		a = gson.fromJson(circuloMagico, CirculoMagico.class);
		
		return circuloMagicoRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody CirculoMagico save(@RequestBody String circuloMagico) {
		Gson gson = new Gson();
		CirculoMagico a = new CirculoMagico();
		
		a = gson.fromJson(circuloMagico, CirculoMagico.class);
		
		return circuloMagicoRepository.save(a);
	}

}