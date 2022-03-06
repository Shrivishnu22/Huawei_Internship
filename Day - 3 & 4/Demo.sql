//Creation of table
CREATE TABLE students (id integer PRIMARY KEY, first_name VARCHAR(20), last_name VARCHAR(20), age INTEGER, college VARCHAR(50),branch VARCHAR(20), year INTEGER )

//Insertion of values
INSERT INTO students (id,first_name,last_name,age,college,branch,year) VALUES (101,"Vimal","M",20,"IIT","IT",2017);
INSERT INTO students (id,first_name,last_name,age,college,branch,year) VALUES (102,"Arun","Prasath",20,"NIT","CSE",2017);
INSERT INTO students (id,first_name,last_name,age,college,branch,year) VALUES (103,"Thulasi","K",20,"MIT","IT",2017);
INSERT INTO students (id,first_name,last_name,age,college,branch,year) VALUES (104,"Akshya","P",23,"IIT","ASLP",2015);
INSERT INTO students (id,first_name,last_name,age,college,branch,year) VALUES (105,"Vishnu","P",20,"Sastra","IT",2017);

//Updation of values
UPDATE students set last_name="Shri" WHERE id = 105;
UPDATE students SET first_name="Coder" WHERE id=105;

//Deletion of last row
DELETE from students where id=105;






