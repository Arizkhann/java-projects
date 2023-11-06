use infinite_august23;


drop table if exists leavedetails;
drop table if exists employee;

create table employee
(
empid int primary key,
empname varchar(30),
empemail varchar(30),
mobileno varchar(30),
dateOfJoin date,
managerid int,
leaveavail int
);


create table leavedetails
(
leaveid int primary key auto_increment,
empid int,
leavestartdate date,
leaveenddate date,
noofdays int,
leavetype enum('el','pl','ml'),
leavestatus enum('pending','accepted','rejected') default 'pending',
leavereason varchar(30),
appliedon timestamp default current_timestamp,
foreign key(empid) references employee(empid)

);