SELECT
    half.flavor
FROM
    first_half half LEFT JOIN icecream_info info
ON 
    half.flavor = info.flavor
WHERE
    total_order > 3000 AND ingredient_type = 'fruit_based'
ORDER BY 
    total_order DESC;
    