package com.proyectoFinal.cuencaNan.model.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.proyectoFinal.cuencaNan.model.dao.IUsuarioDao;
import com.proyectoFinal.cuencaNan.model.entity.Usuario;

@Service 
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        usuarioDao.deleteById(id);
    }
    
    @Override
    public List<Usuario> findByNombre(String nombres) {
        return usuarioDao.findByNombresContainingIgnoreCase(nombres);
    }

    @Override
    public List<Usuario> findByApellido(String apellidos) {
        return usuarioDao.findByApellidosContainingIgnoreCase(apellidos);
    }

    @Override
    public List<Usuario> findByMail(String mail) {
        return Collections.singletonList(usuarioDao.findByMail(mail).orElse(null));
    }

    @Override
    public Usuario authenticate(String mail, String contrasena) {
        Optional<Usuario> personaOptional = usuarioDao.findByMail(mail);

        if (personaOptional.isPresent()) {
            Usuario persona = personaOptional.get();

            // Verificar si las contraseñas coinciden
            if (persona.getContrasena().equals(contrasena)) {
                return persona;
            }
        }

        return null; // Autenticación fallida
    }

}
