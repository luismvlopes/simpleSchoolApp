package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.data.dto.AClassDto;

public interface AClassService {

	BusinessResult<List<AClassDto>> findAllClasses();

//	BusinessResult<AClassDto> saveAClass(@Valid AClassDto aClassDto);
}
