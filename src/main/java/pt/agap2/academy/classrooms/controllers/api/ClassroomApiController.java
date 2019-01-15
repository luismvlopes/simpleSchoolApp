package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.ClassroomService;
import pt.agap2.academy.classrooms.data.jpa.Classroom;

@RestController
@RequestMapping("/api")
public class ClassroomApiController {

	@Autowired
	private ClassroomService classroomService;
	
	@GetMapping("/classrooms")
	public List<Classroom> findAllclassroom() {
		return classroomService.findAllClassrooms();
	}
	
	@PostMapping("/classrooms")
	public void saveClassroom(@RequestBody Classroom classroom) {
		classroomService.saveClassroom(classroom);
	}
	
}


	

	

	