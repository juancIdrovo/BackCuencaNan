package com.proyectoFinal.cuencaNan.controller;

import java.util.List;
import java.util.stream.Collectors;

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

import com.proyectoFinal.cuencaNan.aws3.S3Service;
import com.proyectoFinal.cuencaNan.model.entity.Foto;
import com.proyectoFinal.cuencaNan.model.service.IFotoService;

//@CrossOrigin(origins= {"http://138.197.126.67:9098"})
@RestController
@RequestMapping("/api")
public class FotoRestController {

	@Autowired
	private IFotoService fotoservice;
	
	@Autowired
	private S3Service s3Service;
	@GetMapping("/foto")
	public List<Foto> indext() {
		return fotoservice.findAll().stream().peek(foto -> {
			foto.setFotoUrl(s3Service.getObjectUrl(foto.getFoto()));
		}).collect(Collectors.toList());
	}

    @GetMapping("/foto/{fotoid}")
    public Foto show(@PathVariable Long fotoid) {
    	   Foto foto = fotoservice.findById(fotoid);
    	   foto.setFotoUrl(s3Service.getObjectUrl(foto.getFoto()));
    	return fotoservice.findById(fotoid);
    }

    @PostMapping("/foto")
    @ResponseStatus(HttpStatus.CREATED)
    public Foto create(@RequestBody Foto foto) {
        return fotoservice.save(foto);
    }

    @PutMapping("/foto/{fotoid}")
    @ResponseStatus(HttpStatus.CREATED)
    public Foto update(@RequestBody Foto foto, @PathVariable Long fotoid) {
    	Foto fotoactual = fotoservice.findById(fotoid);
    	fotoactual.setFoto(foto.getFoto());
    	fotoactual.setFotoUrl(foto.getFotoUrl());
    	return fotoservice.save(fotoactual);
    }

    @DeleteMapping("/foto/{fotoid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long fotoid) {
    	fotoservice.delete(fotoid);
    }


}
