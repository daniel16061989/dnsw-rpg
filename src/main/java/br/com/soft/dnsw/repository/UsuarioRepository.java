package br.com.soft.dnsw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query
	Usuario findByLoginAndSenha(String login, String senha);
}
