create database Java;
use Java;
drop table java;	-- Drops Table
create table java(
id int auto_increment unique,	-- Value must be unique (No repeatation allowed)
name varchar(30) not null,	-- Value could not be null
city varchar(30) not null default 'agra',	-- Default value becomes Agra
gender varchar(30) not null,
age int not null check(age>=18),	-- always Checks Condition of age at time of insertion
salary int not null);

insert into java (name, gender, age, salary) values ('John','M',19,14000);

insert into java (name, city, gender, age, salary) values ('Mina','Pune','F',20,15000),
('Atharva','Telangana','F',22,20000),
('Rushi','Nagpur','F',23,25000),
('Akash','Bhosari','F',25,19000),
('Akshay','Mumbai','F',18,18000),
('Aniket','Delhi','F',19,24000),
('Tushar','Kolkata','F',18,16000);

select * from java;
-- Where Clause
select * from java where age>=20;
select * from java where city='Delhi';
select name,salary from java where city='mumbai';
select name from java where salary = 25000;

-- And Operator and OR Operator

-- And Operator
select * from java where age>=21 and age<=25;
select * from java where age>=18 and city='pune';
select * from java where city='pune' and salary>=15000 and age>=18;

-- OR Operator
select * from java where age>=21 or city='nagpur';
select * from java where city='baramati' or salary>=15000;

-- And or Together
select * from java where (age>=18 and city='baramati') or salary>=20000;

-- IN Operator
select * from java where age in (22,25);
select * from java where city in ('pune','nashik');

-- Not IN Operator
select * from java where city not in ('pune','nashik');

-- Between Operator
select * from java where age between 18 and 25;
select * from java where city between 'a' and 'o';	-- Display city name Starts between a and o

-- Not Between Operator
select * from java where salary not between 15000 and 22000; -- Display salary not between this range

-- Like Operator
select * from java where name like 'a%';
select * from java where name like '%a';
select * from java where name like '_u%';
select * from java where name like '__s%';
select * from java where name like '%sh%';
select * from java where name like 'a%a';
select * from java where name like '_th____';

-- Not In Operator
select * from java where city not like 'a%';	-- Starts with
select * from java where city not like '%a';	-- Ends with
select * from java where city not like '_a%';	-- Second letter a
select * from java where city not like '__l%';	-- Third letter l
select * from java where city not like '%sa%';	-- In between sa from any String
select * from java where city not like 'd%i';	-- Starts with d and ends with i
select * from java where city not like '_un_';	-- Selecting specific letters and filling other letters with _

-- Order By

select * from java order by name;
select * from java order by age;		-- it by default sort the data in ascending order or you can use asc
select * from java order by age desc;	-- desc keyword used to sort data by descending order

-- Limit or Offset

select * from java where age>=22 limit 2;
select * from java where salary<20000 limit 2 offset 1;

-- Aggregation Functions

select count(*) as total from java;
select max(salary) from java;
select min(age) from java;
select sum(salary) from java;
select avg(salary) from java;

-- Update Query & Delete Query

update java set name = 'Rohan' where id=1;

delete from java where id=8;	-- After delete record if you rollback then it comes back but if you commit then it can't come back. The changes will permenantly saved in your database
commit;		-- Before using commit and rollback you must have to off the auto commit which was in the Query tab.s
rollback;
-- Exercise
update java set salary=34000 where name not like 'a%' and name in ('Rahul','Atharva') limit 2;

select * from java where salary between 20000 and 25000 limit 3;
select * from java where salary between 15000 and 20000 limit 3 offset 1;

select * from java where gender not in ('M');
select max(salary) as Max from java;

-- Primary key and Foreign key
alter table java add primary key(id);
desc java;

create table city(cid int auto_increment primary key, cname varchar(20));

insert into city (cname) values ("pune"),("baramati"),("nashik"),("nagpur"),("Telangana"),("Bhosari"),("Mumbai"),("Delhi");
select * from city;

update java set 
city = case
when id = 1 then 1
when id = 2 then 2
when id = 3 then 3
when id = 4 then 4
when id = 5 then 5
when id = 6 then 6
when id = 7 then 7
when id = 8 then 8
end
where id between 1 and 8;

alter table java modify city int;

alter table java add foreign key(city) references city(cid);

-- Joins



select city, count(city) from java group by (city);
select * from java;