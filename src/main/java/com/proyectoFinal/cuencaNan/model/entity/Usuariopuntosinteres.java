package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuariopuntosinteres")
public class Usuariopuntosinteres implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusuariopuntosinteres;
	private Long idusuario;
	private Long idpuntosinteres;
	private int calificacion;
	private String comentarios;

	public Long getIdusuariopuntosinteres() {
		return idusuariopuntosinteres;
	}
	public void setIdusuariopuntosinteres(Long idusuariopuntosinteres) {
		this.idusuariopuntosinteres = idusuariopuntosinteres;
	}
	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	public Long getIdpuntosinteres() {
		return idpuntosinteres;
	}
	public void setIdpuntosinteres(Long idpuntosinteres) {
		this.idpuntosinteres = idpuntosinteres;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


}
