-- 코드를 입력하세요
SELECT
    count(DISTINCT name)
FROM
    animal_ins
WHERE
    name is NOT NULL;