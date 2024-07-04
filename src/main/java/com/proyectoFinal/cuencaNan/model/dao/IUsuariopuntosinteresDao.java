package com.proyectoFinal.cuencaNan.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.proyectoFinal.cuencaNan.model.entity.Usuariopuntosinteres;

public interface IUsuariopuntosinteresDao extends CrudRepository<Usuariopuntosinteres, Long> {

    @Query("SELECT AVG(u.calificacion) FROM Usuariopuntosinteres u WHERE u.idpuntosinteres = :idpuntosinteres")
    Double findAverageCalificacionByPuntoInteres(@Param("idpuntosinteres") Long idpuntosinteres);
    
    @Query("SELECT u FROM Usuariopuntosinteres u WHERE u.idusuario = :idusuario AND u.idpuntosinteres = :idpuntosinteres")
    Usuariopuntosinteres findByUserAndPuntoInteres(@Param("idusuario") Long idusuario, @Param("idpuntosinteres") Long idpuntosinteres);
    
}

