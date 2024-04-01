package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.model.Address;

public interface AddRepository extends JpaRepository<Address,Long>
{
	Address findByZipCode(String id);
}
