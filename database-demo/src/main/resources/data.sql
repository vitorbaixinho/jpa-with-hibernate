create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

insert into person (id,name,location,birth_date) values (10001, 'vitor1', 'lisboa1', sysdate()-1);
insert into person (id,name,location,birth_date) values (10002, 'vitor2', 'lisboa2', sysdate()-2);
insert into person (id,name,location,birth_date) values (10003, 'vitor3', 'lisboa3', sysdate()-3);
insert into person (id,name,location,birth_date) values (10004, 'vitor4', 'lisboa4', sysdate()-4);