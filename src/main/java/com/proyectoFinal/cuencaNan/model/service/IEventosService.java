package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;
import com.proyectoFinal.cuencaNan.model.entity.Eventos;

public interface IEventosService {
	public List<Eventos> findAll();
    public Eventos findById(Long id);
    public Eventos save(Eventos evento);
    public void delete(Long id);
}
