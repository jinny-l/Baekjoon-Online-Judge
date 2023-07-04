SELECT title, board.board_id, reply_id, reply.writer_id, reply.contents, DATE_FORMAT(reply.created_date, '%Y-%m-%d') AS created_date
FROM used_goods_board board INNER JOIN used_goods_reply reply
ON board.board_id = reply.board_id
WHERE board.created_date BETWEEN '2022-10-01' AND '2022-10-31'
-- WHERE YEAR(board.created_date) = 2022 AND MONTH(board.created_date) = 10
ORDER BY reply.created_date ASC, title;