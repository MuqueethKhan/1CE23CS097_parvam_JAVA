create database employee_mgmt;

use employee_mgmt;

CREATE TABLE employee (
    emp_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(100) NOT NULL,
    job VARCHAR(50),
    phone VARCHAR(15),
    salary DECIMAL(10,2),
    dept_id INT,
    project_id INT,
    FOREIGN KEY (dept_id) REFERENCES dept(dept_id),
    FOREIGN KEY (project_id) REFERENCES project(project_id)
    );

INSERT INTO employee (emp_name, job, phone, salary, dept_id, project_id) VALUES
('Neha Sharma',   'Manager',     '9876543210', 75000.00, 1, 1),
('Rahul Verma',   'Analyst',     '9876501234', 50000.00, 2, 5),
('Priya Singh',   'Developer',   '9876512345', 60000.00, 3, 2),
('Arjun Mehta',   'Designer',    '9876523456', 55000.00, 3, 1),
('Sonal Gupta',   'HR Executive','9876534567', 45000.00, 1, 4),
('Vikas Patel',   'Marketing',   '9876545678', 52000.00, 4, 4);

CREATE TABLE dept (
    dept_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(100) NOT NULL
);

INSERT INTO dept (dept_name) VALUES
('HR'),
('Finance'),
('IT'),
('Marketing'),
('Operations');


CREATE TABLE project (
    project_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    project_name VARCHAR(100) NOT NULL
);

INSERT INTO project (project_name) VALUES
('Website Redesign'),
('Mobile App'),
('Cloud Migration'),
('Product Launch'),
('Data Analysis');

select * from project;