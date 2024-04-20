SELECT
    info.flavor
FROM
    icecream_info info
LEFT JOIN
    first_half fh
    ON
    info.flavor = fh.flavor
WHERE
    fh.total_order > 3000
    AND
    info.ingredient_type = 'fruit_based'
ORDER BY
    fh.total_order DESC;