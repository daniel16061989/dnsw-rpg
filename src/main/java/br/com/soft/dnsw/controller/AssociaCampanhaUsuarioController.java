package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.AssociaCampanhaUsuario;
import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.AssociaCampanhaUsuarioRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/associaCampanhaUsuario")
public class AssociaCampanhaUsuarioController {
	
	@Autowired
	private AssociaCampanhaUsuarioRepository associaCampanhaUsuarioRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<AssociaCampanhaUsuario> findByUsuario(@PathParam(value = "usuario") String usuario) {
		Gson gson = new Gson();
		Usuario u = new Usuario();
		
		u = gson.fromJson(usuario, Usuario.class);
		
		return associaCampanhaUsuarioRepository.findByUsuario(u);
	}
	
}