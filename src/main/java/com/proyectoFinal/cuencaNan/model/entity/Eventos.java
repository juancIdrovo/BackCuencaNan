package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.List;

@Entity
@Table(name = "eventos")
public class Eventos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_evento;

	private Long id_tipoEvento;
	private Long id_Administrador;
	private String nombre;

	private LocalTime hora_Inicio;
	private LocalTime hora_Fin;

	@Temporal(TemporalType.DATE)
	private Date fecha_Inicio;
	@Temporal(TemporalType.DATE)
	private Date fecha_Fin;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEventoFk")
	private List<EventosPuntoInteres> listaEventosPuntosInt;

	// Getters y Setters

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalTime getHora_Inicio() {
		return hora_Inicio;
	}

	public void setHora_Inicio(LocalTime hora_Inicio) {
		this.hora_Inicio = hora_Inicio;
	}

	public LocalTime getHora_Fin() {
		return hora_Fin;
	}

	public void setHora_Fin(LocalTime hora_Fin) {
		this.hora_Fin = hora_Fin;
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

	public Long getId_Administrador() {
		return id_Administrador;
	}

	public void setId_Administrador(Long id_Administrador) {
		this.id_Administrador = id_Administrador;
	}
}

