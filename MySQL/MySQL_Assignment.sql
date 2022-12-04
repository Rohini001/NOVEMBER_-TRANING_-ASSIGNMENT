use rohini;
create table Employee(id int, name varchar(255), designation varchar(255), salary int,
 address varchar(255),department varchar(255));
 
 insert into Employee(id ,name, designation,salary,address,department) 
 values(1,"alex","Manager",230000,	"US","IT"),
 (2,"ROBERT","manager",340000,	"Canada","IT"),
 (3,"Allen","SE",12000,"London","Accounts"),
 (4,"John","SSE",230000,"India","Testing"),
 (5,"Andrew","Program Manager",250000,	"Australia","IT");
 select * from Employee;

# Write a mysql statement to find the employee salary is greater than 300000 
 select salary from employee where salary >300000;
 
# Write mysql statement to show distinct departments
select distinct(department) from employee ; 

#Write mysql statement to get records of employees working in IT,Testing department.
select * from employee where department IN ("IT","Testing");

#Write mysql statements to get all department sin descending order
select department from employee order by department DESC;

#Write a mysql statement to create a table employee which already not exists
create table IF NOT exists Employee(id int, name varchar(255), designation varchar(255), salary int,
 address varchar(255),department varchar(255));
 
 #Write a mysql statement to find the Highest and lowest paid salary employee full record
SELECT * FROM employee where salary = (select max(salary) from employee);
SELECT * FROM employee where salary = (select min(salary) from employee);

#Write a mysql statement to find all the employees that have worked in at least 2 departments. Show their name ,departments they work in. Display all results in ascending order.
select name, department, COUNT(*) from Employee group by department having COUNT(*)>2 ; 

#Write a mysql statement to create new database,use newly created database,create table and check the list of tables and drop the table
create database rohini;
use rohini;
create table Employee(id int, name varchar(255), designation varchar(255), salary int,
 address varchar(255),department varchar(255));
 show tables;
 drop table Employee;
 
 #Write a mysql statementto fetch employee records whose designation is manager and salary is between 200000 to 300000.
 select * from Employee where designation='Manager' and salary between 200000 and 300000;
 
 #Write a mysql statement to update the salary by 20000 in Accounts department.
 update Employee set salary=salary+20000 where department='Accounts';

#Write a mysql statement to alter table by adding new column as doj(date of joining) into the employee table
alter table Employee add column(doj varchar(255));
desc Employee;

#Write a mysql statement to rename the employee table
rename table Employee to emp;
show tables;

# Write a mysql statement to get names which are NOT NULL.
select * from emp where name is not null;

#Write a mysql statement to get null doj values
select * from emp where name is null;

#Write a mysql statement to get salary between 100000 to 20000 in Accounts and IT departments
select * from emp where department in('Accounts','IT') and  salary between  100000 and 20000 ;

#Write a mysql statement to show the use of ANY
SELECT id FROM emp WHERE id > ANY (SELECT rollno FROM student);  