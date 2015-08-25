package br.com.soft.dnsw.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.soft.dnsw.model.Campanha;
import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.repository.CampanhaRepository;
import br.com.soft.dnsw.repository.SistemaRepository;

@RestController
@RequestMapping("/campanha")
public class CampanhaController {

	@Autowired
	private CampanhaRepository campanhaRepository;

	@Autowired
	private SistemaRepository sistemaRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Campanha save(@RequestBody String campanha) {
		Gson gson = new Gson();
		Campanha c = new Campanha();
		
		c = gson.fromJson(campanha, Campanha.class);
		
		if(c.getIdCampanha() == null) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			c.setDataCriacao(simpleDateFormat.format(new Date()));
		}
		
		return campanhaRepository.save(c);
	}
	
	@RequestMapping(value="/sistema", method = RequestMethod.GET)
	public @ResponseBody List<Sistema> findByExample(@PathParam(value = "sistema") String sistema) {
		Gson gson = new Gson();
		Sistema s = new Sistema();
		
		s = gson.fromJson(sistema, Sistema.class);
		
		if(s == null) {
			s = new Sistema();
		}
		if(s.getNome() == null) {
			s.setNome("");
		}
		if(s.getDescricao() == null) {
			s.setDescricao("");
		}
		if(s.getFlagAtivo() == null) {
			s.setFlagAtivo(Boolean.TRUE);
		}
		
		return sistemaRepository.findByExample(s.getNome(), s.getDescricao(), s.getFlagAtivo());
	}

}