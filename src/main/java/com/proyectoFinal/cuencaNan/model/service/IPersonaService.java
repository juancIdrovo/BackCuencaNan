package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Persona;


public interface IPersonaService {

	public List<Persona> findAll();

	public Persona save(Persona persona);

	public Persona findById(String cedula);

	public void delete(String cedula);

	public Persona authenticate(String correo, String contrasena);

	String getTipoUsuario(String cedula);

	List<Persona> findByNombre(String nombres);

	List<Persona> findByApellido(String apellidos);

	List<Persona> findByCorreo(String correo);

}
