package com.projectJJ.quiz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import jakarta.annotation.PostConstruct;

@Component
public class QuizInitializer {
	
	@Autowired
	QuestionsRepository questionsRepo;
	
	@PostConstruct
	public void postConstruct() {
		//question 1 answers
		Answers ansQ1A1 = new Answers(1,"JRE",1);
		Answers ansQ1A2 = new Answers(1,"JIT",2);
		Answers ansQ1A3 = new Answers(1,"JDK",3);
		Answers ansQ1A4 = new Answers(1,"JVM",4);
		List<Answers> ansQ1List = new ArrayList<>();
		ansQ1List.add(ansQ1A1);
		ansQ1List.add(ansQ1A2);
		ansQ1List.add(ansQ1A3);
		ansQ1List.add(ansQ1A4);
		
		//question 1
		Questions q1 = new Questions();
		q1.setQuestion("Which component is used to compile, debug and execute the java programs?");
		q1.setAnswers(ansQ1List);
		q1.setCorrectAnswer("JDK");
		q1.setCorrectAnswerNum(3);
		q1.setExplanation("JDK is a core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.");
		
		questionsRepo.save(q1);
		
		//question 2 answers
		Answers ansQ2A1 = new Answers(2,"Java is a sequence-dependent programming language",1);
		Answers ansQ2A2 = new Answers(2,"Java is a code dependent programming language",2);
		Answers ansQ2A3 = new Answers(2,"Java is a platform-dependent programming language",3);
		Answers ansQ2A4 = new Answers(2,"Java is a platform-independent programming language",4);
		List<Answers> ansQ2List = new ArrayList<>();
		ansQ2List.add(ansQ2A1);
		ansQ2List.add(ansQ2A2);
		ansQ2List.add(ansQ2A3);
		ansQ2List.add(ansQ2A4);
		
		//question 2
		Questions q2 = new Questions();
		q2.setQuestion("Which statement is true about Java?");
		q2.setAnswers(ansQ2List);
		q2.setCorrectAnswer("Java is a platform-independent programming language");
		q2.setCorrectAnswerNum(4);
		q2.setExplanation("Java is called 'Platform Independent Language' as it primarily works on the principle of 'compile once, run everywhere.'");
		
		questionsRepo.save(q2);
		
		//question 3 answers
		Answers ansQ3A1 = new Answers(3,"32",1);
		Answers ansQ3A2 = new Answers(3,"33",2);
		Answers ansQ3A3 = new Answers(3,"24",3);
		Answers ansQ3A4 = new Answers(3,"25",4);
		List<Answers> ansQ3List = new ArrayList<>();
		ansQ3List.add(ansQ3A1);
		ansQ3List.add(ansQ3A2);
		ansQ3List.add(ansQ3A3);
		ansQ3List.add(ansQ3A4);
		
		//question 3
		Questions q3 = new Questions();
		q3.setQuestion("What will be the output of the following Java code?");
		q3.setAnswers(ansQ3List);
		q3.setCorrectAnswer("32");
		q3.setCorrectAnswerNum(1);
		q3.setExplanation("Operator ++ has more preference than *, thus g becomes 4 and when multiplied by 8 gives 32.");
		q3.setImageHref("JavaQ3.png");
		
		questionsRepo.save(q3);
		
	}
}
