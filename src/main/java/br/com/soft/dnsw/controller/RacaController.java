package br.com.soft.dnsw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.repository.RacaRepository;

@RestController
@RequestMapping("/raca")
public class RacaController {

	@Autowired
	private RacaRepository racaRepository;

}
