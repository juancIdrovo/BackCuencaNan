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

import com.proyectoFinal.cuencaNan.model.entity.Eventos;
import com.proyectoFinal.cuencaNan.model.service.IEventosService;

//@CrossOrigin(origins = { "http://138.197.126.67:9098" })
@RestController
@RequestMapping("/api")
public class EventosRestController {

	@Autowired
	private IEventosService eventoService;

	// listar_todas_los_eventos
	@GetMapping("/eventos")
	public List<Eventos> indext() {
		return eventoService.findAll();
	}

	// buscar_un evento_por_id
	@GetMapping("/eventos/{id_evento}")
	public Eventos show(@PathVariable Long id_evento) {
		return eventoService.findById(id_evento);
	}

	// guardar_un_evento
	@PostMapping("/eventos")
	@ResponseStatus(HttpStatus.CREATED)
	public Eventos create(@RequestBody Eventos eventos) {
		return eventoService.save(eventos);
	}

	// editar_un_evento
	@PutMapping("/eventos/{id_evento}")
	@ResponseStatus(HttpStatus.CREATED)
	public Eventos update(@RequestBody Eventos eventos, @PathVariable Long id_evento) {
		Eventos eventoA = eventoService.findById(id_evento);
		eventoA.setFecha_Fin(eventos.getFecha_Fin());
		eventoA.setFecha_Inicio(eventos.getFecha_Inicio());
		eventoA.setNombre(eventos.getNombre());
		eventoA.setHora_Inicio(eventos.getHora_Inicio());
		eventoA.setHora_Fin(eventos.getHora_Fin());

		return eventoService.save(eventoA);
	}

	// eliminar_un_evento
	@DeleteMapping("/eventos/{id_evento}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_evento) {
		eventoService.delete(id_evento);
	}

}
