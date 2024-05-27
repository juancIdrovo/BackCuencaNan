package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipospuntosinteres")
public class Tipospuntosinteres implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtipospuntosinteres;
	private String nombre;
	private String descripcion;
	public Long getIdtipospuntosinteres() {
		return idtipospuntosinteres;
	}
	public void setIdtipospuntosinteres(Long idtipospuntosinteres) {
		this.idtipospuntosinteres = idtipospuntosinteres;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
