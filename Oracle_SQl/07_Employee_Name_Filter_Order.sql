-- Display employees with specific last names and sort by hire date

SELECT 
    last_name, 
    job_id, 
    hire_date
FROM 
    employees
WHERE 
    last_name IN ('Matos', 'Taylor')
ORDER BY 
    hire_date ASC;