# Write your MySQL query statement below
Select person.firstName, person.lastName, Address.city, Address.state from person
left outer join address
on person.personId = Address.personId;

