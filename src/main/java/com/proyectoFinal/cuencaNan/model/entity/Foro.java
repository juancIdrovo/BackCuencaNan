package com.proyectoFinal.cuencaNan.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "foro")
public class Foro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idForo;
	private Long idUsuario;
	private String respuesta;

	public Foro() {
		super();
	}

	public Foro(Long idForo, Long idUsuario, String respuesta) {
		super();
		this.idForo = idForo;
		this.idUsuario = idUsuario;
		this.respuesta = respuesta;
	}

	public Long getIdForo() {
		return idForo;
	}

	public void setIdForo(Long idForo) {
		this.idForo = idForo;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
