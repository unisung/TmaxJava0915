/* 전체 행의 곱의 수로 출력 카티션곱*/
select *
  from emp, dept
 order by empno;
 
/* join 카티션곱 중에서 왼쪽의 칼럼값 과 오른쪽 카럼값이 같은것만 추출하여
 * 새로운 가상의 테이블 조회 결과 만듬 */ 
select *
  from emp, dept
 where emp.deptno = dept.deptno
 order by empno;
 
/* join 후에 칼럼 조회
 * 동등 join : where 왼쪽테이블.칼럼명 = 오른쪽테이블.칼럼명 */ 
 /* 출력시 칼럼이 공통이면 출력하려는 테이블명.칼럼으로 표시,
  * 칼럼이 unique하다면 칼럼명만 표시 */
select empno, ename, emp.deptno, dname,loc
  from emp, dept
 where emp.deptno = dept.deptno
 ;
 
/* 등가(Equi) join = */
select * 
  from emp, dept
 where emp.deptno = dept.deptno
order by empno;
 
select * 
  from emp, dept
 where emp.deptno = dept.deptno
order by emp.deptno; /* 테이블명.칼럼 */

/* 테이블 별칭(alias): 테이블명 별칭 */
select *
  from emp e, dept d /* emp의 별칭은 e, dept의 별칭은 d */
 where e.deptno = d.deptno
 ;
 
/* 테이블 별칭 부여 후 칼럼 표시 - 테이블별칭.칼럼명 */ 
select empno,e.ename, e.deptno, dname
  from emp e, dept d /* emp의 별칭은 e, dept의 별칭은 d */
 where e.deptno = d.deptno
 ;
 
select empno,e.ename, e.deptno, dname
  from emp e, dept d /* emp의 별칭은 e, dept의 별칭은 d */
 where e.deptno = d.deptno
 order by e.deptno, e.ename
 ; 
 
/* join과 비교 연산 */ 
select e.empno, e.ename, e.sal, d.deptno, d.dname,loc
  from emp e, dept d
 where e.deptno = d.deptno
   and e.sal >=3000
   ;
 
 
/* emp테이블 별칭 e, dept d로 등가조인
 * 급여가 2500 이하이고 사원번호가 9999 이하인 사원정보 출력
 * empno, ename, deptno, dname, loc
 * */   
select e.empno, ename, e.deptno, dname, loc
  from emp e, dept d
 where e.deptno = d.deptno
   and sal <= 2500
   and empno <=9999
 order by empno
   ;
   
select * from salgrade;   
/* 비등가 조인 (non-equi)*/   
select *
  from emp e, SALGRADE s
 where sal between losal and hisal
 /*  where sal >= losal and sal <= hisal */
; 

/*자체(self) join */
select *
  from emp e1, emp e2
 where e1.empno = e2.empno;
 
/* 각 사원들의 직속상관의 사번과 이름을 알고 싶어요 */ 
select e1.empno enpno, e1.ename ename,
       e2.empno mgrno, e2.ename mgrname
  from emp e1, emp e2
 where e1.mgr = e2.empno
order by e2.ename, e1.ename;

select lpad(' ',3*(level - 1))||ename,
        level, connect_by_isleaf,
        connect_by_iscycle,
        sys_connect_by_path(ename,'/'),
        connect_by_root(ename),
        connect_by_root ename
   from emp
  start WITH  mgr is null
  connect by nocycle prior empno = mgr
  ;

/* 출처: https://tiboy.tistory.com/563 */
select level, lpad(' ',10*(level - 1))||ename
   from emp
  start WITH  mgr is null
  connect by prior empno = mgr
  ;

/* SQL-99 표준 */
/* natural join - 두 테이블이 동일 칼럼 자동 join */
select empno, ename, job, mgr, sal, deptno, dname,loc
  from emp e natural join dept d
 order by deptno, empno
 ;
 /* join ~ using - usging(조인할 칼럼) */
select empno, ename, job, mgr, deptno, dname
  from emp join dept using(deptno)
 where sal >=3000
order by deptno, empno;

/*  join ~ on - on(조인조건) */
select empno, ename, emp.deptno, dname
  from emp join dept on (emp.deptno = dept.deptno)
  ;
  

  
  
 
 
 
 

 
 
  