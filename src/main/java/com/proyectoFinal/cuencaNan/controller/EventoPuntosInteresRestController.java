package com.proyectoFinal.cuencaNan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.cuencaNan.model.entity.EventosPuntoInteres;
import com.proyectoFinal.cuencaNan.model.service.IEventosPuntoInteresService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EventoPuntosInteresRestController {

	@Autowired
	private IEventosPuntoInteresService service;

	@GetMapping("/eventospuntointeres")
	public List<EventosPuntoInteres> indext() {
		return service.findAll();

	}

	@GetMapping("/eventospuntointeres/{id}")
	public EventosPuntoInteres show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/eventospuntointeres")
	@ResponseStatus(HttpStatus.CREATED)
	public EventosPuntoInteres create(@RequestBody EventosPuntoInteres id) {
		return service.save(id);
	}

	@DeleteMapping("/eventospuntointeres/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
