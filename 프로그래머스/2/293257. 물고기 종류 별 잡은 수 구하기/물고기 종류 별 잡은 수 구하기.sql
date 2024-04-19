-- 종류 별 물고기의 이름과 잡은 수를 출력하는 SQL문
-- 물고기의 이름 컬럼명은 FISH_NAME, 잡은 수 컬럼명은 FISH_COUNT
-- 결과는 잡은 수 기준으로 내림차순 정렬

SELECT
    COUNT(FI.ID) AS FISH_COUNT,
    FN.FISH_NAME
FROM
    FISH_INFO FI
    LEFT JOIN
    FISH_NAME_INFO FN
        ON FI.FISH_TYPE = FN.FISH_TYPE
GROUP BY
    FN.FISH_NAME
ORDER BY
    FISH_COUNT DESC;

