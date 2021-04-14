--create table sample(
--	ID VARCHAR(12) PRIMARY KEY,
--	TITLE VARCHAR(200),
--	REG_USER VARCHAR(20),
--	CONTENT VARCHAR(2000),
--	REG_DATE TIMESTAMP DEFAULT NOW()
--);


insert into sample(id, title,reg_user,content) values('SAMPLE-00001', 'JAVA Programming', '관리자', ' JAVA 관련 글만 등록하세요.');

--delete from sample;



create table IDS (
	TABLE_NAME VARCHAR(16) PRIMARY KEY,
	NEXT_ID DECIMAL(30) NOT NULL
);


insert into IDS values('SAMPLE',2);