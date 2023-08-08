-- -----------------------------------------------------
-- Table "conductor"
-- -----------------------------------------------------
INSERT INTO "conductor" VALUES (1, 1000000, 'Moya', 'Juan', '123456789', 'Cll25#72-13');
INSERT INTO "conductor" VALUES (2, 1000001, 'Tovar', 'Carlos', '987654321', 'Cll52#13-72');
INSERT INTO "conductor" VALUES (3, 1000002, 'Moya', 'Andres', '173548592', 'Cll63#16-63');
INSERT INTO "conductor" VALUES (4, 1000003, 'Tovar', 'Camilo', '135792468', 'Cll72#62-12');
SELECT setval('conductor_id_seq', (SELECT MAX(id) FROM conductor));

-- -----------------------------------------------------
-- Table "pedido"
-- -----------------------------------------------------
INSERT INTO "pedido" VALUES (1, 'Libro de fantasia','Cll12#34-56', 1);
INSERT INTO "pedido" VALUES (2, 'Videojuego','Cll98#76-54', 2);
SELECT setval('pedido_id_seq', (SELECT MAX(id) FROM pedido));

-- -----------------------------------------------------
-- Table "vehiculo"
-- -----------------------------------------------------
INSERT INTO "vehiculo" VALUES(1, 'ABCD', 'ABC-123','500',1);
INSERT INTO "vehiculo" VALUES(2, 'EFGH', 'DEF-456','1000',2);
SELECT setval('vehiculo_id_seq', (SELECT MAX(id) FROM vehiculo));