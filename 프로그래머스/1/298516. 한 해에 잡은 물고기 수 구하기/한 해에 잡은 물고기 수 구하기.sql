--  2021년도에 잡은 물고기 수를 출력하는 SQL 문을
SELECT
    COUNT(ID) AS FISH_COUNT
FROM
    FISH_INFO
WHERE
    YEAR(TIME) = 2021;

