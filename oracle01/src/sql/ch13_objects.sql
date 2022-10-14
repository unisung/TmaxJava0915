select * from dba_objects order by owner;
select * from user_objects;
select * from all_objects;

/* objects 중 index */
select * from user_indexes;
/* 생성된 index의 칼럼정보 조회 */
select * from user_ind_columns;

select * from emp;
/* 인덱스 생성
 * create index idx_테이블명_칼럼명 on 테이블명(칼럼);
 * */
create index idx_emp_sal on emp(sal);

select * from user_indexes;
select * from user_ind_columns;

select * from dept;

insert into dept values (50,'SALES','JEJU');

delete from dept where deptno=50;
COMMIT

select * from dept where dname ='SALE';

/* 인덱스 삭제 */
drop index ind_dept;
/* create unique index 인덱스명 on 테이블(칼럼) */
create unique index ind_dept on dept(dname);
insert into dept values (50,'SALES','JEJU');
/*ORA-00001: unique constraint (SCOTT.IND_DEPT) violated*/

/* 테이블 생성 시 
 * primary key를 지정하면
 * unique index 가 생성 됨*/
create table emp_imsi(
empno number(4) primary key,/* 중복불가(unique),not null */
ename varchar2(10),
job varchar2(10),
deptno number(2)
);

select * from user_indexes;


















