package com.proyectoFinal.cuencaNan.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.cuencaNan.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
