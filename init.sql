show databases;
CREATE DATABASE student_management_sys DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use student_management_sys;

CREATE TABLE student (
    id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    gender CHAR(2) NOT NULL,
    class_number VARCHAR(5) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO student (name,gender,class_number)
VALUES ("小一","男","1-1"),("小二","男","1-2"),("小四","男","1-4"),("小五","女","1-5"),("小六","女","1-6");
