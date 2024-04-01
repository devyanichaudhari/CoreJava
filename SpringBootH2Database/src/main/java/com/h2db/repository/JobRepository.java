package com.h2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2db.model.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

}
