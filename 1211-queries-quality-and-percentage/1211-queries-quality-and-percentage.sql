# Write your MySQL query statement below



select query_name , Round(Avg(rating/position),2) as quality,Round(avg(if(rating<3,1,0))*100,2) as poor_query_percentage
from Queries
where query_name is not null
group by query_name

# SELECT query_name,
#        ROUND(AVG(rating / position), 2) AS quality,
#        ROUND(AVG(IF(rating < 3, 1, 0)) * 100, 2) AS poor_query_percentage
# FROM Queries
# WHERE query_name IS NOT NULL
# GROUP BY query_name;