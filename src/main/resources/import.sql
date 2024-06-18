INSERT INTO usuarios (id_usuario, apellidos, cedula, celular, contrasena, direccion, fecha_nacimiento, foto, genero, intereses, mail, nombre_usuario, nombres) VALUES (1, 'Gomez', '0101010101', '0999999999', 'password123', 'Calle Falsa 123', '1990-01-01 00:00:00', 'foto1.jpg', 'M', 'Deportes, Música', 'email1@example.com', 'usuario1', 'Juan');
INSERT INTO usuarios (id_usuario, apellidos, cedula, celular, contrasena, direccion, fecha_nacimiento, foto, genero, intereses, mail, nombre_usuario, nombres) VALUES (2, 'Perez', '0202020202', '0888888888', 'password456', 'Avenida Siempre Viva 742', '1985-05-20 00:00:00', 'foto2.jpg', 'F', 'Lectura, Viajes', 'email2@example.com', 'usuario2', 'Maria');
INSERT INTO usuarios (id_usuario, apellidos, cedula, celular, contrasena, direccion, fecha_nacimiento, foto, genero, intereses, mail, nombre_usuario, nombres) VALUES (3, 'Lopez', '0303030303', '0777777777', 'password789', 'Calle 8', '1992-09-15 00:00:00', 'foto3.jpg', 'M', 'Cine, Música', 'email3@example.com', 'usuario3', 'Carlos');
INSERT INTO usuarios (id_usuario, apellidos, cedula, celular, contrasena, direccion, fecha_nacimiento, foto, genero, intereses, mail, nombre_usuario, nombres) VALUES (4, 'Martinez', '0404040404', '0666666666', 'password012', 'Carrera 7', '1980-12-01 00:00:00', 'foto4.jpg', 'F', 'Deportes, Cocina', 'email4@example.com', 'usuario4', 'Laura');
INSERT INTO usuarios (id_usuario, apellidos, cedula, celular, contrasena, direccion, fecha_nacimiento, foto, genero, intereses, mail, nombre_usuario, nombres) VALUES (5, 'Rodriguez', '0505050505', '0555555555', 'password345', 'Plaza Mayor 1', '1995-07-30 00:00:00', 'foto5.jpg', 'M', 'Viajes, Tecnología', 'email5@example.com', 'usuario5', 'Pedro');


INSERT INTO foro (id_foro, id_usuario, respuesta) VALUES (1, 1, 'Esta es una respuesta de ejemplo 1.');
INSERT INTO foro (id_foro, id_usuario, respuesta) VALUES (2, 2, 'Esta es una respuesta de ejemplo 2.');
INSERT INTO foro (id_foro, id_usuario, respuesta) VALUES (3, 3, 'Esta es una respuesta de ejemplo 3.');
INSERT INTO foro (id_foro, id_usuario, respuesta) VALUES (4, 4, 'Esta es una respuesta de ejemplo 4.');
INSERT INTO foro (id_foro, id_usuario, respuesta) VALUES (5, 5, 'Esta es una respuesta de ejemplo 5.');


INSERT INTO forousuarios (id_foro_usuario, id_foro, id_usuario) VALUES (1, 1, 1);
INSERT INTO forousuarios (id_foro_usuario, id_foro, id_usuario) VALUES (2, 2, 2);
INSERT INTO forousuarios (id_foro_usuario, id_foro, id_usuario) VALUES (3, 3, 3);
INSERT INTO forousuarios (id_foro_usuario, id_foro, id_usuario) VALUES (4, 4, 4);
INSERT INTO forousuarios (id_foro_usuario, id_foro, id_usuario) VALUES (5, 5, 5);


INSERT INTO comentarios (id_comentario, comentario, id_foro, id_usuario) VALUES (1, 'Este es un comentario de ejemplo 1.', 1, 1);
INSERT INTO comentarios (id_comentario, comentario, id_foro, id_usuario) VALUES (2, 'Este es un comentario de ejemplo 2.', 2, 2);
INSERT INTO comentarios (id_comentario, comentario, id_foro, id_usuario) VALUES (3, 'Este es un comentario de ejemplo 3.', 3, 3);
INSERT INTO comentarios (id_comentario, comentario, id_foro, id_usuario) VALUES (4, 'Este es un comentario de ejemplo 4.', 4, 4);
INSERT INTO comentarios (id_comentario, comentario, id_foro, id_usuario) VALUES (5, 'Este es un comentario de ejemplo 5.', 5, 5);


INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (1, 'Parque en el centro de la ciudad 1', 'Parque Central 1', 'Recreación 1');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (2, 'Parque en el centro de la ciudad 2', 'Parque Central 2', 'Recreación 2');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (3, 'Parque en el centro de la ciudad 3', 'Parque Central 3', 'Recreación 3');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (4, 'Parque en el centro de la ciudad 4', 'Parque Central 4', 'Recreación 4');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (5, 'Parque en el centro de la ciudad 5', 'Parque Central 5', 'Recreación 5');


INSERT INTO foto (fotoid, foto) VALUES (1, 'foto1.jpg');
INSERT INTO foto (fotoid, foto) VALUES (2, 'foto2.jpg');
INSERT INTO foto (fotoid, foto) VALUES (3, 'foto3.jpg');
INSERT INTO foto (fotoid, foto) VALUES (4, 'foto4.jpg');
INSERT INTO foto (fotoid, foto) VALUES (5, 'foto5.jpg');


INSERT INTO administradores (id_administrador, cedula) VALUES (1, '0606060606');
INSERT INTO administradores (id_administrador, cedula) VALUES (2, '0707070707');
INSERT INTO administradores (id_administrador, cedula) VALUES (3, '0808080808');
INSERT INTO administradores (id_administrador, cedula) VALUES (4, '0909090909');
INSERT INTO administradores (id_administrador, cedula) VALUES (5, '1010101010');


INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (1, 'Evento cultural relacionado con la música 1', 'Festival 1');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (2, 'Evento deportivo relacionado con carreras 2', 'Carrera 2');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (3, 'Evento tecnológico relacionado con innovaciones 3', 'Congreso 3');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (4, 'Evento gastronómico relacionado con comidas 4', 'Feria 4');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (5, 'Evento artístico relacionado con arte 5', 'Exposición 5');


INSERT INTO eventos (id_evento, categoria, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (1, 'Cultural', '2023-12-31', '2023-01-01', 1, 1, 'Festival de Música 1');
INSERT INTO eventos (id_evento, categoria, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (2, 'Deportivo', '2023-12-30', '2023-01-02', 2, 2, 'Carrera 10K 2');
INSERT INTO eventos (id_evento, categoria, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (3, 'Tecnológico', '2023-12-29', '2023-01-03', 3, 3, 'Congreso de Tecnología 3');
INSERT INTO eventos (id_evento, categoria, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (4, 'Gastronómico', '2023-12-28', '2023-01-04', 4, 4, 'Feria de Comida 4');


INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre) VALUES (1, 1, 1, 1, -2.90055, -79.00453, 'Parque Central 1');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre) VALUES (2, 2, 2, 2, -2.90155, -79.00553, 'Parque Central 2');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre) VALUES (3, 3, 3, 3, -2.90255, -79.00653, 'Parque Central 3');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre) VALUES (4, 4, 4, 4, -2.90355, -79.00753, 'Parque Central 4');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre) VALUES (5, 5, 5, 5, -2.90455, -79.00853, 'Parque Central 5');


INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (1, 1, 1);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (2, 2, 2);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (3, 3, 3);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (4, 4, 4);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (5, 5, 5);


INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (1, 5, 'Excelente lugar para visitar 1.', 1, 1);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (2, 4, 'Muy buen lugar 2.', 2, 2);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (3, 3, 'Lugar regular 3.', 3, 3);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (4, 2, 'No me gustó mucho 4.', 4, 4);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (5, 1, 'No recomiendo visitar 5.', 5, 5);