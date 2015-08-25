package br.com.soft.dnsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.soft.dnsw.model.Item;
import br.com.soft.dnsw.repository.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> findItems(){
        return itemRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item getItem(@PathVariable Integer id){
        return itemRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Item addItem(@RequestBody Item item){
        item.setIdItem(null);
        return itemRepository.saveAndFlush(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id){
        updatedItem.setIdItem(id);
        return itemRepository.saveAndFlush(updatedItem);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Integer id){
        itemRepository.delete(id);
    }
}
