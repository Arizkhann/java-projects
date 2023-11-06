use practice23;

delete from project;
delete from employ;
delete from Department;



insert into department(deptno,dname,loc)
values(101,'dotnet','hydrabad'),
(102,'java','bangalore'),
(103,'sql','chennai'),
(104,'testing','delhi');


insert into Employ(Empno,deptno,empname,city,gender)
values(300,101,'satya prakash','delhi','male'),
(301,102,'subhra prakash','hydrabad','male'),
(302,103,'shirisha','hydrabad','female'),
(303,104,'jitendra','agra','male'),
(304,105,'sonali','pune','female'),
(305,106,'unmesha','agra','female');



delete from project;

insert into project(projcode,empno,hours,projname)
values(101,300,100,'zc'),
(102,300,90,'city bank'),
(101,303,190,'zc');