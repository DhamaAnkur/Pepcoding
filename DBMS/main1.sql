 
---------------------------------------------------create database--------------------------------------------------------------


create database PEP;

create schema Company authorization postgres;

select schema_name  from information_schema.schemata s ;

show search_path;

set search_path to Company;

create table Employee(
FName varchar(20),
Minit char,
LName varchar(20),
SSN char(9),
BDate date,
Address varchar(50),
Sex char,
Salary numeric,
SuperSsn varchar(9),
Dno numeric
);