create table student(
id number primary key,
username varchar2(20),
univ varchar2(20),
birth date,
email varchar2(40)
);

create sequence student_seq;

insert into student 
values(student_seq.nextval,'김길동','AA대학교','1999-10-21','kim@aa.com'); 
insert into student 
values(student_seq.nextval,'박사랑','BB대학교','2000-01-21','park@bb.com');
insert into student 
values(student_seq.nextval,'나최고','CC대학교','1998-07-11','na@cc.com'); 
insert into student
values(student_seq.nextval,'김길동','BB대학교','1999-03-10','kim@bb.com'); 
insert into student
values(student_seq.nextval,'홍길동','AA대학교','1999-12-10','hong@aa.com');

select * from student;

select * from student where id=1;

