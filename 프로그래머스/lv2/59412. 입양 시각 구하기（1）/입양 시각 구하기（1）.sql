SELECT
    HOUR(datetime) AS hour,
    COUNT(animal_id)
FROM
    animal_outs
GROUP BY
    hour
HAVING
    hour BETWEEN 9 AND 19
ORDER BY
    hour;