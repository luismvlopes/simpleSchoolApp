package pt.agap2.academy.classrooms.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.data.jpa.Classroom;
import pt.agap2.academy.classrooms.dataaccess.jpa.ClassroomDao;

@Service
public class ClassroomServiceImpl {

	@Autowired
	private ClassroomDao classroomDao;

	public List<Classroom> findAllClassrooms() {
		return classroomDao.findAll();
	}

	public void saveClassroom(Classroom classroom) {
		classroomDao.save(classroom);
	}

}
