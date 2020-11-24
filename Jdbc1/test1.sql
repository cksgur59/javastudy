--CREATE table test(
--name varchar2(3),
--age number(3)
--)
--INSERT INTO test values ('kim',20)
--INSERT into TEST values ('lee',40)
--insert into TEST values ('par',50)
--insert into TEST values ('cho' , 23)
--test 테이블의
--모든 레코드의
--모든 칼럼값을 *
--조회하세요
--select * from TEST
--commit
--select name from test
--select age from TEST
--alias
--컬럼에 별명 넣기
--select name as 이름,age as 나이 from test
--select name 이름,age 나이 from test
--select name as 이름,age 나이 from TEST
--insert into TEST values ('kim',33)
--commit
--select DISTINCT name 성씨 from test

create table test(
name varchar2(5),
age number(3)
)
drop table test

insert into test values('kim',20)
insert into TEST values('lee',40)
insert into TEST values('park',50)
insert into TEST values('choi',23)

commit
insert into test values('kim',33)
select name 이름,age 나이 from test

java collection framework....
sort...
db...

select DISTINCT name 성씨 from test
select * from test order by age asc
select * from test order by age desc

test 테이블의
모든 레코드를
모든 컬럼이 포함되게
조합하되
이름을 기준으로 내림차순으로 정렬하시오

delete from test where age = 33
commit
select * from test order by name desc

select * from test order by name desc, age asc

select * from test where name != 'kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')
commit
select name 이름,age 나이 from test where age is null

select name 이름,age 나이 from test where name is not null order by age asc, name desc

select * from test where age = 55
select * from test where age != 55

select * from test where age is null
delete from test where name = 'pyo'
select * from test where age is not null

select * from test where age = 20 or age= 23 or age =40

select * from test where age in (20,23,40,50)

select * from test where age not in (20,23,40,50)

name kim이고 age 가 33인 레코드를 조회하시오

select * from test where name = 'kim' and age =33

select * from test where age >25 and age <47

select * from test where age >=25 and age <= 47

between a and b
select * from test where age between 25 and 47

select * from test where name like 'k__' 

select * from test where name like '_e_'

select * from test where name like '%o'
select * from test where name like '%m%'
--select name 이름,age 나이 from test where name is not null order by asc , name desc
--select name 이름,age 나이 from test where name is not null order by asc , name desc
--select name 이름 ,age 나이 from test where name is not null oder by asc, name desc
--select name 이름 ,age 나이 from test where name is not null order by asc , name desc
--select name 이름 . age 나이 from test where name is not null order by asc , name desc
--select name 이름, age 나이 from test where name is not null order  byasc, name desc
--select name 이름 ,age 나이 from test where name is not null order by asc , name desc
--select name 이름 , age 나이 from test where name is not null order by asc , name desc
--select name 이름 , age 나이 from tedt where name is not null order by asc , name desc
--select name 이름 , age 나이 from test where name is not null oeder by asc , name desc
--select name 이룸 , age 나이 from test where name is not null order by asc , name desc

select * from test where age >20
select * from (select * from test where age >20) where name like 'k__'

rownum이 2~4

select * from
( select * from test order by age asc)
where rnum between 2 and 4

select * from(select rownum rnum, name ,age  from(select name,age from test order by age asc)) where rnum between 2 and 4
select a, name , age from (select rownum a , name , age from (select name , age from test order by age asc)) where a between 2 and 4

select  r,name , age from (select rownum r , name , age from test) where r between 2 and 4 order by age asc
select  r, name , age from (select rownum r, name , age from test) where r between 2 and 4 order by age asc
select r, name , age from (select rownum r , name , age from test) where r between 2 and 4 order by age asc
select r, name , age from (selecy rownum r , name , age from test) where r between 2 and 4 order by age asc

DB에 데이터를 저장한 상태에서
칼럼 하나만을 이용해서 
특정 레코드 하나만을 조회하고 싶어


create table member2(
id varchar2(6),
name varchar2(6),
age number(3)
)

alter table member2 add constraint pk_member2_id primary key(id)


insert into member2 values ('m001','kim',30)
insert into member2 values ('m002','kim',30)
insert into member2 values ('m003','kim',30)
insert into member2 values ('m004','kim',30)
insert into member2 values ('m005','kim',30)
insert into member2 values ('m006','kim',30)
insert into member2 values ('m007','kim',30)

insert into member2 (id,name, age) values ('m008','kim',20)


select * from member2 

delete from member2
commit

select * from member2 where id = 'm004'
select * from member2 order by id asc

select * from member
alter table member add constraint pk_member_mid primary key(mid)

create table test2(
id varchar2(6) primary key,
age number(3)
)

CREATE TABLE test3(
id VARCHAR2(6),
age NUMBER(3),
constraint pk_test3_id primary key(id)
)

당신이 종하하는 음식을 다음 중에서만 고르시오.
1. 갈비
2. 떢볶이
3. 된장찌개
4. 김치찌개

나는 피자... 이렇게 다른걸 고르는 것을 막아야 한다
1~4중에서만 선택하라고 했는데, 피자를 선택하다니...
이런 일 없게 하자.
rollback
CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6),
edep VARCHAR2(9)
)


DROP TABLE employee
//edep에는 인사부/통보부/연구실/영업부 만 들어갈 수 있다.

INSERT INTO employee (eid,ename,edep) values ('e001','kim','인사부')
INSERT INTO employee (eid,ename,edep) values ('e002','lee','통보부')
INSERT INTO employee (eid,ename,edep) values ('e003','park','연구실')
INSERT INTO employee (eid,ename,edep) values ('e004','choi','영업부')
INSERT INTO employee (eid,ename,edep) values ('e005','jung','비서실')
delete from employee
select * from employee


alter table employee add constraint pk_employee_edep primary key(edep)

create table depart(
edep VARCHAR2(9)
)

alter table depart add constraint pk_depart_edep primary key(edep)

alter table employee add constraint fk_employee_edep FOREIGN key(edep) references depart(edep)

insert into depart values ('인사부')
insert into depart values ('통보부')
insert into depart values ('연구실')
insert into depart values ('영업부')
commit

insert into employee (eid, ename ) values ('e006','kim')















create table bugerp(
pname VARCHAR2(12)
)

alter table bugerp add constraint pk_bugerp_pname primary key(pname)

insert into bugerp values ('멕도날드')
insert into bugerp values ('롯데리아')
insert into bugerp values ('버거킹')
insert into bugerp values ('맘스터치')

create table bugerm(
pname VARCHAR2(12),
bname VARCHAR2(12),
price NUMBER(10)
)


alter table bugerm add constraint fk_bugerm_pname FOREIGN key(pname) references bugerp(pname)
alter table bugerm add constraint pk_bugerm_bname primary key(bname)

insert into bugerm values ('멕도날드', '상하이',7500)
insert into bugerm values ('맘스터치', '싸이버거',8000)
insert into bugerm values ('롯데리아', '불고기',6800)
insert into bugerm values ('버거킹', '몬스터X',9800)

SELECT pname 브랜드,bname 햄버거이름,price 가격 from bugerm



create table gc (
name VARCHAR2(15)
)

alter table gc add constraint pk_gc_name primary key(name)

insert into gc values ('넥슨')
insert into gc values ('펄어비스')
insert into gc values ('넷마블')
insert into gc values ('NC')

create table game(
cname VARCHAR2(15),
gname VARCHAR2(18),
userp NUMBER(10)
)

alter table game add constraint fk_game_cname foreign key(cname) references gc(name)
alter table game add constraint pk_game_gname primary key(gname)

insert into game values ('넷마블', '세븐나이츠',7500)
insert into game values ('펄어비스', '검은사막',8000)
insert into game values ('넥슨', '메이플',6800)
insert into game values ('NC', '리니지',9800)

select * from game

select * from member
DELETE from member where name = 'kim'
select * from member where name = 'kim'
