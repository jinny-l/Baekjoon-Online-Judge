SELECT
    car_type,
    COUNT(car_id) AS cars
FROM
    car_rental_company_car
WHERE
    OPTIONS LIKE '%시트%'
GROUP BY
    car_type
ORDER BY
    car_type ASC;