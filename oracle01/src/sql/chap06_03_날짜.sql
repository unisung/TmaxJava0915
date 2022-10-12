/* 현재 날짜 시간 출력 함수 sysdate */
select sysdate from dual;

/* 날자 연산(기준 단위:날짜) */
select sysdate as now,
       sysdate -1 as yesterday,/* + 이후 */
       sysdate + 1 as tomorrow/* - 이전 */
  from dual;
  
 /* 개월후날짜 구하기 add_months(날짜,개월수) */ 
select sysdate,
       add_months(sysdate,3),/* + 이후 */
       add_months(sysdate,-3)/* - 이전 */
  from dual;
  
/* 사원별 입사(hiredate) 10주년이 되는 날 추출 add_months(날짜,개월수) */
select empno, ename, hiredate,
       add_months(hiredate,120) as work10year
  from emp;
  
/* 입사 32년 미만인 사원 출력 */
select empno, ename, hiredate,
       add_months(hiredate,12*42)
  from emp
 where add_months(hiredate,12*42) > sysdate
 ;

/* 개월수 구하기 함수 months_between(a,b)*/ 
select empno, ename, hiredate, 12*32,
       round(months_between(sysdate,hiredate))
  from emp
 where round(months_between(sysdate,hiredate)) > 12*32
 ;
 
select empno, ename, hiredate,sysdate,
       months_between(hiredate,sysdate) as month1,/*이전 - 현재 = 음수*/
       months_between(sysdate,hiredate) as month2,/*현재 - 이전 = 양수 */
       trunc(months_between(sysdate,hiredate)) as month3/* 버림 */
  from emp;
 
/* 요일 계산 함수 next_day(), 월의 마직막 날 계산 함수 last_day()*/
select sysdate, next_day(sysdate, '월요일'), last_day(sysdate),
       next_day(sysdate, '금요일')
 from dual; 
 
 
 
 
 
 
 
 
 
  
  
  
  
  
  
  
  
  