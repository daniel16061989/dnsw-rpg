package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {

	@Query(value = "SELECT personagem.* FROM tb_personagem WHERE id_campanha is null AND id_usuario = ? ", nativeQuery = true)
	List<Personagem> findByPersonagemBatalha(Integer idUsuario);
}
