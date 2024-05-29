package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "puntointeres")
public class PuntosInteres implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idAdministrador;
	private Long idTipoPuntoInteres;
	private Long idFoto;
	private String nombre;
	private double latitud;
	private double longitud;

	public Long getIdPuntoInteres() {
		return id;
	}

	public void setIdPuntoInteres(Long id) {
		this.id = id;
	}

	public Long getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(Long idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public Long getIdTipoPuntoInteres() {
		return idTipoPuntoInteres;
	}

	public void setIdTipoPuntoInteres(Long idTipoPuntoInteres) {
		this.idTipoPuntoInteres = idTipoPuntoInteres;
	}

	public Long getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(Long idFoto) {
		this.idFoto = idFoto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}
