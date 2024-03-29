package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentResource;
import com.student.repository.StudentRepository;
//It will handle Business Logic it calls methgod from Repository
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentRepository repo;
	
	@Override
	public Student createStudent(Student s) 
	{
		return repo.save(s);
	}

	@Override
	public Student updateStudent(Student s) 
	{
		Optional<Student> stud = repo.findById(s.getStudid());
		if(stud.isPresent())
		{
			Student updateStudent = stud.get();
			updateStudent.setStudid(s.getStudid());
			updateStudent.setFirstname(s.getFirstname());
			updateStudent.setLastname(s.getLastname());
			repo.save(updateStudent);
			return updateStudent;
		}
		else
		{
			throw new StudentResource("Searching id is not available");
		}
	}

	@Override
	public List<Student> getAllStudent() 
	{
		return repo.findAll();
	}

	@Override
	public Student getStudentById(int id) 
	{
		Optional<Student> stud = repo.findById(id);
		if(stud.isPresent())
		{
			return stud.get();		
		}
		else
		{
			throw new StudentResource("Searching id is not available");
		}
	}

	@Override
	public void deleteStudent(int id) 
	{
		Optional<Student> stud = repo.findById(id);
		if(stud.isPresent())
		{
			repo.delete(stud.get());		
		}
		else
		{
			throw new StudentResource("Searching id is not available");
		}	
	}
}
