drop database hotel;
create database Hotel;
use hotel;

drop table customer;
create table customer(
  customerId INT PRIMARY KEY,
    customerName VARCHAR(255),
    checkIn DATE,
    checkOut DATE,
    roomNo INT
);

 

insert into customer
values(1,'Ariz','2022-09-01','2022-09-03',101),
(2,'Stim','2022-09-01','2022-09-03',102),
(3,'ruhan','2022-09-04','2022-09-06',101),
(11,'Emma','2022-09-04','2022-09-06',101);
select * from customer;