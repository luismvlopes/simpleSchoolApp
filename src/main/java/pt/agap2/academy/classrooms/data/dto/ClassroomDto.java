package pt.agap2.academy.classrooms.data.dto;

import org.springframework.beans.BeanUtils;

import pt.agap2.academy.classrooms.data.jpa.Classroom;

public class ClassroomDto {

	private Integer id;

	private String shift;

	private String subject;

	private Integer lectiveYear;

	public ClassroomDto() {

	}

	public ClassroomDto(Classroom classroom) {
		BeanUtils.copyProperties(classroom, this);
	}

	public Classroom toEntity() {
		Classroom classroom = new Classroom();
		BeanUtils.copyProperties(this, classroom);
		
		return classroom;
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
