package com.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Student")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="student_name")
	private String studentName;
	@Column(name="roll_no")
	private long rollNo;
	@Column(name="qualification")
	private String qualification;
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="student_skill",
	joinColumns= {@JoinColumn(name="student_id")},
	inverseJoinColumns= {@JoinColumn(name="skill_id")})
	private Set<Skills> skills = new HashSet<Skills>();
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", rollNo=" + rollNo + ", qualification="
				+ qualification + ", skills=" + skills + "]";
	}
	
}
