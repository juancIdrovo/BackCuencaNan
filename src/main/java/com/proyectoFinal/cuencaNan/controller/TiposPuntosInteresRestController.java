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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.cuencaNan.model.entity.Tipospuntosinteres;
import com.proyectoFinal.cuencaNan.model.service.ITipospuntosinteresService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TiposPuntosInteresRestController {


	@Autowired
	private ITipospuntosinteresService Tipospuntosinteresservice;

	@GetMapping("/tipospuntosinteres")
	public List<Tipospuntosinteres> indext() {
		return Tipospuntosinteresservice.findAll();

	}

    @GetMapping("/tipospuntosinteres/{idtipospuntosinteres}")
    public Tipospuntosinteres show(@PathVariable Long idtipospuntosinteres) {
    	return Tipospuntosinteresservice.findById(idtipospuntosinteres);
    }

    @PostMapping("/tipospuntosinteres")
    @ResponseStatus(HttpStatus.CREATED)
    public Tipospuntosinteres create(@RequestBody Tipospuntosinteres idtipospuntosinteres) {
    	return Tipospuntosinteresservice.save(idtipospuntosinteres);
    }

    @PutMapping("/tipospuntosinteres/{idtipospuntosinteres}")
    @ResponseStatus(HttpStatus.CREATED)
    public Tipospuntosinteres update(@RequestBody Tipospuntosinteres tipopuntosinteres, @PathVariable Long idtipospuntosinteres) {
    	Tipospuntosinteres puntoactual = Tipospuntosinteresservice.findById(idtipospuntosinteres);
    	puntoactual.setNombre(tipopuntosinteres.getNombre());
    	puntoactual.setDescripcion(tipopuntosinteres.getDescripcion());
    	puntoactual.setCategoria(tipopuntosinteres.getCategoria());
    	return Tipospuntosinteresservice.save(puntoactual);
    }

    @DeleteMapping("/tipospuntosinteres/{idtipospuntosinteres}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long idtipospuntosinteres) {
    	Tipospuntosinteresservice.delete(idtipospuntosinteres);
    }


    @GetMapping("/tipospuntosinteres/buscar")
    public List<Tipospuntosinteres> buscar(@RequestParam(required = false) String nombre,
                                           @RequestParam(required = false) String descripcion,
                                           @RequestParam(required = false) String categoria) {
        return Tipospuntosinteresservice.buscarPorCriterios(nombre, descripcion, categoria);
    }

}
