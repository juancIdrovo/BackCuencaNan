package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = { "cedula" }) })

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String mail;
	private String direccion;
	private String genero;
	private Date fecha_nacimiento;
	private String nombre_usuario;
	private String contrasena;
	private String celular;
	private String foto;

	private String intereses;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsuario")
	private List<ForoUsuario> foroUsuario;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idusuario")
	private List<Usuariopuntosinteres> listaUsuarioPI;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsuario")
	private List<Comentario> listaComentarios;

	public Long getIdUsuario() {
		return id_usuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.id_usuario = idUsuario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getIntereses() {
		return intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<ForoUsuario> getForoUsuario() {
		return foroUsuario;
	}

	public void setForoUsuario(List<ForoUsuario> foroUsuario) {
		this.foroUsuario = foroUsuario;
	}

////constructores
	public Usuario(Long id_usuario, String cedula, String nombres, String apellidos, String mail, String direccion,
			String genero, Date fecha_nacimiento, String nombre_usuario, String contrasena, String celular, String foto,
			String intereses, List<ForoUsuario> foroUsuario) {
		super();
		this.id_usuario = id_usuario;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.mail = mail;
		this.direccion = direccion;
		this.genero = genero;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nombre_usuario = nombre_usuario;
		this.contrasena = contrasena;
		this.celular = celular;
		this.foto = foto;
		this.intereses = intereses;
		this.foroUsuario = foroUsuario;
	}

	public Usuario() {
		super();
	}

}
