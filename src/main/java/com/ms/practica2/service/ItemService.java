package com.ms.practica2.service;

import com.ms.practica2.models.Item;
import com.ms.practica2.models.Socio;
import com.ms.practica2.models.SocioDelete;

import java.util.List;


public interface ItemService {

	 List<Item> findAll();
	 Item findById(String dni);
	 Item save(Socio socio);
	SocioDelete delete(String dni);
     Item update(Socio socio,String dni);

}
