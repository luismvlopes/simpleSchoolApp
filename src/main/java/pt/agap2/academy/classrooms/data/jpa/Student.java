package pt.agap2.academy.classrooms.data.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	private String name;

	@NotNull
	private Date dateOfBirth;

	@NotNull
	private String telephone;

	@NotNull
	private String email;

	@NotNull
	private String address;

	@NotNull
	private String niff;

	@NotNull
	private Integer lectiveYear;

	public Student() {

	}

	public Student(@NotNull String name, @NotNull Date dateOfBirth, @NotNull String telephone, @NotNull String email,
			@NotNull String address, @NotNull String niff, @NotNull Integer lectiveYear) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		this.niff = niff;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getNiff() {
		return niff;
	}

	public void setNiff(String niff) {
		this.niff = niff;
	}

	public int getLectiveYear() {
		return lectiveYear;
	}

	public void setLectiveYear(Integer lectiveYear) {
		this.lectiveYear = lectiveYear;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", telephone=" + telephone
				+ ", email=" + email + ", address=" + address + ", niff=" + niff + ", lectiveYear=" + lectiveYear + "]";
	}

}
