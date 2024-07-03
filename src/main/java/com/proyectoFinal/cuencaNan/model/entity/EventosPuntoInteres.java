package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventospuntointeres")
public class EventosPuntoInteres implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idEventoFk;
	private Long idPuntoIFk;

	public Long getIdEventopi() {
		return id;
	}

	public void setIdEventopi(Long id) {
		this.id = id;
	}

	public Long getIdEventoFk() {
		return idEventoFk;
	}

	public void setIdEventoFk(Long idEventoFk) {
		this.idEventoFk = idEventoFk;
	}

	public Long getIdPuntoIFk() {
		return idPuntoIFk;
	}

	public void setIdPuntoIFk(Long idPuntoIFk) {
		this.idPuntoIFk = idPuntoIFk;
	}

}
