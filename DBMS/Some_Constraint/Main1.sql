 
drop table if exists student;
drop table if exists gradeT;

--First type for writing primary key and foreign key**************************************************************************

create table gradeT(
g_id numeric ,
g_name char primary key      ---------->               primary key                   <--------
);

create table student(
s_id numeric,
s_name varchar(30),
s_grade char references gradeT(g_name)    ----------->              foreign key               <--------------
);


--Second type for writing primary key and Foreign key************************************************************************

create table gradeT(
g_id numeric ,
g_name char,
primary key(g_name)         
);


create table student(
s_id numeric,
s_name varchar(30),
s_grade char,
foreign key (s_grade) references gradeT(g_name)   on delete cascade   -- on delete cascade is used to delete tuple wise data also from referenced table(student).....
);



insert into gradeT values(1 , 'A');
insert into gradeT values(2 , 'B');
insert into gradeT values(3 , 'C');


insert into student values(1 , 'Ankur' , 'B');
insert into student values(2 , 'Abhi' , 'B');
insert into student values(3 , 'Tinny' , 'A');

select * from student;
select * from gradeT ;

delete from student where s_name = 'Tinny';

delete from gradeT where g_name = 'B';  --it htrough an error because it gives foreign key constraint because we delete primary key table in g_name







































