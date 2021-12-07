package com.cvbuilder.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cvbuilder.springboot.model.User;
import com.cvbuilder.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
