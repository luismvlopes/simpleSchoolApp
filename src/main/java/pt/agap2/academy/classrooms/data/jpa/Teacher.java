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
@Table(name = "teachers")
public class Teacher {

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
	@JoinColumn(name = "TeacherAddressId")
	private TeacherAddress teacherAddress;

	@NotNull
	private String nif;

	@NotNull
	private String niss;

	@NotNull
	private String iban;

	public Teacher() {

	}

	public Teacher(@NotNull String name, @NotNull Date birthday, @NotNull String telephone, @NotNull String email,
			TeacherAddress teacherAddress, @NotNull String niff, @NotNull String niss, @NotNull String iban) {
		this.name = name;
		this.birthday = birthday;
		this.telephone = telephone;
		this.email = email;
		this.teacherAddress = teacherAddress;
		this.nif = niff;
		this.niss = niss;
		this.iban = iban;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", birthday=" + birthday + ", telephone=" + telephone
				+ ", email=" + email + ", teacherAddress=" + teacherAddress + ", nif=" + nif + ", niss=" + niss
				+ ", iban=" + iban + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
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

	public TeacherAddress getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(TeacherAddress teacherAddress) {
		this.teacherAddress = teacherAddress;
	}

	public String getNiff() {
		return nif;
	}

	public void setNiff(String niff) {
		this.nif = niff;
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
