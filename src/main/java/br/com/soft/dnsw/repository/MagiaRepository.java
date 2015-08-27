package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Magia;
import br.com.soft.dnsw.repository.querys.MagiaQuery;

public interface MagiaRepository extends JpaRepository<Magia, Integer> {

	@Query(value=MagiaQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Magia> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
