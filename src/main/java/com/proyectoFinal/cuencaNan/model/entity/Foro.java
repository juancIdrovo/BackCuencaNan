package com.proyectoFinal.cuencaNan.model.entity;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "foro")
public class Foro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idForo;

	private Long idUsuario;
	private String respuesta;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idForo")
	private List<Comentario> listaComentarios;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idForo")
	private List<ForoUsuario> listaForoUsuario;


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
