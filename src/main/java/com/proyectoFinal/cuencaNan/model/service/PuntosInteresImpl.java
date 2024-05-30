package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IPuntoInteresDao;
import com.proyectoFinal.cuencaNan.model.entity.PuntosInteres;

@Service
public class PuntosInteresImpl implements IPuntosInteresService{

	@Autowired
	private IPuntoInteresDao interesDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<PuntosInteres> findAll() {
		// TODO Auto-generated method stub
		return (List<PuntosInteres>) interesDao.findAll();
	}

	@Override
	@Transactional()
	public PuntosInteres save(PuntosInteres puntosInteres) {
		// TODO Auto-generated method stub
		return interesDao.save(puntosInteres);
	}

	@Override
	@Transactional(readOnly = true)
	public PuntosInteres findById(Long id) {
		// TODO Auto-generated method stub
		return interesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		interesDao.deleteById(id);
	}

}
