package com.rakuten.myhospital.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CONTACT_NUM")
	private long contactNum;

	@Column(name = "DISEASE")
	private String disease;

	@OneToOne
	@JoinColumn(name = "BED_ID_FK")
	private Bed bedIdFk;

	@Column(name = "ADMISSION_DATE")
	private String admissionDate;

	public Patient() {
		super();
	}

	public Patient(int id, String name, int age, String gender, String address, long contactNum, String disease,
			Bed bedIdFk, String admissionDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.contactNum = contactNum;
		this.disease = disease;
		this.bedIdFk = bedIdFk;
		this.admissionDate = admissionDate;
	}

	public int getId() {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Bed getBedIdFk() {
		return bedIdFk;
	}

	public void setBedIdFk(Bed bedIdFk) {
		this.bedIdFk = bedIdFk;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", contactNum=" + contactNum + ", disease=" + disease + ", bedIdFk=" + bedIdFk + ", admissionDate="
				+ admissionDate + "]";
	}
}
