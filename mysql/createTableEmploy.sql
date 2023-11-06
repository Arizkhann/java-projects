drop database if exists infinite_august23;
create database infinite_august23;
use infinite_august23;


drop table if exists employ;
create TABLE EMPLOY
(
empno int primary key,
name varchar(30),
gender enum('male','female'),
dept varchar(30),
desig varchar(30),
basic numeric(9,2)
);