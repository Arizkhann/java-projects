drop database if exists doctor;
create database Doctor;
use Doctor;

CREATE TABLE DOCTOR_MASTER (
    doctor_id VARCHAR(15) NOT NULL,
    doctor_name VARCHAR(15) NOT NULL,
    dept VARCHAR(15) NOT NULL,
    PRIMARY KEY (doctor_id)
);

INSERT INTO DOCTOR_MASTER (doctor_id, doctor_name, dept)
VALUES
    ('D0001', 'Ram', 'ENT'),
    ('D0002', 'Rajan', 'ENT'),
    ('D0003', 'Smita', 'Eye'),
    ('D0004', 'Bhavan', 'Surgery'),
    ('D0005', 'Sheela', 'Surgery'),
    ('D0006', 'Nethra', 'Surgery');


CREATE TABLE room_master (
    room_no VARCHAR(15)  NOT NULL,
    room_type VARCHAR(15) NOT NULL,
    status VARCHAR(15) NOT NULL,
    PRIMARY KEY (room_no)
);

INSERT INTO room_master (room_no, room_type, status) VALUES
('R0001', 'AC', 'occupied'),
('R0002', 'Suite', 'vacant'),
('R0003', 'NonAC', 'vacant'),
('R0004', 'NonAC', 'occupied'),
('R0005', 'AC', 'vacant'),
('R0006', 'AC', 'occupied');


-- PATIENT_MASTER table
CREATE TABLE PATIENT_MASTER (
    pid VARCHAR(15) primary key,
    name VARCHAR(15) NOT NULL,
    age INT(15) NOT NULL,
    weight INT(15) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    address VARCHAR(50) NOT NULL,
    phoneno VARCHAR(10) NOT NULL,
    disease VARCHAR(50) NOT NULL,
    Doctor_id VARCHAR(5),
   
    FOREIGN KEY (Doctor_id) REFERENCES DOCTOR_MASTER(doctor_id) 
);

INSERT INTO PATIENT_MASTER (pid, name, age, weight, gender, address, phoneno, disease, Doctor_id)
VALUES
    ('P0001', 'Gita', 35, 65, 'F', 'Chennai', '9867145678', 'Eye Infection', 'D0003'),
    ('P0002', 'Ashish', 40, 70, 'M', 'Delhi', '9845675678', 'Asthma', 'D0003'),
    ('P0003', 'Radha', 25, 60, 'F', 'Chennai', '9867166678', 'Pain in heart', 'D0005'),
    ('P0004', 'Chandra', 28, 55, 'F', 'Bangalore', '9978675567', 'Asthma','D0001'),
    ('P0005','goyal',42,65,'M','Delhi','8967533223','pain in stomach','D0004');


CREATE TABLE ROOM_ALLOCATION (
    room_no VARCHAR(15) ,
    pid VARCHAR(15),
    admission_date DATE NOT NULL,
    release_date DATE,
    foreign key(room_no) references room_master(room_no),
    foreign key(pid) references patient_master(pid)
    );
    
    INSERT into ROOM_ALLOCATION(room_no,pid,admission_date,release_date)
    values
    ('R0001','P0001','2016-10-15','2016-10-26'),
    ('R0002','P0002','2016-11-15','2016-11-26'),
    ('R0002','P0003','2016-12-01','2016-12-30'),
    ('R0004','P0001','2017-01-15','2017-01-30');
    
    
 -- query 1(admitted in jan)
select patient_master.*
from patient_master
inner join room_allocation on patient_master.pid=room_allocation.pid
where month(room_allocation.admission_date)=1;

-- query 2

select* from patient_master
where gender='F' and disease<>'asthama';

-- query 3

select gender,count(*) as patient_count from Patient_master
group by gender; 
 
-- query 4
SELECT pm.pid AS patient_id,pm.name AS patient_name,pm.doctor_id AS doctor_id,dm.doctor_name AS doctor_name,ra.room_no AS room_no,
    rm.room_type AS room_type,
    ra.admission_date AS admission_date
FROM PATIENT_MASTER pm
INNER JOIN ROOM_ALLOCATION ra ON pm.pid = ra.pid
INNER JOIN doctor_master dm ON pm.doctor_id = dm.doctor_id
INNER JOIN room_master rm ON ra.room_no = rm.room_no;

    -- query 5
    SELECT room_no FROM room_master;
-- query 6
select room_no from room_allocation
group by room_no
having count(*)>1;







     


