-- Display employees whose last name has 'a' as the third character

SELECT 
    last_name
FROM 
    employees
WHERE 
    last_name LIKE '__a%';