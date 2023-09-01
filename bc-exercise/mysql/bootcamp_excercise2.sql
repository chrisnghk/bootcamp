CREATE DATABASE BOOTCAMP_EXERCISE2;
SHOW DATABASES;
USE BOOTCAMP_EXERCISE2;

CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

-- Task 1 insert data into table bonus
select * from worker;

insert into bonus values (6,32000,'2021-11-02');
insert into bonus values (6,20000,'2022-11-02');
insert into bonus values (5,21000,'2021-11-02');
insert into bonus values (9,30000,'2021-11-02');
insert into bonus values (8,4500,'2022-11-02');

-- task 2 write an sql query to show the second highest salary amont all workers.

select salary
from worker
order by salary desc limit 1 offset 1
;

-- task 3 write an sql query to print the name of employees having the highest salary in each department.

with max_salary_by_department as  (
select department, max(salary) as max_salary
from worker
group by department
)
select w1.department, w1.first_name, w1.last_name, w1.salary 
from worker w1, max_salary_by_department w2
where w1.salary = w2.max_salary and w1.department = w2.department
;

-- task 4 write an sql query to fetch the list of employees with the same salary

with t2 as (
select salary 
from worker
group by salary
having count(*) > 1
)
select w.first_name, w.last_name, w.salary
from worker w, t2 t
where w.salary = t.salary
;

-- task 5 write an sql query to find the worker names with salaries + bonus in 202１

select w.first_name, w.last_name, (w.salary + b.bonus_amount) as Total_Salary
from worker w, bonus b
where year(b.bonus_date) = 2021 and w.worker_id = b.worker_ref_id
;

-- task 6 ( please complete task 1- 5 first ):
-- your actions : delete all the records in table worker
-- question study the reason why the data cannot be deleted

delete from worker;

-- Ans : Because worker table have foreign key map to bonus table 


-- task 7 ( please complete task 6 first):
-- your action : drop table worker
-- question : study the reason why the table cannot by dropped

drop table worker;

-- Ans : Because worker table have foreign key map to bonus table 