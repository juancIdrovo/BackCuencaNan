package com.proyectoFinal.cuencaNan.model.dao;
import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.cuencaNan.model.entity.Comentario;

public interface IComentarioDao extends CrudRepository <Comentario, Long>{

}
