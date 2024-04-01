package com.h2db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2db.exception.ResourceNotFoundException;
import com.h2db.model.Job;
import com.h2db.repository.JobRepository;

@Service
public class JobService {
	@Autowired
	private JobRepository jobrepository;
	public Job saveJob(Job job)
	{
		return jobrepository.save(job);
	}
	
	public List<Job> getJob()
	{
		return jobrepository.findAll();
	}
	
	public Job updateJob(Job job) throws ResourceNotFoundException
	{
		Optional<Job> job_new=jobrepository.findById(job.getId());
		if(!job_new.isPresent())
		{
			throw new ResourceNotFoundException("Resource Not Found !!!!!");
		}
		else
		{
			Job job2=job_new.get();
			job2.setJobDescription(job.getJobDescription());
			job2.setId(job.getId());
			job2.setJobLocation(job.getJobLocation());
			job2.setJobName(job.getJobName());
			job2.setJobType(job.getJobType());
			jobrepository.save(job2);
			return job2;
		}
	}
	public Job getJobById(long id) throws ResourceNotFoundException
	{
		Optional<Job> job_new=jobrepository.findById(id);
		if(!job_new.isPresent())
		{
			throw new ResourceNotFoundException("Resource Not Found !!!!!");
		}
		else
		{
			return job_new.get();
		}
	}
	public void delete(long id)throws ResourceNotFoundException
	{
		Optional<Job> job_new=jobrepository.findById(id);
		if(!job_new.isPresent())
		{
			throw new ResourceNotFoundException("Resource Not Found !!!!!");
		}
		else
		{
			jobrepository.delete(job_new.get());
		}
		
	}
}
