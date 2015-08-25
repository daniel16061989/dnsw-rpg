package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.dnsw.model.AssociaCampanhaUsuario;
import br.com.soft.dnsw.model.Usuario;

public interface AssociaCampanhaUsuarioRepository extends JpaRepository<AssociaCampanhaUsuario, Integer> {

	List<AssociaCampanhaUsuario> findByUsuario(Usuario usuario);
}
