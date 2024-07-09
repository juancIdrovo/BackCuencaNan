package com.proyectoFinal.cuencaNan.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.cuencaNan.model.entity.Comentario;

public interface IComentarioDao extends CrudRepository<Comentario, Long> {
    List<Comentario> findByIdForo(Long idForo);
}
