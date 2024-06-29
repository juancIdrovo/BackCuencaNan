package com.proyectoFinal.cuencaNan.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.cuencaNan.model.entity.PuntosInteres;

public interface IPuntoInteresDao extends CrudRepository<PuntosInteres, Long>{
	List<PuntosInteres> findByNombreContainingIgnoreCase(String nombre);
}
