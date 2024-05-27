package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Usuariopuntosinteres;

public interface IUsuariopuntosinteresService  {
	
	public List<Usuariopuntosinteres> findAll();

	public Usuariopuntosinteres save(Usuariopuntosinteres idusuariopuntosinteres);
	
	public Usuariopuntosinteres findById(Long idusuariopuntosinteres);

	public void delete (Long idusuariopuntosinteres);

}