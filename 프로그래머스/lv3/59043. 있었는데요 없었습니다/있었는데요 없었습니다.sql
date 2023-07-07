SELECT
    outs.animal_id,
    outs.name
FROM
    animal_ins ins, animal_outs outs
WHERE
    ins.animal_id = outs.animal_id
AND 
    outs.datetime < ins.datetime
ORDER BY
    ins.datetime;