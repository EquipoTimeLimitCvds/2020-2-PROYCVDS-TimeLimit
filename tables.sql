create table if not exists "PERSONAL" (
	id int NOT NULL,
	nombre varchar(30) NOT NULL,
	cargo Varchar(15) NOT NULL,
	apellido Varchar(30) NOT NULL,
	clave Varchar(50) NOT NULL	
);

create table if not exists "Laboratorios"(
	Id int not null,
	Nombre varchar(30)not null,
	No_Equipo int not null,
	Horario varchar (20)not null,
	Descripcion Varchar(30)not null
);

create table if not exists "Tiene" (
	IdPersonal int not null,
	IdLaboratorio int not null
);

create table  if not exists "equipos"(
	Id int not null,
	Estado Varchar(20)not null,
	EnUso boolean not null,
	IdLaboratorio int not null
);

create table if not exists "elementos"(
	Id int not null,
	Nombre Varchar(30)not null,
	Marca Varchar(30)not null,
	Modelo varchar(30)not null,
	Caracteristicas varchar(50)not null,
	IdEquipo int not null
);
create table if not exists "novedades"(
	Id int not null,
	Fecha date not null,
	descripcion varchar(50) not null,
	estado varchar(15) not null,
	tipo varchar(15) not null,
	IdElemento int not null
);

alter table "PERSONAL" add constraint PK_PERSONAL primary key(id);
alter table "Laboratorios" add constraint PK_Laboratorios primary key(id);
alter table "equipos" add constraint PK_Equipos primary key(id);
alter table "elementos" add constraint PK_Elementos primary key(id);
alter table "novedades" add constraint PK_Novedades primary key(id);

alter table "Tiene" add constraint FK_Tiene_Personal foreign key(IdPersonal) references "PERSONAL"(id);
alter table "Tiene" add constraint FK_Tiene_Laboratorios foreign key(IdLaboratorio) references "Laboratorios"(id);
alter table "equipos" add constraint FK_Equipos_Laboratorios foreign key(IdLaboratorio) references "Laboratorios"(id);
alter table "elementos" add constraint FK_elementos_Equipos foreign key(IdEquipo) references "equipos"(id);
alter table "novedades" add constraint FK_novedades_Equipos foreign key(IdElemento) references "equipos"(id);
alter table "novedades" add constraint FK_novedades_Laboratorios foreign key(IdElemento) references "Laboratorios"(id);
alter table "novedades" add constraint FK_novedades_elementos foreign key(IdElemento) references "elementos"(id);