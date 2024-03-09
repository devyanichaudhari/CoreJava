package com.edubridge.entity;

import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name = "Passport")
public class Passport 
{
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen",strategy = "foreign",parameters=@Parameter(name = "property",value ="applicant"))
	private int passportId;
	private String passportNumber;
	private Date issuedate;
	private Date expirydate;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Applicant applicant;
	
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Date getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
}
