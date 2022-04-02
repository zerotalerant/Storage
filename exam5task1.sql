create table routes(
id integer primary key not null,
route_number varchar(100) not null unique,
start_coordinate varchar (250) not null,
end_coordinate varchar (250) not null 
);

insert into routes
values (1, 'SC210', 'Военный городок','12 мкр'),
       (2, '2140V', 'мкр Асанбай', 'Ак-Ордо'),
       (3, '213FK', 'Токомбаева', 'Аламедин-1');


create table bus(
id integer primary key not null,
bus_number integer not null unique,
routes_id integer not null references routes (id)
);

insert into bus 
values (1, '212', 1),
       (2, '204', 2),
       (3, '172', 3);

create table drivers(
id integer primary key not null,
fio varchar (150) not null
);

insert into drivers 
values (1, 'Magamed Bobrovski'), 
       (2, 'Babijon Usurov'),
       (3, 'Mahripa Hripulaevna');

create table bus_drivers(
id integer primary key not null,
driver_id integer not null references drivers (id),
bus_id integer not null references bus (id)
);

insert into bus_drivers 
values (1, 3, 2),
       (2, 2, 1),
       (3, 1, 3),	
       (4, 3, 2);

create table reports(
id integer primary key not null,
bus_driver integer not null references bus_drivers (id),
work_time timestamp not null
);

insert into reports 
values (1, 1, '02-04-2022 06:00:16'),
       (2, 2, '02-04-2022 05:35:21'),
       (3, 3, '02-04-2022 08:02:43');