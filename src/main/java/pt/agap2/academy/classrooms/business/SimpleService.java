//package pt.agap2.academy.classrooms.business;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import pt.agap2.academy.classrooms.data.jpa.Classroom;
//import pt.agap2.academy.classrooms.data.jpa.Student;
//import pt.agap2.academy.classrooms.data.jpa.Teacher;
//import pt.agap2.academy.classrooms.dataaccess.jpa.ClassroomDao;
//import pt.agap2.academy.classrooms.dataaccess.jpa.StudentDao;
//import pt.agap2.academy.classrooms.dataaccess.jpa.TeacherDao;
//
//@Service
//public class SimpleService {
//
//	@Autowired
//	private TeacherDao teacherDao;
//
//	@Autowired
//	private StudentDao studentDao;
//	
//	@Autowired
//	private ClassroomDao classroomDao;
//
//	public List<Teacher> findAllTeachers() {
//		return teacherDao.findAll();
//	}
//
//	public List<Student> findAllStudents() {
//		return studentDao.findAll();
//	}
//	
//	public List<Classroom> findAllClassrooms() {
//		return classroomDao.findAll();
//	}
//	
//
//}
