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
	private ITipospuntosinteresDao Tipospuntosinteres;

	@Override
	@Transactional(readOnly = true)
	public List<Tipospuntosinteres> findAll() {
		return (List<Tipospuntosinteres>) Tipospuntosinteres.findAll();
	}

	@Override
	@Transactional
	public Tipospuntosinteres save(Tipospuntosinteres tipopuntointeres) {

		return Tipospuntosinteres.save(tipopuntointeres);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipospuntosinteres findById(Long idtipospuntosinteres) {

		return Tipospuntosinteres.findById(idtipospuntosinteres).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idtipospuntosinteres) {

		Tipospuntosinteres.deleteById(idtipospuntosinteres);

	}


    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> findByNombre(String nombre) {
        return Tipospuntosinteres.findByNombreContaining(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> findByDescripcion(String descripcion) {
        return Tipospuntosinteres.findByDescripcionContaining(descripcion);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> findByCategoria(String categoria) {
        return Tipospuntosinteres.findByCategoriaContaining(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tipospuntosinteres> buscarPorCriterios(String nombre, String descripcion, String categoria) {
        return Tipospuntosinteres.buscarPorCriterios(nombre, descripcion, categoria);
    }

}
