CREATE TABLE employee (
  id bigint(20) AUTO_INCREMENT PRIMARY KEY,
  firstname varchar(255) DEFAULT NULL,
  lastname varchar(255) DEFAULT NULL,
  title varchar(255) DEFAULT NULL
  );

insert into employee(firstname, lastname, title) values('John', 'Doe', 'Bossman');
insert into employee(firstname, lastname, title) values('Jane', 'Doe', 'Bosswoman');