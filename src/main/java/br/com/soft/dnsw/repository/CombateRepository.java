package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Combate;
import br.com.soft.dnsw.repository.querys.CombateQuery;

public interface CombateRepository extends JpaRepository<Combate, Integer> {

	@Query(value=CombateQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Combate> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
