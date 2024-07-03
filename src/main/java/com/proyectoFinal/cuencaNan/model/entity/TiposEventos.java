package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;
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

@Entity
@Table(name ="tipo_eventos")
public class TiposEventos implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_tipoEvento;
	private String nombre_tipoEvento;
	private String descripcion;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_tipoEvento")
	private List<Eventos> eventos;

	public Long getId_tipoEvento() {
		return id_tipoEvento;
	}

	public void setId_tipoEvento(Long id_tipoEvento) {
		this.id_tipoEvento = id_tipoEvento;
	}

	public String getNombre_tipoEvento() {
		return nombre_tipoEvento;
	}

	public void setNombre_tipoEvento(String nombre_tipoEvento) {
		this.nombre_tipoEvento = nombre_tipoEvento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
