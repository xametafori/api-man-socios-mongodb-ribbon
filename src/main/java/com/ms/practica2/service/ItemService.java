package com.ms.practica2.service;

import com.ms.practica2.models.Item;
import java.util.List;


public interface ItemService {

	 List<Item> findAll();
	 Item findById(String dni);
	 Item save(Item item);
}
