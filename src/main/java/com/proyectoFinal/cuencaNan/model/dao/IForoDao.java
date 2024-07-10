package com.proyectoFinal.cuencaNan.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.cuencaNan.model.entity.Foro;

public interface IForoDao extends CrudRepository<Foro, Long>{
    List<Foro> findByIdUsuario(Long idUsuario);

}
