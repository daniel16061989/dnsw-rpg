package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Divindade;
import br.com.soft.dnsw.repository.querys.DivindadeQuery;

public interface DivindadeRepository extends JpaRepository<Divindade, Integer> {

	@Query(value=DivindadeQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Divindade> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
