create SCHEMA IF NOT EXISTS db_bootcamp;
use db_bootcamp;

create TABLE IF NOT EXISTS roles (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  PRIMARY KEY (id));

create TABLE IF NOT EXISTS users (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  last_name VARCHAR(40) NOT NULL,
  first_name VARCHAR(20) NOT NULL,
  patronymic VARCHAR(40) NOT NULL,
  email VARCHAR(50) NOT NULL);

create TABLE IF NOT EXISTS user_roles(
    user_id INT NOT NULL PRIMARY KEY,
    role_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
    ON delete CASCADE
    ON update CASCADE,
    CONSTRAINT role_id
    FOREIGN KEY (role_id)
    REFERENCES roles (id)
    ON delete CASCADE
    ON update CASCADE
);
