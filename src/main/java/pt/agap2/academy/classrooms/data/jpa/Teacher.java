package pt.agap2.academy.classrooms.data.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@NotNull
	private String address;

	@NotNull
	private String nif;

	@NotNull
	private String niss;

	@NotNull
	private String iban;

	@NotNull
//	@Column(name ="LectiveYear")
	private Integer lectiveYear;

	public Teacher() {

	}

	public Teacher(@NotNull String name, @NotNull Date birthday, @NotNull String telephone, @NotNull String email,
			@NotNull String address, @NotNull String niff, @NotNull String niss, @NotNull String iban,
			@NotNull Integer lectiveYear) {
		this.name = name;
		this.birthday = birthday;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		this.nif = niff;
		this.niss = niss;
		this.iban = iban;
		this.lectiveYear = lectiveYear;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getLectiveYear() {
		return lectiveYear;
	}

	public void setLectiveYear(Integer lectiveYear) {
		this.lectiveYear = lectiveYear;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", dateOfBirth=" + birthday + ", telephone=" + telephone
				+ ", email=" + email + ", address=" + address + ", niff=" + nif + ", niss=" + niss + ", iban=" + iban
				+ ", lectiveYear=" + lectiveYear + "]";
	}
	
	

}
