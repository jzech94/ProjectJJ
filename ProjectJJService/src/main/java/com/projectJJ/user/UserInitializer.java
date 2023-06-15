package com.projectJJ.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class UserInitializer {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void postConstruct() {
		User user = new User("zechj94","Jordan","Zech",passwordEncoder.encode("admin123"),Role.ADMIN);
		userRepo.save(user);
	}
}
