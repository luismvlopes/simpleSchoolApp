package pt.agap2.academy.classrooms.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.business.interfaces.TeacherService;
import pt.agap2.academy.classrooms.data.jpa.Teacher;
import pt.agap2.academy.classrooms.dataaccess.jpa.TeacherDao;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	@Override
	public List<Teacher> findAllteachers() {
		return teacherDao.findAll();
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		teacherDao.save(teacher);

	}

}
