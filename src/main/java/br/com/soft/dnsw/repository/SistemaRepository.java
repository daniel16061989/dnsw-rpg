package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.soft.dnsw.model.Sistema;

public interface SistemaRepository extends JpaRepository<Sistema, Integer> {

	@Query(value="SELECT sistema.* FROM tb_sistema sistema WHERE sistema.nome LIKE CONCAT('%',:nome,'%') AND sistema.descricao LIKE CONCAT('%',:descricao,'%') AND sistema.flag_ativo = :flagAtivo ORDER BY sistema.id_sistema ", nativeQuery=true)
	List<Sistema> findByExample(@Param("nome") String nome, @Param("descricao") String descricao, @Param("flagAtivo") Boolean flagAtivo);
}