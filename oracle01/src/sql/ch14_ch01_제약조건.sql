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

/* 제약조건 명 변경
 * alter table 테이블명 rename 이전제약조건명 to 새로운 제약조건명 */
alter table table_null
rename constraint tblN_loginid_notnull to tbl_tel_nn;

alter table table_null
rename constraint tbl_tel_nn to tbl_id_nn;

/* 제약조건 삭제 */
/* drop constraint 제약조건명 */
alter table table_null
drop constraint tbl_id_nn;


/*14-3. unique제약 조건 */
create table table_unique(
id varchar2(20) unique,
pwd varchar2(20) not null,
tel varchar2(20)
);

insert into table_unique
values ('hong','1234','010-111-1234');

/*ORA-00001: unique constraint (SCOTT.SYS_C007022) violated */
insert into table_unique
values ('hong','1234','010-111-1234');

/* unique 제약조건은 null은 입력(중복) 입력가능 */
insert into table_unique
values (null,'1234','010-111-1234');

select * from table_unique;

/* 테이블의 id는  primary key, tel은 unique제약조건 */
create table table_tel_unique(
id varchar2(20) primary key,
pwd varchar2(20),
tel varchar2(20) unique
);

insert into table_tel_unique
values ('hong','1234','010-111-1234');

insert into table_tel_unique
values ('kim','1234','010-111-5678');

select * from table_tel_unique;

/* ORA-00001: unique constraint (SCOTT.SYS_C007024) violated
 * primary key(주키) 가 중복은 안되었지만 tel칼럼이 
 * unique제약조건이므로 오류발생
 * */
insert into table_tel_unique
values ('kang','1234','010-111-5678');

/* 제약조건 조회 user_constraints */ 
select * from user_constraints 
where constraint_name not like 'BIN%';

/* 제약조건 삭제 
 * alter table 테이블명 drop costraint 제약조건명 */
alter table table_tel_unique 
 drop constraint SYS_C007024 ;
 
/* 테이블 생성 후 제약조건 추가 하기 */ 
 alter table table_tel_unique
 modify (tel constraint tbl_uniqu_tel unique);

/*제약조건 이름변경 */
alter table table_tel_unique
rename constraint tbl_uniqu_tel to tbl_tel_unique;

/* primary key 제약조건 (not null & unique) */
create table table_pk(
id varchar2(20) primary key,
pwd varchar2(20) not null,
tel varchar2(20)
);
/* 제약조건 조회 user_constraints */ 
select * from user_constraints 
where table_name ='TABLE_PK';

insert into table_pk
values ('hong','1234',null);

/* 
ORA-00001: unique constraint (SCOTT.SYS_C007027) violated*/
insert into table_pk
values ('hong','1234','010-111-1234');

/* ORA-01400: cannot insert NULL into ("SCOTT"."TABLE_PK"."ID") */
insert into table_pk
values (null,'1234','010-111-1234');


/* primary key 이름 부여 */
create table table_pk2(
id varchar2(20) constraint tblpk2_id_pk primary key,
pwd varchar2(20) constraint tblpk2_pwd_nn not null,
tel varchar2(20)
);
/* 제약조건 조회 user_constraints */ 
select * from user_constraints 
where table_name ='TABLE_PK2';









