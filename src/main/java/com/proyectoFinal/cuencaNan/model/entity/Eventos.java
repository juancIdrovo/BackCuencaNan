package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "eventos", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_tipoEvento" }) })
public class Eventos implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_evento;
	
	@Column(nullable = false, unique = true)
	private Long id_tipoEvento;
	
	private String categoria;
	private String nombre;
	@Temporal(TemporalType.DATE)
    private Date fecha_Inicio;
    @Temporal(TemporalType.DATE)
    private Date fecha_Fin;
    
	public Long getId_evento() {
		return id_evento;
	}
	public void setId_evento(Long id_evento) {
		this.id_evento = id_evento;
	}
	public Long getId_tipoEvento() {
		return id_tipoEvento;
	}
	public void setId_tipoEvento(Long id_tipoEvento) {
		this.id_tipoEvento = id_tipoEvento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_Inicio() {
		return fecha_Inicio;
	}
	public void setFecha_Inicio(Date fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}
	public Date getFecha_Fin() {
		return fecha_Fin;
	}
	public void setFecha_Fin(Date fecha_Fin) {
		this.fecha_Fin = fecha_Fin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
}
