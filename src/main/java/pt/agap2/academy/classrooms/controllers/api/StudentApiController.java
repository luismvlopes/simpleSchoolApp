package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.StudentService;
import pt.agap2.academy.classrooms.data.jpa.Student;

@RestController
@RequestMapping("/api")
public class StudentApiController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}

	@PostMapping("/students")
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}

}
