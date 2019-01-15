package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import pt.agap2.academy.classrooms.data.jpa.Student;

public interface StudentService {

	public List<Student> findAllStudents();
	
	public void saveStudent(Student student);
	
	
	
}
