

create table course(c_id numeric primary key , c_name varchar(20));
create table student(s_id numeric , s_name varchar(30) , sc_id numeric references course(c_id));

select * from student;
select * from course;

drop table if exists student;
drop table if exists course cascade ; --cascade deletes referencing foreign key to primary key arrow (-->) and deletes data from referencing table not the referenced table

