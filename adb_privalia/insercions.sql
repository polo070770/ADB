--Insercions de families
INSERT INTO familia VALUES(1,'hombre');
INSERT INTO familia VALUES(2, 'mujer');

--Insercions de subfamilies
INSERT INTO subfamilia VALUES(1,'camisetas',1);
INSERT INTO subfamilia VALUES(2,'camisas',1);
INSERT INTO subfamilia VALUES(3,'chaquetas',1);
INSERT INTO subfamilia VALUES(4,'abrigos',1);
INSERT INTO subfamilia VALUES(5,'vaqueros',1);
INSERT INTO subfamilia VALUES(6,'pantalones',1);
INSERT INTO subfamilia VALUES(7,'ropa_interior',1);
INSERT INTO subfamilia VALUES(8,'calcetines',1);
INSERT INTO subfamilia VALUES(9,'vestidos',2);
INSERT INTO subfamilia VALUES(10,'chaquetas',2);
INSERT INTO subfamilia VALUES(11,'abrigos',2);
INSERT INTO subfamilia VALUES(12,'pantalones',2);
INSERT INTO subfamilia VALUES(13,'faldas',2);
INSERT INTO subfamilia VALUES(14,'ropa_interior',2);
INSERT INTO subfamilia VALUES(15,'calcetines',2);
INSERT INTO subfamilia VALUES(16,'vaqueros',2);


--Insercions de productes
--Moda hombre
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(1,'Pier_1','Adidas',2);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(2,'Pier_2','Adidas',4);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(3,'Pier_1','Vichy_1',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(4,'Pier_1','Vichy_2',4);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(5,' Harrington_1','Adidas',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(6,'Harrington_2','Adidas',2);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(7,' Best_Mountain_1','Adidas',3);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(8,' Best_Mountain_2','Adidas',3);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(9,'Esprit_1','Adidas',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(10,'Esprit_2','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(11,'Superdry_1','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(12,'Superdry_2','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(13,'Twintip_1','Adidas',3);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(14,'Twintip_2','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(15,'River_1','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(16,'River_2','Adidas',3);
--Moda mujer
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(17,'Pier_1','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(18,'Pier_2','Adidas',3);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(19,'Pier_1','Vichy_1',2);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(20,'Pier_1','Vichy_2',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(21,'Harrington_1','Adidas',4);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(22,'Harrington_2','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(23,' Best_Mountain_1','Adidas',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(24,' Best_Mountain_2','Adidas',3);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(25,'Esprit_1','Adidas',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(26,'Esprit_2','Adidas',1);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(27,'Superdry_1','Adidas',3);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(28,'Superdry_2','Adidas',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(29,'Twintip_1','Adidas',5);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(30,'Twintip_2','Adidas',4);
INSERT INTO producte(id_producte,nom,marca,num_articles) 
VALUES(31,'River_1','Adidas',4);
INSERT INTO producte(id_producte,nom,marca,num_articles)
VALUES(32,'River_2','Adidas',4);


--Insercions de clients
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(1,'Rajah','Fleming','936946923',0,'nulla.ante.iaculis@fames.net');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(2,'Quinn','Mejia','938888364',0,'et.netus.et@Cum.net');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(3,'Colette','Mclean','905950528',0,'feugiat.non@ac.net');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(4,'Alfreda','King','920945052',0,'aliquet@semmagna.net');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(5,'Macon','Mccarty','904672709',0,'eu@consectetuer.ca');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(6,'Merrill','Eaton','944326757',0,'in.dolor@miac.co.uk');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(7,'Roanna','Madden','938410038',0,'Cum@Quisque.com');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(8,'Hanna','Morris','943505785',0,'Proin.mi@Maecenas.org');
INSERT INTO client(id_client, nom, cognom, telefon, import_total, email) 
VALUES(9,'Dorian','Rollins','977159595',0,'elit.elit@lectusquismassa.edu');

--Insercions de campanyes
INSERT INTO campanya(id_campanya, nom_campanya, marca, num_articles, total_facturat, data_inici, data_fi)
VALUES(1,'Hello World', 'Adidas', 99, 0, '2014-1-1', '2014-12-31');
