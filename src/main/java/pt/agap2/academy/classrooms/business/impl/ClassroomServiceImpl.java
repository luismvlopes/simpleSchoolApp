package pt.agap2.academy.classrooms.business.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.agap2.academy.classrooms.business.BaseService;
import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.exceptions.ClassroomAlreadyExistsException;
import pt.agap2.academy.classrooms.business.interfaces.ClassroomService;
import pt.agap2.academy.classrooms.data.dto.ClassroomDto;
import pt.agap2.academy.classrooms.data.jpa.Classroom;
import pt.agap2.academy.classrooms.dataaccess.jpa.ClassroomDao;

@Service
public class ClassroomServiceImpl extends BaseService implements ClassroomService {

	@Autowired
	private ClassroomDao classroomDao;

	@Override
	@Transactional
	public BusinessResult<List<ClassroomDto>> findAllClassrooms() {
		return executeOperation(() -> {

			List<Classroom> classrooms = classroomDao.findAll();

			return classrooms.stream().map(classroom -> new ClassroomDto(classroom)).collect(Collectors.toList());
		});

	}

	@Override
	@Transactional
	public BusinessResult<ClassroomDto> saveClassroom(@Valid ClassroomDto classroomDto) {
		return executeOperation(() -> {

			String subject = classroomDto.getSubject();
			String shift = classroomDto.getShift();
			Integer year = classroomDto.getLectiveYear();
			
			Classroom classroomOpt = classroomDao.findBySubjectShiftAndYear(subject, shift , year);
			
			if(classroomOpt != null)  {
				throw new ClassroomAlreadyExistsException();
			}
			
			Classroom c = classroomDao.save(classroomDto.toEntity());

			return new ClassroomDto(c);
			
		});

	}

}
