package br.com.soft.dnsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.SistemaRepository;

@RestController
@RequestMapping("/sistema")
public class SistemaController {

	@Autowired
	private SistemaRepository sistemaRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Sistema> findByFlagAtivo() {
		return sistemaRepository.findByFlagAtivo(Boolean.TRUE);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Sistema save(@PathVariable("sistema") String sistema) {
		Gson gson = new Gson();
		Sistema s = new Sistema();
		
		s = gson.fromJson(sistema, Sistema.class);
		
		return sistemaRepository.save(s);
	}
	
}