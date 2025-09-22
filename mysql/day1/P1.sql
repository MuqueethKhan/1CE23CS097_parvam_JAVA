create database MMKHAN;

use MMKHAN;

create table employee(
e_id int primary key,
e_name varchar(50),
e_roll int,
e_phone varchar(10),
e_email varchar(40)
);

desc employee;

insert into employee values
(1, "Maxim", 1287, '8478276899', 'maxim@gmail.com'),
(2, "Ford", 7845, '9654254123', 'ford@gmail.com'),
(3, "Luqueta", 5868, '7586943232', 'luqueta@gmail.com'),
(4, "Leon", 6845, '8654847895', 'leon@gmail.com');

select * from employee;