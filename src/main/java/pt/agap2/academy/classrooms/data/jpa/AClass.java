package pt.agap2.academy.classrooms.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "classes")
public class AClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	private String shift;

	@NotNull
	private String subject;

	@NotNull
	private String lectiveYear;

//	@ManyToOne
//	@JoinColumn(name = "TeacherId")
//	private Teacher teacher;

	public AClass() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLectiveYear() {
		return lectiveYear;
	}

	public void setLectiveYear(String lectiveYear) {
		this.lectiveYear = lectiveYear;
	}

//	public Teacher getTeacher() {
//		return teacher;
//	}
//
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	

}
