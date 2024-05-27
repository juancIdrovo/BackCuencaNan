package com.proyectoFinal.cuencaNan.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "forousuario", uniqueConstraints = { @UniqueConstraint(columnNames = { "idUsuario", "idForo"}) })
public class ForoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idForoUsuario;
	public Long getIdForoUsuario() {
		return idForoUsuario;
	}
	public void setIdForoUsuario(Long idForoUsuario) {
		this.idForoUsuario = idForoUsuario;
	}
	
}
