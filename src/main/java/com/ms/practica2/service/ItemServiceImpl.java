package com.ms.practica2.service;

import com.ms.practica2.models.Item;
import com.ms.practica2.models.Socio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		List<Socio> socio = Arrays.asList(Objects.requireNonNull(clienteRest.getForObject("http://api-man-socios-mongodb/socio", Socio[].class)));
		
		return socio.stream().map(p -> new Item(p)).collect(Collectors.toList());
	}

	@Override
	public Item findById(String dni) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", dni);
		Socio socio = clienteRest.getForObject("http://api-man-socios-mongodb/socio/{id}", Socio.class, pathVariables);
		return new Item(socio);
	}

}
