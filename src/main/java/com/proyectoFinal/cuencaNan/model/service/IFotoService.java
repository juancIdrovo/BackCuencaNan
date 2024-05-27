package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Foto;

public interface IFotoService {
	
	public List<Foto> findAll();

	public Foto save(Foto fotoid);
	
	public Foto findById(Long fotoid);

	public void delete (Long fotoid);

}