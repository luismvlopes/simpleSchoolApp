CREATE DATABASE IF NOT EXISTS sala_de_aula_db;
USE sala_de_aula_db;

SET foreign_key_checks= false;

#DROP TABLES

DROP TABLE IF EXISTS classrooms;
DROP TABLE IF EXISTS teachers;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS teachers_classrooms;
DROP TABLE IF EXISTS students_classrooms;

#CREATE TABLES


CREATE TABLE students(
	Id 						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Name					VARCHAR(255) NOT NULL,
    Birthday				DATE NOT NULL,	
    Telephone				INT(20) NOT NULL,
    Email					VARCHAR(255) UNIQUE COLLATE 'utf8mb4_unicode_ci' NOT NULL,
    Address					VARCHAR(255) NOT NULL,
    NIF						INT(20) NOT NULL,
    Lective_Year				INT(10) NOT NULL

);

CREATE TABLE teachers(
	Id 						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Name					VARCHAR(255) NOT NULL,
    Birthday				DATE NOT NULL,
    Telephone				INT(20) NOT NULL,
    Email        	        VARCHAR(255) UNIQUE COLLATE 'utf8mb4_unicode_ci' NOT NULL,
    Address					VARCHAR(255) NOT NULL,
    NIF						INT(20) NOT NULL,
    NISS					BIGINT NOT NULL,
    IBAN					FLOAT,
	Lective_Year				INT(10) NOT NULL
    	
);


CREATE TABLE classrooms(
	Id						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Shift					VARCHAR(255),
    Subject 				VARCHAR(255),
    Lective_Year				INT(10)
   
);


CREATE TABLE teachers_classrooms(
	Id						INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    TeacherId				INT NOT NULL,
    ClassroomId				INT NOT NULL,
    
    FOREIGN KEY(TeacherId) REFERENCES teachers(Id),
    FOREIGN KEY(ClassroomId) REFERENCES classrooms(Id)
    
);

CREATE TABLE students_classrooms(
	Id						INT PRIMARY KEY	NOT NULL AUTO_INCREMENT,
    StudentId				INT NOT NULL,
    ClassroomId				INT NOT NULL,
    
    FOREIGN KEY(StudentId) REFERENCES students(Id),
    FOREIGN KEY(ClassroomId) REFERENCES classrooms(Id)
);


SET foreign_key_checks= true;