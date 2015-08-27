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

import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.UsuarioRepository;

import com.google.gson.Gson;

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
	
	@RequestMapping(value="/cadastro", method = RequestMethod.GET)
	public @ResponseBody List<Usuario> findByExample(@PathParam(value = "usuario") String usuario) {
		Gson gson = new Gson();
		Usuario a = new Usuario();
		
		a = gson.fromJson(usuario, Usuario.class);
		
		if(a == null) {
			a = new Usuario();
		}
		if(a.getLogin() == null) {
			a.setLogin("");
		}
		if(a.getEmail() == null) {
			a.setEmail("");
		}
		if(a.getApelido() == null) {
			a.setApelido("");
		}
		if(a.getFlagAtivo() == null) {
			a.setFlagAtivo(Boolean.TRUE);
		}
		
		return usuarioRepository.findByExample(a.getLogin(), a.getEmail(), a.getApelido(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Usuario update(@RequestBody String usuario) {
		Gson gson = new Gson();
		Usuario a = new Usuario();
		
		a = gson.fromJson(usuario, Usuario.class);
		
		return usuarioRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Usuario save(@RequestBody String usuario) {
		Gson gson = new Gson();
		Usuario u = new Usuario();
		
		u = gson.fromJson(usuario, Usuario.class);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		if(u.getIdUsuario() == null) {
			u.setStatusJogador(Usuario.STATUS_INICIANTE);
			u.setStatusMestre(Usuario.STATUS_INICIANTE);
			u.setDataCriacao(simpleDateFormat.format(new Date()));
		}
		
		return usuarioRepository.save(u);
	}

}