package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.TiposEventos;

public interface ITipoEventosService {

	public List<TiposEventos> findAll();
    public TiposEventos findById(Long id);
    public TiposEventos save(TiposEventos tipoEvento);
    public void delete(Long id);
}
