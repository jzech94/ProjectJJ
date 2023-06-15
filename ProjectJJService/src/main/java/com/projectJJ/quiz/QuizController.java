package com.projectJJ.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProjectJJ/quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@GetMapping(value="/findAll")
	ResponseEntity<List<Questions>> findAllQuestions() {
	    return ResponseEntity.ok(quizService.getAllQuestions());
	}

}
