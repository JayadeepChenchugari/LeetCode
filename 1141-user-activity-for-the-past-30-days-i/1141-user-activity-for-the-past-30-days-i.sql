# Write your MySQL query statement below


SELECT 
    activity_date as day,
    COUNT(DISTINCT(user_id)) as active_users
FROM Activity
WHERE
    activity_date BETWEEN DATE('2019-07-27') - INTERVAL '29' DAY AND DATE('2019-07-27')
GROUP BY
    day
ORDER BY
    day
    
    
    
    
# select 
# activity_date as day,
# count(Distinct(user_id)) as active_users
# from Activity 
# where activity_date between date('2019-07-27') -interval '29' DAY AND DATE('29-07-27')
# group by day
# order by day