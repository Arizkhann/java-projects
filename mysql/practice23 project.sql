create database practice23;

use practice23;



create table department 
(
deptNo int,
Dname varchar(30),
loc varchar(30),
primary key(deptno)
);

create table employ
(
Empno int,
deptNo int,
EmpName varchar(30),
Gender enum('MALE','FEMALE'),
city varchar(30),
primary key(EMpno),
foreign key(deptNo) references department(deptno)
);



create Table project 
(
projcode int,
empno int,
hours int,
projname varchar(30),
foreign key(empno) references employ(empno),
primary key(empno,projcode)
)