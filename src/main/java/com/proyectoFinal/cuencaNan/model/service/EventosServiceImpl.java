package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IEventosDao;
import com.proyectoFinal.cuencaNan.model.entity.Eventos;

@Service
public class EventosServiceImpl implements IEventosService{

	@Autowired
    private IEventosDao eventoDao;

	@Override
	public List<Eventos> findAll() {
		return (List<Eventos>)eventoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Eventos findById(Long id) {
		return eventoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Eventos save(Eventos evento) {
		return eventoDao.save(evento);
	}

	@Override
	public void delete(Long id_evento) {
		eventoDao.deleteById(id_evento);
	}


}
