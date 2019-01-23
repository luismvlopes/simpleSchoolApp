package pt.agap2.academy.classrooms.business.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.business.BaseService;
import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.interfaces.AClassService;
import pt.agap2.academy.classrooms.data.dto.AClassDto;
import pt.agap2.academy.classrooms.data.jpa.AClass;
import pt.agap2.academy.classrooms.dataaccess.jpa.AClassDao;

@Service
public class AClassServiceImpl extends BaseService implements AClassService {

	@Autowired
	private AClassDao aClassDao;

	@Override
	public BusinessResult<List<AClassDto>> findAllClasses() {
		return executeOperation(() -> {

			List<AClass> classes = aClassDao.findAll();

			return classes.stream().map(aClass -> new AClassDto(aClass)).collect(Collectors.toList());
		});
	}

//	@Override
//	public BusinessResult<AClassDto> saveAClass(@Valid AClassDto aClassDto) {
//		return executeOperation(() -> {
//
//			String subject = aClassDto.getSubject();
//			String shift = aClassDto.getShift();
//			
//
//			AClass aClassOpt = aClassDao.findBySubjectShiftAndYear(subject, shift);
//
//			if (aClassOpt != null) {
//				throw new ClassroomAlreadyExistsException();
//			}
//
//			AClass c = aClassDao.save(aClassDto.toEntity());
//
//			return new AClassDto(c);
//
//		});
//	}

}
