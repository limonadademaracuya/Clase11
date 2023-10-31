--  ----------------
-- 	EJERCICIOS
--  ----------------
show databases;
use cursomysql; 

-- +++++++++++++++++++++
--   PRIMERA PARTE   --
-- +++++++++++++++++++++

-- Basándose en la tabla articulos, realizar los siguientes puntos:
-- 1) Agregar a la tabla articulos, los campos stockMinimo y stockMaximo.

alter table articulos add stockMinimo smallint not null, add stockMaximo smallint not null;

describe articulos;

-- 2) Completar en los registros los valores de los campos stockMinimo y stockMaximo
-- 	teniendo en cuenta que el stock mínimo debe ser menor que el stock máximo.

update articulos set stockMinimo=10, stockMaximo=100; 

-- acá lo que había que hacer era poner un nuevo mínimo y nuevo máximo
-- para cada articulo en la tabla, no un min/max general para todos porque no tendría sentido


-- 3) Listar los articulos que se deben reponer y qué cantidad se debe reponer de cada artículo.
--	Tener en cuenta que se debe reponer cuando el stock es menor al stockMinimo y la cantidad
--	de articulos a reponer es stockMaximo - stock.

select nombre, (stockMaximo-stock) as "cantidad a reponer"
from articulos where stock < stockMinimo;

select * from articulos;
set sql_safe_updates=0; -- desactiva la protección
-- set sql_safe_updates=1; -- activa la protección
update articulos set stock=2 where nombre= 'alfajorcito';

describe articulos;
select * from articulos;

-- 4) Calcular el valor de venta de toda la mercaderia que hay en stock.

select stock, sum(stock * precio) valor_venta_total from articulos;
select * from articulos;

-- 5) Calcular el valor de venta + IVA de toda la mercaderia que hay en stock.
select stock, sum(stock * precio) * 1.21 suma_IVA from articulos;

-- +++++++++++++++++++++
--   SEGUNDA PARTE   --
-- +++++++++++++++++++++

-- 1. Crear la tabla 'autos' dentro de la base de datos 'intro' con el siguiente detalle:

-- 	codigo	INTEGER y PK
-- 	marca	VARCHAR(255)
-- 	modelo	VARCHAR(255)
-- 	color	VARCHAR(255)
-- 	anio	INTEGER
-- 	precio	DOUBLE

create database intro;
use intro;

create table autos(
	codigo int auto_increment,
	marca varchar(255),
	modelo varchar(255),
	color	VARCHAR(255),
	anio	INT,
	precio	DOUBLE,	
	primary key (codigo)
);

-- 2. Cargar la tabla con 15 autos -- https://www.autocasion.com/
insert into autos values 
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(2, 'Audi', 'A3', 'Gris', '2003', '3000000000');
(3, 'VMW', 'Serie3', 'Negro', '2013', '4000000000');
(4, 'Citroen', 'C4', 'Blanco', '2020', '17000000000');
(5, 'Fiat', 'Stelvio', 'Rojo', '2022', '20000000000');
(6, 'Honda', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');
(1, 'Alfa Romeo', 'Stelvio', 'Rojo', '2022', '20000000000');


-- -------------------------------------COMO HACER UNA COPIA DE LA BASE DE DATOS------------------------------------------------------------------
-- server > data export > a la izq están las b.d. que tengo en mi servidor, 
-- si le doy click al nombre de una se seleccionan todas las tablas en esa b.d., 
-- si no, puedo seleccionar una sola tabla en especifico
-- abajo, en "Export Options" podemos elegir si exportarlo todo en carpetas separadas (primer tilde circular)
-- o para exportarlo todo en una sola carpeta (segundo tilde circular)
-- también tildamos "Create dump in a single transaction (self contained file only)" 
-- tiltamos también "Include create schema " > de ahí Start Export 
-- -------------------------------------------------------------------------------------------------------------------------------

-- 3. Realizar las siguientes consultas:
-- 	a. obtener el precio máximo.
select max(precio) from autos;
-- 	b. obtener el precio mínimo.
select min(precio) from autos;
-- 	c. obtener el precio mínimo entre los años 2010 y 2020.
select min(precio) precio_minimo from autos where anio between 2010 and 2020 ;
-- 	d. obtener el precio promedio.
select avg(precio) from autos;
-- 	e. obtener el precio promedio del año 2023.
select avg(precio) from autos where anio = 2023;
-- 	f. obtener la cantidad de autos.
select count(*) from autos; 
-- 	g. obtener la cantidad de autos que tienen un precio entre $3.500.000 y $4.000.000
select count(*) cantidad from autos where precio between 3500000 and 4000000;
-- 	h. obtener la cantidad de autos que hay en cada año.
select count(*) from autos group by anio;
-- 	i. obtener la cantidad de autos y el precio promedio en cada año.
select anio, count (*) cantidad_autos, avg(precio) precio_promedio from autos group by anio;
-- 	j. obtener la suma de precios y el promedio de precios según marca.
select marca, sum(precio), avg(precio) from autos group by marca;
--  	k. informar los autos con el menor precio.
select count(*) precio_menor, 
--  	l. informar los autos con el menor precio entre los años 2014 y 2023
--  	m. listar los autos ordenados ascendentemente por marca,modelo, y el año en forma descendente.
--  	n. contar cuantos autos hay de cada marca.
--  	o. borrar los autos del siglo pasado.