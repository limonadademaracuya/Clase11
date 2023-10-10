drop database if exists cursomysql;

create database cursomysql;

use cursomysql;

create table clientes(
	codigo int auto_increment,
	nombre varchar(20) not null,
	apellido varchar(20) not null,
	dni char(8) not null,
	direccion varchar(50),
	primary key (codigo)
);

insert into clientes (nombre,apellido,dni,direccion) values ('Juan','Gardoni','12555777','Paso 1523');
insert into clientes (nombre,apellido,dni,direccion) values ('Diego','Novoa','22333444','Libertad 555');
insert into clientes (nombre,apellido,dni,direccion) values ('Laura','Lopez','15888999','España 222');
insert into clientes (nombre,apellido,dni,direccion) values ('Mario','Mendez','99888777','Peña 345');
insert into clientes (nombre,apellido,dni,direccion) values ('Marcela','Gonzalez','56568568','Lima 2042');

select * from clientes;

-- 1- Crear la tabla facturas dentro de la base de datos, con el siguiente detalle:

-- campos		tipo
-- letra		char y PK
-- numero 		int y PK
-- fecha		date
-- monto		double

-- PK siginifica Primary Key
-- en este caso se declara una clave primaria compuesta
-- es decir, (letra,codigo)

drop table if exists facturas;
create table facturas(
	letra enum('A','B','C'),
    numero int unsigned,
    fecha date not null,
    monto double not null,
    check (letra in ('A','B','C')),
    primary key(letra, numero)
);

describe facturas;

/*
Crear la tabla articulos dentro de la base de datos con el siguiente detalle:
	codigo		int y PK
    nombre		varchar(50)
    precio		double
    stock		int
*/

create table articulos(
	codigo int primary key,
    nombre varchar(50) not null,
    precio double not null,
    stock int not null
);

describe articulos;

-- insertar registros en la tabla facturas
insert into facturas (letra, numero, fecha, monto) values ('A',1,curdate(),12500);
insert into facturas (letra, numero, fecha, monto) values ('A',2,curdate(),12500);
insert into facturas (letra, numero, fecha, monto) values ('B',1,curdate(),12500);
insert into facturas (letra, numero, fecha, monto) values ('C',1,'2023-09-04',50000);
-- insert into facturas (letra, numero, fecha, monto) values ('J',1,'2023-08-09',90000);
insert into facturas (letra, numero, fecha, monto) values ('B',2,'2023-01-19',1500);
-- si se cargan todos los campos y en orden, no es necesario describirlos antes:
insert into facturas values ('B',3,'2023-01-19',1500);

-- insertar registros en la tabla articulos
insert into articulos values (1, 'alfajorcito',1000,7);
insert into articulos values (2, 'papitas', 1500, 20);
insert into articulos values (3, 'caramelos', 100, 2000);
insert into articulos values (4, 'agua', 500, 50);
insert into articulos values (5, 'gaseosa', 1200,200); 

-- insertamos más registros en la tabla clientes
insert into clientes (nombre, apellido, dni, direccion) values 
('Juan', 'Novoa', '12345678', 'Belgrano 2033'),
('Marcelo', 'Galván', '11235466', 'Freire 154'),
('María', 'Guerra', '69687563', 'Soler 41'),
('Marcela', 'Nuñez', '22333444', 'San Martín 455'),
('Analía', 'Ponce', '88777666', 'Salta 789');


-- --------------------------------------------------------
-- Comando de recuperación select 
-- --------------------------------------------------------
-- trae todos los registros con todos los campos de la tabla. El * es un comodín 
select * from clientes;

-- seleccionar sólo los nombres y apellidos
select nombre, apellido from clientes;

-- solo seleccionamos los nombres
select nombre from clientes;

-- omitimos los nombres repetidos
select distinct nombre from clientes;

-- filtrado con where 
select * from clientes where nombre = 'Juan';
select * from clientes where nombre = 'juan';
select * from clientes where nombre = 'JUAN';
select * from clientes where nombre = 'Maria'; -- lo trae igual aunque no lo pongamos con tilde

-- Operadores relacionales
-- = igual
-- != no igual
-- <> distinto
-- > mayor
-- < menor
-- >= mayor o igual
-- <= menor o igual

-- selecciona todos los campos de aquellos registros cuyo codigo sea igual a 3
select * from clientes where codigo = 3;

-- selecciona todos los campos de aquellos registros cuyo codigo sea mayor a 3
select * from clientes where codigo > 3;

-- selecciona todos los campos de aquellos registros cuyo codigo sea menor a 3
select * from clientes where codigo < 3;

-- selecciona todos los campos de aquellos registros cuyo codigo sea mayor o igual a 3
select * from clientes where codigo >= 3;

-- operadores AND y OR
-- nos trae todos los campos de todos los registros cuyo codigo sea menor a 3 o mayor a 5.
-- trae los registros que cumplan al menos con alguna de las dos condiciones
select * from clientes where codigo < 3 or codigo > 5;

-- trae todos los campos de todos los registros cuyo codigo sea mayor o igual a 3 y menor o igual a 5
-- trae todos los registros que cumplan con las dos condiciones
select * from clientes where codigo >= 3 and codigo <= 5;

-- valores NULL
-- insertamos registros 
insert into clientes (nombre, apellido, dni, direccion) values ('Mario','Fernández', '99666111','');
insert into clientes (nombre, apellido, dni, direccion) values ('Juana','Fernández', '98888111',null);

-- null significa desconocido, no es lo mismo que vacío o 0
-- los valores nulos no ocupan espacio y son distintos al 0 y al espacio en blanco
-- hay que tener cuidado con los valores nulos en las operaciones, ya que 1 * NULL es igual a NULL

select * from clientes where direccion = '';
select * from clientes where direccion is null;
select * from clientes where direccion is not null;
-- los valores nulos se consultan con is null o is not null
-- nunca ejecutamos con = null, ya que si bien se ejecuta, no da el resultado correcto
select * from clientes where direccion = null;

-- --------------- columnas calculadas y alias ------------------------
select 2 + 2;
select letra, numero, monto from facturas;
select letra, numero, monto, monto * 0.21 from facturas;
select letra, numero, monto, monto * 0.21 IVA from facturas;

-- -------------- parámetros between y not between ----------------------
select * from facturas where monto between 10000 and 25000;
select * from facturas where monto not between 10000 and 25000;
-- la sentencia between incluye los extremos.
-- la sentencia not between no incluye los valores extremos.

-- -----------------------parametros IN, NOT insert---------------------------
select * from clientes where codigo in (2,4,6);
-- es lo mismo 
-- select * from clientes where codigo = 2 or codigo = 4 or codigo = 5; 
select * from clientes where codigo not in (2,4,5);

-- que es lo mismo que 

select * from clientes where codigo <> 2 and codigo <> 4 and codigo <> 5;

-- parametros like, operadores % y _
-- % significa nada o cualquier cosa
-- _ significa un caracter cualquiera 

select * from clientes;

-- busca todos los registros cuyo nombre empiece con 'M'
select * from clientes where nombre like 'M%';

-- busca todos los registros cuyo nombre termine con 'a'
select * from clientes where nombre like '%a';

-- busca todos los registros cuyo apellido termina en 'z'
select * from clientes where apellido like '%z'; 

-- busca todos los registros donde el caracter de la primera posicion sea cualquiera, su segundo caracter sea la 'a', 
-- y continue con culquier secuencia de caracteres o nada 
select * from clientes where nombre like '_a%';

-- apellido que su segundo caracter sea 'o' y que termine por 'z'
select * from clientes where apellido like '_o%z';

-- - - ejemplo: 
insert into clientes (nombre, apellido, dni, direccion) values 

('Sol', 'Toaz', '958464937', ''),
('Fernando', 'Voz', '84574239', null),
('Fernando', 'Lopez', '9485774239', null);

-- aca, los tres ejemplos cumplen con la condicion '_o%z', porque indica que si o si 
-- su segundo caracter debe ser la o, que despes vaya caulquier cosa, pero que si o si termine con z




-- -----------------Parametros ORDER BY, ASC Y desc----------------------

select * from clientes order by nombre;
-- ordena alfabeticamente por nombre 

select * from clientes order by nombre asc; 
-- acá 'asc' viene de ascendant (acendente en inglés), NO ES OBLIGATORIO usar el asc, ya lo hace automaticamente

select * from clientes order by nombre desc;
-- acá si seria obligatorio, porque es un orden descendente, hay que especificarlo

select * from clientes order by nombre, codigo;
-- ordena primero por nombre y despues por codigo

select * from clientes order by nombre, codigo desc;
-- ordena primero en ascendente y luego por codigo de forma descendiente

-- -----------CLAUSULA LIMIT------------------

select * from clientes; -- trae todos los clientes cargados en la tabla
select * from clientes limit 5; -- solo trae a los 5 primeros
select * from clientes limit 3,6; -- trae los 6 registros que están después del registro número 3 
-- (el registro numero 3 seria el punto de partida)

-- insertamos registros en la tabla de articulos --

insert into articulos values (6, 'galletitas de agua', 1000, 500),
(7, 'galletitas dulces', 2500, 1000), 
(8, 'tostadas', 1500, 600),
(9, 'dulce de leche', 4500, 3), 
(10, 'yerba', 25000, 100),
(11, 'cigarrillos', 70000, 3000),
(12, 'panchos', 1200, 200),
(13, 'chupetin', 500, 700),
(14, 'sube', 1000, 10000);

/*
Basándose en la tabla artículos, obtener los siguientes listados.
1- articulos con precio mayor a 1000
2- articulos con precio entre 2000 y 4000 (usar < y >)
3- articulos con precio entre 400 y 6000 (usar between)
4- articulos con precio = 2000 y stock mayor a 300
5- articulos con precio (1200,2000,3000) no usar in
6- articulos con precio (1200,2000,3000) usar in
7- articulos que su precio no sea (1200,2000,3000)
8- listar los articulos ordenados por precio de mayor a menor, y si hubiera
precios iguales deben quedar ordenados por nombre
9- listar todos los articulos incluyendo una columna denominada "precio con IVA", 
la cual deberá tener el monto con el iva del producto
10- listar todos los articulos incluyendo una columna denominada "cantidad de 
cuotas" y otra "valor de cuota", la cantidad es fija y es 3, el valor de cuota
corresponde a 1/3 del monto con un 5% de interés

*/
select * from articulos; 

-- Desarrollo
-- 1) 
select * from articulos where precio > 1000;

-- 2) 
select * from articulos where precio > 1999 and monto < 4001; 

-- 3)
select * from articulos where precio between 400 and 6000;

-- 4)
select * from articulos where precio = 2000 and stock > 300;

-- 5) 
select * from articulos where precio = 1200 or precio = 2000 or precio = 3000;

-- 6)
select * from articulos where precio in (1200,2000,3000);

-- 7)
select * from articulos where precio not in (1200,2000,3000);

-- 8)
select * from articulos order by precio desc, nombre; 

-- 9)
select nombre, precio (precio + (precio * 0.21)) 'Pecio con IVA' from articulos;

-- aca lista todos los articulos por el nombre, pero no me da el resto de informacion para tener
-- solo lo que me interesa, nombre, precio y precio con iva, pero bien podria poner * para tener toda la informacion a la mano, no pasa nada:

select nombre, precio, precio + precio * 0.21 'precio con IVA' from articulos;

-- o, mas prolijo y organizado, optimizado:
select nombre, precio, precio * 1.21 'precio con IVA' from articulos;

-- para obtener el porcentaje de algo es multiplicar por ' 0, ' y mi porcentaje a sacar, si quiero sacar el 21% multiplico mi precio por 0,21
-- Ahora, para evitar eso de sumar precio + precio * 0,21 puedo hacer precio * 1,21 , esto reemplaza sumarlo por si mismo

-- Al final, forma recomendada:

select nombre, precio, precio * 1.21 'precio con IVA' from articulos; -- esta es 


select * , precio * 1.21 'precio con IVA' from articulos;
-- ahora, para tener toda la informacion pero colocando la casilla del IVA al lado de los precios sin tener la de stock en medio
select codigo, nombre, precio, precio * 1.21 'precio con IVA', stock from articulos;

-- 10) no se, mi preferir esta prmera:
select nombre, precio, 3 'Cantidad de cuotas', (((precio * 5) / 100) + precio) / 3 'valor de cuota' from articulos;

-- corresponde a 1/3 del monto con un 5% de interes

select nombre, stock, precio, 3 as 'cantidad de cuotas', (precio*1.05) / 3 'valor de cuotas' from articulos;

-- -------- Clase 8 -------------

-- DDL (Data Definition Language)
-- CEATE 
-- ALTER
-- DROP


-- DML (Data Maipulation Language)
-- SELECT
-- INSERT
-- UPFATE
-- DELET 
-- -------------------------------

create table amigos (
	nombre varchar(50),
    apellidos varchar(50)
);

select * from amigos;

-- cargar registros con datos de otra tabla usando select
insert into amigos (nombe, apellido) select nombre, apellido from clientes; 

-- crear una tabla a partir de la informacion de otra 
create table nombres select distinct nombre from clientes; -- distinct muestra los nombres sin repetir 

select * from nombres;

-- clonar una tabla 

create table clientes_2 select * from clientes; 

select * from clientes;

select * from clientes_2;

insert into amigos values ('Marina', 'Fernández'), ('Luján', 'Tucci'), ('Gabriel', 'Strauss');

-- --------------- TABLAS TEMPORALES -----------------
-- son tablas alojadas en memoria RAM y desaparecen al cortar la conexión con el servidor, 
-- o sea, se apaga el computador y se borra la tabla
-- se la usa para obtener consultas muy veloces para datos temporarios

create temporary table copia select * from clientes;

select * from copia; 

-- ----------- comando delete -------------

select * from clientes;

delete from clientes where codigo = 5;

-- elimina un unico registro (porque le pedi que elimine el que tenga n codigo = 5, y solo uno porque es una primary key)

insert into clientes (nombre, apellido, dni, direccion) values ('Juan Pablo', 'Guerra', '7777777789', null);
delete from clientes where nombre = 'juan';

-- para eliminar todos los registros cuyo nombre sea igual a Juan:
delete from clientes where nombre like '%juan%';

-- elimina todos los egistros cuyo nombre contenga la palabra juan

-- NOTA: el editor de MySQL Workbench trae configurado por default una protección para evitar ejecutar comandos
-- de borrado o actualización masiva. Hay que desactivarla desde el menú de Edición, preferencias, editor, de sql. Para mayor seguridad,
-- reiniciar el MySQL Workbench.
-- Otra manera de desactivarla por medio de código:
set sql_safe_updates=0; -- desactiva la protección
set sql_safe_updates=1; -- activa la protección

-- delete from clientes; -- HAY QUE TENER CUIDADO CON ESTE COMANDO, ASÍ COMO ESTÁ BORRA TODOS LOS REGISTROS DE LA TABLA. drop borra la estructura, delete no.
-- elimino todos los registros de la tabla clientes 

-- inserto un nuevo registro a la tabla clientes, el codigo será el último asignado + 1 
insert into clientes (nombre, apellido, dni, direccion) values ('Fiorella', 'Aranibar', '642387649', null);

-- el comando truncate también vacía la tabla, pero borrando todos los registros simultaneamente, no uno por uno 
-- como hace el comando delete, por lo tanto es más veloz. Este comando también reinicia la secuencia de los autoincrementables

truncate clientes;
-- acá acabamos de borrar toodo de la tabla clientes, para volvere a ingresar los datos que teníamos antes podemos pasar 
-- los datos de la tabla clientes_2 que hicimos más temprano a nuestra tabla clientes

insert into clientes select * from clientes_2;

-- actualizar valores de registros de una tabla 
-- comando update, actualiza registros (siempre respetando el tipo de dato, ejemplo, no podemos poner un número donde va un texto)

update clientes set nombre = 'Mariana' where codigo = 2;
-- actualiza la tabla clientes cambiando el nombre 'Mariana' a aquellos registros cuyo codigo sea igual a 2

update clientes set apellido = 'Vilchez' where nombre = 'Fernando';
-- actualiza la tabla clientes, cambiando el apellido por 'Vilchez' cuando el nombre sea igual a 'Fernando'

-- update clientes set apellido = 'Aranibar'; -- NO OLVIDAR EL WHERE, PORQUE PUEDEN PASA ESTAS COSAS
-- OJO esta query actualiza todos los registros, es decir, que ahora todos los registros tienen como apellido 'Aranibar'

-- --------------------------------- EJERCICIOS ------------------------------------------------------------------------------

-- Basándose en la tabla clientes, realizar los siguientes puntos:

-- 1- 	Insertar 5 clientes en la tabla clientes dejando que el motor de la BD complete su código
-- 2-	Insertar 5 clientes en la tabla clientes utilizando los campos como parte de la sentencias,
-- es decir de la forma extendida. Completando todos los campos
-- 3-	Actualizar el nombre del cliente 1 a Jose.
-- 4-	Actualizar el nombre apellido y dni del cliente 3 a Pablo Fuentes 21053119
-- 5-  Actualizar la dirección del cliente de código 2 a vacío
-- 6-	Actualizar las direcciones de los clientes de código 3, 5 y 7 a 'null'
-- 7-	Eliminar los clientes con apellido Perez.
-- 8-	Eliminar los clientes con dni que terminan en 0.
-- 9-  Eliminar los clientes cuyo nombre contenga una r y su apellido termine en z

-- Basandose en la tabla artículos, realizar los siguientes puntos.
-- 	10- Aumentar un 20% los precios de los artículos con precio menor igual a 50.
-- 	11- Aumentar un 15% los precios de los artículos con precio mayor a 50.
-- 	12- Bajar un 5% los precios de los artículos con precio mayor a 200.
-- 13- bajar el %50 del precio a los artículos que estén entre 20000 y 40000
-- 13- aumentar el stock a 200 a todos aquellos productos que tengan el stock mayor a 0 y hasta 150
-- 	14- Eliminar los artículos con stock menor a 0.
-- 15- eliminar todos los artículos cuyo precio sea mayor a $50.000

-- ------------------------------------------------------------------------------------------------------------------

-- 1) 
insert into clientes (nombre,apellido,dni,direccion) values ('Sury','Marcela','11111111','Paso 1111');
insert into clientes (nombre,apellido,dni,direccion) values ('Manteca','Budin','21111144','Libertad 555');
insert into clientes (nombre,apellido,dni,direccion) values ('Kira','Lopez','777777799','España 222');
insert into clientes (nombre,apellido,dni,direccion) values ('Mario','Card','6666668777','Peña 345');
insert into clientes (nombre,apellido,dni,direccion) values ('Marcela','Perez','56568568','Lima 2042');
 -- 2) 
insert into clientes (codigo, nombre,apellido,dni,direccion) values (21, 'Pepe', 'Agento', '5623104756', '');
insert into clientes (codigo, nombre,apellido,dni,direccion) values (27,'Sabado','Marcelo','111156711','Paso 1222');
insert into clientes (codigo, nombre,apellido,dni,direccion) values (30, 'Domingo','Mandarina','21111111','Corrientes 1113');
insert into clientes (codigo, nombre,apellido,dni,direccion) values (22, 'Lunes','Manzana','11111101','Araoz 1111');
insert into clientes (codigo, nombre,apellido,dni,direccion) values (73, 'Pizza','Muzzarella','11711111','Paso 1111');
-- 3)
update clientes set nombre = 'Jose' where codigo = 1;
-- 4)
update clientes set nombre = 'Pablo', apellido = 'Fuentes', dni = '21053119' where codigo = 3;
-- 5)
update clientes set direccion = '' where codigo = 2;
-- 6)
update clientes set direccion = null where codigo in (3, 5, 7);
-- 7) 
delete from clientes where apellido like '%perez%';
-- 8)
delete from clientes where dni like '%0';
-- 9)
delete from clientes where nombre like '%r%' and apellido like '%z';
-- 10)
update articulos set precio = precio * 1.2 where precio <= 50;
-- 11)
update articulos set precio = precio * 1.15 where precio > 50; 
-- 12)
update articulos set precio = precio * 0.95 where precio > 200;

-- 13- bajar el %50 del precio a los artículos que estén entre 20000 y 40000
update articulos set precio = precio/2 where precio between 20000 and 40000; -- otra forma es ponerle precio = precio * 0.5, como antes

-- 14) aumentar el stock a 200 a todos aquellos productos que tengan el stock mayor a 0 y hasta 150
update articulos set stock = 200 where stock > 0 and stock <= 150; 

-- 15) Eliminar los artículos con stock menor a 0.
delete from articulos where stock < 0;

-- 16) eliminar todos los artículos cuyo precio sea mayor a $50.000
delete from articulos where precio > 50000;
-- ----------------------- Tema Nuevo: ALTER TABLE (ddl) ---------------------------
-- modifica la estructura de una tabla 

describe clientes;
-- agregar campos 

alter table clientes add edad smallint unsigned not null;
-- unsigned quiere decir que no acepta numeros negativos, el tipo de dato que estoy usando se llama 'smallint unsigned', así como el otro se llama 'int'

describe clientes;

select * from clientes;

update clientes set edad = 25 where codigo = 1;
update clientes set edad = 35 where codigo = 2;
select * from clientes;

-- modificar campos 

alter table clientes modify edad tinyint unsigned;
describe clientes;


-- truncate articulos; esto sólo lo hice porque sin querer elimine todos los articulos que tenia en el ejercicio 15, me equivoque en el simbolo <, no >
 
-- cambiar nombre a un campo 
alter table clientes change edad antiguedad tinyint unsigned;

describe clientes; 

-- borrar campos 
alter table clientes drop antiguedad;
describe clientes;

-- eliminar la pk (primary key)
-- para poder eliminar la pk, el campo no puede ser auto_increment
-- alter table clientes drop primary key;

alter table clientes modify codigo int;
describe clientes;
-- al no ser mas auto_incrementable, puedo eliminar la pk

alter table clientes drop primary key;

describe clientes;

-- agregar clave primaria 
alter table clientes add primary key (codigo);
describe clientes;

alter table clientes modify codigo int auto_increment;
describe clientes;

-- remonbrar tablas

rename table clientes to auxiliar, facturas to auxiliar2;
show tables;

rename table auxiliar to clientes, auxiliar2 to facturas;
show tables;








