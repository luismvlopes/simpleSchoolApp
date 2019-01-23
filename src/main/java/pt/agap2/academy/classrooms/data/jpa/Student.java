package pt.agap2.academy.classrooms.data.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Date birthday;

	@NotNull
	private String telephone;

	@NotNull
	private String email;

	@ManyToOne
	@JoinColumn(name = "StudentAddressId")
	private StudentAddress studentAddress;

	@NotNull
	private String nif;

	@NotNull
	private Integer lectiveYear;

	public Student() {

	}

	public Student(@NotNull String name, @NotNull Date birthday, @NotNull String telephone, @NotNull String email,
			StudentAddress studentAddress, @NotNull String niff, @NotNull Integer lectiveYear) {
		this.name = name;
		this.birthday = birthday;
		this.telephone = telephone;
		this.email = email;
		this.studentAddress = studentAddress;
		this.nif = niff;
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
		return birthday;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.birthday = dateOfBirth;
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

	public StudentAddress getAddress() {
		return studentAddress;
	}

	public void setAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getNiff() {
		return nif;
	}

	public void setNiff(String niff) {
		this.nif = niff;
	}

	public int getLectiveYear() {
		return lectiveYear;
	}

	public void setLectiveYear(Integer lectiveYear) {
		this.lectiveYear = lectiveYear;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", telephone=" + telephone
				+ ", email=" + email + ", studentAddress=" + studentAddress + ", nif=" + nif + ", lectiveYear="
				+ lectiveYear + "]";
	}

}
