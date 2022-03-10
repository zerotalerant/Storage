create table student (
id integer primary key,
fio varchar(100) not null,
id_gruppi integer references gruppa (id) ,
date_of_birth timestamp
);

insert into student (id, fio,id_gruppi,date_of_birth)
values (222, 'Ahmed Rahimjanov', 1, '1999-02-21');
insert into student (id, fio,id_gruppi,date_of_birth)
values (333, 'Magamed Sharipov', 2, '1999-09-01');
insert into student (id, fio,id_gruppi,date_of_birth)
values (444, 'Babijon Sasha', 2, '2001-12-29');

create table gruppa (
id integer primary key,
id_fakulteta integer references fakultet (id),
kod_gruppi integer not null unique
);

insert into gruppa (id, id_fakulteta, kod_gruppi)
values (1, 43532, 123);
insert into gruppa (id, id_fakulteta, kod_gruppi)
values (2, 32323, 456);
insert into gruppa (id, id_fakulteta, kod_gruppi)       
values (3, 22422, 789);

create table  fakultet (
id integer primary key,
fakultet_name varchar (100) not null ,
id_university integer references university (id)
);

insert into fakultet (id, fakultet_name, id_university)
values (43532, 'Krutoi13', 12342);
insert into fakultet (id, fakultet_name, id_university)
values (32323, 'Begemotiki221', 42242);
insert into fakultet (id, fakultet_name, id_university)
values (22422, 'Mediki2022', 53423);

create table university (
id integer primary key,
university_name varchar (10) not null	
);

insert into university (id, university_name)
values (12342, 'KGTY');
insert into university (id, university_name)
values (42242, 'KSTU');
insert into university (id, university_name)
values (53423, 'KGMA');

create table subject  (
id integer primary key,
subject_name varchar (20) not null
);

insert into subject (id, subject_name)
values (53, 'Math');
insert into subject (id, subject_name)
values (66, 'Physic');
insert into subject (id, subject_name)
values (42, 'English');

create table mark (
id_studenta integer references student (id),
mark integer not null,
subject integer references subject (id)
);

insert into mark (id_studenta,mark,subject)
values (222, 3 , 53);
insert into mark (id_studenta,mark,subject)
values (222, 4 , 66);
insert into mark (id_studenta,mark,subject)
values (222, 4 , 42);

insert into mark (id_studenta,mark,subject)
values (333, 4 , 53);
insert into mark (id_studenta,mark,subject)
values (333, 5 , 66);
insert into mark (id_studenta,mark,subject)
values (333, 5 , 42);

insert into mark (id_studenta,mark,subject)
values (444, 3 , 53);
insert into mark (id_studenta,mark,subject)
values (444, 2 , 66);
insert into mark (id_studenta,mark,subject)
values (444, 3 , 42);


select fio, avg(mark) from mark m 
join student s on s.id = m.id_studenta;

select student.fio ,m.kod_gruppi,f.fakultet_name , u.university_name from student s 
join gruppa g on m.id = s.mark 
join fakultet f on f.id = f.id_fakulteta 