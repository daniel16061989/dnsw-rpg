package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemRaca;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemRacaRepository extends JpaRepository<AssociaPersonagemRaca, Integer> {

	@Query
	List<AssociaPersonagemRaca> findByPersonagem(Personagem personagem);

}
