package com.ms.practica2.service;

import com.ms.practica2.clientes.SocioFeignCliente;
import com.ms.practica2.models.Item;
import com.ms.practica2.models.Socio;
import com.ms.practica2.models.SocioDelete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private SocioFeignCliente clienteFeign;

	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map(Item::new).collect(Collectors.toList());
	}

	@Override
	public Item findById(String dni) {
		Socio socio = clienteFeign.detalle(dni);
		return new Item(socio);
	}

	@Override
	public Item save(Socio socio) {
		Socio oSocio = clienteFeign.Save(socio);
		return new Item(oSocio);
	}

	@Override
	public SocioDelete delete(String dni) {
		return clienteFeign.delete(dni);
	}

	@Override
	public Item update(Socio socio, String dni) {
		return new Item(clienteFeign.update(socio,dni));
	}

}
