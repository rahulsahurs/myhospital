package com.rakuten.myhospital.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_DETAILS")
public class TestDetails {

	@Id
	@Column(name = "TEST_DETAILS_ID")
	private int testDetailsId;

	@OneToOne
	private Patient patientIdFk;

	@Column(name = "DOCTOR_ID_FK")
	private int doctorId;

	@Column(name = "PRESCRIPTION")
	private String prescription;

	public TestDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestDetails(int testDetailsId, Patient patientIdFk, int doctorId, String prescription) {
		super();
		this.testDetailsId = testDetailsId;
		this.patientIdFk = patientIdFk;
		this.doctorId = doctorId;
		this.prescription = prescription;
	}

	public int getTestDetailsId() {
		return testDetailsId;
	}

	public void setTestDetailsId(int testDetailsId) {
		this.testDetailsId = testDetailsId;
	}

	public Patient getPatientIdFk() {
		return patientIdFk;
	}

	public void setPatientIdFk(Patient patientIdFk) {
		this.patientIdFk = patientIdFk;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "TestDetails [testDetailsId=" + testDetailsId + ", patientIdFk=" + patientIdFk + ", doctorId=" + doctorId
				+ ", prescription=" + prescription + "]";
	}

}
