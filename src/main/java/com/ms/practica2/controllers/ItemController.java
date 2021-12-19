package com.ms.practica2.controllers;

import com.ms.practica2.models.Item;
import com.ms.practica2.models.Socio;
import com.ms.practica2.models.SocioDelete;
import com.ms.practica2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ItemController {
	
	@Autowired
	@Qualifier("serviceFeign")
	private ItemService itemService;
	
	@GetMapping("/socio")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping("/socio/{dni}")
	public Item detalle(@PathVariable String dni) {
		return itemService.findById(dni);
	}

	@PostMapping("/socio")
	public Item grabarSocio(@RequestBody Socio item)	{
		return itemService.save(item);
	}

	@PutMapping("/socio/{dni}")
	public Item actualizarSocio(@RequestBody Socio oSocio, @PathVariable String dni)	{
		return itemService.update(oSocio,dni);
	}
	@DeleteMapping(value = "/socio/{dni}", produces = "application/json; charset=utf-8")
	public SocioDelete deleteSocio(@PathVariable String dni) {
		return itemService.delete(dni);
	}


}
