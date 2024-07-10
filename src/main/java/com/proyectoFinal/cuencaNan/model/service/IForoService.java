package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Foro;

public interface IForoService {

	public List<Foro> findAll();

	public Foro save(Foro foro);

	public Foro findById(Long idForo);

	public void delete(Long idForo);
	
    List<Foro> findByIdUsuario(Long idUsuario);

}
