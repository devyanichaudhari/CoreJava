package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.model.Skills;

@Repository
public interface SkillRepository extends JpaRepository<Skills,Long>
{
	Skills findBySkillName(String string);
}
