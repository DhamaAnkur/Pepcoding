

drop schema if exists company cascade ;
show search_path;

create schema company authorization postgres;
set search_path to 'company';


 

CREATE TABLE EMPLOYEE
( Fname           VARCHAR(10)   NOT NULL,
  Minit           CHAR,
  Lname           VARCHAR(20)      NOT NULL,
  Ssn             CHAR(9)          NOT NULL,
  Bdate           DATE,
  Address         VARCHAR(30),
  Sex             CHAR(1),
  Salary          DECIMAL(5),
  Super_ssn       CHAR(9),
  Dno             INT               NOT NULL,
PRIMARY KEY   (Ssn));

CREATE TABLE DEPARTMENT
( Dname           VARCHAR(15)       NOT NULL,
  Dnumber         INT               NOT NULL,
  Mgr_ssn         CHAR(9)           NOT NULL,
  Mgr_start_date  DATE,
PRIMARY KEY (Dnumber),
UNIQUE      (Dname),
FOREIGN KEY (Mgr_ssn) REFERENCES EMPLOYEE(Ssn) );

CREATE TABLE DEPT_LOCATIONS
( Dnumber         INT               NOT NULL,
  Dlocation       VARCHAR(15)       NOT NULL,
PRIMARY KEY (Dnumber, Dlocation),
FOREIGN KEY (Dnumber) REFERENCES DEPARTMENT(Dnumber) );

CREATE TABLE PROJECT
( Pname           VARCHAR(15)       NOT NULL,
  Pnumber         INT               NOT NULL,
  Plocation       VARCHAR(15),
  Dnum            INT               NOT NULL,
PRIMARY KEY (Pnumber),
UNIQUE      (Pname),
FOREIGN KEY (Dnum) REFERENCES DEPARTMENT(Dnumber) );

CREATE TABLE WORKS_ON
( Essn            CHAR(9)           NOT NULL,
  Pno             INT               NOT NULL,
  Hours           DECIMAL(3,1)      NOT NULL,
PRIMARY KEY (Essn, Pno),
FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn),
FOREIGN KEY (Pno) REFERENCES PROJECT(Pnumber) );

CREATE TABLE DEPENDENT
( Essn            CHAR(9)           NOT NULL,
  Dependent_name  VARCHAR(15)       NOT NULL,
  Sex             CHAR,
  Bdate           DATE,
  Relationship    VARCHAR(8),
PRIMARY KEY (Essn, Dependent_name),
FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn) );

INSERT INTO EMPLOYEE
VALUES      ('John','B','Smith',123456789,'1965-01-09','731 Fondren, Houston TX','M',30000,333445555,5),
            ('Franklin','T','Wong',333445555,'1965-12-08','638 Voss, Houston TX','M',40000,888665555,5),
            ('Alicia','J','Zelaya',999887777,'1968-01-19','3321 Castle, Spring TX','F',25000,987654321,4),
            ('Jennifer','S','Wallace',987654321,'1941-06-20','291 Berry, Bellaire TX','F',43000,888665555,4),
            ('Ramesh','K','Narayan',666884444,'1962-09-15','975 Fire Oak, Humble TX','M',38000,333445555,5),
            ('Joyce','A','English',453453453,'1972-07-31','5631 Rice, Houston TX','F',25000,333445555,5),
            ('Ahmad','V','Jabbar',987987987,'1969-03-29','980 Dallas, Houston TX','M',25000,987654321,4),
            ('James','E','Borg',888665555,'1937-11-10','450 Stone, Houston TX','M',55000,null,1);

INSERT INTO DEPARTMENT
VALUES      ('Research',5,333445555,'1988-05-22'),
            ('Administration',4,987654321,'1995-01-01'),
            ('Headquarters',1,888665555,'1981-06-19');

INSERT INTO PROJECT
VALUES      ('ProductX',1,'Bellaire',5),
            ('ProductY',2,'Sugarland',5),
            ('ProductZ',3,'Houston',5),
            ('Computerization',10,'Stafford',4),
            ('Reorganization',20,'Houston',1),
            ('Newbenefits',30,'Stafford',4);

INSERT INTO WORKS_ON
VALUES     (123456789,1,32.5),
           (123456789,2,7.5),
           (666884444,3,40.0),
           (453453453,1,20.0),
           (453453453,2,20.0),
           (333445555,2,10.0),
           (333445555,3,10.0),
           (333445555,10,10.0),
           (333445555,20,10.0),
           (999887777,30,30.0),
           (999887777,10,10.0),
           (987987987,10,35.0),
           (987987987,30,5.0),
           (987654321,30,20.0),
           (987654321,20,15.0),
           (888665555,20,16.0);

INSERT INTO DEPENDENT
VALUES      (333445555,'Alice','F','1986-04-04','Daughter'),
            (333445555,'Theodore','M','1983-10-25','Son'),
            (333445555,'Joy','F','1958-05-03','Spouse'),
            (987654321,'Abner','M','1942-02-28','Spouse'),
            (123456789,'Michael','M','1988-01-04','Son'),
            (123456789,'Alice','F','1988-12-30','Daughter'),
            (123456789,'Elizabeth','F','1967-05-05','Spouse');

INSERT INTO DEPT_LOCATIONS
VALUES      (1,'Houston'),
            (4,'Stafford'),
            (5,'Bellaire'),
            (5,'Sugarland'),
            (5,'Houston');

ALTER TABLE DEPARTMENT
 ADD CONSTRAINT Dep_emp FOREIGN KEY (Mgr_ssn) REFERENCES EMPLOYEE(Ssn);

ALTER TABLE EMPLOYEE
 ADD CONSTRAINT Emp_emp FOREIGN KEY (Super_ssn) REFERENCES EMPLOYEE(Ssn);
ALTER TABLE EMPLOYEE
 ADD CONSTRAINT Emp_dno FOREIGN KEY  (Dno) REFERENCES DEPARTMENT(Dnumber);
ALTER TABLE EMPLOYEE
 ADD CONSTRAINT Emp_super FOREIGN KEY  (Super_ssn) REFERENCES EMPLOYEE(Ssn);
 

------------------------------------------------------------------(1) Question --> For every employee retrieve the employee's first name and last name 
-- and the first name and last anemof his/her immediate supervisor.

select * from employee e ;


select e.fname  ,e.lname  ,s.fname  ,s.lname  
from employee e ,employee s 
where e.super_ssn  = s.ssn ;


-----------------------------------------------------------------------(2)Question -->  retrieve the salary of every employee and all the distinct salary values.

select * from employee e ;

select distinct salary    ----- distinct keyword is used to remove the duplicates row/tupple
from  employee e; 



------------------------------------------------------------------------(3)Question -->  Make a list of all project number for projects that involve an employee whose last
-- name is "Smith" either as worker or as a manager of the department that controls the projects.

select * from employee ; 
select * from project ;
select * from works_on ;
--select * from department ;

select p.pnumber , e.fname 
from employee e , project p , works_on wo 
where e.lname = 'Smith' and wo.essn = e.ssn and p.pnumber  = wo.pno ;



-------------------------------------------------------------------------------(4)Question --> Retrieve all employees whose address is in " Houston TX " 
select * from employee ; 
select * from project ;
select * from works_on ;

select * 
from employee e 
where address like '%Houston TX%';      -- Filtering in any tupple with use of like keyword and '% Houston TX %' from "731 Fondren, Houston TX" ;



select e.fname , e.lname 
from employee e 
where to_char(bdate , 'YYYY-MM-DD') like  '196_______';     --- change the pattern of Date to store the "DATE" with use of to_char



select *
from employee e 
where extract(year from bdate) <1970;





---------------------------------------------------------------------------(5)Question --> Show resulting salary if every employee working ont hte "Product X"
----  project is given a raise of 50%. 

select * from employee ;
select * from project p ;
select * from works_on wo ;

select e.fname  , e.lname , salary * 1.5    ---salary * 1.5 means (salary = salaray*1.5)  --> increases salary by 50% of itself and 
------------------------------------------------------------------------------------salary * 2 (salary = salaray*2)  means increases salary by 100% 
from employee e , project p , works_on wo 
where  p.pnumber  = wo.pno  and wo.essn  = e.ssn and p.pname = 'ProductX' ;


--------------------------------------------------------------------------------(6)Retrieve all the employee in " Department 5 " whose salary between $40,000 to $50,000  

select * from employee e ;
select * from department d ;

select * 
from employee e , department d 
where d.dnumber  = 5 and salary >= 40000 and salary <= 50000 ;


















