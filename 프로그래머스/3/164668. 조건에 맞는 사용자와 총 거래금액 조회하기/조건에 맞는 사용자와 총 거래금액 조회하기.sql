-- 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문
-- 결과는 총거래금액을 기준으로 오름차순 정렬
SELECT
    user_id,
    nickname,
    SUM(price) total_sales
FROM
    used_goods_board board
    LEFT JOIN
        used_goods_user user
    ON
        writer_id = user_id
WHERE
    STATUS = 'DONE'
GROUP BY
    user_id
HAVING
    total_sales >= 700000
ORDER BY
    total_sales;
        