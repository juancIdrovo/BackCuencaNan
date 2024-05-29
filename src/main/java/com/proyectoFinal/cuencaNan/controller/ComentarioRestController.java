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

import com.proyectoFinal.cuencaNan.model.entity.Comentario;

import com.proyectoFinal.cuencaNan.model.service.IComentarioService;

@RestController
@RequestMapping("/api")
public class ComentarioRestController {

	@Autowired
	private IComentarioService comenServe;

	// listar_todas_los_usuarios
	@GetMapping("/comentarios")
	public List<Comentario> indext() {
		return comenServe.findAll();
	}

	// buscar_un usuario_por_id
	@GetMapping("/buscar/{idComentario}")
	public Comentario show(@PathVariable Long idComentario) {
		return comenServe.findById(idComentario);
	}

	// guardar_un_usuario
	@PostMapping("/guardar")
	@ResponseStatus(HttpStatus.CREATED)
	public Comentario create(@RequestBody Comentario comentario) {
		return comenServe.save(comentario);
	}

	// editar_un_usuario
	@PutMapping("/editar/{idComentario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Comentario update(@RequestBody Comentario comentario, @PathVariable Long idComentario) {
		Comentario comentarioActual = comenServe.findById(idComentario);
		comentarioActual.setComentario(comentario.getComentario());
		return comenServe.save(comentarioActual);
	}

	// eliminar_un_usuario
	@DeleteMapping("/eliminar/{idComentario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long idComentario) {
		comenServe.delete(idComentario);
	}

}
