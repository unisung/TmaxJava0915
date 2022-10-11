/* 데이타 조회 select문 */
select empno, ename, job, mgr, hiredate, sal, comm, deptno 
  from emp;
/* wildcard문자 *로 전체 칼럼 대체 */  
select * from emp;  

/* selection */
select * from emp where empno =7788;

/* projection */
select empno, ename, job, deptno from emp;

/* select & projection */
select empno, ename, job, deptno from emp where empno=7788;



