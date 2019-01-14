package pt.agap2.academy.classrooms.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classrooms")
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

//	@Column(name = "Shift")
	private String shift;

	private String subject;

	private Integer lectiveYear;

	public Classroom() {

	}

	public Classroom(String shift, String subject, Integer lectiveYear) {
		this.shift = shift;
		this.subject = subject;
		this.lectiveYear = lectiveYear;
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

	public Integer getLectiveYear() {
		return lectiveYear;
	}

	public void setLectiveYear(Integer lectiveYear) {
		this.lectiveYear = lectiveYear;
	}

}
