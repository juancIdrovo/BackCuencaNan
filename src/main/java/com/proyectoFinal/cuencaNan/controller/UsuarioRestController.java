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

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService usuarioservice;

	@Autowired
	private S3Service s3Service;

	// listar_todas_los_usuarios
	@GetMapping("/usuarios")
	public List<Usuario> indext() {
		return usuarioservice.findAll().stream().peek(usuario -> {
			usuario.setFotoUrl(s3Service.getObjectUrl(usuario.getFotoPath()));
		}).collect(Collectors.toList());
	}

	// buscar_un usuario_por_id
	@GetMapping("/usuarios/{id_usuario}")
	public Usuario show(@PathVariable Long id_usuario) {
		return usuarioservice.findById(id_usuario);
	}

	// guardar_un_usuario
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		usuarioservice.save(usuario);
		usuario.setFotoUrl(s3Service.getObjectUrl(usuario.getFotoPath()));
		return usuario;
	}

	// editar_un_usuario
	@PutMapping("/usuarios/{id_usuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id_usuario) {
		Usuario usuarioActual = usuarioservice.findById(id_usuario);
		usuarioActual.setApellidos(usuario.getApellidos());
		return usuarioservice.save(usuarioActual);
	}

	// eliminar_un_usuario
	@DeleteMapping("/usuarios/{id_usuario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioservice.delete(id);
	}

	// Login solo para usuario

	@PostMapping("/usuarios/loginusuario")
	public ResponseEntity<?> logginUsuario(@RequestBody Map<String, String> credentials) {
		String mail = credentials.get("mail");
		String contrasena = credentials.get("contrasena");

		System.out.println("Intento de inicio de sesión para el mail: " + mail);

		Usuario usu = usuarioservice.authenticate(mail, contrasena);

		if (usu != null) {
			System.out.println("Inicio de sesión exitoso para el mail: " + mail);

			// Asegúrate de que sea un usuario
			if (usu instanceof Usuario) {
				// Solo permitir el acceso si es un usuario
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

/////////// Buscadores x nombre apellido y mail///////////////////////
	@GetMapping("/usuario/busca_nombre")
	public List<Usuario> buscarPorNombre(@RequestParam String nombres) {
		return usuarioservice.findByNombre(nombres);
	}

	@GetMapping("/usuario/busca_apellido")
	public List<Usuario> buscarPorApellido(@RequestParam String apellidos) {
		return usuarioservice.findByApellido(apellidos);
	}

	@GetMapping("/usuario/busca_mail")
	public List<Usuario> buscarPorCorreo(@RequestParam String mail) {
		return usuarioservice.findByMail(mail);
	}

}
