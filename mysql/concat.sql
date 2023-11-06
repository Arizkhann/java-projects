-- String functions 
-- instr() :used to display first occurence of given char in a string

select instr('jitendra,'e');

select ename, instr(ename,'a')from emp;

select length ('anirudh');
select ename ,length(ename) from emp;


select reverse ('yukesh');
select ename ,reverse(ename) from emp;


select lower('adams'),upper('rajkishore');
select ename,lower(ename),upper(ename) from emp;


select left('sanjay',4);

select right('rajesh',4);

-- concate 

select concat ('anirudh',' ','mehta');

-- replace : used to replace old string with new string
-- in all occurance
select replace ('java training','java','sql');





