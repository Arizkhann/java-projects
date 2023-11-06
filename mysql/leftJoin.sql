select d.deptno,dname,empno,ename,job,sal
from dept d left join emp e
on d.deptno=e.deptno;