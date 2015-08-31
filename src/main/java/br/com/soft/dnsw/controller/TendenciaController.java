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

import br.com.soft.dnsw.model.Tendencia;
import br.com.soft.dnsw.repository.TendenciaRepository;

@RestController
@RequestMapping("/tendencia")
public class TendenciaController {

	@Autowired
    private TendenciaRepository tendenciaRepository;

    @RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Tendencia> findByExample(@PathParam(value = "tendencia") String tendencia) {
		Gson gson = new Gson();
		Tendencia a = new Tendencia();
		
		a = gson.fromJson(tendencia, Tendencia.class);
		
		if(a == null) {
			a = new Tendencia();
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
		
		return tendenciaRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Tendencia update(@RequestBody String tendencia) {
		Gson gson = new Gson();
		Tendencia a = new Tendencia();
		
		a = gson.fromJson(tendencia, Tendencia.class);
		
		return tendenciaRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Tendencia save(@RequestBody String tendencia) {
		Gson gson = new Gson();
		Tendencia a = new Tendencia();
		
		a = gson.fromJson(tendencia, Tendencia.class);
		
		return tendenciaRepository.save(a);
	}

}