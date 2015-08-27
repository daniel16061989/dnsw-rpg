package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Raca;
import br.com.soft.dnsw.repository.querys.RacaQuery;

public interface RacaRepository extends JpaRepository<Raca, Integer> {

	@Query(value=RacaQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Raca> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
