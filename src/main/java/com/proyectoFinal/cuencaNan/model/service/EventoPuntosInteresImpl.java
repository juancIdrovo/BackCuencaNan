package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IEventosPuntonteresDao;
import com.proyectoFinal.cuencaNan.model.entity.EventosPuntoInteres;

@Service
public class EventoPuntosInteresImpl implements IEventosPuntoInteresService {

	@Autowired
	private IEventosPuntonteresDao eventosPuntonteresDao;

	@Override
	@Transactional(readOnly = true)
	public List<EventosPuntoInteres> findAll() {
		return (List<EventosPuntoInteres>) eventosPuntonteresDao.findAll();
	}

	@Override
	@Transactional
	public EventosPuntoInteres save(EventosPuntoInteres eventosPuntoInteres) {
		// TODO Auto-generated method stub
		return eventosPuntonteresDao.save(eventosPuntoInteres);
	}

	@Override
	@Transactional(readOnly = true)
	public EventosPuntoInteres findById(Long id) {
		// TODO Auto-generated method stub
		return eventosPuntonteresDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		eventosPuntonteresDao.deleteById(id);

	}

}
