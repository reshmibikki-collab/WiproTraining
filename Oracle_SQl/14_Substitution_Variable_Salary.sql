-- Display employees whose salary is greater than user-provided value

SELECT 
    last_name, 
    salary
FROM 
    employees
WHERE 
    salary > &Salary_value;