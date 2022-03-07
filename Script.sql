--create table book (
--id integer primary key,
--name varchar(100),
--year timestamp,
--has_in_library boolean
--);
--	
--insert into book (1, name, year, has_in_library)
--values ('Sasha', '2022-02-3 19:35', true);
--
--insert into book (id, name, year, has_in_library)
--values ('Masha', '2020-01-4 22:42', true);
--
--select * from book;

--insert into book 
--values (2, 'Misha', '2232-02-13 24:00', false);

--create sequence vid_sporta_id_seq;

--create table vid_sporta (
--id integer primary key default nextval('vid_sporta_id_seq'),
--vid_sporta varchar(115),
--cash integer
--);

--insert into vid_sporta (vid_sporta, cash)
--values ('football', 4000);

--select * from vid_sporta;

--create sequence coach_inn_seq;

--create table coach (
--id integer,
--fio varchar(100),
--id_vid_sporta integer,
--telephone integer primary key,
--inn integer
--);

create sequence visitor_visitor_seq;

create table visitor (
fio varchar (115),
birth_date timestamp,
gender boolean
);

insert into visitor (fio, birth_date, gender)	
values ('Ivanov Alexander', '2001-02-21', true );

insert into visitor (fio, birth_date, gender)
values ('Kartavyi Sasha', '1999-12-31', true );

insert into visitor (fio, birth_date, gender)
values ('Oleg Mask', '1994-06-12', true );

create table visit (
visitor varchar (115),
visit_time timestamp,
trainer varchar (115)
);

insert into visit (visitor, visit_time, trainer)
values ('Ivanov Alexander', '2022-02-03 16:50', 'Iliya Biceps');

select * from visit;

select * from visitor;
