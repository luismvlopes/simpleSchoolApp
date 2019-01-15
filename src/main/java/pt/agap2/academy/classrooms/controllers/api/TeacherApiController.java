package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.TeacherService;
import pt.agap2.academy.classrooms.data.jpa.Teacher;

@RestController
@RequestMapping("/api")
public class TeacherApiController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/teachers")
	public List<Teacher> findAllteachers() {
		return teacherService.findAllteachers();
	}

	@PostMapping("/teachers")
	public void saveStudent(@RequestBody Teacher teacher) {
		teacherService.saveTeacher(teacher);
	}

}
