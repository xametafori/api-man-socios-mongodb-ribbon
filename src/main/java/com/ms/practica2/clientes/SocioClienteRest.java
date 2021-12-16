package com.ms.practica2.clientes;

import com.ms.practica2.models.Socio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "servicio-productos")
public interface SocioClienteRest {
	
	@GetMapping("/listar")
	public List<Socio> listar();
	
	@GetMapping("/ver/{id}")
	public Socio detalle(@PathVariable Long id);

}
