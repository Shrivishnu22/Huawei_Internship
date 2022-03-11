//Creation of a table 'Student'

CREATE TABLE student(id integer PRIMARY Key AUTOINCREMENT,name varchar(20),age integer, mobile_no integer, reg_no integer, batch integer);

//Creation of a table 'Teacher'

CREATE TABLE teacher(id integer PRIMARY Key AUTOINCREMENT,name varchar(20),domain varchar(60),department varchar(20));


//Updation of values in table 'Student'

INSERT into student VALUES (1,"Vimal",20,1234567890,811719104118,2023);
INSERT into student VALUES (2,"Arun",20,5686266887,811719104058,2023);
INSERT into student VALUES (3,"Rooban",20,2681264484,811719104022,2023);
INSERT into student VALUES (4,"Ronaldo",20,646269818,811719104099,2023);
INSERT into student VALUES (5,"Ram",20,86288568488,811719104100,2023);
INSERT into student VALUES (6,"Rakesh",20,6518465168,811719104001,2023);
INSERT into student VALUES (7,"Thulasi",20,86584616,811719104008,2023);
INSERT into student VALUES (8,"Sanjay",20,6468156846,811719104006,2023);
INSERT into student VALUES (9,"Shyam",20,6846664889,811719104009,2023);
INSERT into student VALUES (10,"Nesainth",20,6466554649,811719104069,2023);


//Updation of values in table 'Teacher'

INSERT into teacher VALUES(101,"Kumar",'AI','CSE');
INSERT into teacher VALUES(109,"Jai Shankar",'Thermal','MECH');
INSERT into teacher VALUES(110,"Prasanna",'DS','CSE');
INSERT into teacher VALUES(105,"Prithivi",'IT','CSE');
INSERT into teacher VALUES(120,"Sudharshan",'Microprocessor','ECE');
INSERT into teacher VALUES(119,"Shanjith",'AutoCAD','MECH');
INSERT into teacher VALUES(200,"Nithish",'Motors','EEE');
INSERT into teacher VALUES(315,"Rangesh",'Audrino','MECH');
INSERT into teacher VALUES(215,"Muthu",'Ethics','GENERAL');
INSERT into teacher VALUES(400,"Eswar",'AI','CSE');
