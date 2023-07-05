SELECT
    member_id,
    member_name,
    gender,
    DATE_FORMAT(date_of_birth, '%Y-%m-%d') AS date_of_birth
FROM
    member_profile
WHERE
    GENDER = 'W' AND MONTH(date_of_birth) = 3 AND tlno is NOT NULL
ORDER BY
    member_id ASC;
    