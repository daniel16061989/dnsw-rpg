package br.com.soft.dnsw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.dnsw.model.Monstro;

public interface MonstroRepository extends JpaRepository<Monstro, Integer> {

}
