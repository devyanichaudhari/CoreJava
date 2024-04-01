package com.h2db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2db.exception.ResourceNotFoundException;
import com.h2db.model.Job;
import com.h2db.service.JobService;

@RestController
public class JobController 
{
	@Autowired
	private JobService jobService;
	@GetMapping("/jobs")
	public List<Job> getJob()
	{
		return jobService.getJob();
	}
	@PostMapping("/jobs/addjobs")
	public ResponseEntity<Job> saveJob(@RequestBody Job job)
	{
		return new ResponseEntity<Job>(jobService.saveJob(job),HttpStatus.CREATED);
	}
	@PutMapping("/jobs/{id}")
	public ResponseEntity<Job> updateJob(@RequestBody Job job,@PathVariable("id")long id) throws ResourceNotFoundException
	{
		job.setId(id);
		return new ResponseEntity<Job>(jobService.updateJob(job),HttpStatus.CREATED);
	}
	@DeleteMapping("/deletejobs/{id}")
	public ResponseEntity<String> deleteJob(@PathVariable("id")long id) throws ResourceNotFoundException
	{
		jobService.delete(id);
		return new ResponseEntity<String>("Deleted",HttpStatus.CREATED);
	}
}
