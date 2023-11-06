drop database if exists training;

 

create database training;

 

use training;

 

drop table if exists courses;

 

create table courses(
ccode varchar(5) primary key,
cname varchar(30),
duration numeric(3) not null,
fee numeric(5) not null,
prerequisite varchar(100)
);



insert into courses
values('C001','Java',90,10000,'No Prerequisite knowledge required'),
('C002','Python',90,10000,'No Prerequisite knowledge required'),
('C003','Web-Dev',120,11000,'Basics of Web-Dev required'),
('C004','Data Science',120,12000,'Basics of Excel, Python, SQL required');

 

 

drop table if exists faculty;

 

 

create table faculty(
faccode varchar(5) primary key,
fname varchar(30),
qual varchar(30),
exp varchar(100));

 

insert into faculty
values('F0001','Ramos','Phd.','3 years'),
('F0002','Benzema','Ex-Army','6 years'),
('F0003','Messi','Phd','7 years'),
('F0004','Ronaldo','M.Tech','7 years');

 

 

drop table if exists course_faculty;

 

create table course_faculty(
faccode varchar(5),
ccode varchar(5),
grade varchar(1),
foreign key (faccode) references faculty(faccode),
foreign key (ccode) references courses(ccode));

 

insert into course_faculty
values('F0001','C003','A'),
('F0002','C002','B'),
('F0003','C004','B'),
('F0004','C001','A');

 

 

drop table if exists batches;

 

create table batches(
bcode varchar(5) primary key,
ccode varchar(5),
faccode varchar(5),
stdate date,
enddate date ,
timing numeric(1),
foreign key (ccode) references courses(ccode),
foreign key (faccode) references faculty(faccode),
check(stdate<=enddate)
);

 

insert into batches
values('BA01','C001','F0004','2023-10-01','2023-12-30',1),
('BA02','C002','F0002','2023-10-01','2023-12-30',2),
('BA03','C004','F0003','2023-11-01','2024-02-28',3),
('BA04','C003','F0001','2023-10-01','2024-01-30',1),
('BA05','C001','F0004','2023-07-01','2023-10-30',2),
('BA06','C004','F0001','2023-07-01','2023-10-30',1);

 

 

drop table if exists batches;

 

create table students(
rollno int primary key,
bcode varchar(5),
sname varchar(30),
gender char(1) check(gender IN('M','F')),
dj date,
phone varchar(10),
email varchar(30),
foreign key (bcode) references batches(bcode)
);

 

insert into students 
values(10001,'BA01','Vini Jr.','M','2023-10-01','980980','vini@gmail.com'),
(10002,'BA01','Layla','F','2023-10-01','670600','layla@gmail.com'),
(10003,'BA02','Adam','M','2023-10-01','290100','adam@gmail.com'),
(10004,'BA03','Clint','M','2023-11-01','123345','clint@gmail.com'),
(10005,'BA04','Blake','F','2023-10-01','345098','blake@gmail.com'),
(10006,'BA02','Thomas','M','2023-10-01','901236','thomas@gmail.com'),
(10007,'BA05','Sydney','F','2024-02-01','654321','sydney@gmail.com'),
(10008,'BA04','Eva','F','2023-10-01','789024','eva@gmail.com'),
(10012,'BA06','Sandy','F','2024-07-01','982340','sandy@gmail.com'),
(10009,'BA04','Ben','M','2023-10-01','378902','ben@gmail.com'),
(10010,'BA06','Jerry','M','2023-07-01','950402','jerry@gmail.com'),
(10011,'BA05','Josh','M','2023-07-01','675891','josh@gmail.com');

 

 

drop table if exists payments;
create table payments(
rollno int ,
dp date,
amount int );

 

insert into payments
values(10001,'2023-10-01',7000),
(10002,'2023-10-01',5000),
(10003,'2023-10-01',6000),
(10004,'2023-11-01',9000),
(10005,'2023-10-01',10000),
(10006,'2023-10-01',10000),
(10007,'2024-02-01',7500),
(10008,'2023-10-01',11000),
(10001,'2023-11-11',3000),
(10009,'2023-10-01',5000),
(10010,'2023-07-01',6000),
(10009,'2023-11-01',4000),
(10009,'2023-11-30',2000),
(10009,'2023-08-01',6000);

