

SELECT 
    last_name, 
    job_id, 
    salary
FROM 
    employees
WHERE 
    (job_id LIKE '%REP%' OR job_id LIKE '%CLERK%')
    AND 
    salary NOT IN (2500, 3500, 7000);