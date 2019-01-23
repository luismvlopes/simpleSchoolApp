CREATE DATABASE IF NOT EXISTS sala_de_aula_db;
USE sala_de_aula_db;

SET foreign_key_checks= true;

#DROP TABLES

DROP TABLE IF EXISTS students_classes;
DROP TABLE IF EXISTS classes;
DROP TABLE IF EXISTS teachers;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS students_addresses;
DROP TABLE IF EXISTS teachers_addresses;


#CREATE TABLES

CREATE TABLE students_addresses(
	Id						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	Street					VARCHAR(200) NOT NULL,
    DoorNumber				VARCHAR(10),
    City					VARCHAR(35) NOT NULL,
    Country					VARCHAR(45) NOT NULL

);

CREATE TABLE teachers_addresses(
	Id						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	Street					VARCHAR(200) NOT NULL,
    DoorNumber				VARCHAR(10),
    City					VARCHAR(35) NOT NULL,
    Country					VARCHAR(45) NOT NULL

);

CREATE TABLE students(
	Id 						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Name					VARCHAR(100) NOT NULL,
    Birthday				DATE NOT NULL,	
    Telephone				VARCHAR(25) NOT NULL,
    Email					VARCHAR(100) UNIQUE COLLATE 'utf8mb4_unicode_ci' NOT NULL,
    StudentAddressId		INT NOT NULL,
    NIF						VARCHAR(15) NOT NULL,  

	FOREIGN KEY (StudentAddressId) REFERENCES students_addresses(Id)

);


CREATE TABLE teachers(
	Id 						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Name					VARCHAR(100) NOT NULL,
    Birthday				DATE NOT NULL,
    Telephone				VARCHAR(25) NOT NULL,
    Email        	        VARCHAR(100) UNIQUE COLLATE 'utf8mb4_unicode_ci' NOT NULL,
    TeacherAddressId		INT NOT NULL,
    NIF						VARCHAR(15) NOT NULL,
    NISS					VARCHAR(15) NOT NULL,
    IBAN					VARCHAR(40),
            	
    FOREIGN KEY (TeacherAddressId) REFERENCES teachers_addresses(Id)    

);


CREATE TABLE classes(
	Id						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Shift					VARCHAR(255) NOT NULL,
    Subject 				VARCHAR(255) NOT NULL,
    Lective_Year			VARCHAR(10) NOT NULL,
    TeacherId				INT NOT NULL,
    
    CONSTRAINT teacher_per_shift UNIQUE KEY (Shift, Subject, Lective_Year, TeacherId),
    FOREIGN KEY(TeacherId) REFERENCES teachers(Id)

);


CREATE TABLE students_classes(
	Id						INT PRIMARY KEY	NOT NULL AUTO_INCREMENT,
    StudentId				INT NOT NULL,
    ClassId					INT NOT NULL,
    
    CONSTRAINT student_per_class UNIQUE KEY (StudentId, ClassId),
    
    FOREIGN KEY(StudentId) REFERENCES students(Id),
    FOREIGN KEY(ClassId) REFERENCES classes(Id)
    
);

SET foreign_key_checks= true;