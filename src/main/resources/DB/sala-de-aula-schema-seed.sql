USE sala_de_aula_db;


#Clean Data
DELETE FROM students_addresses;
DELETE FROM teachers_addresses;
DELETE FROM classes;
DELETE FROM teachers;
DELETE FROM students;
DELETE FROM students_classes;



#students_addresses
INSERT INTO sala_de_aula_db.students_addresses
											(Id, Street, DoorNumber, City, Country)
								VALUES
											(1,'Rua do Cano', '213', 'Lisboa', 'Portugal'),
                                            (2,'Rua do Comboio', '14', 'Cascais', 'Portugal'),
                                            (3,'Praça da Alegria', '53', 'Lisboa', 'Portugal'),
                                            (4,'Rua da Escola', '87', 'Montijo', 'Portugal');
                               

#Students

INSERT INTO sala_de_aula_db.students
											(Id,Name, Birthday, Telephone, Email, StudentAddressId, NIF)
								VALUES
											(1,'Francisco', '1990-05-05', '968742230', 'francisco@escola.com', 1, '123123233'),
                                            (2,'Sara', '1995-10-15', '912345678', 'sara@escola.com', 2, '134134343'),
                                            (3,'Amilcar', '2000-01-01', '931793179', 'amilcar@escola.com', 3, '124122414'),
                                            (4,'Vladimir', '1998-05-05', '991177355', 'vlad@escola.com', 4, '142414442');
                                                                                     

#teachers_addresses
INSERT INTO sala_de_aula_db.teachers_addresses
											(Id, Street, DoorNumber, City, Country)
								VALUES
											(1,'Rua da Academia', '2', 'Lisboa', 'Portugal'),
                                            (2,'Avenida da Colombia', '444', 'Bogota', 'Colombia'),
                                            (3,'Avenida do Brasil', '1', 'Rio de Janeiro', 'Brasil');                                                                                      
	
#Teachers

INSERT INTO sala_de_aula_db.teachers
											(Id, Name, Birthday, Telephone, Email, TeacherAddressId, NIF, NISS, IBAN)
								VALUES
											(1, 'Ricardo', '1983-01-01', '912345234', 'ricardo@escola.com', 1, '151515515', '23423432434', '000023030432040234000234'),
                                            (2, 'Veronica', '1988-01-01', '962342344', 'veronica@escola.com', 2, '542312343', '141414141414','000023030434563542343240'),
                                            (3, 'Rafael', '1982-01-01', '913635234', 'rafael@escola.com', 3, '351252452', '145435643673', '000052520432040234000234');
                                            

#classrooms

INSERT INTO sala_de_aula_db.classes
											(Id, Shift, Subject, Lective_Year, TeacherId)
								VALUES
											(1, 'manhã', 'Java', 'Inicial', 1),
                                            (2, 'tarde', '.NET C#', 'Intermedio', 2),
                                            (3, 'noite','Curso pós-laboral','Avançado', 3);
                                            
                                                                   
#students_classes

INSERT INTO sala_de_aula_db.students_classes
											(Id, StudentId, ClassId)
								VALUES
											(1, 1, 1),
                                            (2, 2, 2),
                                            (3, 3, 2),
                                            (4, 4, 1);

                                            
                                            