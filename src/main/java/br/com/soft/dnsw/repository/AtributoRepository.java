package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.Atributo;
import br.com.soft.dnsw.repository.querys.AtributoQuery;

public interface AtributoRepository extends JpaRepository<Atributo, Integer> {

	@Query(value=AtributoQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Atributo> findByExample(String nome, String descricao, Integer idSistema, Boolean flagAtivo);
}