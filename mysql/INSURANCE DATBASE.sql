drop database if exists insurance;

create database insurance;

use insurance;

drop table if exists insurance_details;

create table insurance_details(
insuranceId varchar(5) primary key,
insuranceName varchar (50),
insuranceType varchar (50),
premiumStart varchar (10),
premiumEnd varchar(10),
minPeriod varchar(10),
maxPeriod varchar (10),
launchDate date,
status varchar (10)
);

Insert into insurance_details (insuranceId,insuranceName,insuranceType,
premiumStart,premiumEnd,minPeriod,maxPeriod,launchDate,status)
values
('INS01', 'The Aam Aadmi Bima Yojana', 'Health Insurance', '5 k', '200 k', '5 years', '10 years', '2023-01-15', 'Active'),
('INS02', 'The Pradhan Mantri Suraksha Bima Yojana ', 'Health Insurance', '3 k', '150 k', '3 years', '30 years', '2023-02-15', 'Active'),
('INS03', 'The Mahatma Jyotiba Phule Jan Arogya Yojana ', 'Health Insurance', '3 k', '500 k', '2 years', '25 years', '2023-03-15', 'Active'),
('INS04', 'The Bhamashah Swasthya Bima Yojana ', 'Health Insurance', '10 k', '65 k', '3 years', '45 years', '2023-04-15', 'Active'),
('INS05', 'Bajaj Allianz Car Insurance ', 'Motor Insurance', '15 k', '125 k', '2 years', '15 years', '2023-05-17', 'Active'),
('INS06', 'ICICI Lombard Car Insurance ', 'Motor Insurance', '10 k', '100 k', '3 years', '8 years', '2023-06-18', 'Active'),
('INS07', 'National Car Insurance', 'Motor Insurance', '7 k', '80 k', '2 years', '10 years', '2023-07-19', 'Active'),
('INS08', 'Bharti AXA Home Insurance', 'Home Insurance','15 k', '2 Cr', '5 years', '20 years', '2023-07-20', 'Active'),
('INS09', 'Shriram General Home Insurance', 'Home Insurance', '20 k', '5 Cr', '2 years', '40 years', '2023-07-21', 'Active'),
('INS10', 'Royal Sundaram Home Insurance', 'Home Insurance', '12.5 k' , '7 Cr', '3 years', '38 years', '2023-07-22', 'Active'),
('INS11', 'Bharat Griha Raksha', 'Fire Insurance', '5 Cr' , '40 Cr', '1 years', '30 years', '2023-07-21', 'Active'),
('INS12', 'Bharat Sookshma Udyam Surakhsa', 'Fire Insurance', '900 k' , '5 Cr', '4 years', '20 years', '2023-08-22', 'Active'),
('INS13', 'Bharat Laghu Udyam Suraksha', 'Fire Insurance', '900 k' , '5 Cr', '4 years', '20 years', '2023-08-22', 'Active');
select * from insurance_details;

use insurance;
drop table if exists customer_details;
create table customer_details(
custId INT AUTO_INCREMENT PRIMARY KEY,
firstName varchar (50),
lastName varchar (50),
gender varchar (10),
dob DATE,
username varchar (50),
email varchar (50),
password varchar (50),
status VARCHAR(10)
);
select * from customer_details;

use insurance;
drop table if exists customer_auth;
create table customer_auth(
authId INT auto_increment primary key,
userName varchar(50),
passWord varchar(50),
custId int,
otp varchar(50),
status varchar(10)
);

use insurance;
drop table if exists ins_plans;
create table ins_plans(
planId INT  primary key,
insuranceId varchar(50),
premiumAmount double,
covAmount double,
FOREIGN KEY (insuranceId) REFERENCES insurance_details(insuranceId)
);
insert into ins_plans(planId,insuranceId, premiumAmount, covAmount)	
values 
(1, 'INS01', 5000, 800000),
(2, 'INS01', 8000, 1200000),
(3, 'INS02', 3000, 500000);				
 




select * from customer_auth;
