create table if not exists "Personal" (
	id int NOT NULL,
	nombre varchar(30) NOT NULL,
	name varchar(30) NOT NULL,
	cargo Varchar(15) NOT NULL,
	apellido Varchar(30) NOT NULL,
	clave Varchar(200) NOT NULL	
);
  
create table if not exists "Laboratorio"(
	Id integer not null,
	Nombre varchar(30)not null,
	Horario varchar (20)not null,
	Descripcion Varchar(50)not null,
	cerrado Varchar(2)not null,
	fechaDeCreado date not null,
	fechaDeCerrado date 
);
 
create table  if not exists "Equipo"(
	Id int not null,
	Nombre Varchar(50)not null,
	Estado Varchar(20)not null,
	EnUso Varchar (4)not null,
	IdLaboratorio int not null,
	nombreLaboratorio varchar(30)
);

create table if not exists "Elemento"(
	Id int not null,
	Nombre Varchar(30)not null,
	Marca Varchar(30)not null,
	Modelo varchar(30)not null,
	Caracteristicas varchar(50)not null,
	IdEquipo int not null
);
create table if not exists "Novedad"(
	Id int not null,
	Fecha date not null,
	descripcion varchar(50) not null,
	estado varchar(15) not null,
	tipo varchar(15) not null,
	IdElemento int not null
);

alter table "Personal" add constraint PK_PERSONAL primary key(id);
alter table "Laboratorio" add constraint PK_Laboratorios primary key(id);
alter table "Equipo" add constraint PK_Equipos primary key(id);
alter table "Elemento" add constraint PK_Elementos primary key(id);
alter table "Novedad" add constraint PK_Novedades primary key(id);

alter table "Personal" add constraint UK_name unique(nombre);
alter table "Equipo" add constraint UK_nombreEquipo unique(nombre);




insert into "Personal" (id,nombre,name,cargo,apellido,clave) values(2146684,'Lina10','Lina','Monitor','Buitrago','b24f3a9ad4c9fedcadf95801740ed240667b9b0ecb4b14be25616f5681341836');
insert into "Personal"(id,nombre,name,cargo,apellido,clave) values(2145058,'Steven15','Lina','Monitor','Bermudez','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92');
insert into "Personal"(id,nombre,name,cargo,apellido,clave) values(2145059,'Santiago27','Lina','Monitor','Laiton','88f4380b893c15a3e8361a8910fb7989b4261f303643858a6963b59f507076a1');
insert into "Personal"(id,nombre,name,cargo,apellido,clave) values(2145054,'SebastianVilla','Sebastian','Monitor','Villamarin','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92');
 