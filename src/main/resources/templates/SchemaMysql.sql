-- Table "conductor"
CREATE TABLE conductor (
                           id INT AUTO_INCREMENT NOT NULL,
                           identificacion VARCHAR(11) NOT NULL,
                           apellido VARCHAR(20),
                           nombre VARCHAR(20) NOT NULL,
                           telefono VARCHAR(10) NOT NULL,
                           direccion VARCHAR(50),
                           PRIMARY KEY (id)
);

-- Table "pedido"
CREATE TABLE pedido (
                        id INT AUTO_INCREMENT NOT NULL,
                        tipo_pedido VARCHAR(20),
                        direccion VARCHAR(50) NOT NULL,
                        conductor_id INT NOT NULL,
                        FOREIGN KEY (conductor_id) REFERENCES conductor(id),
                        PRIMARY KEY (id)
);

-- Table "vehiculo"
CREATE TABLE vehiculo (
                          id INT AUTO_INCREMENT NOT NULL,
                          modelo VARCHAR(4) NOT NULL,
                          placa VARCHAR(7) NOT NULL,
                          capacidad VARCHAR(7),
                          conductor_id INT,
                          FOREIGN KEY (conductor_id) REFERENCES conductor(id),
                          PRIMARY KEY (id)
);
