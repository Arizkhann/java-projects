drop database if exists cust_otp;
create database cust_otp;
use cust_otp;

drop table if exists customer;
create table Customer(
Cust_ID INT Primary Key Auto_Increment ,
	customer_Firstname varchar(30),
	customer_LastName varchar(30),
	customer_UserName varchar(30),
	customer_Password varchar(200),
	customer_Email  varchar(30),
	customer_PhoneNo varchar(15),
	Customer_Status varchar(20),
	Customer_ActivatedOn DateTime
    );

 

create table otp(
Otp_ID Int Primary Key Auto_Increment,
	Cust_ID Int ,
	OptCode varchar(10),
	GeneratedOn DateTime,
    foreign key (cust_ID) references customer(cust_ID)
    );
   /*
Requirements : Write Code to Create Account for Customer

 

-> CustomerPassword must be Encrypted
-> Customer_Status By Default 'OTP PENDING'
-> Generate OTP and store in OTP table.

 

OTP to be shared by email which mentioned in Customer Table. */

