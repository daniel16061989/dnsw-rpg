package br.com.soft.dnsw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.soft.dnsw.model.Sistema;

public interface SistemaRepository extends JpaRepository<Sistema, Integer> {

	@Query
	List<Sistema> findByFlagAtivo(Boolean flagAtivo);
}