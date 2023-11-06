-- group by: used to generate aggregate reports

select job,sum(sal)
from Emp group by job;

select job,max(sal),min(sal),avg(sal),count(*)
from Emp group by job;

select job,count(*)
from emp group by job;

-- having class : used to check the condition on aggregrate field 
-- display all records as whose job sum(sal) more than 5000 

select job,sum(sal)
from emp group by job 
having sum(sal)>5000;

-- display info as whose job contains more than 1 employe

select job,count(*)
from Emp group by job 
having count(*)>1
order by job;


select job,count(*)
from Emp
where job in('analyst','clerk','manager')
 group by job 
having count(*)>1
order by job;


