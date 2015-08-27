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

import br.com.soft.dnsw.model.Classe;
import br.com.soft.dnsw.repository.ClasseRepository;

@RestController
@RequestMapping("/classe")
public class ClasseController {

	@Autowired
	private ClasseRepository classeRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Classe> findByExample(@PathParam(value = "classe") String classe) {
		Gson gson = new Gson();
		Classe a = new Classe();
		
		a = gson.fromJson(classe, Classe.class);
		
		if(a == null) {
			a = new Classe();
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
		
		return classeRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Classe update(@RequestBody String classe) {
		Gson gson = new Gson();
		Classe a = new Classe();
		
		a = gson.fromJson(classe, Classe.class);
		
		return classeRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Classe save(@RequestBody String classe) {
		Gson gson = new Gson();
		Classe a = new Classe();
		
		a = gson.fromJson(classe, Classe.class);
		
		return classeRepository.save(a);
	}
}
