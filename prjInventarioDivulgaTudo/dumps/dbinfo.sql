-- Cria o banco de dados
create database dbinfo;
-- Seleciona o banco de dados
use dbinfo;
-- Cria a tabela de usuários
create table tbusers(
iduser int primary key,
id varchar(50) not null,
login varchar(15) not null unique,
senha varchar(15) not null
);
-- Descreve a tabela
describe tbusers;
-- Insere dados na tabela (CRUD)
-- Create
insert into tbusers(iduser,id,login,senha)
values(1,'Ana Clara','AnaClara','12345');
-- Exibe dados da tabela (CRUD)
-- read -- select
select * from tbusers; 
insert into tbusers(iduser,id,login,senha)
values(2,'Administrador','Admin','admin');
insert into tbusers(iduser,id,login,senha)
values(3,'Maria Helena','MHelena','12345');
-- Modifica dados da tabela (CRUD)
-- update -> update
update tbusers set senha='123456' where iduser=3;
-- Deleta um registro da tabela (CRUD)
-- delete -> delete
delete from tbusers where iduser=3;
-- Cria a tabela de anúncios
create table tbads(
idad int primary key auto_increment,
nomecliente varchar(50) not null,
datainicio date not null,
datatermino date not null,
invest decimal not null
);
describe tbads;
insert into tbads (idad,nomecliente,datainicio,datatermino,invest)
values ('1','Empresa Variedades Mil','2021/01/01','2021/01/03','300.00');
insert into tbads (idad,nomecliente,datainicio,datatermino,invest)
values ('2','Eletrodomésticos A&A','2019/02/15','2020/02/15','55.00');
insert into tbads (idad,nomecliente,datainicio,datatermino,invest)
values ('3','Beauty Cosméticos','2020/09/01','2021/01/05','120.00');
select * from tbads;
-- Cria tabela de relatório
create table tbrelat(
idad int primary key auto_increment,
nomecliente varchar(50) not null,
invtotal decimal not null,
vtotal int not null,
maxclick int not null,
maxshare int not null,
foreign key(idad) references tbads(idad));
describe tbrelat;
insert into tbrelat (idad,nomecliente,invtotal,vtotal,maxclick,maxshare)
values (1,'Empresa Variedades Mil','1000','86410','1343','200');
insert into tbrelat (idad,nomecliente,invtotal,vtotal,maxclick,maxshare)
values (2,'Eletrodomésticos A&A','715','61783','960','143');
insert into tbrelat (idad,nomecliente,invtotal,vtotal,maxclick,maxshare)
values (3,'Beauty Cosméticos','7320','632521','9833','1464');
insert into tbrelat (idad,nomecliente,invtotal,vtotal,maxclick,maxshare)
values (4,'Skatewear Radical','10500','907305','14105','2100');
insert into tbrelat (idad,nomecliente,invtotal,vtotal,maxclick,maxshare)
values (5,'Ecommerce Bela Jeans','2450','211704','10967','');
select * from tbrelat;
-- Apresenta informações de duas tabelas

select
A.nomecliente,datainicio,datatermino,invest,
R.nomecliente,invtotal,vtotal,maxclick,maxshare
from tbads as A
inner join tbrelat as R
on (A.idad = R.idad );
