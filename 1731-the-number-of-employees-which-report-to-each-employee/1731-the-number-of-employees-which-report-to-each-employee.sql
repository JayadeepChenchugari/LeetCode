# Write your MySQL query statement below

select e1.employee_id,e1.name,count(e2.reports_to) as reports_count,Round(avg(e2.age),0) as average_age
from 
Employees e1
left join
Employees e2
on
e1.employee_id=e2.reports_to
where
e2.reports_to is not null
group by e1.employee_id,e1.name
order by e1.employee_id;





