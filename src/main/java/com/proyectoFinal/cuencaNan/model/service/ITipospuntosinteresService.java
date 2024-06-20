package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Tipospuntosinteres;

public interface ITipospuntosinteresService {
	
	public List<Tipospuntosinteres> findAll();

	public Tipospuntosinteres save(Tipospuntosinteres fotoid);
	
	public Tipospuntosinteres findById(Long fotoid);

	public void delete (Long fotoid);
	
	List<Tipospuntosinteres> findByNombre(String nombre);

    List<Tipospuntosinteres> findByDescripcion(String descripcion);

    List<Tipospuntosinteres> findByCategoria(String categoria);

    List<Tipospuntosinteres> buscarPorCriterios(String nombre, String descripcion, String categoria);

}