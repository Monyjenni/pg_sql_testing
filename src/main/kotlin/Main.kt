-- Database: pet_owner

-- DROP DATABASE IF EXISTS pet_owner;


--Create tables
CREATE DATABASE pet_owner
WITH
OWNER = postgres
ENCODING = 'UTF8'
LC_COLLATE = 'C'
LC_CTYPE = 'C'
TABLESPACE = pg_default
CONNECTION LIMIT = -1
IS_TEMPLATE = False;


CREATE TABLE pets
(
id SERIAL PRIMARY KEY ,
species VARCHAR (30),
full_name VARCHAR (30),
age INT
);

CREATE TABLE owners
(
id SERIAL PRIMARY KEY,
first_name VARCHAR (30) Not Null,
last_name VARCHAR(30) Not Null,
city VARCHAR (30) Not Null,
state CHAR(2)
);

CREATE TABLE persons
(
id int Not Null ,
LastName varchar(255) ,
FirstName varchar(255),
Age int,
Primary Key (id)

);

CREATE TABLE humans (
ID int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Age int,
-- contraint here is used to command that they need ID and last name for constraints
CONSTRAINT PK_Person PRIMARY KEY (ID,LastName)
);
--Foreign Key
CREATE TABLE Orders (
OrderID int NOT NULL,
OrderNumber int NOT NULL,
PersonID int,
PRIMARY KEY (OrderID),
FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);

--Insert Values



--Update Tables
ALTER TABLE pets
ADD COLUMN owner_id Int;

ALTER TABLE owners
ADD COLUMN pet_id Int;

Alter Table owners
Drop Column pet_id;


--Display tables
SELECT * FROM pets;
Select * From owners;
Select * From persons;
Select * From humans;
Select * From Orders;





