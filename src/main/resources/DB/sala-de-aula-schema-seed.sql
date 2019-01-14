USE sala_de_aula_db;


#Clean Data
DELETE FROM classrooms;
DELETE FROM teachers;
DELETE FROM students;
DELETE FROM teachers_classrooms;
DELETE FROM students_classrooms;


#Students

INSERT INTO sala_de_aula_db.students
											(Id,Name, Birthday, Telephone, Email, Address, NIF, Lective_Year)
								VALUES
											(1,'Francisco', '1990-05-05', 968742230, 'francisco@escola.com', 'Rua do Cano 213 Lisboa', 123123233, 2),
                                            (2,'Sara', '1995-10-15', 912345678, 'sara@escola.com', 'Rua do Comboio 14 Lisboa', 134134343, 2),
                                            (3,'Amilcar', '2000-01-01', 931793179, 'amilcar@escola.com', 'Praça da Alegria 1 Lisboa', 124122414, 1),
                                            (4,'Vladimir', '1998-05-05', 991177355, 'vlad@escola.com', 'Rua da Escola 16 Lisboa', 142414442, 1);
                                                                                      
	
#Teachers

INSERT INTO sala_de_aula_db.teachers
											(Id, Name, Birthday, Telephone, Email, Address, NIF, NISS, IBAN, Lective_Year)
								VALUES
											(1, 'Ricardo', '1983-01-01', 912345234, 'ricardo@escola.com', 'Rua da Academia', 151515515, 23423432434, 			000023030432040234000234, 2),
                                            (2, 'Veronica', '1988-01-01', 962342344, 'veronica@escola.com', 'Avenida da Colombia', 542312343, 141414141414,   000023030434563542343240, 1),
                                            (3, 'Rafael', '1982-01-01', 913635234, 'rafael@escola.com', 'Avenida do Brasil', 351252452, 145435643673, 		000052520432040234000234, 1);
                                            

#classrooms

INSERT INTO sala_de_aula_db.classrooms
											(Id, Shift, Subject, Lective_Year)
								VALUES
											(1, 'manhã', 'Java', 1),
                                            (2, 'tarde', '.NET C#', 1),
                                            (3, 'noite','Curso pós-laboral', 2);
                                            
                       

#teachers_classrooms

INSERT INTO sala_de_aula_db.teachers_classrooms
											(Id, TeacherId, ClassroomId)
								VALUES
											(1, 1, 2),
                                            (2, 2, 1),
                                            (3, 3, 3);
                                            
#students_classrooms

INSERT INTO sala_de_aula_db.students_classrooms
											(Id, StudentId, ClassroomId)
								VALUES
											(1, 1, 2),
                                            (2, 2, 2),
                                            (3, 3, 2),
                                            (4, 4, 1);

                                            
                                            