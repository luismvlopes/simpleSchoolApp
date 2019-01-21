/* package pt.agap2.academy.classrooms.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.business.interfaces.StudentService;
import pt.agap2.academy.classrooms.data.jpa.Student;
import pt.agap2.academy.classrooms.dataaccess.jpa.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> findAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		studentDao.save(student);
	}

}

*/