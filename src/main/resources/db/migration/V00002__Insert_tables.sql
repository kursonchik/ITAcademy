INSERT INTO roles (id, name) VALUES ('1', 'ADMINISTRATOR'),('2', 'SALE_USER'),('3', 'CUSTOMER_USER'),('4', 'SECURE_API_USER');

INSERT INTO users (id, last_name, first_name, patronymic, email)
VALUES (1,'Ivanov','Ivan', 'Ivanovich', 'admin@gmail.com'),
(2,'Bobov','Bob', 'Bobovich','bob@gmail.com'),
(3,'Tompson','Tom', 'Tomovich','tom@gmail.com'),
(4,'Clark','Clark', 'Clarkovich','clark@gmail.com'),
(5,'Frankinston','Frank', 'Frankovich','frank@gmail.com'),
(6,'Ddddson','Dddd', 'Ddddovich','dddd@gmail.com'),
(7,'Smith','Frank', 'Clarkovich','smith@gmail.com'),
(8,'Vorobiov','Andrey', 'Andreevich','vaa@gmail.com'),
(9,'Cotov','Igor', 'Andreevich','cotov@gmail.com'),
(10,'Medvedev','Ruslan', 'Bobovich','medved@gmail.com'),
(11,'Dotov','Digor', 'Dandreevich','dotov@gmail.com');

INSERT INTO user_roles (user_id, role_id) VALUES ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '2'), ('6', '3'), ('7', '4'), ('8', '2'), ('9', '3'), ('10', '4'), ('11', '3');