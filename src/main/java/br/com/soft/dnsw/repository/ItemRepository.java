package br.com.soft.dnsw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.dnsw.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
