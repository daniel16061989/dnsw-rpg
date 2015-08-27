package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.CirculoMagico;
import br.com.soft.dnsw.repository.querys.CirculoMagicoQuery;

public interface CirculoMagicoRepository extends JpaRepository<CirculoMagico, Integer> {

	@Query(value=CirculoMagicoQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<CirculoMagico> findByExample(@Param("nome") String nome, 
									  @Param("descricao") String descricao, 
									  @Param("idSistema") Integer idSistema, 
									  @Param("flagAtivo") Boolean flagAtivo);
}
