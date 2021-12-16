package com.ms.practica2.service;

import com.cjava.ribbon.models.Item;

import java.util.List;


public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
