package com.proyectoFinal.cuencaNan.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComentario;
	private Long idUsuario;
	private Long idForo;
	private String comentario;

	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdForo() {
		return idForo;
	}

	public void setIdForo(Long idForo) {
		this.idForo = idForo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Comentario() {
		super();
	}

	public Comentario(Long idComentario, Long idUsuario, Long idForo, String comentario) {
		this.idComentario = idComentario;
		this.idUsuario = idUsuario;
		this.idForo = idForo;
		this.comentario = comentario;
	}

}
