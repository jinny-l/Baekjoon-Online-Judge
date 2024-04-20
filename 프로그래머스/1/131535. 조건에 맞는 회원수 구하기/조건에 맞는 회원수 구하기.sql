-- 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원

SELECT
    COUNT(USER_ID) AS USERS
FROM
    USER_INFO
WHERE
    AGE BETWEEN 20 AND 29
    AND
    YEAR(JOINED) = 2021;