package com.proyectoFinal.cuencaNan.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.proyectoFinal.cuencaNan.model.entity.Tipospuntosinteres;


public interface ITipospuntosinteresDao extends CrudRepository<Tipospuntosinteres,Long> {
	
	// Buscar por nombre
    List<Tipospuntosinteres> findByNombreContaining(String nombre);

    // Buscar por descripción
    List<Tipospuntosinteres> findByDescripcionContaining(String descripcion);

    // Buscar por categoría
    List<Tipospuntosinteres> findByCategoriaContaining(String categoria);

    // Método personalizado para buscar por múltiples criterios
    @Query("SELECT t FROM Tipospuntosinteres t WHERE " +
           "(:nombre IS NULL OR t.nombre LIKE %:nombre%) AND " +
           "(:descripcion IS NULL OR t.descripcion LIKE %:descripcion%) AND " +
           "(:categoria IS NULL OR t.categoria LIKE %:categoria%)")
    List<Tipospuntosinteres> buscarPorCriterios(@Param("nombre") String nombre,
                                               @Param("descripcion") String descripcion,
                                               @Param("categoria") String categoria);

}
