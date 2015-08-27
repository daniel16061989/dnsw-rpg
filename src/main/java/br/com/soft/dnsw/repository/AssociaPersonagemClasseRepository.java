package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemClasse;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemClasseRepository extends JpaRepository<AssociaPersonagemClasse, Integer> {
	
	@Query
	List<AssociaPersonagemClasse> findByPersonagem(Personagem personagem);

}

