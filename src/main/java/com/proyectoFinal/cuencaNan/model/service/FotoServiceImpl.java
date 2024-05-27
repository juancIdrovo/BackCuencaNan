package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IFotoDao;
import com.proyectoFinal.cuencaNan.model.entity.Foto;

@Service
public class FotoServiceImpl implements IFotoService{

	
	@Autowired
	private IFotoDao fotodao;

	@Override
	@Transactional(readOnly = true)
	public List<Foto> findAll() {
		return (List<Foto>) fotodao.findAll();
	}

	@Override
	@Transactional
	public Foto save(Foto foto) {
		// TODO Auto-generated method stub
		return fotodao.save(foto);
	}

	@Override
	@Transactional(readOnly = true)
	public Foto findById(Long fotoid) {
		// TODO Auto-generated method stub
		return fotodao.findById(fotoid).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long fotoid) {
		// TODO Auto-generated method stub
		fotodao.deleteById(fotoid);
		
	}


}
