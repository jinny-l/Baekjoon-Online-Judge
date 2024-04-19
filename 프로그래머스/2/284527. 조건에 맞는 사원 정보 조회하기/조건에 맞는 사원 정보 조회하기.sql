-- 2022년도 한해 평가 점수가 가장 높은 사원 정보 조회
-- 평가 점수가 가장 높은 사원들의 점수, 사번, 성명, 직책, 이메일을 조회하는 SQL문
-- 평가 점수를 나타내는 컬럼의 이름은 SCORE

WITH SCORE AS (
    SELECT
        EMP_NO,
        SUM(SCORE) AS SCORE
    FROM HR_GRADE
    WHERE
        YEAR = 2022
    GROUP BY
        EMP_NO
)

SELECT
    S.SCORE, E.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
FROM
    HR_EMPLOYEES E
    LEFT JOIN SCORE S
        ON E.EMP_NO = S.EMP_NO
WHERE
    S.SCORE = (SELECT
               MAX(SCORE) AS SCORE
               FROM SCORE);
    