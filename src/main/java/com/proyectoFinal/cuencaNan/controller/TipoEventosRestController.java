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
import com.proyectoFinal.cuencaNan.model.entity.TiposEventos;
import com.proyectoFinal.cuencaNan.model.service.ITipoEventosService;

@RestController
@RequestMapping("/api")
public class TipoEventosRestController {

	@Autowired
	private ITipoEventosService tipoeventoService;
	
	// listar_todas_los_tiposEventos
		@GetMapping("/listar")
		public List<TiposEventos> indext() {
			return tipoeventoService.findAll();
		}

		// buscar_un tipoEvento_por_id
		@GetMapping("/buscar/{id}")
		public TiposEventos show(@PathVariable Long id) {
			return tipoeventoService.findById(id);
		}
		
		// guardar_un_tipoEvento
		@PostMapping("/guardar")
		@ResponseStatus(HttpStatus.CREATED)
		public TiposEventos create(@RequestBody TiposEventos tipoevento) {
			return tipoeventoService.save(tipoevento);
		}
		
		// editar_un_tipoEvento
		@PutMapping("/editar/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public TiposEventos update(@RequestBody TiposEventos tipoevento, @PathVariable Long id) {
			TiposEventos TipoEventoActual = tipoeventoService.findById(id);
			return tipoeventoService.save(TipoEventoActual);
		}

		// eliminar_un_tipoEvento
		@DeleteMapping("/eliminar/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			tipoeventoService.delete(id);
		}
		
}
