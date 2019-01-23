package pt.agap2.academy.classrooms.business.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.agap2.academy.classrooms.business.BaseService;
import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.exceptions.ClassroomAlreadyExistsException;
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

	@Override
	public BusinessResult<AClassDto> saveAClass(@Valid AClassDto aClassDto) {
		return executeOperation(() -> {

			String cShift = aClassDto.getShift();
			String cSubject = aClassDto.getSubject();
			Integer teacherId = aClassDto.getTeacherId();
			String cYear = aClassDto.getLectiveYear();

			// Procurar aulas com mesmo subject and e turno

			List<AClass> aClassOpt = aClassDao.findBySubjectYearAndShift(cSubject, cYear, cShift);

			if (!aClassOpt.isEmpty()) {
				// Se existir, fazer loop e procurar se tem o prof

				if (aClassOpt != null) {
					throw new ClassroomAlreadyExistsException();
				}

				// Se contém, então enviar excepção, já existe aula
			}

//			então gravar numa nova entidade

			AClass c = aClassDao.save(aClassDto.toEntity());

			return new AClassDto(c);

		});
	}

}
