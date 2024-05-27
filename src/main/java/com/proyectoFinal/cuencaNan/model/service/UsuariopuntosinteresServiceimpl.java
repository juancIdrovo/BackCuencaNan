package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IUsuariopuntosinteresDao;
import com.proyectoFinal.cuencaNan.model.entity.Usuariopuntosinteres;

@Service
public class UsuariopuntosinteresServiceimpl implements IUsuariopuntosinteresService{

	
	@Autowired
	private IUsuariopuntosinteresDao Usuariopuntos;

	@Override
	@Transactional(readOnly = true)
	public List<Usuariopuntosinteres> findAll() {
		return (List<Usuariopuntosinteres>) Usuariopuntos.findAll();
	}

	@Override
	@Transactional
	public Usuariopuntosinteres save(Usuariopuntosinteres usuariopuntointeres) {
		// TODO Auto-generated method stub
		return Usuariopuntos.save(usuariopuntointeres);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuariopuntosinteres findById(Long idusuariopuntosinteres) {
		// TODO Auto-generated method stub
		return Usuariopuntos.findById(idusuariopuntosinteres).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idusuariopuntosinteres) {
		// TODO Auto-generated method stub
		Usuariopuntos.deleteById(idusuariopuntosinteres);
		
	}


}
