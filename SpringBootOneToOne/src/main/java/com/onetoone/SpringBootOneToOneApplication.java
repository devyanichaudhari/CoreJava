package com.onetoone;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.onetoone.model.Address;
import com.onetoone.model.Employee;
import com.onetoone.repository.AddRepository;
import com.onetoone.repository.EmpRepository;

@SpringBootApplication
public class SpringBootOneToOneApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootOneToOneApplication.class, args);
		EmpRepository emprepo = context.getBean(EmpRepository.class);
		AddRepository addrepo = context.getBean(AddRepository.class);
		Address address = new Address();
		address.setZipCode("421428");
		address.setCity("Thane");
		address.setCountry("India");
		address.setState("Maharashtra");
		Employee emp = new Employee();
		emp.setEmpName("Devyani");
		emp.setAddress(address);
		emprepo.save(emp);
		List<Employee> list = emprepo.findAll();
		System.out.println(list);
		Address add = addrepo.findByZipCode("421498");
		System.out.println("Record Found By Id: "+add);
	}

}
