package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemVantagem;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemVantagemRepository extends JpaRepository<AssociaPersonagemVantagem, Integer> {

	@Query
	List<AssociaPersonagemVantagem> findByPersonagem(Personagem personagem);

}
