package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.AssociaPersonagemAtributo;
import br.com.soft.dnsw.model.AssociaPersonagemClasse;
import br.com.soft.dnsw.model.AssociaPersonagemDesvantagem;
import br.com.soft.dnsw.model.AssociaPersonagemMagia;
import br.com.soft.dnsw.model.AssociaPersonagemPericia;
import br.com.soft.dnsw.model.AssociaPersonagemRaca;
import br.com.soft.dnsw.model.AssociaPersonagemVantagem;
import br.com.soft.dnsw.model.Personagem;
import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.AssociaPersonagemAtributoRepository;
import br.com.soft.dnsw.repository.AssociaPersonagemClasseRepository;
import br.com.soft.dnsw.repository.AssociaPersonagemDesvantagemRepository;
import br.com.soft.dnsw.repository.AssociaPersonagemMagiaRepository;
import br.com.soft.dnsw.repository.AssociaPersonagemPericiaRepository;
import br.com.soft.dnsw.repository.AssociaPersonagemRacaRepository;
import br.com.soft.dnsw.repository.AssociaPersonagemVantagemRepository;
import br.com.soft.dnsw.repository.PersonagemRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

	@Autowired
	private PersonagemRepository personagemRepository;
	@Autowired
	private AssociaPersonagemAtributoRepository personagemAtributoRepository;
	@Autowired
	private AssociaPersonagemClasseRepository personagemClasseRepository;
	@Autowired
	private AssociaPersonagemDesvantagemRepository personagemDesvantagemRepository;
	@Autowired
	private AssociaPersonagemMagiaRepository personagemMagiaRepository;
	@Autowired
	private AssociaPersonagemPericiaRepository periciaRepository;
	@Autowired
	private AssociaPersonagemRacaRepository personagemRacaRepository;
	@Autowired
	private AssociaPersonagemVantagemRepository personagemVantagemRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Personagem> findByPesonagemBatalha(@PathParam(value = "usuario") String usuario, 
																 @PathParam(value = "sistema") String sistema) {
		Gson gson = new Gson();
		
		Usuario u = new Usuario();
		Sistema s = new Sistema();
		
		u = gson.fromJson(usuario, Usuario.class);
		s = gson.fromJson(sistema, Sistema.class);
		
		return personagemRepository.findByPersonagemBatalha(u.getIdUsuario(), s.getIdSistema());
	}
	
	@RequestMapping(value="/ficha", method = RequestMethod.GET)
	public @ResponseBody String findByPersonagem(@PathParam(value = "personagem") String personagem) {
		Gson gson = new Gson();
		
		Personagem p = new Personagem();
		p = gson.fromJson(personagem, Personagem.class);
		
		List<AssociaPersonagemAtributo> listAtributos = personagemAtributoRepository.findByPersonagem(p);
		List<AssociaPersonagemClasse> listClasses = personagemClasseRepository.findByPersonagem(p);
		List<AssociaPersonagemDesvantagem> listDesvantagens = personagemDesvantagemRepository.findByPersonagem(p);
		List<AssociaPersonagemMagia> listMagias = personagemMagiaRepository.findByPersonagem(p);
		List<AssociaPersonagemPericia> listPericias = periciaRepository.findByPersonagem(p);
		List<AssociaPersonagemRaca> listRacas = personagemRacaRepository.findByPersonagem(p);
		List<AssociaPersonagemVantagem> listVantagens = personagemVantagemRepository.findByPersonagem(p);
		
		String personagemJSONString = gson.toJson(p);
		personagemJSONString += gson.toJson(listAtributos);
		personagemJSONString += gson.toJson(listClasses);
		personagemJSONString += gson.toJson(listDesvantagens);
		personagemJSONString += gson.toJson(listMagias);
		personagemJSONString += gson.toJson(listPericias);
		personagemJSONString += gson.toJson(listRacas);
		personagemJSONString += gson.toJson(listVantagens);
		
		return personagemJSONString;
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public @ResponseBody String findByFicha(@PathParam(value = "sistema") String sistema) {
//		
//		return "";
//	}

}