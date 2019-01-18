package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.ClassroomService;
import pt.agap2.academy.classrooms.data.dto.ClassroomDto;

@RestController
@RequestMapping("/api")
public class ClassroomApiController extends BaseApiController {

	@Autowired
	private ClassroomService classroomService;

	@GetMapping("/classrooms")
	public ResponseEntity<ApiResult<List<ClassroomDto>>> findAllclassroom() {

		return generateResponseEntityFromBusinessResult(classroomService.findAllClassrooms());

	}

	@PostMapping("/classrooms")
	public ResponseEntity<ApiResult<ClassroomDto>> saveClassroom(@RequestBody ClassroomDto classroomDto) {

		return generateResponseEntityFromBusinessResult(classroomService.saveClassroom(classroomDto));

	}

}
