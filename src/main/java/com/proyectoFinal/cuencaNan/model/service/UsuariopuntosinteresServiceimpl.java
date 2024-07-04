package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IPuntoInteresDao;
import com.proyectoFinal.cuencaNan.model.dao.IUsuariopuntosinteresDao;
import com.proyectoFinal.cuencaNan.model.entity.Usuariopuntosinteres;

@Service
public class UsuariopuntosinteresServiceimpl implements IUsuariopuntosinteresService {

    @Autowired
    private IUsuariopuntosinteresDao usuariopuntos;

    @Autowired
    private IPuntoInteresDao pidao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuariopuntosinteres> findAll() {
        return (List<Usuariopuntosinteres>) usuariopuntos.findAll();
    }

    @Override
    @Transactional
    public Usuariopuntosinteres save(Usuariopuntosinteres usuariopuntointeres) {
        return usuariopuntos.save(usuariopuntointeres);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuariopuntosinteres findById(Long idusuariopuntosinteres) {
        return usuariopuntos.findById(idusuariopuntosinteres).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long idusuariopuntosinteres) {
        usuariopuntos.deleteById(idusuariopuntosinteres);
    }

    @Override
    @Transactional(readOnly = true)
    public Double findAverageCalificacionByPuntoInteres(Long idpuntosinteres) {
        return usuariopuntos.findAverageCalificacionByPuntoInteres(idpuntosinteres);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuariopuntosinteres findByUserAndPuntoInteres(Long idusuario, Long idpuntosinteres) {
        return usuariopuntos.findByUserAndPuntoInteres(idusuario, idpuntosinteres);
    }
}
