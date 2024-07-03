package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.EventosPuntoInteres;

public interface IEventosPuntoInteresService {

	public List<EventosPuntoInteres> findAll();

	public EventosPuntoInteres save(EventosPuntoInteres id);

	public EventosPuntoInteres findById(Long id);

	public void delete (Long id);

}