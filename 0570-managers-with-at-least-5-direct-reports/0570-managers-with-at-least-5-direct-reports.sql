# Write your MySQL query statement below

-- select name from Employee
-- where id in 
-- (select managerId from Employee where managerId is not null 
-- group by managerId having count(managerId)>=5);

select e1.name from 
Employee e1 
left join 
Employee e2
on
e1.id=e2.managerId
group by e1.id 
having count(e2.managerId)>=5;