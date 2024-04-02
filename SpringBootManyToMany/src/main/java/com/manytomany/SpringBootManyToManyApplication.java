package com.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.manytomany.model.Student;
import com.manytomany.model.Skills;
import com.manytomany.repository.SkillRepository;
import com.manytomany.repository.StudentRepository;

@SpringBootApplication
public class SpringBootManyToManyApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootManyToManyApplication.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		SkillRepository skillRepositort = context.getBean(SkillRepository.class);
		Student student = new Student();
		student.setStudentName("Devyani");
		student.setQualification("MCA");
		student.setRollNo(102);
		Skills skills = new Skills();
		skills.setSkillName("Java");
		skills.setSkillScore("90%");
		Skills skills1 = new Skills();
		skills1.setSkillName("SQL");
		skills1.setSkillScore("95%");
		student.getSkills().add(skills);
		student.getSkills().add(skills1);
		skills.getStudents().add(student);
		skills1.getStudents().add(student);
		studentRepository.save(student);
	}

}
