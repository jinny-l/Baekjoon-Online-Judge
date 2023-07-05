SELECT 
    count(user_id)
FROM
    user_info
WHERE 
    YEAR(joined) = 2021 AND (AGE BETWEEN 20 AND 29);