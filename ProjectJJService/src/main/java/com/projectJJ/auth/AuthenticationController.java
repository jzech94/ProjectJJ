package com.projectJJ.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProjectJJ/auth")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest authenticationRequest) {
		return ResponseEntity.ok(authenticationService.authenticate(authenticationRequest));
	}

}
