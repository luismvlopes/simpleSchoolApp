package pt.agap2.academy.classrooms.business.interfaces;

import java.util.List;

import pt.agap2.academy.classrooms.data.jpa.Classroom;

public interface ClassroomService {

	public List<Classroom> findAllClassrooms();
	
	public void saveClassroom(Classroom classroom);
}
