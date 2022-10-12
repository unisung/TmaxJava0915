/* 오라클 함수 upper()대문자, lower()소문자, initcap() 첫글자대문자나머지 소문자*/
select 'hello', upper('hello'),upper('Hello'),
       lower('HELLO'), lower('Hello'),
       initcap('hello'),initcap('Hello')
  from dual;
  
select 'hello gildong', 
       initcap('hello gildong'),initcap('hellogildong')
  from dual;
  
/* where절에서 upper, lower사용 */
select * from emp where upper(ename) = upper('scott');
select * from emp where upper(ename) = 'SCOTT';
select * from emp where ename = upper('scott');

/* LOWER */
select * from emp where lower(ename) ='scott';
select * from emp where lower(ename) =lower('Scott');

/* like 와 같이 사용 */
select * from emp where upper(ename) like upper('%scott%');
select * from emp where upper(ename) like upper('%ot%');
select * from emp where lower(ename) like '%scott%';
select * from emp where lower(ename) like '%ot%';

/* 문자열 길이 length, lengthb */
select ename, length(ename), lengthb(ename) from emp;
select '안녕하세요',length('안녕하세요'), lengthb('안녕하세요') 
  from dual;

select length('한글'), lengthb('한글') from dual;






