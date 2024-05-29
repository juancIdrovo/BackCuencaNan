package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IComentarioDao;
import com.proyectoFinal.cuencaNan.model.entity.Comentario;

public class ComentarioServiceImpl implements IComentarioService {
	
	@Autowired
	private IComentarioDao comenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Comentario> findAll() {
		// TODO Auto-generated method stub
		return (List<Comentario>) comenDao.findAll();
	}

	@Override
	@Transactional
	public Comentario save(Comentario comentario) {
		// TODO Auto-generated method stub
		return comenDao.save(comentario);
	}

	@Override
	@Transactional(readOnly = true)
	public Comentario findById(Long idComentario) {
		// TODO Auto-generated method stub
		return comenDao.findById(idComentario).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idComentario) {
		// TODO Auto-generated method stub
		comenDao.deleteById(idComentario);
	}

}
