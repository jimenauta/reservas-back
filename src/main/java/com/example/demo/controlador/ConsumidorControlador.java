package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Consumidor;
import com.example.demo.repositorio.RepositorioConsumidor;

@RestController
@RequestMapping("/ver/consumidores")
public class ConsumidorControlador {
	
	@Autowired
	private RepositorioConsumidor repositorioCo;
	
	@GetMapping("/cargarconsumidor")
	public List<Consumidor> cargarConsumidor(){
		Consumidor co1 = new Consumidor (5555L, "Jimena", "Garzon", "3118772589","28 / Abril / 2005");
		this.repositorioCo.save(co1);
		return this.repositorioCo.findAll();
	}

}
