package com.edubridge.entity;

import javax.persistence.*;

@Entity
@Table(name = "Applicant")
public class Applicant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ApplicationId")
	private int applicantId;
	@Column(name = "ApplicationName")
	private String name;
	@Column(name = "ApplicationAge")
	private int age;
	@Column(name = "ApplicationCity")
	private String city;
	@OneToOne(mappedBy = "applicant",cascade=CascadeType.ALL)
	private Passport passport;
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}