package pt.agap2.academy.classrooms.dataaccess.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pt.agap2.academy.classrooms.data.jpa.Classroom;

@Repository
public interface ClassroomDao extends JpaRepository<Classroom, Integer> {

	@Query("SELECT cr FROM Classroom cr " + 
	"WHERE cr.subject=:subjectName  AND cr.shift =:shiftName AND cr.lectiveYear =:yearNumber")
	public Classroom findBySubjectShiftAndYear(@Param(value = "subjectName") String subject,
			@Param(value = "shiftName") String shift, @Param(value = "yearNumber") Integer year);
}
