-- 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문

SELECT
    outs.animal_id,
    outs.name
FROM
    animal_outs outs
    LEFT JOIN
    animal_ins ins
    ON
    outs.animal_id = ins.animal_id
WHERE
    ins.animal_id IS NULL
    AND
    outs.datetime IS NOT NULL
ORDER BY
    outs.animal_id;