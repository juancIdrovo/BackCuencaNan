package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoFinal.cuencaNan.model.dao.ITipoEventosDao;
import com.proyectoFinal.cuencaNan.model.entity.TiposEventos;

@Service
public class TipoEventosServiceImpl implements ITipoEventosService{

	@Autowired
    private ITipoEventosDao tipoEventoDao;
	
	@Override
	public List<TiposEventos> findAll() {
		// TODO Auto-generated method stub
		return (List<TiposEventos>) tipoEventoDao.findAll();
	}

	@Override
	public TiposEventos findById(Long id) {
		// TODO Auto-generated method stub
		 return tipoEventoDao.findById(id).orElse(null);
	}

	@Override
	public TiposEventos save(TiposEventos tipoEvento) {
		// TODO Auto-generated method stub
		return tipoEventoDao.save(tipoEvento);
	}

	@Override
	public void delete(Long id_tipoEvento) {
		// TODO Auto-generated method stub
		tipoEventoDao.deleteById(id_tipoEvento);
	}

}
