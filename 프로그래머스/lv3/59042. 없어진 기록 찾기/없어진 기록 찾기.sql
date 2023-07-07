-- 코드를 입력하세요
SELECT
    outs.animal_id,
    outs.name
FROM
    animal_outs outs LEFT JOIN animal_ins ins
ON
    ins.animal_id = outs.animal_id
WHERE
    ins.animal_id IS NULL;
    
    