package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.AssociaPersonagemAtributo;
import br.com.soft.dnsw.model.Personagem;

public interface AssociaPersonagemAtributoRepository extends JpaRepository<AssociaPersonagemAtributo, Integer> {

	@Query
	List<AssociaPersonagemAtributo> findByPersonagem(Personagem personagem);
}
