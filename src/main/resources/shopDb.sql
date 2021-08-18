USE shopdb;

CREATE TABLE shop
(
    id        INT PRIMARY KEY AUTO_INCREMENT,
    shop_name VARCHAR(30) NOT NULL
);

CREATE TABLE position
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    position VARCHAR(30) NOT NULL,
    shop_id  INT,
    FOREIGN KEY (shop_id) REFERENCES shop (id)
);

CREATE TABLE person
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    person_name VARCHAR(30) NOT NULL,
    position_id  INT,
    FOREIGN KEY (position_id) REFERENCES position (id)
);