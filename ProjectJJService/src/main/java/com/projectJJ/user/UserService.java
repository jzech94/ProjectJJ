package com.projectJJ.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUserName(username)
				.orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
		return user;
	}
}
