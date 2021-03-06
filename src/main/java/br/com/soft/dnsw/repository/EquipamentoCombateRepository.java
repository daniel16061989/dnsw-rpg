package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.EquipamentoCombate;
import br.com.soft.dnsw.repository.querys.EquipamentoCombateQuery;

public interface EquipamentoCombateRepository extends JpaRepository<EquipamentoCombate, Integer> {

	@Query(value=EquipamentoCombateQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<EquipamentoCombate> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
