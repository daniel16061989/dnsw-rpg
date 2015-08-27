package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Item;
import br.com.soft.dnsw.repository.querys.ItemQuery;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	@Query(value=ItemQuery.FIND_BY_EXAMPLE, nativeQuery=true)
	List<Item> findByExample(@Param("nome") String nome, 
								 @Param("descricao") String descricao, 
								 @Param("idSistema") Integer idSistema, 
								 @Param("flagAtivo") Boolean flagAtivo);
}
