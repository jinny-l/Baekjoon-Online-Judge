-- 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문
-- 결과는 보호 시작일 순으로 조회

SELECT
    INS.NAME,
    INS.DATETIME
FROM
    ANIMAL_INS INS
    LEFT JOIN
    ANIMAL_OUTS OUTS
    ON
    INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE
    OUTS.DATETIME IS NULL
ORDER BY
    INS.DATETIME
LIMIT
    3;