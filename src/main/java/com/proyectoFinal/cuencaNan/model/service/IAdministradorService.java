package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Administrador;

public interface IAdministradorService {

	public List<Administrador> findAll();

	public Administrador save(Administrador administrador);

	public Administrador findById(Long id);

	public void delete(Long id);

}
