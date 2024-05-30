package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IForoUsuarioDao;
import com.proyectoFinal.cuencaNan.model.entity.ForoUsuario;

@Service 
public class ForoUsuarioServiceImpl implements IForoUsuarioService{
	
	@Autowired
	
	private IForoUsuarioDao foroUsuarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<ForoUsuario> findAll() {
		return (List<ForoUsuario>) foroUsuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ForoUsuario findById(Long id) {
		return foroUsuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public ForoUsuario save(ForoUsuario foroUsuario) {
		return foroUsuarioDao.save(foroUsuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		foroUsuarioDao.deleteById(id);
	}
	
}
