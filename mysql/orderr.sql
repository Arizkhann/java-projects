-- change database to infinite_august

use infinite_august;

-- show List of tables available in current database

show tables;
-- Display Info about Emp table

desc Emp;
-- Display records of Emp table

select*from Emp;

-- Display Empno,Ename,job,sal,Deptno from emp

select Empno,Ename,Job,sal,Deptno
from Emp; -- Project operator
-- where clause : used to display filtered records
-- display info whose empno is 7839

select *from emp
where empno=7839;

-- display info whose sal >=3000

select * from Emp
where sal>=3000;

-- Display info whose job is "clerk"

select * from emp
where job="clerk";

-- display info whose ename is "Adams"

select * from emp 
where ename="Adams";

-- display Info whose employ hiredate is "1980-12-17"

select * from emp
where hiredate="1980-12-17";

-- between... AND : used to display info.from startdate to enddate

select * from emp
where sal   between 1000 and 3000;

select * from emp
where sal not  between 1000 and 3000;

select * from EMp
where hiredate between "1980-01-01" and "1981-12-12";

select * from EMp
where hiredate not  between "1980-01-01" and "1981-12-12";


-- display all records whose name starts with "s"
select * from emp
where ename like "s%";

-- display all records whose name ends with "s"
select * from emp
where ename like "%s";

-- Display info as whole name starts with "j" and 5th char is "s"
select * from Emp
where ename like "j___s";

-- IN clause : used to check multiple values of particular column
-- display info whose job is "manager" or clerk or salesman
select * from emp
where JOB in("manager","clerk","salesman");

-- display info whose ename is 'smith' or 'ward' or 'blake'or 'adams'
select * from emp
where ename not in('smith','ward','blake','adams');

-- order by: used to display records wrt specific fields
-- in ascending or descending

select empno,ename,job,sal,hiredate
from emp order by job;

select empno,ename,job,sal,hiredate
from emp order by ename;

select empno,ename,job,sal,hiredate
from emp order by job desc;

select empno,ename,job,sal,hiredate
from emp order by job,Ename;

select empno,ename,job,sal,hiredate
from emp order by job,Ename desc;










