-- 부서별로 부서 ID, 영문 부서명, 평균 연봉을 조회하는 SQL문
-- 평균연봉은 소수점 첫째 자리에서 반올림하고 컬럼명은 AVG_SAL
-- 부서별 평균 연봉을 기준으로 내림차순 정렬

SELECT
    D.DEPT_ID,
    D.DEPT_NAME_EN,
    ROUND(AVG(SAL), 0) AS AVG_SAL
FROM
    HR_EMPLOYEES E
    LEFT JOIN HR_DEPARTMENT D
    ON
    E.DEPT_ID = D.DEPT_ID
GROUP BY
    E.DEPT_ID
ORDER BY
    AVG_SAL DESC;