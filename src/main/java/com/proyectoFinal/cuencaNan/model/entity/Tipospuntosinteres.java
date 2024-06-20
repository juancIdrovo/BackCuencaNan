package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;
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
@Table(name = "tipospuntosinteres")
public class Tipospuntosinteres implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtipospuntosinteres;
	private String nombre;
	private String descripcion;
	private String categoria;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoPuntoInteres")
	private List<PuntosInteres> listaPuntosInteres;

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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<PuntosInteres> getListaPuntosInteres() {
		return listaPuntosInteres;
	}

	public void setListaPuntosInteres(List<PuntosInteres> listaPuntosInteres) {
		this.listaPuntosInteres = listaPuntosInteres;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
