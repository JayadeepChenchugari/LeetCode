# Write your MySQL query statement below

select teacher_id,count(distinct subject_id) as cnt
from Teacher
where teacher_id is not null
group by teacher_id
