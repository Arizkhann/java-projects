package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PatientReports")

public class PatientReports implements Serializable {

	@Id
	

	@Column(name = "reportId")
	private int reportId;

	@Column(name = "patientId")
	private String patientId;

	@Column(name = "TestCode")
	private String testCode;

	@Column(name = "TestName")
	private String testName;

	@Column(name = "TestDescription")
	private String testDescription;

	@Column(name = "Cost")
	private double cost;

	@Column(name = "comments")
	private String comments;

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "PatientReports [reportId=" + reportId + ", patientId=" + patientId + ", testCode=" + testCode
				+ ", testName=" + testName + ", testDescription=" + testDescription + ", cost=" + cost + ", comments="
				+ comments + "]";
	}

	public PatientReports(int reportId, String patientId, String testCode, String testName, String testDescription,
			double cost, String comments) {
		super();
		this.reportId = reportId;
		this.patientId = patientId;
		this.testCode = testCode;
		this.testName = testName;
		this.testDescription = testDescription;
		this.cost = cost;
		this.comments = comments;
	}

	public PatientReports() {
		super();
		// TODO Auto-generated constructor stub
	}

}
