drop database if exists cust_otp;

 

create database cust_otp;
use cust_otp;

 

drop table if exists customer;
CREATE TABLE Customer (
    Cust_ID INT PRIMARY KEY AUTO_INCREMENT,
    customer_Firstname VARCHAR(30),
    customer_LastName VARCHAR(30),
    customer_UserName VARCHAR(30),
    customer_Password VARCHAR(200),
    customer_Email VARCHAR(30),
    customer_PhoneNo VARCHAR(15),
    Customer_Status VARCHAR(20),
    Customer_ActivatedOn DATETIME
);

 

drop table if exists otp;

 

CREATE TABLE Otp (
    Otp_ID INT PRIMARY KEY AUTO_INCREMENT,
    Cust_ID INT,
    customer_UserName VARCHAR(30),
    OtpCode VARCHAR(10),
    GeneratedOn DATETIME,
     FOREIGN KEY (Cust_ID) REFERENCES Customer(Cust_ID)
);