DROP TABLE IF EXISTS cliente CASCADE;
DROP TABLE IF EXISTS producto CASCADE;
DROP TABLE IF EXISTS fecha CASCADE;
DROP TABLE IF EXISTS geografia CASCADE;
DROP TABLE IF EXISTS tienda CASCADE;
DROP TABLE IF EXISTS ventas CASCADE;

CREATE TABLE cliente(
  id_cliente INTEGER NOT NULL,

  id_edad INTEGER NOT NULL,
  desc_edad INTEGER,

  id_nombre INTEGER NOT NULL,
  desc_nombre VARCHAR(50),

  apellidos VARCHAR(50),

  PRIMARY KEY (id_cliente)
);

CREATE TABLE producto(
  id_producto INTEGER NOT NULL,
  
  id_marca INTEGER NOT NULL,
  desc_marca VARCHAR(50),

  id_nombre INTEGER NOT NULL,
  desc_nombre VARCHAR(50),

  PRIMARY KEY(id_producto)

);

CREATE TABLE fecha(
  id_fecha INTEGER NOT NULL,
  
  id_dia INTEGER NOT NULL,
  desc_dia VARCHAR(20),
  
  id_mes INTEGER NOT NULL,
  desc_mes VARCHAR(20),
  
  id_anyo INTEGER NOT NULL,
  desc_anyo VARCHAR(20),
  
  PRIMARY KEY(id_fecha)
);

CREATE TABLE geografia(
  id_geografia INTEGER NOT NULL,

  id_provincia INTEGER NOT NULL,
  desc_provincia VARCHAR(50),

  id_municipio INTEGER NOT NULL,
  desc_municipio VARCHAR(50),

  PRIMARY KEY(id_geografia)
);

CREATE TABLE tienda(
  id_tienda INTEGER NOT NULL,
  
  id_nombre INTEGER NOT NULL,
  desc_nombre VARCHAR(50),

  PRIMARY KEY(id_tienda)
);

CREATE TABLE ventas(
  num_ventas INTEGER,
  num_devoluciones BOOLEAN,
  importe REAL,
  impuestos REAL,
  coste_venta REAL,
  
  producto_id INTEGER NOT NULL,
  cliente_id INTEGER NOT NULL,
  fecha_id INTEGER NOT NULL,
  geografia_id INTEGER NOT NULL,
  tienda_id INTEGER NOT NULL,

  PRIMARY KEY(producto_id, cliente_id, fecha_id, geografia_id, tienda_id),
  
  FOREIGN KEY(producto_id) REFERENCES producto(id_producto),
  FOREIGN KEY(cliente_id) REFERENCES cliente(id_cliente),
  FOREIGN KEY(fecha_id) REFERENCES fecha(id_fecha),
  FOREIGN KEY(geografia_id) REFERENCES geografia(id_geografia),
  FOREIGN KEY(tienda_id) REFERENCES tienda(id_tienda)
);
