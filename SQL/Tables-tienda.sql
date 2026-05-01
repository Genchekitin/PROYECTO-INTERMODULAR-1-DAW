-- =====================
-- CREACIÓN DE TABLAS
-- =====================

CREATE TABLE categoria (
  Id_categoria INT NOT NULL AUTO_INCREMENT,
  plataforma VARCHAR(60),
  genero VARCHAR(60),
  PRIMARY KEY (Id_categoria)
);

CREATE TABLE cliente (
  Id_cliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(80) NOT NULL,
  apellidos VARCHAR(100) NOT NULL,
  direccion VARCHAR(200) NOT NULL,
  dni CHAR(9) NOT NULL UNIQUE,
  telefono VARCHAR(15),
  email VARCHAR(100) UNIQUE,
  PRIMARY KEY (Id_cliente)
);

CREATE TABLE producto (
  Id_producto INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(60) NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  stock INT NOT NULL,
  Id_categoria INT NOT NULL,
  PRIMARY KEY (Id_producto),
  FOREIGN KEY (Id_categoria) REFERENCES categoria(Id_categoria)
);

CREATE TABLE pedido (
  Id_pedido INT NOT NULL AUTO_INCREMENT,
  fecha DATE NOT NULL,
  metodo_pago VARCHAR(50) NOT NULL,
  Id_cliente INT NOT NULL,
  total DECIMAL(10,2),
  PRIMARY KEY (Id_pedido),
  FOREIGN KEY (Id_cliente) REFERENCES cliente(Id_cliente)
);

CREATE TABLE detalles_pedido (
  Id_detalles INT NOT NULL AUTO_INCREMENT,
  cantidad INT NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  Id_producto INT NOT NULL,
  Id_pedido INT NOT NULL,
  PRIMARY KEY (Id_detalles),
  FOREIGN KEY (Id_producto) REFERENCES producto(Id_producto),
  FOREIGN KEY (Id_pedido) REFERENCES pedido(Id_pedido)
);

CREATE TABLE envio (
  Id_envio INT NOT NULL AUTO_INCREMENT,
  direccion VARCHAR(200) NOT NULL,
  fecha_envio DATE NOT NULL,
  estado VARCHAR(50) NOT NULL,
  Id_pedido INT NOT NULL,
  PRIMARY KEY (Id_envio),
  FOREIGN KEY (Id_pedido) REFERENCES pedido(Id_pedido)
);