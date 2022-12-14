

drop table if exists course;
drop table if exists student;

create table course(c_id numeric primary key, c_name varchar(30));
create table student(s_id numeric , s_name varchar(30) , sc_id numeric references course(c_id) on delete set null);  -- when you delete a table which has referenced from other table than the data also be deleted from renferencing table and set null  

insert into course values(1,'DBMS');
insert into course values(2,'DSA');
insert into course values(3,'OS');
insert into course values(4,'JAVA');

insert into student values(101,'Ankur' ,2);
insert into student values(102,'Abhi' ,3);
insert into student values(103,'Anshul' ,4);
insert into student values(104,'Ankit' ,3);

select * from course ;
select * from student ;

truncate table course cascade;  --it deletes all the data inside the table or schema but it did not delete skeleton/schema/column of the table 

delete from course where c_id%2=0;