package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.AuthRequest;
import com.jwt.entity.UserInfo;
import com.jwt.service.JwtServices;
import com.jwt.service.UserInfoService;

@RestController
@RequestMapping("/auth")
public class UserController 
{
	@Autowired
	private UserInfoService service;
	@Autowired
	private JwtServices jwtServices;
	@Autowired
	private AuthenticationManager authenticationManager;
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome this endpoint is not secure";
	}
	@PostMapping("/addNewUser")
	public String addNewuser(@RequestBody UserInfo userInfo)
	{
		return service.adduser(userInfo);
	}
	@GetMapping("/user/userprofile")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String userProfile()
	{
		return "Welcome to User Profile";
	}
	@GetMapping("/admin/adminprofile")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminProfile()
	{
		return "Welcome to Admin Profile";
	}
	@PostMapping("/generateToken")
	public String authenticationAndGetToken(@RequestBody AuthRequest authRequest)
	{
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword()));
		if(authentication.isAuthenticated())
		{
			return jwtServices.generateToken(authRequest.getUsername());
		}
		else
		{
			throw new UsernameNotFoundException("Invalid User Request!");
		}
	}
	
}

