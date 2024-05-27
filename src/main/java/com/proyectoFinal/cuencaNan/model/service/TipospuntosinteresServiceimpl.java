package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.ITipospuntosinteresDao;
import com.proyectoFinal.cuencaNan.model.entity.Tipospuntosinteres;

@Service
public class TipospuntosinteresServiceimpl implements ITipospuntosinteresService{

	
	@Autowired
	private ITipospuntosinteresDao Tipospuntosinteres;

	@Override
	@Transactional(readOnly = true)
	public List<Tipospuntosinteres> findAll() {
		return (List<Tipospuntosinteres>) Tipospuntosinteres.findAll();
	}

	@Override
	@Transactional
	public Tipospuntosinteres save(Tipospuntosinteres tipopuntointeres) {
		// TODO Auto-generated method stub
		return Tipospuntosinteres.save(tipopuntointeres);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipospuntosinteres findById(Long idtipospuntosinteres) {
		// TODO Auto-generated method stub
		return Tipospuntosinteres.findById(idtipospuntosinteres).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idtipospuntosinteres) {
		// TODO Auto-generated method stub
		Tipospuntosinteres.deleteById(idtipospuntosinteres);
		
	}


}
