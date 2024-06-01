package com.proyectoFinal.cuencaNan.model.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.cuencaNan.model.dao.IPersonaDao;
import com.proyectoFinal.cuencaNan.model.entity.Administrador;
import com.proyectoFinal.cuencaNan.model.entity.Persona;
import com.proyectoFinal.cuencaNan.model.entity.Usuario;



@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	IPersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	public Persona findById(String cedula) {
		// TODO Auto-generated method stub
		return personaDao.findById(cedula).orElse(null);
	}

	@Override
	public void delete(String cedula) {
		// TODO Auto-generated method stub
		personaDao.deleteById(cedula);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona authenticate(String correo, String contrasena) {
		Optional<Persona> personaOptional = personaDao.findByCorreo(correo);

		if (personaOptional.isPresent()) {
			Persona persona = personaOptional.get();

			// Verificar si las contraseñas coinciden
			if (persona.getContrasena().equals(contrasena)) {
				return persona;
			}
		}

		return null; // Autenticación fallida
	}

	@Override
	@Transactional(readOnly = true)
	public String getTipoUsuario(String cedula) {
		Optional<Persona> personaOptional = personaDao.findById(cedula);

		if (personaOptional.isPresent()) {
			Persona persona = personaOptional.get();
			if (persona instanceof Usuario) {
				return "usuario";
			} else if (persona instanceof Administrador) {
				return "Administrador";
			}
		}

		return "otro";
	}

	@Override
	public List<Persona> findByNombre(String nombres) {

		return personaDao.findByNombresContainingIgnoreCase(nombres);
	}

	@Override
	public List<Persona> findByApellido(String apellidos) {
		// TODO Auto-generated method stub
		return personaDao.findByApellidosContainingIgnoreCase(apellidos);
	}

	@Override
	public List<Persona> findByCorreo(String correo) {
		// TODO Auto-generated method stub
		return Collections.singletonList(personaDao.findByCorreo(correo).orElse(null));
	}
}
