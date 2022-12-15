drop table if exists course;
drop table if exists student;


create table course(course_id numeric primary key,
course_name varchar(30));

create table student(sname varchar(30),
sid numeric primary key,sage numeric,
course_id numeric references course(course_id));


insert into course values(101, 'DBMS');
insert into course values(102, 'OS');
insert into course values(103, 'CN');
insert into course values(104, 'TOA');
insert into course values(105, 'CD');



insert into student values('A',1,10,103);
insert into student values('B',2,11,101);
insert into student values('C',3,11,102);
insert into student values('G',4,12,101);
insert into student values('D',5,12,104);
insert into student values('E',6,11,102);
insert into student values('F',7,10,103);

--------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------  Join  --------------------------------------------------------------------------

select*from course;
select* from student;

select * from course c join student s on c.course_id = s.course_id ;  -------------- inner join use like this 

select * from student s ,student c where s.course_id = c.course_id;  ------------------ self join use like this 

