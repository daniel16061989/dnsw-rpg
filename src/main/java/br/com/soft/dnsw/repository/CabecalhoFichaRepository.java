package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.CabecalhoFicha;
import br.com.soft.dnsw.repository.querys.CabecalhoFichaQuery;

public interface CabecalhoFichaRepository extends JpaRepository<CabecalhoFicha, Integer> {

	@Query(value=CabecalhoFichaQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<CabecalhoFicha> findByExample(String nome, String descricao, Integer idSistema, Boolean flagAtivo);
}