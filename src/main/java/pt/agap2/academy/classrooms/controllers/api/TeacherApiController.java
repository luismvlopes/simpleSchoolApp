package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.TeacherService;
import pt.agap2.academy.classrooms.data.dto.TeacherDto;
import pt.agap2.academy.classrooms.data.jpa.Teacher;

@RestController
@RequestMapping("/api")
public class TeacherApiController extends BaseApiController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/teachers")
	public ResponseEntity<ApiResult<List<TeacherDto>>> findAllteachers() {
		return generateResponseEntityFromBusinessResult(teacherService.findAllTeachers());
	}

	@PostMapping("/teachers")
	public void saveStudent(@RequestBody Teacher teacher) {
		teacherService.saveTeacher(teacher);
	}

}
