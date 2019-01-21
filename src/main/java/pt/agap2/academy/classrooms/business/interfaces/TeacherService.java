package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.data.dto.TeacherDto;
import pt.agap2.academy.classrooms.data.jpa.Teacher;

public interface TeacherService {

	BusinessResult<List<TeacherDto>> findAllTeachers();
	
	public void saveTeacher(Teacher teacher);
}
