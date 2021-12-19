package com.ms.practica2.clientes;

import com.ms.practica2.models.Socio;
import com.ms.practica2.models.SocioDelete;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = "api-man-socios-mongodb")
public interface SocioFeignCliente {
	
	@GetMapping("/socio")
	public List<Socio> listar();
	
	@GetMapping("/socio/{dni}")
	public Socio detalle(@PathVariable String dni);

	@PostMapping("/socio")
	public Socio Save(@RequestBody Socio socio);

	@PutMapping("/socio/{dni}")
	public Socio update(@RequestBody Socio socio,@PathVariable String dni);

	@DeleteMapping("/socio/{dni}")
	public SocioDelete delete(@PathVariable String dni);

}
