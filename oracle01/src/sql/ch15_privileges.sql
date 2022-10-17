/**/
select file_name, tablespace_name,  bytes/1024/1024 
from dba_data_files;

select * from dba_data_files;

/* tablespace에 물리적인 파일 공간 추가하기 */
alter tablespace users 
add datafile  'C:\\ORACLEXE\\APP\\ORACLE\\ORADATA\\XE\\USERS2.DBF' 
size 100m;


select tablespace_name,  sum(bytes/1024/1024) 
from dba_data_files
group by tablespace_name
;

/* 패스워드 만료 처리 */
alter user scott password expire;





