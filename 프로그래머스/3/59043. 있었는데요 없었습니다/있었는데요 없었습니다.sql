-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문
-- 결과는 보호 시작일이 빠른 순으로 조회

SELECT
    ins.animal_id,
    ins.name
FROM
    animal_ins ins
    LEFT JOIN
    animal_outs outs
    ON
    ins.animal_id = outs.animal_id
WHERE
    outs.datetime - ins.datetime < 0
ORDER BY
    ins.datetime;