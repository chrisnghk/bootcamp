 -- Task 1 
create database bootcamp_exercise1;

use bootcamp_exercise1;
-- Task 2.1
create table regions(
	region_id integer primary key,
    region_name varchar(25)
);

create table countries(
	country_id char(2) primary key,
    country_name varchar(40),
    region_id integer,
    foreign key (region_id) references regions(region_id)
);

create table locations(
	location_id integer primary key,
    street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    foreign key (country_id) references countries(country_id)
);

create table departments(
	department_id integer primary key,
    department_name varchar(30),
    manager_id integer,
    location_id integer,
    foreign key (location_id) references locations(location_id)
);

create table job_grades(
	grade_level varchar(2) primary key,
    lowest_sal integer,
    highest_sal integer
);

create table jobs(
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary integer,
    max_salary integer
);

create table job_history(
	employee_id integer,
    start_date date,
    end_date date,
    job_id varchar(10),
    department_id integer,
    primary key (employee_id, start_date),
    foreign key (department_id) references departments(department_id),
    foreign key (job_id) references jobs(job_id)
);

create table employees(
	employee_id integer primary key,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25),
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10),
    salary integer,
    commission_pct integer,
    manager_id integer,
    department_id integer,
    foreign key (employee_id) references job_history (employee_id),
    foreign key (department_id) references departments (department_id),
    foreign key (job_id) references jobs(job_id)
);

-- Task 2.2

insert into jobs values ('IT_PROG', 'IT PROGRAMMER',16000,70000);
insert into jobs values ('MK_REP', 'MARKET REP',8000,20000);
insert into jobs values ('ST_CLERK', 'SENIOR CLERK',21000,29000);

insert into regions values(1,'EMEA');
insert into regions values(2,'EUROPE');
insert into regions values(3,'ASIA');

insert into countries values ('DE','Germany',1);
insert into countries values ('IT','Italy',1);
insert into countries values ('JP','Japan',3);
insert into countries values ('US','United State',2);

insert into locations values ( 1000, '1297 Via Cola Di Rie','989','Roma','','IT');
insert into locations values ( 1100, '93091 Calle della Te','10934','Venice','','IT');
insert into locations values ( 1200, '2017 Shinjuku-ku','1689','iTokyo','Prefectu','JP');
insert into locations values ( 1400, '2014 Jabberwocky Rd','26192','Southlake','Texas','US');

insert into departments values ( 10,'Administration',200,1100);
insert into departments values ( 20,'Marketing',201,1200);
insert into departments values ( 30,'Purchasing',202,1400);

insert into job_history values ( 102,'1993-01-13','1998-07-24','IT_PROG',20);
insert into job_history values ( 101,'1989-09-21','1993-10-27','MK_REP',10);
insert into job_history values ( 101,'1993-10-28','1997-03-15','MK_REP',30);
insert into job_history values ( 100,'1996-02-17','1999-12-19','ST_CLERK',30);
insert into job_history values ( 103,'1998-03-24','1999-12-31','MK_REP',20);

insert into employees values ( 100,'Steven','King','SKING','515-1234567','1987-06-17','ST_CLERK',24000,0,109,10);
insert into employees values ( 101,'Neena','Kochhar','NKOCHHAR','515-1234568','1987-06-18','MK_REP',17000,0,103,20);
insert into employees values ( 102,'Lex','De Haan','LDEHAAN','515-1234569','1987-06-19','IT_PROG',17000,0,108,30);
insert into employees values ( 103,'Alexander','AHUNOLD','SKING','590-4234567','1987-06-20','MK_REP',9000,0,105,20);


--  Task 2.3
SELECT l.location_id,l.street_address,l.city,l.state_province,c.country_name
FROM locations l, countries c
;

-- Task 2.4
select first_name, last_name, department_id
from employees
;

-- Task 2.5
select e.first_name, e.last_name,job_id, e.department_id, c.country_name
from employees e ,departments d, locations l, countries c
where e.department_id = d.department_id and d.location_id = l.location_id and l.country_id = c.country_id and c.country_name ='Japan'
;

-- Task 2.6 Write a query to find the employee id , last name along with their manager id and last name

insert into job_history values ( 109,'1990-01-01','2022-07-24','IT_PROG',20);
insert into employees values ( 109,'Fisrt_m name','last m name ','manager@gmail.com','404-1234568','1990-06-18','IT_PROG',50000,0,201,20);

select e1.employee_id,e1.last_name, e2.employee_id,e2.last_name
from employees e1,employees e2
where e1.manager_id = e2.employee_id
;
-- Task 2.7

select first_name,last_name,hire_date
from employees
where hire_date > (select hire_date
from employees
where first_name = 'Lex' and last_name = 'De Haan'
)
;

-- Task 2.8

select d.department_name,count(1) as number_of_employee
from departments d ,employees e
where d.department_id = e.department_id
group by d.department_id 
;

-- Task 2.9 -- write a query to find the employee ID, job title ,number of days between ending date and starting date for all jobs in department ID30

select e.employee_id, j.job_title, datediff( jh.end_date,jh.start_date ) as 'number of days between ending date and starting date'
from employees e, jobs j, job_history jh
where e.job_id = j.job_id and j.job_id = jh.job_id and jh.department_id = 30
;
-- Task 2.10 -- wrtie a query to display all department name, manager name, city and country name.

select d.department_name , e.first_name, e.last_name, l.city, c.country_name
from departments d, employees e , locations l, countries c
where d.department_id = e.department_id and d.location_id = l.location_id and l.country_id = c.country_id and d.manager_id = e.employee_id
;

-- Task 2.11 -- write a query to display the average salary of each department 

select d.department_name, avg(e.salary) as Average_salary
from departments d, employees e
where d.department_id = e.department_id
group by d.department_name
;

-- task 2.12
create table job_grades(
	grade_level varchar(2) primary key,
    lowest_sal integer,
    highest_sal integer
);

create table jobs(
	job_id varchar(10) primary key,
    job_title varchar(35),
    grade_level varchar(2),
    foreign key (grade_level) references job_grades(grade_level)
);