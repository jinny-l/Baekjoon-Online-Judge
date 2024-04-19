-- 월별 잡은 물고기의 수와 월을 출력하는 SQL문
-- 잡은 물고기 수 컬럼명은 FISH_COUNT, 월 컬럼명은 MONTH
-- 결과는 월을 기준으로 오름차순 정렬

SELECT
    COUNT(ID) AS FISH_COUNT,
    MONTH(TIME) AS MONTH
FROM
    FISH_INFO
GROUP BY
    MONTH(TIME)
ORDER BY
    MONTH;
    