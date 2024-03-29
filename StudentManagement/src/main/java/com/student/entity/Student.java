package com.student.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Student_Info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studid;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
}
