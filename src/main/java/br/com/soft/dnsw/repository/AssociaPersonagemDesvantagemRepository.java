package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemDesvantagem;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemDesvantagemRepository extends JpaRepository<AssociaPersonagemDesvantagem, Integer> {

	@Query
	List<AssociaPersonagemDesvantagem> findByPersonagem(Personagem personagem);

}
