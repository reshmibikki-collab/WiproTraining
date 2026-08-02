-- Display employees based on manager id and dynamic sorting column

SELECT 
    employee_id, 
    last_name, 
    salary, 
    department_id
FROM 
    employees
WHERE 
    manager_id = &manager_id
ORDER BY 
    &sorted_by;