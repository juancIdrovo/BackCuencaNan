package com.proyectoFinal.cuencaNan.model.service;

import java.util.List;

import com.proyectoFinal.cuencaNan.model.entity.Usuariopuntosinteres;

public interface IUsuariopuntosinteresService {

    List<Usuariopuntosinteres> findAll();

    Usuariopuntosinteres save(Usuariopuntosinteres idusuariopuntosinteres);

    Usuariopuntosinteres findById(Long idusuariopuntosinteres);

    void delete(Long idusuariopuntosinteres);

    Double findAverageCalificacionByPuntoInteres(Long idpuntosinteres);

    Usuariopuntosinteres findByUserAndPuntoInteres(Long idusuario, Long idpuntosinteres); // Nuevo método
}