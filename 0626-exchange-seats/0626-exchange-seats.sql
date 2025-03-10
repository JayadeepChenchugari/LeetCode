# Write your MySQL query statement below
-- SELECT 
--     CASE 
--         WHEN id = (SELECT MAX(id) FROM seat) AND id % 2 = 1
--             THEN id 
--         WHEN id % 2 = 1
--             THEN id + 1
--         ELSE id - 1
--     END AS id,
--     student
-- FROM seat
-- ORDER BY id
select 
Case
when id=(select max(id) from seat) and id%2=1 then id
when id%2=1 then id+1
else id-1
end as id, 
student from seat
order by id