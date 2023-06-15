package com.projectJJ.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProjectJJ/demo")
public class DemoController {
	
	@GetMapping(value="/test")
	ResponseEntity<DemoResponse> hello() {
		DemoResponse menuR = new DemoResponse("HelloWorld");
	    return ResponseEntity.ok(menuR);
	}

}
