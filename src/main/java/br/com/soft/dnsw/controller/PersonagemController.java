package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Personagem;
import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.PersonagemRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

	@Autowired
	private PersonagemRepository personagemRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Personagem> findByPesonagemBatalha(@PathParam(value = "usuario") String usuario) {
		Gson gson = new Gson();
		Usuario u = new Usuario();
		
		u = gson.fromJson(usuario, Usuario.class);
		
		return personagemRepository.findByPersonagemBatalha(u.getIdUsuario());
	}

}