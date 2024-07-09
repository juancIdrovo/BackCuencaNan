package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Usuario;

public interface IUsuarioService {

    List<Usuario> findAll();

    Usuario save(Usuario usuario);

    Usuario findById(Long id);

    void delete(Long id);

    Usuario authenticate(String mail, String contrasena);

    List<Usuario> findByNombre(String nombres);

    List<Usuario> findByApellido(String apellidos);

    List<Usuario> findByMail(String mail);

}