package pt.agap2.academy.classrooms.data.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import pt.agap2.academy.classrooms.data.jpa.Teacher;

public class TeacherDto {

	private Integer id;

	private String name;

	private Date birthday;

	private String telephone;

	private String email;

	private String address;

	private String nif;

	private String niss;

	private String iban;

	public TeacherDto() {

	}

	public TeacherDto(Teacher teacher) {
		BeanUtils.copyProperties(teacher, this);
	}

	public TeacherDto(String name, Date birthday, String telephone, String email, String address, String nif,
			String niss, String iban) {
		this.name = name;
		this.birthday = birthday;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		this.nif = nif;
		this.niss = niss;
		this.iban = iban;
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

	public String getNiss() {
		return niss;
	}

	public void setNiss(String niss) {
		this.niss = niss;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

}
