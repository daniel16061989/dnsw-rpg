package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemMagia;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemMagiaRepository extends JpaRepository<AssociaPersonagemMagia, Integer> {

	@Query
	List<AssociaPersonagemMagia> findByPersonagem(Personagem personagem);

}
