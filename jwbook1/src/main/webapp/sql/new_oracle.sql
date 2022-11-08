CREATE TABLE news (
	aid number primary key,
	title VARCHAR2(100) NOT NULL,
	img VARCHAR2(200) NOT NULL,
	regdate date default sysdate,
	content VARCHAR2(4000) NOT NULL
);

create sequence new_seq;