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

import com.proyectoFinal.cuencaNan.model.entity.PuntosInteres;
import com.proyectoFinal.cuencaNan.model.service.IPuntosInteresService;

//@CrossOrigin(origins= {"http://138.197.126.67:9098"})
@RestController
@RequestMapping("/api")
public class PuntosInteresRestController {

	@Autowired
	private IPuntosInteresService interesService;

	// listar_todas_los_administradores
	@GetMapping("/puntosinteres")
	public List<PuntosInteres> indext() {
		return interesService.findAll();
	}

	// buscar_un administrador_por_id
	@GetMapping("/puntosinteres/{id}")
	public PuntosInteres show(@PathVariable Long id) {
		return interesService.findById(id);
	}

	// guardar_un_administrador
	@PostMapping("/puntosinteres")
	@ResponseStatus(HttpStatus.CREATED)
	public PuntosInteres create(@RequestBody PuntosInteres interes) {
		return interesService.save(interes);
	}

	// editar_un_administrador
	@PutMapping("/puntosinteres/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PuntosInteres update(@RequestBody PuntosInteres interes, @PathVariable Long id) {
		PuntosInteres interesActual = interesService.findById(id);
		interesActual.setLatitud(interes.getLatitud());
		interesActual.setLongitud(interes.getLongitud());
		interesActual.setNombre(interes.getNombre());
		interesActual.setDescripcion(interes.getDescripcion());
		return interesService.save(interesActual);
	}

	// eliminar_un_administrador
	@DeleteMapping("/puntosinteres/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		interesService.delete(id);
	}

	@GetMapping("/puntosinteres/nombre/{nombre}")
    public List<PuntosInteres> findByNombre(@PathVariable String nombre) {
        return interesService.findByNombre(nombre);
    }


}
