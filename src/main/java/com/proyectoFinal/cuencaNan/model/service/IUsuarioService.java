package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario usuario);

	public Usuario findById(Long id);

	public void delete(Long id);

}
