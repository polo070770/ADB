﻿DROP TABLE IF EXISTS cliente CASCADE;
DROP TABLE IF EXISTS producto CASCADE;
DROP TABLE IF EXISTS ventas CASCADE;
DROP TABLE IF EXISTS fecha CASCADE;

CREATE TABLE cliente(
  id_cliente INTEGER PRIMARY KEY NOT NULL,
  nombre VARCHAR(50),
  apellidos VARCHAR(50),
  edad INTEGER
);

CREATE TABLE producto(
  id_producto INTEGER PRIMARY KEY NOT NULL,
  nombre VARCHAR(50),
  marca VARCHAR(20)
);

CREATE TABLE fecha(
  id_fecha INTEGER PRIMARY KEY NOT NULL,
  dia INTEGER,
  mes INTEGER,
  ano INTEGER
);

CREATE TABLE ventas(
  id_ventas INTEGER PRIMARY KEY NOT NULL,
  num_ventas INTEGER,
  num_devoluciones INTEGER,
  importe REAL,
  impuestos REAL,
  coste_venta REAL,
  
  producto_id INTEGER,
  cliente_id INTEGER,
  fecha_id INTEGER,
  FOREIGN KEY(producto_id) REFERENCES producto(id_producto),
  FOREIGN KEY(cliente_id) REFERENCES cliente(id_cliente),
  FOREIGN KEY(fecha_id) REFERENCES fecha(id_fecha)
);

