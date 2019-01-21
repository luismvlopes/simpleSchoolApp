package pt.agap2.academy.classrooms.business.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.business.BaseService;
import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.interfaces.StudentService;
import pt.agap2.academy.classrooms.data.dto.StudentDto;
import pt.agap2.academy.classrooms.data.jpa.Student;
import pt.agap2.academy.classrooms.dataaccess.jpa.StudentDao;

@Service
public class StudentServiceImplUpdated extends BaseService implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public BusinessResult<List<StudentDto>> findAllStudents() {
		return executeOperation(() -> {

			List<Student> students = studentDao.findAll();

			return students.stream().map(student -> new StudentDto(student)).collect(Collectors.toList());

		});
	}

	@Override
	public BusinessResult<StudentDto> saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
