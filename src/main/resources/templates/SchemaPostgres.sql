-- -----------------------------------------------------
-- Table "conductor"
-- -----------------------------------------------------
CREATE TABLE "conductor" (
    "id" SERIAL NOT NULL,
    "identificacion" VARCHAR(11) NOT NULL,
    "apellido" VARCHAR(20),
    "nombre" VARCHAR(20) NOT NULL,
    "telefono" VARCHAR(10) NOT NULL,
    "direccion" VARCHAR(50),
    PRIMARY KEY ("id")
);

--CREATE SEQUENCE conductor_seq START 1;

-- -----------------------------------------------------
-- Table "pedido"
-- -----------------------------------------------------
CREATE TABLE "pedido" (
    "id" SERIAL NOT NULL,
    "tipo_pedido" VARCHAR(20),
    "direccion" VARCHAR(50) NOT NULL,
    "conductor_id" INTEGER NOT NULL,
    FOREIGN KEY ("conductor_id") REFERENCES "conductor"("id"),
    PRIMARY KEY ("id")
);

--CREATE SEQUENCE pedido_seq START 1;

-- -----------------------------------------------------
-- Table "vehiculo"
-- -----------------------------------------------------
CREATE TABLE "vehiculo" (
    "id" SERIAL NOT NULL,
    "modelo" VARCHAR(4) NOT NULL,
    "placa" VARCHAR(7) NOT NULL,
    "capacidad" VARCHAR(7),
    "conductor_id" INTEGER,
    FOREIGN KEY ("conductor_id") REFERENCES "conductor"("id"),
    PRIMARY KEY ("id")
);

--CREATE SEQUENCE vehiculo_seq START 1;