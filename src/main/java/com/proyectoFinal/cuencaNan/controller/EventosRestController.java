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
import com.proyectoFinal.cuencaNan.model.entity.Eventos;
import com.proyectoFinal.cuencaNan.model.service.IEventosService;

@RestController
@RequestMapping("/api")
public class EventosRestController {

	@Autowired
	private IEventosService eventoService;
	
	// listar_todas_los_eventos
		@GetMapping("/listar")
		public List<Eventos> indext() {
			return eventoService.findAll();
		}
		
		// buscar_un evento_por_id
		@GetMapping("/buscar/{id}")
		public Eventos show(@PathVariable Long id) {
			return eventoService.findById(id);
		}	
		
		// guardar_un_evento
		@PostMapping("/guardar")
		@ResponseStatus(HttpStatus.CREATED)
		public Eventos create(@RequestBody Eventos eventos) {
			return eventoService.save(eventos);
		}
		
		// editar_un_evento
		@PutMapping("/editar/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Eventos update(@RequestBody Eventos eventos, @PathVariable Long id) {
			Eventos eventoA = eventoService.findById(id);
			return eventoService.save(eventoA);
		}

		// eliminar_un_evento
		@DeleteMapping("/eliminar/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			eventoService.delete(id);
		}
				
}
