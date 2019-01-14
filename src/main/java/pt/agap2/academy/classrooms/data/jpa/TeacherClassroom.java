package pt.agap2.academy.classrooms.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teachers_classrooms")
public class TeacherClassroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "TeacherId")
	private Teacher teacher;

	@ManyToOne
	@JoinColumn(name = "ClassroomId")
	private Classroom classroom;

	public TeacherClassroom() {

	}

	public TeacherClassroom(Teacher teacher, Classroom classroom) {
		this.teacher = teacher;
		this.classroom = classroom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "TeacherClassroom [id=" + id + ", teacher=" + teacher + ", classroom=" + classroom + "]";
	}

}
