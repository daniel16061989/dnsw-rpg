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

import br.com.soft.dnsw.model.EquipamentoCombate;
import br.com.soft.dnsw.repository.EquipamentoCombateRepository;

@RestController
@RequestMapping("/equipamentoCombate")
public class EquipamentoCombateController {

	@Autowired
	private EquipamentoCombateRepository equipamentoCombateRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<EquipamentoCombate> findByExample(@PathParam(value = "equipamentoCombate") String equipamentoCombate) {
		Gson gson = new Gson();
		EquipamentoCombate a = new EquipamentoCombate();
		
		a = gson.fromJson(equipamentoCombate, EquipamentoCombate.class);
		
		if(a == null) {
			a = new EquipamentoCombate();
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
		
		return equipamentoCombateRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody EquipamentoCombate update(@RequestBody String equipamentoCombate) {
		Gson gson = new Gson();
		EquipamentoCombate a = new EquipamentoCombate();
		
		a = gson.fromJson(equipamentoCombate, EquipamentoCombate.class);
		
		return equipamentoCombateRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody EquipamentoCombate save(@RequestBody String equipamentoCombate) {
		Gson gson = new Gson();
		EquipamentoCombate a = new EquipamentoCombate();
		
		a = gson.fromJson(equipamentoCombate, EquipamentoCombate.class);
		
		return equipamentoCombateRepository.save(a);
	}

}