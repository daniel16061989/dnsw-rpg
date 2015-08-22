package br.com.soft.dnsw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.dnsw.model.InformacaoLogin;

public interface InformacaoLoginRepository extends JpaRepository<InformacaoLogin, Integer> {

}
