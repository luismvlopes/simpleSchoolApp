package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.StudentService;
import pt.agap2.academy.classrooms.data.dto.StudentDto;

@RestController
@RequestMapping("/api")
public class StudentApiControllerUpdated extends BaseApiController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public ResponseEntity<ApiResult<List<StudentDto>>> findAllStudents() {
		return generateResponseEntityFromBusinessResult(studentService.findAllStudents());
	}

}
