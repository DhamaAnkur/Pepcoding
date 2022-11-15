
---------------------------------------------- some constraint ---------------------------------------------
--not null--
--default--
--check--
--unique--

# not null constraint---------------------------------------------------------------------------------------
    
create table student(
  st_name varchar(20) not null,
  st_age numeric,
  st_grade char
); 

insert into student values('sid', 24, 'C' );
insert into student values('Ankur', 21, 'A');

(if you dont know the order of your table)-------------------------------
insert into student(st_name , st_grade , st_age) values ('ABCDE' , 'E' , 30);

select * from student;

drop table if exists student;




# default constraint--------------------------------------------------------------------------------------------

create table account(
  h_name varchar(20) not null,
  h_age numeric  ,
  h_grade char default 'Z'
);

insert into account values('Ankur',18);

select * from account ;

drop table if exists account ;


# check constraint-----------------------------------------------------------------------------------------------

create table student(
  st_name varchar(20),
  st_age numeric,
  st_grade char check (st_grade in ('A' , 'B' , 'C' , 'D' , 'E' , 'F'))
); 

insert into student values('sid', 24, 'C' );
insert into student values('Ankur', 21, 'Z');  it through error because Z is not in the check constraint

select * from student;

drop table if exists student;


# unique constraint-----------------------------------------------------------------------------------

create table employee(
  id numeric unique,
  name varchar(20),
  age numeric
); 

insert into employee values( 01 ,'sid', 24 );
insert into employee values(02,'Ankur', 21 );
insert into employee values(02,'Abhi', 11 );  it through an error because id num is not unique constraint

select * from employee;

drop table if exists employee;
