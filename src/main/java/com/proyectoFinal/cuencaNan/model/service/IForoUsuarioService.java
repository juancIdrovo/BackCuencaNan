package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.ForoUsuario;

public interface IForoUsuarioService {

	public List<ForoUsuario> findAll();

	public ForoUsuario save(ForoUsuario forousuario);

	public ForoUsuario findById(Long id);

	public void delete(Long id);

}
