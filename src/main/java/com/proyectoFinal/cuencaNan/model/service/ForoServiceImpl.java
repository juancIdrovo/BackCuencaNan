package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IForoDao;
import com.proyectoFinal.cuencaNan.model.entity.Foro;

@Service
public class ForoServiceImpl implements IForoService{

	@Autowired
	private IForoDao foroDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Foro> findAll() {
		// TODO Auto-generated method stub
		return (List <Foro> ) foroDao.findAll();
	}

	@Override
	@Transactional
	public Foro save(Foro foro) {
		// TODO Auto-generated method stub
		return foroDao.save(foro);
	}

	@Override
	@Transactional(readOnly = true)
	public Foro findById(Long idForo) {
		// TODO Auto-generated method stub
		return foroDao.findById(idForo).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idForo) {
		// TODO Auto-generated method stub
		foroDao.deleteById(idForo);
	}

}
