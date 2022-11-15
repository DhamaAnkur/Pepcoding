

----------------------------------------primary key constraint----------------------------------------------------------
--it is the combination of not null and unique constraint--


create table student(
  st_name varchar(20)primary key,
  st_age numeric,
  st_grade char
); 

insert into student values('sid', 24, 'C' );
insert into student values('Ankur', 21, 'A');
insert into student values('sid', 20, 'B' ); it through an error because st_name have a primary key

select * from student;

drop table if exists student;


-------------------------------------------------------------------------------------


create table student(
  st_name varchar(20),
  st_age numeric,
  st_grade char,
  primary key(st_name , st_age)
); 

insert into student values('sid', 24, 'C' );
insert into student values('Ankur', 21, 'A');
insert into student values('sid', 20, 'B' ); it does not through an error because st_name and st_age both combination is primary key

select * from student;

drop table if exists student;


