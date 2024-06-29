package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.PuntosInteres;

public interface IPuntosInteresService {

	public List<PuntosInteres> findAll();
	
	public PuntosInteres save (PuntosInteres puntosInteres);
	
	public PuntosInteres findById(Long id);
	
	public void delete (Long id);
	
	List<PuntosInteres> findByNombre(String nombre);
}
