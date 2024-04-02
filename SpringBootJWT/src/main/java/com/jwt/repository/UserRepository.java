package com.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo,Integer>
{
	Optional<UserInfo> findByName(String username);
}
