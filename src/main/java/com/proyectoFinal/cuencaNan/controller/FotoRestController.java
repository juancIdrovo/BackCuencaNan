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

import com.proyectoFinal.cuencaNan.model.entity.Foto;
import com.proyectoFinal.cuencaNan.model.service.IFotoService;

@RestController
@RequestMapping("/api")
public class FotoRestController {

	@Autowired
	private IFotoService fotoservice;

	@GetMapping("/foto")
	public List<Foto> indext() {
		return fotoservice.findAll();

	}
	
    @GetMapping("/foto/{fotoid}")
    public Foto show(@PathVariable Long fotoid) {
    	return fotoservice.findById(fotoid);
    }
    
    @PostMapping("/foto")
    @ResponseStatus(HttpStatus.CREATED)
    public Foto create(@RequestBody Foto fotoid) {
    	return fotoservice.save(fotoid);
    }
    
    @PutMapping("/foto/{fotoid}")
    @ResponseStatus(HttpStatus.CREATED)
    public Foto update(@RequestBody Foto foto, @PathVariable Long fotoid) {
    	Foto fotoactual = fotoservice.findById(fotoid);
    	fotoactual.setFoto(foto.getFoto());
    	return fotoservice.save(fotoactual);
    }
    
    @DeleteMapping("/foto/{fotoid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long fotoid) {
    	fotoservice.delete(fotoid);
    }
    
    
}
