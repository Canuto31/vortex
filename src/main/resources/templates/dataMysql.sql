-- Insertar datos en la tabla "conductor"
INSERT INTO conductor (id, identificacion, apellido, nombre, telefono, direccion) VALUES
                                                                                      (1, 1000000, 'Moya', 'Juan', '123456789', 'Cll25#72-13'),
                                                                                      (2, 1000001, 'Tovar', 'Carlos', '987654321', 'Cll52#13-72'),
                                                                                      (3, 1000002, 'Moya', 'Andres', '173548592', 'Cll63#16-63'),
                                                                                      (4, 1000003, 'Tovar', 'Camilo', '135792468', 'Cll72#62-12');

-- Insertar datos en la tabla "pedido"
INSERT INTO pedido (id, tipo_pedido, direccion, conductor_id) VALUES
                                                                  (1, 'Libro de fantasia', 'Cll12#34-56', 1),
                                                                  (2, 'Videojuego', 'Cll98#76-54', 2);

-- Insertar datos en la tabla "vehiculo"
INSERT INTO vehiculo (id, modelo, placa, capacidad, conductor_id) VALUES
                                                                      (1, 'ABCD', 'ABC-123', '500', 1),
                                                                      (2, 'EFGH', 'DEF-456', '1000', 2);
