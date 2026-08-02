-- Display employees who do not have a manager

SELECT 
    last_name, 
    job_id
FROM 
    employees
WHERE 
    manager_id IS NULL;