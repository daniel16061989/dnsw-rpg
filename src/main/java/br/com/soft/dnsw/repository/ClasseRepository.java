package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Classe;
import br.com.soft.dnsw.repository.querys.ClasseQuery;

public interface ClasseRepository extends JpaRepository<Classe, Integer> {

	@Query(value=ClasseQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Classe> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
