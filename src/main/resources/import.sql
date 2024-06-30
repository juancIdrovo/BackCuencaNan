INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, genero, intereses, mail, nombre_usuario, nombres) VALUES ('1992-04-24 00:00:00', 1, 'Idrovo', '0104455647', '0984359326', '1234', 'Av Loja', 'foto1.jpg', 'Masculino', 'Deportes, Música', 'juancidrovo@gmail.com', 'juanc .i.', 'Juan');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, genero, intereses, mail, nombre_usuario, nombres) VALUES ('1985-05-20 00:00:00', 2, 'Perez', '0202020202', '0888888888', 'password456', 'Avenida Siempre Viva 742', 'foto2.jpg', 'Femenino', 'Lectura, Viajes', 'email2@example.com', 'usuario2', 'Maria');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, genero, intereses, mail, nombre_usuario, nombres) VALUES ('1992-09-15 00:00:00', 3, 'Lopez', '0303030303', '0777777777', 'password789', 'Calle 8', 'foto3.jpg', 'Masculino', 'Cine, Música', 'email3@example.com', 'usuario3', 'Carlos');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, genero, intereses, mail, nombre_usuario, nombres) VALUES ('1980-12-01 00:00:00', 4, 'Martinez', '0404040404', '0666666666', 'password012', 'Carrera 7', 'foto4.jpg', 'Femenino', 'Deportes, Cocina', 'email4@example.com', 'usuario4', 'Laura');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, genero, intereses, mail, nombre_usuario, nombres) VALUES ('1995-07-30 00:00:00', 5, 'Rodriguez', '0505050505', '0555555555', 'password345', 'Plaza Mayor 1', 'foto5.jpg', 'Masculino', 'Viajes, Tecnología', 'email5@example.com', 'usuario5', 'Pedro');

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


INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (1, 'Parques recreacionales', 'Parques', 'Parques');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (2, 'Puntos recreacionales para hacer deportes', 'Deportes', 'Deportes');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (3, 'Lagunas y rios', 'Cuerpos de Agua', 'Cuerpos de Agua');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (4, 'Iglesias y Catedrales en Cuenca', 'Iglesias y Catedrales', 'Iglesias y Catedrales');
INSERT INTO tipospuntosinteres (idtipospuntosinteres, descripcion, nombre, categoria) VALUES (5, 'Puntos estrategicos para observar la ciudad', 'Miradores', 'Miradores');


INSERT INTO foto (fotoid, foto) VALUES (1, 'https://practicasjohnsiguenza.s3.amazonaws.com/8fa81ac4-f1a6-4d8a-b5a1-4c5241b7a80e.jpg');
INSERT INTO foto (fotoid, foto) VALUES (2, 'foto2.jpg');
INSERT INTO foto (fotoid, foto) VALUES (3, 'foto3.jpg');
INSERT INTO foto (fotoid, foto) VALUES (4, 'foto4.jpg');
INSERT INTO foto (fotoid, foto) VALUES (5, 'foto5.jpg');


INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres) VALUES (1, 'Lupercio', '0606060606', '0987456325', 'esteban45', 'esteban@gmail.com', 'esteban12', 'Esteban');
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres) VALUES (2, 'Idrovo', '0707070707', '0945210361', 'xavier23', 'xavi@hotmail.com', 'xavi45', 'Xavier');
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres) VALUES (3, 'Abad', '0808080808', '0987412569', 'nicole69', 'nicole@hotmail.com', 'nic5', 'Nicole');
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres) VALUES (4, 'Gonzales', '0909090909', '0920014582', 'juanci1', 'juanidrovo@gmail.com', 'jsio420', 'Juan');
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres) VALUES (5, 'Gomez', '1010101010', '0987523010', 'paula0', 'pau@gmail.com', 'pauli6', 'Paula');

INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (1, 'Evento cultural relacionado con la música 1', 'Festival 1');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (2, 'Evento deportivo relacionado con carreras 2', 'Carrera 2');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (3, 'Evento tecnológico relacionado con innovaciones 3', 'Congreso 3');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (4, 'Evento gastronómico relacionado con comidas 4', 'Feria 4');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (5, 'Evento artístico relacionado con arte 5', 'Exposición 5');


INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (1, '2023-12-31', '2023-01-01', 1, 1, 'Festival de Música 1');
INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (2, '2023-12-30', '2023-01-02', 2, 2, 'Carrera 10K 2');
INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (3, '2023-12-29', '2023-01-03', 3, 3, 'Congreso de Tecnología 3');
INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre) VALUES (4, '2023-12-28', '2023-01-04', 4, 4, 'Feria de Comida 4');


INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (1, 1, 1, 1, -2.8974172, -79.0044893, 'Parque Abdón Calderón', 'Oficialmente Parque Mayor Abdón Calderón​, antiguamente conocida también como Plaza República o Plaza de Armas.');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (2, 2, 2, 2, -2.9307079, -78.9972698, 'Turi Bike Park', 'Parque extremo para bicicletas de montaña');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (3, 3, 3, 5, -2.9226683, -79.011736, 'El Columpio De Turi', 'Lugar turístico donde te puedes columpiar y ver la ciudad de Cuenca, Ecuador');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (4, 4, 4, 4, -2.90355, -79.00753, 'Iglesia del Sagrario', 'Esta iglesia se encuentra frente al parque central, mantiene el estilo barroco renacentista, siendo la estructura arquitectónica más antigua de la ciudad de Cuenca');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (5, 5, 5, 3, -2.7798513, -79.22467259999999, 'Laguna Toreadora', 'La Laguna Toreadora es una laguna ubicada en el Parque Nacional Cajas, a una altitud de aproximadamente 4.000 metros sobre el nivel del mar.');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (6, 1, 1, 1, -2.9028129, -79.03096939999999, 'Parque del Dragon Cuenca, Ecuador', 'Parque, con un dragón metálico que vota fugo por su boca!');

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