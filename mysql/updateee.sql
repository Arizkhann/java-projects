-- write query as to display head name for job as
-- dept clerk head is naveen 
-- dept salesman head is tanya
-- dept manager head is subhra prakash
-- dept analyst head is sanjay
-- else head is sireesha

select empno,ename,job,sal,
CASE JOB
   WHEN 'clerk' THEN 'NAVEEN'
   WHEN 'SALESMAN' THEN 'TANYA'
   WHEN 'MANAGER' THEN 'SUBHRA PRAKASH'
   WHEN 'ANALYST' THEN 'SANJAY'
   ELSE 'SIREESHA'
  
END 'HEADNAME'

from emp;


SELECT EMPNO,ENAME,job,sal,comm,
CASE WHEN COMM IS NULL THEN 0
ELSE COMM END 'UPDATED',
CASE WHEN COMM IS NULL THEN SAL
ELSE SAL+COMM END 'TAKEHOME'
from emp;
