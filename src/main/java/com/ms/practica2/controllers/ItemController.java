package com.ms.practica2.controllers;

import com.ms.practica2.models.Item;
import com.ms.practica2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/socio")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping("/socio/{id}")
	public Item detalle(@PathVariable String dni) {
		return itemService.findById(dni);
	}
	@PostMapping("/socio")
	public Item grabarPersona(@RequestBody Item item)	{
		Item oItem=itemService.save(item);
		return oItem;
	}

}
