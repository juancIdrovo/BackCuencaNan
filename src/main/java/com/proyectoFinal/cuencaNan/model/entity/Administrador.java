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
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "administradores", uniqueConstraints = { @UniqueConstraint(columnNames = { "cedula" }) })
public class Administrador implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdministrador;
	private String cedula;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Administrador")
	private List<Eventos> listaEventos;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAdministrador")
	private List<PuntosInteres> listaPuntosInteres;
	
	public Long getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(Long idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
