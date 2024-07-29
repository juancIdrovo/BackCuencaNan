package com.proyectoFinal.cuencaNan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.proyectoFinal.cuencaNan.model.entity.Usuariopuntosinteres;
import com.proyectoFinal.cuencaNan.model.service.IUsuariopuntosinteresService;

//@CrossOrigin(origins= {"http://138.197.126.67:9098"})
@RestController
@RequestMapping("/api")
public class UsuarioPuntoInteresRestController {
	@Autowired
	private IUsuariopuntosinteresService usuarioservice;

	@GetMapping("/usuariopuntosinteres")
	public List<Usuariopuntosinteres> indext() {
		return usuarioservice.findAll();

	}

    @GetMapping("/usuariopuntosinteres/{idusuariopuntosinteres}")
    public Usuariopuntosinteres show(@PathVariable Long idusuariopuntosinteres) {
    	return usuarioservice.findById(idusuariopuntosinteres);
    }

    @PostMapping("/usuariopuntosinteres")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuariopuntosinteres create(@RequestBody Usuariopuntosinteres idusuariopuntosinteres) {
    	return usuarioservice.save(idusuariopuntosinteres);
    }

    @PutMapping("/usuariopuntosinteres/{idusuariopuntosinteres}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuariopuntosinteres update(@RequestBody Usuariopuntosinteres usuariopuntointeres, @PathVariable Long idusuariopuntosinteres) {
    	Usuariopuntosinteres usupuntoactual = usuarioservice.findById(idusuariopuntosinteres);
    	usupuntoactual.setComentarios(usuariopuntointeres.getComentarios());
    	usupuntoactual.setCalificacion(usuariopuntointeres.getCalificacion());
    	return usuarioservice.save(usupuntoactual);
    }

    @DeleteMapping("/usuariopuntosinteres/{idusuariopuntosinteres}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long idusuariopuntosinteres) {
    	usuarioservice.delete(idusuariopuntosinteres);
    }
    
    @GetMapping("/puntosinteres/{id}/media-calificaciones")
    public Double getMediaCalificaciones(@PathVariable Long id) {
        return usuarioservice.findAverageCalificacionByPuntoInteres(id);
    }
    
    @GetMapping("/usuariopuntosinteres/{idusuario}/{idpuntosinteres}")
    public ResponseEntity<?> getByUserAndPuntoInteres(@PathVariable Long idusuario, @PathVariable Long idpuntosinteres) {
        List<Usuariopuntosinteres> result = usuarioservice.findByUserAndPuntoInteres(idusuario, idpuntosinteres);
        if (result.size() == 1) {
            return new ResponseEntity<>(result.get(0), HttpStatus.OK);
        } else if (result.isEmpty()) {
            return new ResponseEntity<>("No rating found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>("Multiple ratings found", HttpStatus.CONFLICT);
        }
    }


}
