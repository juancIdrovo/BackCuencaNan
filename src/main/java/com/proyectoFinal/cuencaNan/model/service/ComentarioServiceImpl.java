package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IComentarioDao;
import com.proyectoFinal.cuencaNan.model.entity.Comentario;

@Service
public class ComentarioServiceImpl implements IComentarioService {

    @Autowired
    private IComentarioDao comentarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Comentario> findAll() {
        return (List<Comentario>) comentarioDao.findAll();
    }

    @Override
    @Transactional
    public Comentario save(Comentario comentario) {
        return comentarioDao.save(comentario);
    }

    @Override
    @Transactional(readOnly = true)
    public Comentario findById(Long idComentario) {
        return comentarioDao.findById(idComentario).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long idComentario) {
        comentarioDao.deleteById(idComentario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Comentario> findByForoId(Long idForo) {
        return comentarioDao.findByIdForo(idForo);
    }
}
