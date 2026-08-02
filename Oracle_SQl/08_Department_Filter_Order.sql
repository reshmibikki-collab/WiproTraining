-- Display employees from departments 20 and 50 sorted by last name

SELECT 
    last_name, 
    department_id
FROM 
    employees
WHERE 
    department_id IN (20, 50)
ORDER BY 
    last_name ASC;