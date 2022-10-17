/* 14. 1*/
create table table_null(
login_id varchar2(20),
login_pwd varchar2(20),
tel varchar2(20)
);

insert into table_null(login_id,login_pwd,tel)
values(null,null,null)
;
select * from table_null;

insert into table_null(login_id,login_pwd,tel)
values('hong',null,null)
;
insert into table_null(login_id,login_pwd)
values('hong','1234')
;
insert into table_null(login_pwd,tel)
values('1234','010-111-1234')
;
commit
/* 무결성 제약조건 */
/* 1.영역 무결성(domain integrity)
 *   -자료형, 형식 데이타, null여부지정한 형식에 맞는지 체크
 * 2.개체 무결성(entity integrity)
 *   - 테이블의 데이타 유일(unique) 식별 키(기본키는 null이 되면 안됨)
 * 3.참조 무결성(referential integrity)
 *   - 외래키값은 참조테이블의 기본키로서 존재해야함, null가능
 * */

create table table_notnull(
login_id varchar2(20) not null,
login_pwd varchar2(20) not null,
tel varchar2(20)
);

select * from table_notnull;

/* ORA-01400: cannot insert NULL into ("SCOTT"."TABL_ENOTNULL"."LOGIN_ID") */
insert into table_notnull(login_id,login_pwd,tel)
values(null,null,null)
;

insert into table_notnull(login_id,login_pwd,tel)
values('hong',null,null)
;
insert into table_notnull(login_id,login_pwd)
values('hong','1234')
;
insert into table_notnull(login_pwd,tel)
values('1234','010-111-1234')
;

/* not null지장한 칼럼의 데이타를 update 로 null로 변경*/
select * from table_notnull;
/* ORA-01407: cannot update ("SCOTT"."TABLE_NOTNULL"."LOGIN_PWD") to NULL */
update table_notnull
   set login_pwd = null
 where login_id='hong'
 ;
 
/* 제약조건 조회 user_constraints */ 
select * from user_constraints 
where constraint_name not like 'BIN%';


/* 사용자 정의 제약조건 명
 * constraint 제약조건명 제약조건 */ 
create table table_notnull2(
login_id varchar2(20) constraint tblnn2_lgnid not null,
login_pwd varchar2(20) constraint tblnn2_lgnpw not null,
tel varchar2(20)
);

/* 제약조건 변경 alter table */
/* ORA-02296: cannot enable (SCOTT.) - null values found */
alter table table_notnull modify (tel not null);
update table_notnull
   set tel ='010-1111-1234'
 where login_id='hong';
 commit
select * from table_notnull;


/* not null칼럼 제약조건 명 */
select * from table_null;
update table_null
   set login_id = 'kim'
 where login_id is null
   and rownum =1
   ;
   
update table_null
   set login_id = 'kang'
 where login_id is null
   and rownum =1
   ;

commit

alter table table_null 
modify ( login_id constraint tblN_loginid_notnull not null);

/* 제약조건 조회 user_constraints */ 
select * from user_constraints 
where constraint_name not like 'BIN%';







