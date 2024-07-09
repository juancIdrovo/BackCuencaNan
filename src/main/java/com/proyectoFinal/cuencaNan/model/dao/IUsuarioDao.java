package com.proyectoFinal.cuencaNan.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.cuencaNan.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByCedula(String cedula);

    Optional<Usuario> findByMail(String mail);

    List<Usuario> findByNombresContainingIgnoreCase(String nombres);

    List<Usuario> findByApellidosContainingIgnoreCase(String apellidos);
}