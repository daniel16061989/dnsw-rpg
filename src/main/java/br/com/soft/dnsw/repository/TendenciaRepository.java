package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Tendencia;
import br.com.soft.dnsw.repository.querys.TendenciaQuery;

public interface TendenciaRepository extends JpaRepository<Tendencia, Integer> {

	@Query(value=TendenciaQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Tendencia> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
