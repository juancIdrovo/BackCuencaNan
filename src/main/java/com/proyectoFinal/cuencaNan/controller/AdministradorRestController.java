package com.proyectoFinal.cuencaNan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.cuencaNan.model.entity.Administrador;
import com.proyectoFinal.cuencaNan.model.service.IAdministradorService;

@RestController
@RequestMapping("/api")
public class AdministradorRestController {
	
	
	@Autowired
	private IAdministradorService administradorservice;

	// listar_todas_los_administradores
	@GetMapping("/administradores")
	public List<Administrador> indext() {
		return administradorservice.findAll();
	}

	// buscar_un administrador_por_id
	@GetMapping("/administradores/{idAdministrador}")
	public Administrador show(@PathVariable Long id) {
		return administradorservice.findById(id);
	}

	// guardar_un_administrador
	@PostMapping("/administradores")
	@ResponseStatus(HttpStatus.CREATED)
	public Administrador create(@RequestBody Administrador administrador) {
		return administradorservice.save(administrador);
	}

	// editar_un_administrador
	@PutMapping("/administradores/{idAdministrador}")
	@ResponseStatus(HttpStatus.CREATED)
	public Administrador update(@RequestBody Administrador administrador, @PathVariable Long id) {
		Administrador administradorActual = administradorservice.findById(id);
		return administradorservice.save(administradorActual);
	}

	// eliminar_un_administrador
	@DeleteMapping("/administradores/{idAdministrador}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		administradorservice.delete(id);
	}

}
