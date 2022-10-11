/* 계정 리스트 */
select * from dba_users;
/*물리적 공간확인 */
select * from dba_data_files;
/*논리적 공간확인 */
select * from dba_tablespaces;
/*사용자 인덱스 정보 
 primary key는 주키로 사용, 인덱스(빠른검색)로도 사용 */
select * from user_indexes;
/* index 생성 create index 인덱스명 on 테이블(칼럼) */
create index ind_dept
on dept(dname);

/* 생성된 인덱스에 해당하는 칼럼을 기준으로 조회 */
select * from dept where dname='SALES';

select * from emp;
select * from dept;
select * from salgrade;
/* view생성 */
create view emp_dept_salInfo as
select empno,ename,job,sal,dname,loc,grade
  from emp, dept, salgrade
 where emp.deptno =dept.deptno
   and emp.sal between salgrade.losal and salgrade.hisal
;
/* 생성된 view 확인*/
select * from user_views;
/* view로 부터 조회 */
select * from emp_dept_salInfo;
  
/* 민감한 정보를 제외한 칼럼으로만 view생성 */
create view emp_info 
    as
select empno, ename, job, deptno
  from emp;
/* view로 부터 공개된 정보 조회 */
select * from emp_info;

/* 시쿼스 생성 */
create sequence seq_no;
/* 접속한 유저가 생성한 모든 오브젝트 정보 조회 */
select * from user_objects order by object_type;

/* 시퀀스로 부터 값 조회 */
/* select 값(식|함수) from 테이블; */
select 'hello' from dual;
select sysdate from dual;
select 10*3/5 from dual;
select seq_no.nextval, seq_no.currval from dual;

/* 시노님(동의어) 생성 */
create synonym myEmp
for scott.emp;

select * from myEmp;


/* 프로시져 생성 */
create or replace procedure pro_noparam
is
v_empno number(4):=7788;
v_ename varchar2(10);
begin
	v_ename :='SCOTT';
	dbms_output.put_line('v_empno : '||v_empno);
	dbms_output.put_line('v_ename : '||v_ename);
end;

/* 함수 생성*/
create or replace function func_aftertax(
sal in number /* 입력되는 매개변수 선언 */
)
return number/* 리턴할 타입 선언*/
is
tax number:=0.05;
begin
	return (round(sal - (sal*tax)));
end func_aftertax; 

/* 함수 실행 */
select func_aftertax(10000) from dual;



