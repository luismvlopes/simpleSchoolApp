package pt.agap2.academy.classrooms.dataaccess.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.agap2.academy.classrooms.data.jpa.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
