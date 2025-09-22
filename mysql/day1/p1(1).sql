show databases;
create database student_mgmt;
show databases;
use student_mgmt;
create table student(
s_id int primary key,
s_name varchar(50),
s_roll int,
s_email varchar(40)
);
insert into student(s_id, s_name, s_roll, s_email) values
(1, "Alok", 12, 'Alok@ff.com');

select * from student;
select s_name, s_email from student;

alter table student DROP column s_class;

Alter table student add column s_class varchar(20) default 'C103';
desc student;

INSERT INTO student (s_id, s_name, s_roll, s_email) VALUES
(2, 'Neha',   15, 'neha@ff.com'),
(3, 'Rahul',  18, 'rahul@ff.com'),
(4, 'Priya',  21, 'priya@ff.com'),
(5, 'Arjun',  24, 'arjun@ff.com'),
(6, 'Sonal',  27, 'sonal@ff.com');

select * from student limit 2;

select * from student where s_id=5;

INSERT INTO student (s_id, s_name, s_roll, s_email) VALUES
(7,  'Vikas',     30, 'vikas@ff.com'),
(8,  'Meena',     33, 'meena@ff.com'),
(9,  'Ravi',      36, 'ravi@ff.com'),
(10, 'Kavita',    39, 'kavita@ff.com'),
(11, 'Deepak',    42, 'deepak@ff.com'),
(12, 'Simran',    45, 'simran@ff.com'),
(13, 'Ankit',     48, 'ankit@ff.com'),
(14, 'Pooja',     51, 'pooja@ff.com'),
(15, 'Sandeep',   54, 'sandeep@ff.com');

select * from student limit 3 offset 1;

update student
set s_class='C408'
where s_id=4;

select * from student;

delete from student 
where s_id=15;

truncate student; /*Delete the information from table, wwithout dropping the table*/

drop table student;/*Table deletion*/

drop database student_mgmt; /*db deletion*/

