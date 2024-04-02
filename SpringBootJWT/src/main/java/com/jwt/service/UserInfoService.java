package com.jwt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.entity.UserInfo;
import com.jwt.repository.UserRepository;

@Service
public class UserInfoService implements UserDetailsService{
	@Autowired
	private UserRepository repository;
	
	@Autowired 
	private PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		Optional<UserInfo> userDetail = repository.findByName(username);
		
		return userDetail.map(UserInfoDetails::new)
				.orElseThrow(()-> new UsernameNotFoundException("user Not Found"+username));
	}
	public String adduser(UserInfo userInfo)
	{
		userInfo.setPassword(encoder.encode(userInfo.getPassword()));
		repository.save(userInfo);
		return "User Added Successfully";
	}

}
