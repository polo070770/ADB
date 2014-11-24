DROP TABLE IF EXISTS cliente CASCADE;
DROP TABLE IF EXISTS producto CASCADE;
DROP TABLE IF EXISTS fecha CASCADE;
DROP TABLE IF EXISTS geografia CASCADE;
DROP TABLE IF EXISTS tienda CASCADE;
DROP TABLE IF EXISTS sexo CASCADE;
DROP TABLE IF EXISTS categoria CASCADE;
DROP TABLE IF EXISTS articulo CASCADE;
DROP TABLE IF EXISTS campanya CASCADE;
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
  
  id_anyo INTEGER NOT NULL,
  desc_anyo VARCHAR(20),

  id_mes INTEGER NOT NULL,
  desc_mes VARCHAR(20),

  id_dia INTEGER NOT NULL,
  desc_dia VARCHAR(20),
  
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

CREATE TABLE sexo(
  id_sexo INTEGER NOT NULL,

  id_nombre INTEGER NOT NULL,
  desc_nombre VARCHAR(10),

  PRIMARY KEY(id_sexo)
);

CREATE TABLE categoria(
  id_categoria INTEGER NOT NULL,

  id_familia INTEGER NOT NULL,
  desc_familia VARCHAR(50),

  id_subfamilia INTEGER NOT NULL,
  desc_subfamilia VARCHAR(50),

  PRIMARY KEY (id_categoria)
);

CREATE TABLE articulo(
  serial_number INTEGER NOT NULL,

  id_tamanyo INTEGER NOT NULL,
  desc_tamanyo VARCHAR(10),

  color VARCHAR(50),

  PRIMARY KEY(serial_number)
);

CREATE TABLE campanya(
  id_campanya INTEGER NOT NULL,

  id_nombre INTEGER NOT NULL,
  desc_nombre VARCHAR(50),

  fecha_inicio VARCHAR(20),
  fecha_fin VARCHAR(20),

  n_articulos INTEGER,
  importe_facturado REAL,

  PRIMARY KEY(id_campanya)
);

CREATE TABLE ventas(
  num_ventas INTEGER,
  devuelto INTEGER,
  importe REAL,
  impuestos REAL,
  coste_venta REAL,
  
  producto_id INTEGER NOT NULL,
  cliente_id INTEGER NOT NULL,
  fecha_id INTEGER NOT NULL,
  geografia_id INTEGER NOT NULL,
  tienda_id INTEGER NOT NULL,
  sexo_id INTEGER NOT NULL,
  categoria_id INTEGER NOT NULL,
  articulo_id INTEGER NOT NULL,
  campanya_id INTEGER NOT NULL,

  PRIMARY KEY(producto_id, cliente_id, fecha_id, geografia_id, tienda_id, sexo_id,
    categoria_id, articulo_id, campanya_id),
  
  FOREIGN KEY(producto_id) REFERENCES producto(id_producto),
  FOREIGN KEY(cliente_id) REFERENCES cliente(id_cliente),
  FOREIGN KEY(fecha_id) REFERENCES fecha(id_fecha),
  FOREIGN KEY(geografia_id) REFERENCES geografia(id_geografia),
  FOREIGN KEY(tienda_id) REFERENCES tienda(id_tienda),
  FOREIGN KEY(sexo_id) REFERENCES sexo(id_sexo),
  FOREIGN KEY(categoria_id) REFERENCES categoria(id_categoria),
  FOREIGN KEY(articulo_id) REFERENCES articulo(serial_number),
  FOREIGN KEY(campanya_id) REFERENCES campanya(id_campanya)
);