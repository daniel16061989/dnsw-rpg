package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemPericia;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemPericiaRepository extends JpaRepository<AssociaPersonagemPericia, Integer> {

	@Query
	List<AssociaPersonagemPericia> findByPersonagem(Personagem personagem);

}
