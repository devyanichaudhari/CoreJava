package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/app")
public class StudentController 
{
	@Autowired
	StudentService service;
	@PostMapping("/addstudent")
	public Student createStudent(@RequestBody Student s) 
	{
		return service.createStudent(s);
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable("id")int id,Student s) 
	{
		s.getStudid();
		return service.updateStudent(s);
	}
}
