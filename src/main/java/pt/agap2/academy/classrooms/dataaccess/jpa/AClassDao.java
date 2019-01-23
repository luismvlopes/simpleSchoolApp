package pt.agap2.academy.classrooms.dataaccess.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.agap2.academy.classrooms.data.jpa.AClass;

@Repository
public interface AClassDao extends JpaRepository<AClass, Integer> {

//	@Query("SELECT ac FROM AClass ac " + "WHERE ac.subject =:acSubject " + "AND ac.shift =:acShift ")
//	public AClass findBySubjectShiftAndYear(@Param(value = "acSubject") String subject,
//			@Param(value = "acShift") String shift);
}
