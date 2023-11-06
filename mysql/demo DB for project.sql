 drop database micha;
 create database micha;
 use micha;
 
 CREATE TABLE Insurance_Details (
    Insurance_id varchar(5) PRIMARY KEy,
    Insurance_Name VARCHAR(255),
    Type VARCHAR(255),
    PremiumStart DATE,
    PremiumEnd DATE,
    MinPeriod INT,
    MaxPeriod INT,
    LaunchDate DATE,
    Status VARCHAR(10)
    
);
CREATE TABLE Insurance_Plans (
    Plan_id INT AUTO_INCREMENT PRIMARY KEY,
    Insurance_id  varchar(5),
    Premium_Amount DECIMAL(10, 2),
    Coverage_Amount DECIMAL(10, 2),
    Benefits varchar(369),
    FOREIGN KEY (Insurance_id) REFERENCES Insurance_Details(Insurance_id)
    );
    
    INSERT INTO Insurance_Details (Insurance_id, Insurance_Name, Type, PremiumStart, PremiumEnd, MinPeriod, MaxPeriod, LaunchDate, Status)
VALUES
    ('I001', 'Aditya Birla Activ Health Platinum Plan', 'Private', '2023-01-01', '2023-12-31', 1, 10, '2023-01-01', 'Active'),
    ('I002', 'Bharti AXA Smart Super Health Insurance Policy

	', 'Government', '2023-03-15', '2024-03-15', 1, 5, '2023-03-15', 'Active'),
    ('I003', 'Niva Bupa Heartbeat Health Insurance Plan', 'Private', '2023-02-01', '2033-02-01', 5, 30, '2023-02-01', 'Active');
    
    
    -- Claim and provider---
    
    
    create table claim(
    Claim_Id int Auto_Increment Primary Key,
    Insurance_id varchar(5),
    Plan_id int,
    Patient_id varchar(100),
    Hospital_id varchar(15),
    Admit_date date,
    disc_date date,
    Bill_Amount numeric(11,2),
    Mis_Amount numeric(9,2),
    Disease varchar(100),
    Comments varchar(100)
    );
    
    
    INSERT INTO Insurance_Plans (Insurance_id, Premium_Amount, Coverage_Amount, Benefits)
VALUES
    ('I001', 100, 10000, 'Dental Care'),
    ('I001',989, 30000, 'Maternity Care'),
     ('I001', 300, 200000, 'Surgery'),
     
       ('I002', 1000.00, 100000.00, 'Hospitalization'),
    ('I002', 200, 7500.00, 'Prescription Drugs'),
     ('I002', 800, 150000.00, 'Emergency Room'),
     
       ('I003', 600, 20000.00, 'Mental Health Services'),
    ('I003', 1200, 300000, 'Home Healthcare'),
     ('I003', 800, 20000, 'Chiropractic Care');
    use micha; 
CREATE TABLE Subscriptions (
    Subscription_Id INT AUTO_INCREMENT PRIMARY KEY,
    Plan_id INT,
    Insurance_id VARCHAR(5),
    Premium_Amount DECIMAL(10, 2),
    Coverage_Amount DECIMAL(10, 2),
    PayMode VARCHAR(20),
    email varchar(30),
    RegistrationDate DATE,
    Initial_Amount DECIMAL(10, 2),
    Status VARCHAR(20)
);
