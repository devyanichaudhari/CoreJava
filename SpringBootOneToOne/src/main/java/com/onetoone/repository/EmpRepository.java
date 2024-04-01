package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.model.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long>{

}
