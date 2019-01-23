package pt.agap2.academy.classrooms.data.dto;

import org.springframework.beans.BeanUtils;

import pt.agap2.academy.classrooms.data.jpa.AClass;

public class AClassDto {

	private Integer id;

	private String shift;

	private String subject;

	private String lectiveYear;

	private Integer teacherId;

	public AClassDto() {
	}

	public AClassDto(AClass aClass) {
		BeanUtils.copyProperties(aClass, this);
	}

	public AClass toEntity() {

		AClass aClass = new AClass();
		BeanUtils.copyProperties(this, aClass);
		return aClass;
	}
	
	@Override
	public String toString() {
		return "AClassDto [id=" + id + ", shift=" + shift + ", subject=" + subject + ", lectiveYear=" + lectiveYear
				+ ", teacherId=" + teacherId + "]";
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

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

}
