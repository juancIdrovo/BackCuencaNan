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

import com.proyectoFinal.cuencaNan.model.entity.Comentario;
import com.proyectoFinal.cuencaNan.model.service.IComentarioService;

//@CrossOrigin(origins = {"http://138.197.126.67:9098"})
@RestController
@RequestMapping("/api")
public class ComentarioRestController {

    @Autowired
    private IComentarioService comentarioService;

    @GetMapping("/comentarios")
    public List<Comentario> listarComentarios() {
        return comentarioService.findAll();
    }

    @GetMapping("/comentarios/{idComentario}")
    public Comentario obtenerComentario(@PathVariable Long idComentario) {
        return comentarioService.findById(idComentario);
    }

    @PostMapping("/comentarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Comentario crearComentario(@RequestBody Comentario comentario) {
        return comentarioService.save(comentario);
    }

    @PutMapping("/comentarios/{idComentario}")
    @ResponseStatus(HttpStatus.CREATED)
    public Comentario actualizarComentario(@RequestBody Comentario comentario, @PathVariable Long idComentario) {
        Comentario comentarioActual = comentarioService.findById(idComentario);
        comentarioActual.setComentario(comentario.getComentario());
        // Actualiza otros campos si es necesario
        return comentarioService.save(comentarioActual);
    }

    @DeleteMapping("/comentarios/{idComentario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarComentario(@PathVariable Long idComentario) {
        comentarioService.delete(idComentario);
    }

    @GetMapping("/comentarios/foro/{idForo}")
    public List<Comentario> listarComentariosPorForo(@PathVariable Long idForo) {
        return comentarioService.findByForoId(idForo);
    }
}
