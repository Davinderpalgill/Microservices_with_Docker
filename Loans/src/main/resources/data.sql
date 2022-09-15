DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS loans;

CREATE TABLE `customer` (
  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile_number` varchar(20) NOT NULL,
  `create_dt` date DEFAULT NULL
);

CREATE TABLE `loans` (
   `loan_id` long AUTO_INCREMENT PRIMARY KEY,
    `customer_id` int NOT NULL,
  `loan_amount` long NOT NULL,
  `balance_amount` long NOT NULL,
  `tenure` int NOT NULL,
  `loan_type` varchar(20) NOT NULL ,
  `start_dt` date DEFAULT NULL
);

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_dt`)
 VALUES ('gillz','gilldav1997@gmail.com','9872968689',CURDATE());
 
INSERT INTO `loans` (`customer_id`, `loan_amount`, `balance_amount`, `tenure`,`loan_type`, `start_dt`)
 VALUES (1, 186576453, 120000,5,'Personal', '2020-05-20');
 INSERT INTO `loans` (`customer_id`, `loan_amount`, `balance_amount`, `tenure`,`loan_type`, `start_dt`)
 VALUES (1, 18654453, 160000,5,'home', '2022-09-01');
 