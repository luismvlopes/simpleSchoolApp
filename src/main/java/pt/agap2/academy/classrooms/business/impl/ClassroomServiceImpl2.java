package pt.agap2.academy.classrooms.business.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import pt.agap2.academy.classrooms.business.BaseService;
import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.interfaces.ClassroomService;
import pt.agap2.academy.classrooms.data.dto.ClassroomDto;
import pt.agap2.academy.classrooms.data.jpa.Classroom;
import pt.agap2.academy.classrooms.dataaccess.jpa.ClassroomDao;

public class ClassroomServiceImpl2 extends BaseService implements ClassroomService {

	@Autowired
	private ClassroomDao classroomDao;

	@Override
	public BusinessResult<List<ClassroomDto>> findAllClassrooms() {
		return executeOperation(() -> {

			List<Classroom> classrooms = classroomDao.findAll();

			return classrooms.stream().map(classroom -> new ClassroomDto(classroom)).collect(Collectors.toList());
		});

	}

	@Override
	public BusinessResult<ClassroomDto> saveClassroom(@Valid Classroom classroom) {
		// TODO Auto-generated method stub
		return null;
	}

}
