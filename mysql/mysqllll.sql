create database collegee;
use collegee;
create table studentsss(
rollno int primary key,
name varchar(50),
marks int not null,
grade varchar(1),
city varchar(50)
);
insert into students values

(1,"ariz",86,"b","bbsr"),
(2,"amit",76,"c","pune"),
(3,"saurav",66,"d","cuttuck"),
(4,"rohan",99,"a","banglore"),
(5,"gaurav",66,"d","pune");
 select * from students;


select  city,count(name) from students
group by(city);
 