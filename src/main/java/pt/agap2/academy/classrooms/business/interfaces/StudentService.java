package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.data.dto.StudentDto;
import pt.agap2.academy.classrooms.data.jpa.Student;

public interface StudentService {

	BusinessResult<List<StudentDto>> findAllStudents();
	
	BusinessResult<StudentDto> saveStudent(Student student);
	
	
	
}
