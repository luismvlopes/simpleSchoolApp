package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import javax.validation.Valid;

import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.data.dto.ClassroomDto;

public interface ClassroomService {

	BusinessResult<List<ClassroomDto>> findAllClassrooms();

	BusinessResult<ClassroomDto> saveClassroom(@Valid ClassroomDto classroomDto);
}
