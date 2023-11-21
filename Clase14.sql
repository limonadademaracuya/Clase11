
create database negocioVespertino;
use negocioVespertino;

create table clientes(
	codigo int auto_increment,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    dni char(8) not null,
    direccion varchar(100),
    primary key (codigo)
);

create table facturas(
	letra char(1),
    numero int,
    codigoCliente int not null,
    fecha date not null,
    monto double not null,
    check(letra in ('A','B','C')),
    primary key (letra,numero)
);

insert into clientes (nombre, apellido, dni, direccion) values
('Juan', 'Perez', '22222222', 'La Paz 2042'),
('Marcelo', 'Lopez', '33333333', 'Independencia 124'),
('Julia', 'Gonzalez', '44444444', 'Larrea 2587'),
('Violeta', 'Gutierrez', '55555555', 'Belgrano 89'),
('Victor', 'Espíndola', '66666666', 'Soler 5341'),
('Mario', 'Ramos', '77777777', 'Independencia 683'),
('Troy', 'McKlure', '88888888', 'Salta 54'),
('Cosme', 'Fulanito', '99999999', 'Navarra 44'),
('Mariana', 'Flores', '10101010', 'Italia 354'),
('Carlos', 'Ríos', '11111111', 'Medrano 162');

insert into facturas values
('A', 1, 1, '2023-11-07', 777000),
('A', 2, 2, '2023-10-12', 125000),
('B', 1, 1, '2023-11-08', 550000),
('C', 1, 5, curdate(), 25000),
('C', 2, 8, curdate(), 258000),
('A', 3, 6, '2023-05-12', 548000),
('A', 4, 10, '2022-10-25', 98000),
('B', 2, 1, curdate(), 987000),
('C', 3, 4, '1990-06-21', 12000),
('C', 4, 8, curdate(), 78000);

-- el producto cartesiano, es la unión de todos los registros.
-- por lo que va traer las relaciones de todos con todos
select * from clientes, facturas;

-- para obtener el producto relacionado
select * from clientes, facturas where codigo=codigoCliente;

-- cantidad de clientes
select count(*) from clientes; -- 10
-- cantidad de facturas
select count(*) from facturas; -- 10
-- cantidad de clientes * cantidad de facturas
select count(*) from clientes, facturas; -- 10 (10 * 10)

-- Para obtener el producto relacionado, primero tiene que hacerse el cruce interno
-- de x registros. Porque para obtener el producto relacionado, primero tiene que
-- obtener el producto cartesiano y luego filtrar por el relacionado

-- uso de alias para tablas
select 	c.nombre, c.apellido, f.fecha, f.monto 
from 	clientes c, facturas f 
where 	c.codigo=f.codigoCliente;

select * from clientes c, facturas f where c.codigo=f.codigoCliente;

select * from clientes c join facturas f on c.codigo=f.codigoCliente;
-- El join que utilizamos se lo conoce también como INNER JOIN
-- une las dos tablas por medio de una columna en común.
-- Compara los valores y si encuentra coincidencia, los selecciona.
-- Comparado con la teoría de los conjuntos, vendría a ser la intersección.

-- select c.nombre, capellido, f.* from clientes c rigth join

insert into facturas values
('B', 3, 30, curdate(), 1000000);

insert into facturas values
('B', 4, 25, current_timestamp(), 100); -- current_timestamp() esta funcion incerta la fecha y la hora actual,
-- en este caso, hace un truncate de los datos porque el campo no guarda la hora

-- restricción de FOREIGN KEY 
-- afregamos la restricción para cuidar la integridad referencial de la base

alter table facturas -- modifica estructuras
add constraint FK_facturas_codigoCliente -- 
foreign key(codigoCliente) references clientes(codigo); -- es una llave que identifica a la llave primaria en otra tabla

-- borramos los registros de facturas que no tengan un cliente valido 
delete from facturas where codigoCliente > 10;
-- join entre tablas y se elimina lo que no exista
-- ya creamos la restricción 

-- quienes compraron hoy? (nombre, apellido)
select nombre, apellido from clientes join facturas on codigo=codigoCliente where fecha=curdate(); 

-- qué compras (facturas) realizó Juan Perez?
select f.* from facturas f join clientes c on codigo=codigoCliente where nombre='Juan' and apellido='Perez';

-- cuánnto se le facturó a cada cliente?
select	codigo, nombre, apellido, sum(monto) total
from	clientes
join	facturas on codigo=codigoCliente
group by	codigo;

-- creamos las tablas articulos y detalles

create table articulos(
	codigo int primary key,
    nombre varchar(50) not null,
    precio double not null,
    stock int not null
); 

create table detalles(
	letra char(1),
    numero int,
    codigo int,
    cantidad int not null,
    primary key(letra, numero, codigo)
);

-- creamos las restricciones de claves foráneas
alter table detalles add constraint FK_detalles_facturas
foreign key(letra, numero) references facturas(letra, numero);

alter table detalles add constraint FK_detalles_articulos
foreign key(codigo) references articulos(codigo); 





