package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.ITipospuntosinteresDao;
import com.proyectoFinal.cuencaNan.model.entity.Tipospuntosinteres;

@Service
public class TipospuntosinteresServiceimpl implements ITipospuntosinteresService {

	@Autowired
	private ITipospuntosinteresDao interesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Tipospuntosinteres> findAll() {
		return (List<Tipospuntosinteres>) interesDao.findAll();
	}

	@Override
	@Transactional
	public Tipospuntosinteres save(Tipospuntosinteres tipopuntointeres) {

		return interesDao.save(tipopuntointeres);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipospuntosinteres findById(Long idtipospuntosinteres) {

		return interesDao.findById(idtipospuntosinteres).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idtipospuntosinteres) {

		interesDao.deleteById(idtipospuntosinteres);

	}
	

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> findByNombre(String nombre) {
        return interesDao.findByNombreContaining(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> findByDescripcion(String descripcion) {
        return interesDao.findByDescripcionContaining(descripcion);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> findByCategoria(String categoria) {
        return interesDao.findByCategoriaContaining(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> buscarPorCriterios(String nombre, String descripcion, String categoria) {
        return interesDao.buscarPorCriterios(nombre, descripcion, categoria);
    }

}
