package pt.agap2.academy.classrooms.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students_classes")
public class StudentAClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "StudentId")
	private Student student;

	@ManyToOne
	@JoinColumn(name = "ClassId")
	private AClass aClass;

	public StudentAClass() {

	}

	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", student=" + student + ", aClass=" + aClass + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public AClass getaClass() {
		return aClass;
	}

	public void setaClass(AClass aClass) {
		this.aClass = aClass;
	}

}
