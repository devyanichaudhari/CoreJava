package com.onetoone.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empid;
	private String empName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName="id")
	private Address address;
	
}
