package pt.agap2.academy.classrooms.business.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.business.BaseService;
import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.interfaces.TeacherService;
import pt.agap2.academy.classrooms.data.dto.TeacherDto;
import pt.agap2.academy.classrooms.data.jpa.Teacher;
import pt.agap2.academy.classrooms.dataaccess.jpa.TeacherDao;

@Service
public class TeacherServiceImpl extends BaseService implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	@Override
	public BusinessResult<List<TeacherDto>> findAllTeachers() {
		return executeOperation(() -> {

			List<Teacher> teachers = teacherDao.findAll();

			return teachers.stream().map(teacher -> new TeacherDto(teacher)).collect(Collectors.toList());
		});
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		teacherDao.save(teacher);

	}

}
