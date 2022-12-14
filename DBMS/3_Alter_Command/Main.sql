create table irctc(
t_id numeric primary key ,
t_name varchar(30),
t_arrival varchar (30),
t_departure varchar(30)
);

select * from irctc;

alter table irctc add t_date date;    --for add a column--

alter table irctc drop column t_date;   --for remove/delete a column--

alter table irctc rename t_date to t_time;  --for rename a column--

alter table irctc alter column t_time type text;  --for change data type--


alter table irctc alter t_name set not null;

--insert into irctc(t_id , t_time) values(321,'ABC321');   --also a way to insert values--


insert into irctc values(100 , 'Rajdhani' , 'Delhi' , 'Mimbai' , '9:00am');
insert into irctc values(101 , 'Lok' , 'Goa' , 'Mimbai' , '9:20am');
insert into irctc values(102 , 'chennai express' , 'Old-Delhi' , 'chennai' , '9:30am');
insert into irctc values(106 , null ,'Punjab' , 'pathankot' , '9:15am');   -- it through an error because we add constraint in t_name( not null ) --

drop table if exists irctc;  --for drop full schema from database-- 

delete from irctc;  -- for delete all tuples -- 
