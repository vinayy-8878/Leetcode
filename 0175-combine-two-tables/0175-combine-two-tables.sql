# Write your MySQL query statement below
select Person.firstName,Person.lastName,Address.city,Address.state
from Person LEFT OUTER JOIN Address on Person.personId=Address.personId;