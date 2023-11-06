-- aggregate function

-- sum() : display total of the numeric field supplied 
select sum(sal) from emp;

-- max() : display max. value of numeric field specified 


select max(sal) from emp;

select min(sal) from emp;

select avg(sal) from emp;


-- count(*) : display total record of particular table 
select count(*) from emp;
select count(comm) from emp;


-- above command returns as for how many records comm is not null that
-- count will be returned 
