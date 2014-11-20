DROP TABLE IF EXISTS cliente CASCADE;
DROP TABLE IF EXISTS producto CASCADE;
DROP TABLE IF EXISTS fecha CASCADE;
DROP TABLE IF EXISTS geografia CASCADE;
DROP TABLE IF EXISTS tienda CASCADE;
DROP TABLE IF EXISTS ventas CASCADE;

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
  anyo INTEGER
);

CREATE TABLE geografia(
  id_geografia INTEGER PRIMARY KEY NOT NULL,
  provincia VARCHAR(50),
  municipio VARCHAR(50)
);

CREATE TABLE tienda(
  id_tienda INTEGER PRIMARY KEY NOT NULL,
  nombre VARCHAR(50)
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
  geografia_id INTEGER,
  tienda_id INTEGER,
  FOREIGN KEY(producto_id) REFERENCES producto(id_producto),
  FOREIGN KEY(cliente_id) REFERENCES cliente(id_cliente),
  FOREIGN KEY(fecha_id) REFERENCES fecha(id_fecha),
  FOREIGN KEY(geografia_id) REFERENCES geografia(id_geografia),
  FOREIGN KEY(tienda_id) REFERENCES tienda(id_tienda)
);

