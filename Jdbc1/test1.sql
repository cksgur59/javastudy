--CREATE table test(
--name varchar2(3),
--age number(3)
--)
--INSERT INTO test values ('kim',20)
--INSERT into TEST values ('lee',40)
--insert into TEST values ('par',50)
--insert into TEST values ('cho' , 23)
--test ���̺���
--��� ���ڵ���
--��� Į������ *
--��ȸ�ϼ���
--select * from TEST
--commit
--select name from test
--select age from TEST
--alias
--�÷��� ���� �ֱ�
--select name as �̸�,age as ���� from test
--select name �̸�,age ���� from test
--select name as �̸�,age ���� from TEST
--insert into TEST values ('kim',33)
--commit
--select DISTINCT name ���� from test

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
select name �̸�,age ���� from test

java collection framework....
sort...
db...

select DISTINCT name ���� from test
select * from test order by age asc
select * from test order by age desc

test ���̺���
��� ���ڵ带
��� �÷��� ���Եǰ�
�����ϵ�
�̸��� �������� ������������ �����Ͻÿ�

delete from test where age = 33
commit
select * from test order by name desc

select * from test order by name desc, age asc

select * from test where name != 'kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')
commit
select name �̸�,age ���� from test where age is null

select name �̸�,age ���� from test where name is not null order by age asc, name desc

select * from test where age = 55
select * from test where age != 55

select * from test where age is null
delete from test where name = 'pyo'
select * from test where age is not null

select * from test where age = 20 or age= 23 or age =40

select * from test where age in (20,23,40,50)

select * from test where age not in (20,23,40,50)

name kim�̰� age �� 33�� ���ڵ带 ��ȸ�Ͻÿ�

select * from test where name = 'kim' and age =33

select * from test where age >25 and age <47

select * from test where age >=25 and age <= 47

between a and b
select * from test where age between 25 and 47

select * from test where name like 'k__' 

select * from test where name like '_e_'

select * from test where name like '%o'
select * from test where name like '%m%'
--select name �̸�,age ���� from test where name is not null order by asc , name desc
--select name �̸�,age ���� from test where name is not null order by asc , name desc
--select name �̸� ,age ���� from test where name is not null oder by asc, name desc
--select name �̸� ,age ���� from test where name is not null order by asc , name desc
--select name �̸� . age ���� from test where name is not null order by asc , name desc
--select name �̸�, age ���� from test where name is not null order  byasc, name desc
--select name �̸� ,age ���� from test where name is not null order by asc , name desc
--select name �̸� , age ���� from test where name is not null order by asc , name desc
--select name �̸� , age ���� from tedt where name is not null order by asc , name desc
--select name �̸� , age ���� from test where name is not null oeder by asc , name desc
--select name �̷� , age ���� from test where name is not null order by asc , name desc

select * from test where age >20
select * from (select * from test where age >20) where name like 'k__'

rownum�� 2~4

select * from
( select * from test order by age asc)
where rnum between 2 and 4

select * from(select rownum rnum, name ,age  from(select name,age from test order by age asc)) where rnum between 2 and 4
select a, name , age from (select rownum a , name , age from (select name , age from test order by age asc)) where a between 2 and 4

select  r,name , age from (select rownum r , name , age from test) where r between 2 and 4 order by age asc
select  r, name , age from (select rownum r, name , age from test) where r between 2 and 4 order by age asc
select r, name , age from (select rownum r , name , age from test) where r between 2 and 4 order by age asc
select r, name , age from (selecy rownum r , name , age from test) where r between 2 and 4 order by age asc
