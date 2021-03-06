package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Pericia;
import br.com.soft.dnsw.repository.querys.PericiaQuery;

public interface PericiaRepository extends JpaRepository<Pericia, Integer> {

	@Query(value=PericiaQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Pericia> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}