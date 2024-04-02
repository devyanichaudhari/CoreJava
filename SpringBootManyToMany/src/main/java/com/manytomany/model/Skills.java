package com.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="Skills")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Skills 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="skill_name")
	private String skillName;
	@Column(name="skill_score")
	private String skillScore;
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="skills")
	private Set<Student> students = new HashSet<Student>();
	@Override
	public String toString() {
		return "Skills [id=" + id + ", skillName=" + skillName + ", skillScore=" + skillScore + ", students=" + students
				+ "]";
	}
	
}
