CREATE table account(
id VARCHAR2(3) primary key,
balance NUMBER
)

INSERT INTO ACCOUNT (id,balance) values ('kim',0)
INSERT INTO account values ('lee',10000)
commit

select * from account

UPDATE account SET balance = 10000 WHERE id = 'kim'

DROP TABLE member22
commit

CREATE TABLE member(
id VARCHAR2(10),
name VARCHAR2(10),
point NUMBER(10),
money NUMBER(10)
)

CREATE TABLE oder(
mid VARCHAR2(10),
menu VARCHAR2(15),
price NUMBER,
point NUMBER
)

SELECT * FROM member22
SELECT * FROM oder

CREATE TABLE member22(
mid VARCHAR2(10),
name VARCHAR2(10),
job VARCHAR2(10),
birth DATE
)

SELECT * FROM member22

DELETE FROM member22 WHERE name = asd