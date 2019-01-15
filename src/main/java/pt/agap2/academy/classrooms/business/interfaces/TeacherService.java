package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import pt.agap2.academy.classrooms.data.jpa.Teacher;

public interface TeacherService {

	public List<Teacher> findAllteachers();
	
	public void saveTeacher(Teacher teacher);
}
