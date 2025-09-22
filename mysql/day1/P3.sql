create database order_mgmt;

use order_mgmt;

CREATE TABLE orders (
    o_id INT PRIMARY KEY AUTO_INCREMENT,
    cust_name VARCHAR(100) NOT NULL,
    pro_name VARCHAR(100) NOT NULL,
    qty INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    o_date DATE NOT NULL,
    status VARCHAR(20) DEFAULT 'Pending'
);

INSERT INTO orders (cust_name, pro_name, qty, price, o_date, status) VALUES
('Neha Sharma',   'Laptop',        1, 55000.00, '2025-09-01', 'Pending'),
('Rahul Verma',   'Smartphone',    2, 18000.00, '2025-09-03', 'Completed'),
('Priya Singh',   'Headphones',    3, 1500.00,  '2025-09-05', 'Pending'),
('Arjun Mehta',   'Keyboard',      1, 1200.00,  '2025-09-07', 'Shipped'),
('Sonal Gupta',   'Monitor',       2, 9000.00,  '2025-09-09', 'Pending'),
('Vikas Patel',   'USB Drive',     5, 500.00,   '2025-09-10', 'Completed');

select * from orders;

select * from orders order by price;

select * from orders where price>50000.00;

select max(price) as MaxPrice from orders; /*or select * from orders order by price desc limit 1 offset 1;*/

SELECT * FROM orders
WHERE status IN ('Shipped', 'Completed');

select count(*) as Total_Count from orders;

select avg(price) as Average from orders;

SELECT COUNT(*), STATUS FROM orders group by status;

