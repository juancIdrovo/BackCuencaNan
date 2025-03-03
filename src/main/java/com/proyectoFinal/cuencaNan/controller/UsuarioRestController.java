package com.proyectoFinal.cuencaNan.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.cuencaNan.aws3.S3Service;
import com.proyectoFinal.cuencaNan.model.entity.Usuario;
import com.proyectoFinal.cuencaNan.model.service.IUsuarioService;

//@CrossOrigin(origins = { "http://138.197.126.67:9098" })
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private S3Service s3Service;

    @GetMapping("/usuarios")
    public List<Usuario> indext() {
        return usuarioService.findAll().stream().peek(usuario -> {
            usuario.setFotoUrl(s3Service.getObjectUrl(usuario.getFotoPath()));
        }).collect(Collectors.toList());
    }

    @GetMapping("/usuarios/{id_usuario}")
    public Usuario show(@PathVariable Long id_usuario) {
        Usuario usuario = usuarioService.findById(id_usuario);
        usuario.setFotoUrl(s3Service.getObjectUrl(usuario.getFotoPath()));
        return usuario;
    }
    
    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario) {
        usuario = usuarioService.save(usuario);
        if (usuario.getFotoPath() != null) {
            usuario.setFotoUrl(s3Service.getObjectUrl(usuario.getFotoPath()));
        }
        return usuario;
    }

	// editar_un_usuario
	@PutMapping("/usuarios/{id_usuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id_usuario) {
		Usuario usuarioActual = usuarioService.findById(id_usuario);
		usuarioActual.setNombres(usuario.getNombres());
		usuarioActual.setApellidos(usuario.getApellidos());
		usuarioActual.setMail(usuario.getMail());
		usuarioActual.setDireccion(usuario.getDireccion());
		usuarioActual.setCelular(usuario.getCelular());
		usuarioActual.setContrasena(usuario.getContrasena());
		usuarioActual.setFecha_nacimiento(usuario.getFecha_nacimiento());
		usuarioActual.setFotoPath(usuario.getFotoPath());
		usuarioActual.setFotoUrl(s3Service.getObjectUrl(usuario.getFotoPath()));
		return usuarioService.save(usuarioActual);
	}

    @DeleteMapping("/usuarios/{id_usuario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id_usuario) {
        usuarioService.delete(id_usuario);
    }

    @PostMapping("/usuarios/loginusuario")
    public ResponseEntity<?> logginUsuario(@RequestBody Map<String, String> credentials) {
        String mail = credentials.get("mail");
        String contrasena = credentials.get("contrasena");

        System.out.println("Intento de inicio de sesión para el mail: " + mail);

        Usuario usu = usuarioService.authenticate(mail, contrasena);

        if (usu != null) {
            System.out.println("Inicio de sesión exitoso para el mail: " + mail);
              
            String fotoUrl = s3Service.getObjectUrl(usu.getFotoPath());
            usu.setFotoUrl(fotoUrl);

            // Asegúrate de que sea un usuario
            if (usu instanceof Usuario) {
                // Solo permitir el acceso si es un usuario
                System.out.println("ID de usuario: " + usu.getIdUsuario()); // Agrega esta línea
                return ResponseEntity.ok(usu);
            } else {
                // Si la persona autenticada no es un estudiante, denegar el acceso
                System.out.println("Inicio de sesión denegado.");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Inicio de sesión denegado.");
            }
        } else {
            System.out.println("Falló el inicio de sesión para el mail: " + mail);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Autenticación fallida");
        }
    }

    @GetMapping("/usuario/busca_nombre")
    public List<Usuario> buscarPorNombre(@RequestParam String nombres) {
        return usuarioService.findByNombre(nombres);
    }

    @GetMapping("/usuario/busca_apellido")
    public List<Usuario> buscarPorApellido(@RequestParam String apellidos) {
        return usuarioService.findByApellido(apellidos);
    }

    @GetMapping("/usuario/busca_mail")
    public List<Usuario> buscarPorCorreo(@RequestParam String mail) {
        return usuarioService.findByMail(mail);
    }
}