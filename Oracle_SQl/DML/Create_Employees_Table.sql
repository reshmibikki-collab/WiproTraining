

CREATE TABLE employees (
    employee_id    NUMBER(6),
    first_name     VARCHAR2(20),
    last_name      VARCHAR2(25) NOT NULL,
    department_id  NUMBER(4),
    salary         NUMBER(8,2)
);



DESCRIBE employees;