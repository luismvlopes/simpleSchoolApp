package pt.agap2.academy.classrooms.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pt.agap2.academy.classrooms.business.interfaces.ClassroomService;
import pt.agap2.academy.classrooms.data.jpa.Classroom;
import pt.agap2.academy.classrooms.dataaccess.jpa.ClassroomDao;

public class ClassroomServiceImpl implements ClassroomService {

	@Autowired
	private ClassroomDao classroomDao;

	@Override
	public List<Classroom> findAllClassrooms() {
		return classroomDao.findAll();
	}

	@Override
	public void saveClassroom(Classroom classroom) {
		classroomDao.save(classroom);
	}

}
