package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Desvantagem;
import br.com.soft.dnsw.repository.querys.DesvantagemQuery;

public interface DesvantagemRepository extends JpaRepository<Desvantagem, Integer> {

	@Query(value=DesvantagemQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Desvantagem> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
