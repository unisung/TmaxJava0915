/*---  ch19. 저장 서브 프로그램   ---*/
/*---- 파라미터 없는 프로시져 -----*/
CREATE OR REPLACE PROCEDURE pro_noparam
IS
  v_empno number(4) :=7788;
  v_ename varchar2(10);
BEGIN
	v_ename :='SCOTT';
	DBMS_OUTPUT.PUT_LINE('V_EMPNO :'||v_empno);
	DBMS_OUTPUT.PUT_LINE('V_ENAME :'||v_ename);
END;
/

/****** 프로시져 실행 **********************/
/* 1. sql커맨더에서 실행 */
set serveroutput on
exec pro_noparam;

/*2. 익명블록에서 실행 */
begin
  pro_noparam;
end 

/*------ 프로시저확인   ------------------*/
select * from user_objects where object_type='PROCEDURE';
/* 프로시져 내용 확인 */
select text from user_source where name='PRO_NOPARAM';

/* 프로시저 삭제 */
DROP procedure pro_noparam;


/*------- 파라미터 있는 프로시져 ------*/
create or replace procedure pro_param_in
(
 param1 in number,/* default in */
 param2 number, /* default모드 in */
 param3 number :=3,--값 초기화
 param4 number default 4--default값 지정
)
is
begin
	 dbms_output.put_line('param1 : '||param1);
	 dbms_output.put_line('param2 : '||param2);
	 dbms_output.put_line('param3 : '||param3);
	 dbms_output.put_line('param4 : '||param4);
end;
/

/* 파라미터명으로 접근 param1 =>값 */
EXECUTE pro_param_in(param1 => 10, param2 => 20);


/* out모드 파라미터 프로시져 */
create or replace procedure pro_param_out
( 
  in_empno in emp.empno%type,/* 값을 받는 변수*/
  out_ename out emp.ename%type,/* 프로시져 실행 후 값을 출력변수*/
  out_sal out emp.sal%type/* 프로시져 실행 후 값을 출력변수*/
)
as
begin
	select ename, sal 
	  into out_ename, out_sal
	  from emp
	 where empno =in_empno; 
end pro_param_out;
/









