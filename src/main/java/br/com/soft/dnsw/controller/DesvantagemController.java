package br.com.soft.dnsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.repository.SistemaRepository;

@RestController
@RequestMapping("/desvantagem")
public class DesvantagemController {

	@Autowired
	private SistemaRepository desvantagemRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Sistema> findByFlagAtivo() {
		return desvantagemRepository.findAll();
	}

}
