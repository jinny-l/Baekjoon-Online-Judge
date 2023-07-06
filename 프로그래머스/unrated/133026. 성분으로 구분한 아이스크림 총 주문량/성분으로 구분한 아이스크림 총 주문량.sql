-- 코드를 입력하세요
SELECT
    ingredient_type,
    SUM(total_order)
FROM
    first_half half LEFT JOIN icecream_info info
ON
    half.flavor = info.flavor
GROUP BY
    ingredient_type;