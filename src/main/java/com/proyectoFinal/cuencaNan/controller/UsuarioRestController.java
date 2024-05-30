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

import com.proyectoFinal.cuencaNan.model.entity.Usuario;
import com.proyectoFinal.cuencaNan.model.service.IUsuarioService;


@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioService usuarioservice;

	// listar_todas_los_usuarios
	@GetMapping("/usuarios")
	public List<Usuario> indext() {
		return usuarioservice.findAll();
	}

	// buscar_un usuario_por_id
	@GetMapping("/usuarios/{idUsuario}")
	public Usuario show(@PathVariable Long id) {
		return usuarioservice.findById(id);
	}

	// guardar_un_usuario
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioservice.save(usuario);
	}

	// editar_un_usuario
	@PutMapping("/usuarios/{idUsuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usuarioActual = usuarioservice.findById(id);
		usuarioActual.setIntereses(usuario.getIntereses());
		return usuarioservice.save(usuarioActual);
	}

	// eliminar_un_usuario
	@DeleteMapping("/usuarios/{idUsuario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioservice.delete(id);
	}
}
