package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.Sistema;
import br.com.soft.dnsw.repository.querys.SistemaQuery;

public interface SistemaRepository extends JpaRepository<Sistema, Integer> {

	@Query(value=SistemaQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Sistema> findByExample(String nome,  String descricao,  Boolean flagAtivo);
}