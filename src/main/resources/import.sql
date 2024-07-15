INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, mail, nombre_usuario, nombres) VALUES ('1992-04-24 00:00:00', 1, 'Idrovo', '0104455647', '0984359326', 'Giantreign424$', 'Av Loja', '081dc47d-2dc2-4b9f-9a0c-4d8b54177e38.jpg',  'juancidrovo@gmail.com', 'juanc .i.', 'Juan');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, mail, nombre_usuario, nombres) VALUES ('1985-05-20 00:00:00', 2, 'Perez', '0202020202', '0888888888', 'password456', 'Avenida Siempre Viva 742', 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/000c5f04-ef87-4b14-a2cf-328625f7e741.jpg', 'email2@example.com', 'usuario2', 'Maria');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, mail, nombre_usuario, nombres) VALUES ('1992-09-15 00:00:00', 3, 'Lopez', '0303030303', '0777777777', 'password789', 'Calle 8', 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/0e6fe673-bfa1-4a87-9ad1-2840225b7ce3.jpg','email3@example.com', 'usuario3', 'Carlos');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, mail, nombre_usuario, nombres) VALUES ('1980-12-01 00:00:00', 4, 'Martinez', '0404040404', '0666666666', 'password012', 'Carrera 7', 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/081dc47d-2dc2-4b9f-9a0c-4d8b54177e38.jpg', 'email4@example.com', 'usuario4', 'Laura');
INSERT INTO usuarios (fecha_nacimiento, id_usuario, apellidos, cedula, celular, contrasena, direccion, foto_path, mail, nombre_usuario, nombres) VALUES ('1995-07-30 00:00:00', 5, 'Rodriguez', '0505050505', '0555555555', 'password345', 'Plaza Mayor 1', "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/d4cce848-116b-4651-b5e9-6c07185652ae.jpg", 'Viajes, Tecnología', 'usuario5', 'Pedro');

INSERT INTO foro (id_foro, id_usuario, respuesta, titulo, id_foto) VALUES (1, 1, 'Esta es una respuesta de ejemplo 1.', 'Ejemplo 1.', 1);
INSERT INTO foro (id_foro, id_usuario, respuesta, titulo, id_foto) VALUES (2, 2, 'Esta es una respuesta de ejemplo 2.', 'Ejemplo 2.', 2);
INSERT INTO foro (id_foro, id_usuario, respuesta, titulo, id_foto) VALUES (3, 3, 'Esta es una respuesta de ejemplo 3.', 'Ejemplo 3.', 3);
INSERT INTO foro (id_foro, id_usuario, respuesta, titulo, id_foto) VALUES (4, 4, 'Esta es una respuesta de ejemplo 4.', 'Ejemplo 4.', 4);
INSERT INTO foro (id_foro, id_usuario, respuesta, titulo, id_foto) VALUES (5, 5, 'Esta es una respuesta de ejemplo 5.', 'Ejemplo 5.', 5);


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


INSERT INTO foto (fotoid, foto) VALUES (1, 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/Screenshot+2024-04-14+145519.png');
INSERT INTO foto (fotoid, foto) VALUES (2, 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/341b08a9-1710-4c06-bc16-26a6c6493fe8.jpg');
INSERT INTO foto (fotoid, foto) VALUES (3, 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/ccbc460f-7ab7-4309-ace7-ec57da79d987.jpg');
INSERT INTO foto (fotoid, foto) VALUES (4, 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/a0a27fdd-bf83-4eda-8cbd-20e273383eca.jpg');
INSERT INTO foto (fotoid, foto) VALUES (5, 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/e91b825e-41c3-4796-88f0-9780b392e6fb.jpg');
INSERT INTO foto (fotoid, foto) VALUES (6, 'https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/paqDragon.jpg');


INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres, url_imagen) VALUES (1, 'Lupercio', '0606060606', '0987456325', 'esteban45', 'esteban@gmail.com', 'esteban12', 'Esteban', "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/Screenshot+2024-04-14+145519.png");
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres, url_imagen) VALUES (2, 'Idrovo', '0707070707', '0945210361', 'xavier23', 'xavi@hotmail.com', 'xavi45', 'Xavier', "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/000c5f04-ef87-4b14-a2cf-328625f7e741.jpg");
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres, url_imagen) VALUES (3, 'Abad', '0808080808', '0987412569', 'nicole69', 'nicole@hotmail.com', 'nic5', 'Nicole', "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/05528d47-dec1-4899-90d2-c3ff3429cdab.png");
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres, url_imagen) VALUES (4, 'Gonzales', '0909090909', '0920014582', 'juanci1', 'juanidrovo@gmail.com', 'jsio420', 'Juan', "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/47f4f717-476e-4867-9a3a-2f0050953046.jpg");
INSERT INTO administradores (id_administrador, apellidos, cedula, celular, contrasenia, email, nombre_usuario, nombres, url_imagen) VALUES (5, 'Gomez', '1010101010', '0987523010', 'paula0', 'pau@gmail.com', 'pauli6', 'Paula', "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/d4cce848-116b-4651-b5e9-6c07185652ae.jpg");

INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (1, 'Evento cultural relacionado con la música 1', 'Festival 1');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (2, 'Evento deportivo relacionado con carreras 2', 'Carrera 2');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (3, 'Evento tecnológico relacionado con innovaciones 3', 'Congreso 3');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (4, 'Evento gastronómico relacionado con comidas 4', 'Feria 4');
INSERT INTO tipo_eventos (id_tipo_evento, descripcion, nombre_tipo_evento) VALUES (5, 'Evento artístico relacionado con arte 5', 'Exposición 5');


INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre, hora_inicio, hora_fin) VALUES (1, '2023-12-31', '2023-01-01', 1, 1, 'Festival de Música 1', '10:00:00', '22:00:00');
INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre, hora_inicio, hora_fin) VALUES (2, '2023-12-30', '2023-01-02', 2, 2, 'Carrera 10K 2', '08:00:00', '12:00:00');
INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre, hora_inicio, hora_fin) VALUES (3, '2023-12-29', '2023-01-03', 3, 3, 'Congreso de Tecnología 3', '09:00:00', '17:00:00');
INSERT INTO eventos (id_evento, fecha_fin, fecha_inicio, id_administrador, id_tipo_evento, nombre, hora_inicio, hora_fin) VALUES (4, '2023-12-28', '2023-01-04', 4, 4, 'Feria de Comida 4', '11:00:00', '20:00:00');



INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (1, 1, 1, 1, -2.8974172, -79.0044893, 'Parque Abdón Calderón', 'Oficialmente Parque Mayor Abdón Calderón​, antiguamente conocida también como Plaza República o Plaza de Armas.');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (2, 2, "https://practicasjohnsiguenza.s3.us-east-2.amazonaws.com/d4cce848-116b-4651-b5e9-6c07185652ae.jpg", 2, -2.9307079, -78.9972698, 'Turi Bike Park', 'Parque extremo para bicicletas de montaña');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (3, 3, 3, 5, -2.9226683, -79.011736, 'El Columpio De Turi', 'Lugar turístico donde te puedes columpiar y ver la ciudad de Cuenca, Ecuador');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (4, 4, 4, 4, -2.90355, -79.00753, 'Iglesia del Sagrario', 'Esta iglesia se encuentra frente al parque central, mantiene el estilo barroco renacentista, siendo la estructura arquitectónica más antigua de la ciudad de Cuenca');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (5, 5, 5, 3, -2.7798513, -79.22467259999999, 'Laguna Toreadora', 'La Laguna Toreadora es una laguna ubicada en el Parque Nacional Cajas, a una altitud de aproximadamente 4.000 metros sobre el nivel del mar.');
INSERT INTO puntointeres (id, id_administrador, id_foto, id_tipo_punto_interes, latitud, longitud, nombre, descripcion) VALUES (6, 1, 6, 1, -2.9028129, -79.03096939999999, 'Parque del Dragon Cuenca, Ecuador', 'Parque, con un dragón metálico que vota fugo por su boca!');

INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (1, 1, 1);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (2, 2, 2);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (3, 3, 3);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (4, 4, 4);
INSERT INTO eventospuntointeres (id, id_evento_fk, id_puntoifk) VALUES (5, 5, 5);


INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (1, 5, 'Excelente lugar para visitar 1.', 1, 1);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (2, 4, 'Muy buen lugar 2.', 1, 2);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (3, 3, 'Lugar regular 3.', 1, 3);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (4, 2, 'No me gustó mucho 4.', 4, 4);
INSERT INTO usuariopuntosinteres (idusuariopuntosinteres, calificacion, comentarios, idpuntosinteres, idusuario) VALUES (5, 1, 'No recomiendo visitar 5.', 5, 5);