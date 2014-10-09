DROP TABLE IF EXISTS campanya;
DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS linea_factura;
DROP TABLE IF EXISTS dades_entrega;
DROP TABLE IF EXISTS familia;
DROP TABLE IF EXISTS subfamilia;
DROP TABLE IF EXISTS article;
DROP TABLE IF EXISTS producte;

CREATE TABLE familia(
  id_familia INTEGER PRIMARY KEY NOT NULL,
  nom VARCHAR(30) NOT NULL
);

CREATE TABLE subfamilia(

  id_subfamilia INTEGER PRIMARY KEY NOT NULL,
  nom VARCHAR(50) NOT NULL,
  
  id_fam INTEGER,
  
  FOREIGN KEY(id_fam) REFERENCES familia(id_familia) 
  
);

CREATE TABLE campanya(

	id_campanya INTEGER PRIMARY KEY NOT NULL,
	nom_campanya VARCHAR(30) NOT NULL,
	marca VARCHAR(20),
	num_articles INTEGER,
	total_facturat FLOAT
  data_inici DATE NOT NULL,
  data_fi DATE NOT NULL,

);

CREATE TABLE producte(

  id_producte INTEGER PRIMARY KEY NOT NULL,
  nom VARCHAR(50),
  marca VARCHAR(20),
  num_articles INTEGER,

);

CREATE TABLE article(

  id_article INTEGER PRIMARY KEY NOT NULL,
  talla FLOAT,
  color VARCHAR(20),
  preu FLOAT,
  
  id_subfam INTEGER,
  id_campanya INTEGER,  
  
  FOREIGN KEY(id_subfam) REFERENCES subfamilia(id_subfamilia),
  FOREIGN KEY(id_campanya) REFERENCES campanya(id_campanya)
);

CREATE TABLE linea_factura(

	id_client VARCHAR(10),
	id_article INTEGER,

	FOREIGN KEY(id_article) REFERENCES article(id_article),
	FOREIGN KEY(id_client) REFERENCES client(email)
);

CREATE TABLE client(

	email VARCHAR(50) PRIMARY KEY NOT NULL,

	nom VARCHAR(20) NOT NULL,
	cognom VARCHAR(50) NOT NULL,
	telefon VARCHAR(9),

	import_total FLOAT
  
);

CREATE TABLE dades_entrega(

  carrer VARCHAR(30),
  poblacio VARCHAR(30),
  provincia VARCHAR(30),
  codi_postal VARCHAR(5),
  pais VARCHAR(30),
  
  id_client VARCHAR(50),
  
  FOREIGN KEY(id_client) REFERENCES client(email)
);