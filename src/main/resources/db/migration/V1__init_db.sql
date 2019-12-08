DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS jobdetails;

CREATE TABLE jobdetails (
  id bigint(20) AUTO_INCREMENT PRIMARY KEY,
  title varchar(255) DEFAULT NULL,
  salary decimal(18,9) DEFAULT NULL,
  department varchar(255) DEFAULT NULL
  );

  insert into jobdetails(id, title, salary, department) values(1, 'Bossman', 4550, 'Management');
  insert into jobdetails(id, title, salary, department) values(2, 'Bosswoman', 4700, 'Management');
  insert into jobdetails(id, title, salary, department) values(3, ' Japanese salaryman', 3400, 'N/A');

CREATE TABLE employee (
  id bigint(20) AUTO_INCREMENT PRIMARY KEY,
  firstname varchar(255) DEFAULT NULL,
  lastname varchar(255) DEFAULT NULL,
  jobdetails_ bigint(20),
  CONSTRAINT fk_jobdetails
    FOREIGN KEY (jobdetails_)
        REFERENCES jobdetails(id)
  );

  insert into employee(firstname, lastname, jobdetails_) values('John', 'Doe', 1);
  insert into employee(firstname, lastname, jobdetails_) values('Jane', 'Doe', 2);