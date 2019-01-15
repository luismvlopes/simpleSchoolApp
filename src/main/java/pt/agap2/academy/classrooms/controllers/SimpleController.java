//package pt.agap2.academy.classrooms.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import pt.agap2.academy.classrooms.business.SimpleService;
//import pt.agap2.academy.classrooms.data.jpa.Classroom;
//import pt.agap2.academy.classrooms.data.jpa.Student;
//import pt.agap2.academy.classrooms.data.jpa.Teacher;
//
//@RestController
//@RequestMapping("/api")
//public class SimpleController {
//
//	@Autowired
//	private SimpleService simpleService;
//
//	@GetMapping("/teachers")
//	public List<Teacher> findAllTeachers() {
//		return simpleService.findAllTeachers();
//	}
//	
////	@PostMapping("/teachers")
////	public 
//	
//	@GetMapping("/students")
//	public List<Student> findAllStudents() {
//		return simpleService.findAllStudents();
//	}
//
//	@GetMapping("/classrooms")
//	public List<Classroom> findAllClassrooms() {
//		return simpleService.findAllClassrooms();
//	}
//	
////	@PostMapping("/")
//	
//}
