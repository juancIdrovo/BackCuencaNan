package com.proyectoFinal.cuencaNan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.cuencaNan.model.entity.ForoUsuario;
import com.proyectoFinal.cuencaNan.model.service.IForoUsuarioService;

//@CrossOrigin(origins= {"http://138.197.126.67:9098"})
@RestController
@RequestMapping("/api")
public class ForoUsuarioRestController {

	@Autowired
	private IForoUsuarioService foroUsuarioservice;

	// listar_todas_los_forosUsuarios
	@GetMapping("/forousuarios")
	public List<ForoUsuario> indext() {
		return foroUsuarioservice.findAll();
	}

	// buscar_un foroUsuario_por_id
	@GetMapping("/forousuarios/{idForoUsuario}")
	public ForoUsuario show(@PathVariable Long id) {
		return foroUsuarioservice.findById(id);
	}

	// guardar_un_foroUsuario
	@PostMapping("/forousuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public ForoUsuario create(@RequestBody ForoUsuario foroUsuario) {
		return foroUsuarioservice.save(foroUsuario);
	}

	// editar_un_foroUsuario
	@PutMapping("/forousuarios/{idForoUsuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public ForoUsuario update(@RequestBody ForoUsuario foroUsuario, @PathVariable Long id) {
		ForoUsuario foroUsuarioActual = foroUsuarioservice.findById(id);
		return foroUsuarioservice.save(foroUsuarioActual);
	}

	// eliminar_un_foroUsuario
	@DeleteMapping("/forousuarios/{idForoUsuario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		foroUsuarioservice.delete(id);
	}

}
