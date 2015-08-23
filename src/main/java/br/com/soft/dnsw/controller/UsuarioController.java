package br.com.soft.dnsw.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Usuario findByLoginAndSenha(@PathParam(value = "usuario") String usuario) {
		Gson gson = new Gson();
		Usuario u = new Usuario();
		
		u = gson.fromJson(usuario, Usuario.class);
		
		return usuarioRepository.findByLoginAndSenha(u.getLogin(), u.getSenha());
	}
}