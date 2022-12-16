drop table if exists course;
drop table if exists student;


--create table course(course_id numeric primary key,
--course_name varchar(30));
--
--create table student(sname varchar(30),
--sid numeric primary key,sage numeric,
--course_id numeric references course(course_id));

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table course(course_id numeric,
course_name varchar(30));

create table student(sname varchar(30),                            --- for outer join/ left join 
sid numeric ,sage numeric,
course_id numeric );
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

insert into course values(101, 'DBMS');
insert into course values(102, 'OS');
insert into course values(103, 'CN');
insert into course values(104, 'TOA');
insert into course values(105, 'CD');



insert into student values('A',1,10,103);
insert into student values('B',2,11,101);
insert into student values('C',3,11,102);
insert into student values('D',4,12,101);
insert into student values('E',5,12,104);
insert into student values('F',6,11,102);
insert into student values('G',7,10,103);
insert into student values('H',8,14,111);
insert into student values('I',9,10,null);
--------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------  Join  --------------------------------------------------------------------------

select*from course;
select* from student;


----------------------------(1) INNER JOIN 

select * from course c join student s on c.course_id = s.course_id ;  -------------- inner join use like this 


select * from student s left join student c on s.course_id = c.course_id;   -------------- self join use like this 


select * from student s  natural join  course c ;  -- It gives you matching tupples from table student and course and if they have not same name os attribute 
  -- than it gives you a cartesian product of the tables.






---------------------------(2) OUTER JOIN 


select * from student s left join course c on s.course_id  = c.course_id  order by s.sname ; --left join ( it includes matching tupples or also left full table 
-- and gives null for non-matching tupples )


select * from student s right join course c on s.course_id  = c.course_id  order by s.sname ;  -- right join (it includes matching tupples or also rigth full table )
 -- and gives null for non-matching tupples )
 


select * from student s full join course c on s.course_id  = c.course_id  order by s.sname; --full join (it includes matching tupples or also both table student and course )
 -- and gives null for non-matching tupples )  LOJ.Union.ROJ (Loj - Left outer join ) , (ROJ - Right outer join)






------------------------ --(3)CROSS JOIN


select * from student s cross join course c  ;  -- It is like cartesian product 



















