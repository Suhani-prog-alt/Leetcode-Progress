# Write your MySQL query statement below
select employee.name, bonus.bonus from employee 
left outer join bonus
on employee.empId = Bonus.empId
where bonus.bonus < 1000 OR bonus.bonus is null
