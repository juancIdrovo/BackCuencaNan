package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Comentario;

public interface IComentarioService {

	public List<Comentario> findAll();

	public Comentario save(Comentario comentario);

	public Comentario findById(Long idComentario);

	public void delete(Long idComentario);

}
