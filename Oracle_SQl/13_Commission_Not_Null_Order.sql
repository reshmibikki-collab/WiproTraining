-- Display employees having commission percentage and sort by salary and commission

SELECT 
    last_name, 
    salary, 
    commission_pct
FROM 
    employees
WHERE 
    commission_pct IS NOT NULL
ORDER BY 
    2 DESC, 
    3 DESC;