package com.tutorial.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tutorial.springboot.model.User;
import com.tutorial.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
