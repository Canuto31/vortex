-- -----------------------------------------------------
-- Table "CONDUCTOR"
-- -----------------------------------------------------
CREATE TABLE "CONDUCTOR" (
    "id" INTEGER NOT NULL,
    "identificacion" VARCHAR(11) NOT NULL,
    "apellido" VARCHAR(20),
    "nombre" VARCHAR(20) NOT NULL,
    "telefono" VARCHAR(10) NOT NULL,
    "direccion" VARCHAR(50),
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "PEDIDO"
-- -----------------------------------------------------
CREATE TABLE "PEDIDO" (
    "id" INTEGER NOT NULL,
    "tipo_pedido" VARCHAR(20),
    "direccion" VARCHAR(50) NOT NULL,
    "conductor_id" INTEGER NOT NULL,
    FOREIGN KEY ("conductor_id") REFERENCES "CONDUCTOR"("id"),
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "VEHICULO"
-- -----------------------------------------------------
CREATE TABLE "VEHICULO" (
    "id" INTEGER NOT NULL,
    "modelo" VARCHAR(4) NOT NULL,
    "placa" VARCHAR(7) NOT NULL,
    "capacidad" VARCHAR(7),
    "conductor_id" INTEGER,
    FOREIGN KEY ("conductor_id") REFERENCES "CONDUCTOR"("id"),
    PRIMARY KEY ("id")
);