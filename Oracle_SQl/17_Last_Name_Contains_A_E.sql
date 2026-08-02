-- Display employees whose last names contain both 'a' and 'e'

SELECT 
    last_name
FROM 
    employees
WHERE 
    last_name LIKE '%a%'
    AND 
    last_name LIKE '%e%';