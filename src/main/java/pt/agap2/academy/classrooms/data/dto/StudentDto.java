package pt.agap2.academy.classrooms.data.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import pt.agap2.academy.classrooms.data.jpa.Student;

public class StudentDto {

	private Integer id;

	private String name;

	private Date birthday;

	private String telephone;

	private String email;

	private String address;

	private String nif;

	private Integer lectiveYear;

	public StudentDto() {

	}
	
	public StudentDto(Student student) {
			BeanUtils.copyProperties(student, this);
	}

	public StudentDto(String name, Date birthday, String telephone, String email, String address, String nif,
			Integer lectiveYear) {
		this.name = name;
		this.birthday = birthday;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		this.nif = nif;
		this.lectiveYear = lectiveYear;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Integer getLectiveYear() {
		return lectiveYear;
	}

	public void setLectiveYear(Integer lectiveYear) {
		this.lectiveYear = lectiveYear;
	}

}
