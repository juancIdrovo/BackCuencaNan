package com.proyectoFinal.cuencaNan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.cuencaNan.model.entity.Foro;
import com.proyectoFinal.cuencaNan.model.service.IForoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ForoRestController {
	
	@Autowired 
	private IForoService foroService;
	
	@GetMapping("/foros")
	public List <Foro> indext(){
		
		return foroService.findAll();	
	}
	
	@GetMapping("/foros/{idForo}")
	public Foro show(@PathVariable Long idForo) {
		return foroService.findById(idForo);
	}
	
	@PostMapping("/foros")
	@ResponseStatus(HttpStatus.CREATED)
	public Foro update(@RequestBody Foro foro) {
		return foroService.save(foro);
	}
	
	@PutMapping("/foros/{idForo}")
	@ResponseStatus(HttpStatus.CREATED)
	public Foro update(@RequestBody Foro foro, @PathVariable Long idForo) {
		
		Foro foroA = foroService.findById(idForo);
		
		foroA.setRespuesta(foro.getRespuesta());
		
		return foroService.save(foroA);
		
	}
	
	
	

}
