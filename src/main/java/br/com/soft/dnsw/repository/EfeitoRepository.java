package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Efeito;
import br.com.soft.dnsw.repository.querys.EfeitoQuery;

public interface EfeitoRepository extends JpaRepository<Efeito, Integer> {

	@Query(value=EfeitoQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Efeito> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
