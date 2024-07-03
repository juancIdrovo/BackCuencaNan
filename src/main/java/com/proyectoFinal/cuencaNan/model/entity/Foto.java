package com.proyectoFinal.cuencaNan.model.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "foto")
public class Foto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fotoid;
	private String foto;


	public Long getFotoid() {
		return fotoid;
	}
	public void setFotoid(Long fotoid) {
		this.fotoid = fotoid;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}


}
