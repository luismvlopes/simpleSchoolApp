package pt.agap2.academy.classrooms.dataaccess.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pt.agap2.academy.classrooms.data.jpa.AClass;

@Repository
public interface AClassDao extends JpaRepository<AClass, Integer> {

	@Query("SELECT ac FROM AClass ac " 
			+ "WHERE ac.subject =:cSubject "
			+ "AND ac.lectiveYear =:cYear " 
			+ "AND ac.shift =:cShift ")
	List<AClass> findBySubjectYearAndShift(
			@Param(value = "cSubject") String subject,
			@Param(value = "cYear") String year,
			@Param(value = "cShift") String shift);

}
