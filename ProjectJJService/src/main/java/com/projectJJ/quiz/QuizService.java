package com.projectJJ.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
	
	@Autowired
	QuestionsRepository questionsRepo;
	
	public List<Questions> getAllQuestions(){
		return questionsRepo.findAll();
	}

}
