package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{

}
