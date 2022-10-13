/* sub쿼리 */
/* 'JONES'사원의 급여보다 많이 받는 사원 출력 */
select sal from emp where ename = 'JONES';
select * from emp where sal > 2975;

/* SUB쿼리 */
select * 
  from emp 
 where sal > (select sal 
                from emp 
               where ename = 'JONES');
               
/* 'SCOTT'사원 보다 입사일자 먼저인 사원들 정보 출려 */
select * from emp where hiredate < '1981-07-13';
select hiredate from emp where ename ='SCOTT';   

/*update emp set hiredate = to_date('1981-07-13') 
 where ename='SCOTT'; */

select * 
  from emp
 where hiredate < (select hiredate 
                     from emp 
                    where ename='SCOTT');

/*  전체 평균급여보다 급여를 많이 받는 사원들 출력 */
select avg(sal) from emp; /* 2073.214285714285714285714285714285714286
 */
select * from emp where sal >  2073.214285714285714285714285714285714286
;                    
/* 집계함수를 이용한 sub쿼리 */
select empno, ename, job, sal
  from emp
 where sal > (select avg(sal) from emp);
 
/* join한 테이블에서 sub쿼리 */ 
select empno, ename, job, sal, dept.deptno, dname,loc
  from emp, dept
 where emp.deptno = dept.deptno
   and sal > (select avg(sal) from emp);
   
/* 다중 행 sub쿼리 */
/* 부서별 최대 급여를 받는 사원들의 정보 출력 */ 
select *
  from emp
 where sal in (2850,3000,5000);
 
/* 다중행 결과는 in()으로 대체가능 */ 
select *
  from emp
 where sal in (select max(sal) from emp group by deptno);
/* 다중 행 = 비교는 = any, =some */ 
select *
  from emp
 where sal = any (select max(sal) from emp group by deptno); 

 select *
  from emp
 where sal = some (select max(sal) from emp group by deptno);  
 
/* 30번 부서의 최대 급여(2850) 보다 적게받는 사원들 정보 출력
 * any(some) 서브쿼리와 비교조건에 하나만 만족해도 true */               
select sal from emp where deptno = 30; 
select *
  from emp
 where sal < some (select sal from emp where deptno = 30);
 
/* 30번 부서의 급여보다 적게받는 사원들 정보 출력
 * all 서브쿼리와 비교조건에서 모두 만족해얃 true */                
select *
  from emp
 where sal < all (select sal from emp where deptno = 30);               
               
               


