package com.projectJJ.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

import com.projectJJ.config.JwtService;
import com.projectJJ.user.User;
import com.projectJJ.user.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class AuthenticationService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationResponse authenticationResponse;

	public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(),
				authenticationRequest.getPassword()));
		// found valid username and password otherwise will thrown an exception above
		User user = userRepo.findByUserName(authenticationRequest.getUserName())
				.orElseThrow(() -> new UsernameNotFoundException(authenticationRequest.getUserName()));
		String jwtToken = jwtService.generateToken(user);
		// TODO implement refreshToken
		String refreshToken = null;
		authenticationResponse.setAccessToken(jwtToken);
		authenticationResponse.setRefreshToken(refreshToken);
		return authenticationResponse;
	}

}
