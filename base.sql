CREATE DATABASE "University"
WITH OWNER = postgres
ENCODING = 'UTF8'
TABLESPACE = pg_default
LC_COLLATE = 'Russian_Russia.1251'
LC_CTYPE = 'Russian_Russia.1251'
CONNECTION LIMIT = -1;

CREATE TABLE _group
(
	group_num integer  NOT NULL PRIMARY KEY,
	faculty varchar(50)  NULL 
);

CREATE TABLE student
(
	name varchar(20)  NOT NULL ,
	last_name varchar(50)  NOT NULL ,
	sec_name varchar(20)  NULL ,
	id_stud integer  NOT NULL PRIMARY KEY,
	group_num integer  NULL 
);

ALTER TABLE Student
	ADD CONSTRAINT  R_1 FOREIGN KEY (group_num) REFERENCES _group(group_num)
		ON DELETE CASCADE
		ON UPDATE CASCADE
;

