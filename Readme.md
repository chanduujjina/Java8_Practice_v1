1.default and static methods in interface

2.Custom functional interface(SAM class)

an interface having only one absstract method in it

lambda expression 

Default functional interfaces in java

1.Function
2.BiFunction
3.UnaryOperator
4.BinaryOperator
5.Consumer
6.BiConsumer
7.Supplier
8.Predicate
9.BiPredicate

Function is an functional interface having SAM(single abstarct method) called apply

it will accept one object as parameter and return object

BiFunction:
it will accept two object as parameter and return object

UnaryOperator
it will accept one object as parameter and return same object as input parameter

BinaryOperator
it will accept two object as parameter and return same object as input parameters

Consumer:
it will accept one object return nothing

BiConsumer:
it will accept two object return nothing

Supplier:
accept nothing but return object

Predicate:
it will accept one object and return boolean value

BiPredicate:
it will accept two object and return boolean value

Stream Api in collection?

1.how to create a stream?
2.Basics rules of stream api?
3.What ate intermediate operators and terminal operators in stream?

Queries on Employee mock data?

Basic rule of Stream usage

1.There should be one or more intermediate operators and should be only one terminal operator

Aggregators functions(sum,avg,max,min,count)


 select sum(salary) from employee;
 select avg(salary) from employee;
 select max(salary) from employee;
 select min(salary) from employee;
 
 select count(column) from employee;
 
 sorting queries in sql
 
 select * from employee order by salary asc;
 
  select * from employee order by salary desc;
  
  
  distinct list of names
  
  select distinct empName from employee
  
  group by function
  
   select count(id) as employeeCount ,deptName from employee group by deptName;
  
  
 







