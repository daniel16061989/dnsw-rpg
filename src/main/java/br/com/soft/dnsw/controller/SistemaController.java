package br.com.soft.dnsw.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.repository.SistemaRepository;

import com.google.gson.Gson;

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
	public @ResponseBody Sistema save(@RequestBody String sistema) {
		Gson gson = new Gson();
		Sistema s = new Sistema();
		
		s = gson.fromJson(sistema, Sistema.class);
		
		if(s.getIdSistema() == null) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			s.setDataCriacao(simpleDateFormat.format(new Date()));
			s.setVersao(1);
		}
		
		return sistemaRepository.save(s);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public @ResponseBody void remove(@RequestBody String sistema) {
		Gson gson = new Gson();
		Sistema s = new Sistema();
		
		s = gson.fromJson(sistema, Sistema.class);
		
		sistemaRepository.delete(s.getIdSistema());
	}

}