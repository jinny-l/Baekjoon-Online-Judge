-- 코드를 입력하세요
SELECT
    COUNT(user_ID) AS users
FROM
    user_info
WHERE
    age is NULL;