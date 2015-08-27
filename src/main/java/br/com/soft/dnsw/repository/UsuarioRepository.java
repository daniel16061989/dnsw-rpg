package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Usuario;
import br.com.soft.dnsw.repository.querys.UsuarioQuery;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query
	Usuario findByLoginAndSenha(String login, String senha);
	
	@Query(value=UsuarioQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Usuario> findByExample(@Param("login") String login, 
								@Param("email") String email, 
								@Param("apelido") String apelido, 
								@Param("flagAtivo") Boolean flagAtivo);
}