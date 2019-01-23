package pt.agap2.academy.classrooms.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.agap2.academy.classrooms.business.interfaces.AClassService;
import pt.agap2.academy.classrooms.data.dto.AClassDto;

@RestController
@RequestMapping("/api")
public class AClassApiController extends BaseApiController {

	@Autowired
	private AClassService aClassService;

	@GetMapping("/classes")
	public ResponseEntity<ApiResult<List<AClassDto>>> findAllclasses() {

		return generateResponseEntityFromBusinessResult(aClassService.findAllClasses());

	}

//	@PostMapping("/classrooms")
//	public ResponseEntity<ApiResult<AClassDto>> saveAClass(@RequestBody AClassDto aClassDto) {
//
//		return generateResponseEntityFromBusinessResult(aClassService.saveAClass(aClassDto));
//
//	}

}
