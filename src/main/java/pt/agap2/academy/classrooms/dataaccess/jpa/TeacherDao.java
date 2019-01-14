package pt.agap2.academy.classrooms.dataaccess.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.agap2.academy.classrooms.data.jpa.Teacher;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Integer> {

}
