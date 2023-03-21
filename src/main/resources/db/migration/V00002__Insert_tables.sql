INSERT INTO roles (id, name) VALUES ('1', 'ADMINISTRATOR'),('2', 'SALE_USER'),('3', 'CUSTOMER_USER'),('4', 'SECURE_API_USER');

INSERT INTO users (id, username, lastname, firstname, patronymic, password, email)
VALUES (1,'admin','Ivanov','Ivan', 'Ivanovich', 'adminadmin','admin@gmail.com'),
(2,'qwerty','Bobov','Bob', 'Bobovich','bobbobbob','bob@gmail.com'),
(3,'yuio','Tompson','Tom', 'Tomovich','bobbobbob','tom@gmail.com'),
(4,'zxcvb','Clark','Clark', 'Clarkovich','bobbobbob','clark@gmail.com'),
(5,'poiuyt','Frankinston','Frank', 'Frankovich','bobbobbob','frank@gmail.com'),
(6,'dfghh','Ddddson','Dddd', 'Ddddovich','bobbobbob','dddd@gmail.com'),
(7,'dfghjk','Smith','Frank', 'Clarkovich','bobbobbob','smith@gmail.com'),
(8,'nbvcx','Vorobiov','Andrey', 'Andreevich','bobbobbob','vaa@gmail.com'),
(9,'rfvtgb','Cotov','Igor', 'Andreevich','bobbobbob','cotov@gmail.com'),
(10,'vcxz','Medvedev','Ruslan', 'Bobovich','bobbobbob','medved@gmail.com');

INSERT INTO user_roles (user_id, role_id) VALUES ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '2'), ('6', '3'), ('7', '4'), ('8', '2'), ('9', '3'), ('10', '4');