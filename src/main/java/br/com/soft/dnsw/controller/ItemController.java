package br.com.soft.dnsw.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Item;
import br.com.soft.dnsw.repository.ItemRepository;

import com.google.gson.Gson;

@RestController
@RequestMapping("/item")
public class ItemController {
	
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Item> findByExample(@PathParam(value = "item") String item) {
		Gson gson = new Gson();
		Item a = new Item();
		
		a = gson.fromJson(item, Item.class);
		
		if(a == null) {
			a = new Item();
		}
		if(a.getNome() == null) {
			a.setNome("");
		}
		if(a.getDescricao() == null) {
			a.setDescricao("");
		}
		if(a.getFlagAtivo() == null) {
			a.setFlagAtivo(Boolean.TRUE);
		}
		
		return itemRepository.findByExample(a.getNome(), 
				a.getDescricao(), a.getSistema().getIdSistema(), a.getFlagAtivo());
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Item update(@RequestBody String item) {
		Gson gson = new Gson();
		Item a = new Item();
		
		a = gson.fromJson(item, Item.class);
		
		return itemRepository.save(a);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Item save(@RequestBody String item) {
		Gson gson = new Gson();
		Item a = new Item();
		
		a = gson.fromJson(item, Item.class);
		
		return itemRepository.save(a);
	}

}