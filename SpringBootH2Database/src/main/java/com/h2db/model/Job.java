package com.h2db.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Job_Management")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String jobName;
	private String jobDescription;
	private String jobLocation;
	private String jobType;
	
}
