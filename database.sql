CREATE DATABASE IF NOT EXISTS web_java_3_db;

USE web_java_3_db;

DROP TABLE IF EXISTS Products;
CREATE TABLE IF NOT EXISTS Products(
  id mediumint not null auto_increment,
  PRIMARY KEY (id),
  name varchar(60) not null,
  description varchar(100),
  price mediumint not null
);

DROP TABLE IF EXISTS Sales;
CREATE TABLE IF NOT EXISTS Sales(
  id mediumint not null auto_increment,
  PRIMARY KEY (id),
  product_id mediumint not null,
  FOREIGN KEY (product_id) references Products(id),
  description varchar(100),
  total mediumint not null
);


INSERT INTO Products(name, price)
VALUES('laksa', 5),
      ('mee goreng', 3),
      ('nasi lemak', 3.5),
      ('kueh salat', 2),
      ('ayam goreng', 6)
;

INSERT INTO Sales(product_id, total)
VALUES(1, 5),
      (1, 3),
      (2, 6),
      (3, 2),
      (4, 1),
      (5, 3)
;

