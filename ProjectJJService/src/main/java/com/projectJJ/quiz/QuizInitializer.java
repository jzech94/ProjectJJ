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
		
		Questions q4 = new Questions();
		q4.setQuestion("Who invented Java Programming?");
		Answers ansQ4A1 = new Answers(4,"Guido van Rossum",1);
		Answers ansQ4A2 = new Answers(4,"James Gosling",2);
		Answers ansQ4A3 = new Answers(4,"Dennis Ritchie",3);
		Answers ansQ4A4 = new Answers(4,"Bjarne Stroustrup",4);
		
		List<Answers> ansQ4List = new ArrayList<>();
		ansQ4List.add(ansQ4A1);
		ansQ4List.add(ansQ4A2);
		ansQ4List.add(ansQ4A3);
		ansQ4List.add(ansQ4A4);

		q4.setCorrectAnswerNum(2);
		q4.setAnswers(ansQ4List);
		q4.setExplanation("Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java.");
		q4.setCorrectAnswer("James Gosling");
		q4.setImageHref("");
		
		questionsRepo.save(q4);
		
		Questions q5 = new Questions();
		q5.setQuestion("Which one of the following is not a Java feature?");
		Answers ansQ5A1 = new Answers(5,"Object-oriented",1);
		Answers ansQ5A2 = new Answers(5,"Use of pointers",2);
		Answers ansQ5A3 = new Answers(5,"Portable",3);
		Answers ansQ5A4 = new Answers(5,"Dynamic and Extensible",4);
		
		List<Answers> ansQ5List = new ArrayList<>();
		ansQ5List.add(ansQ5A1);
		ansQ5List.add(ansQ5A2);
		ansQ5List.add(ansQ5A3);
		ansQ5List.add(ansQ5A4);

		q5.setCorrectAnswerNum(2);
		q5.setAnswers(ansQ5List);
		q5.setExplanation("Pointers is not a Java feature. Java provides an efficient abstraction layer for developing without using a pointer in Java. Features of Java Programming are Portable, Architectural Neutral, Object-Oriented, Robust, Secure, Dynamic and Extensible, etc.");
		q5.setCorrectAnswer("Use of pointers");
		q5.setImageHref("");
		
		questionsRepo.save(q5);
		
		Questions q6 = new Questions();
		q6.setQuestion("Which of these cannot be used for a variable name in Java?");
		Answers ansQ6A1 = new Answers(6,"identifier & keyword",1);
		Answers ansQ6A2 = new Answers(6,"identifier",2);
		Answers ansQ6A3 = new Answers(6,"keyword",3);
		Answers ansQ6A4 = new Answers(6,"none of the mentioned",4);

		List<Answers> ansQ6List = new ArrayList<>();
		ansQ6List.add(ansQ6A1);
		ansQ6List.add(ansQ6A2);
		ansQ6List.add(ansQ6A3);
		ansQ6List.add(ansQ6A4);

		q6.setCorrectAnswerNum(3);
		q6.setAnswers(ansQ6List);
		q6.setExplanation("Keywords are specially reserved words that can not be used for naming a user-defined variable, for example: class, int, for, etc.");
		q6.setCorrectAnswer("keyword");
		q6.setImageHref("");

		questionsRepo.save(q6);
		
		Questions q7 = new Questions();
		q7.setQuestion("What is the extension of java code files?");
		Answers ansQ7A1 = new Answers(7,".js",1);
		Answers ansQ7A2 = new Answers(7,".txt",2);
		Answers ansQ7A3 = new Answers(7,".class",3);
		Answers ansQ7A4 = new Answers(7,".java",4);

		List<Answers> ansQ7List = new ArrayList<>();
		ansQ7List.add(ansQ7A1);
		ansQ7List.add(ansQ7A2);
		ansQ7List.add(ansQ7A3);
		ansQ7List.add(ansQ7A4);

		q7.setCorrectAnswerNum(4);
		q7.setAnswers(ansQ7List);
		q7.setExplanation("Java files have .java extension.");
		q7.setCorrectAnswer(".java");
		q7.setImageHref("");

		questionsRepo.save(q7);
		
		Questions q8 = new Questions();
		q8.setQuestion("Which environment variable is used to set the java path?");
		Answers ansQ8A1 = new Answers(8,"MAVEN_Path",1);
		Answers ansQ8A2 = new Answers(8,"JavaPATH",2);
		Answers ansQ8A3 = new Answers(8,"JAVA",3);
		Answers ansQ8A4 = new Answers(8,"JAVA_HOME",4);

		List<Answers> ansQ8List = new ArrayList<>();
		ansQ8List.add(ansQ8A1);
		ansQ8List.add(ansQ8A2);
		ansQ8List.add(ansQ8A3);
		ansQ8List.add(ansQ8A4);

		q8.setCorrectAnswerNum(4);
		q8.setAnswers(ansQ8List);
		q8.setExplanation("JAVA_HOME is used to store a path to the java installation.");
		q8.setCorrectAnswer("JAVA_HOME");
		q8.setImageHref("");

		questionsRepo.save(q8);
		
		Questions q9 = new Questions();
		q9.setQuestion("What will be the output of the following Java program?");
		Answers ansQ9A1 = new Answers(9,"NaN",1);
		Answers ansQ9A2 = new Answers(9,"Infinity",2);
		Answers ansQ9A3 = new Answers(9,"0.0",3);
		Answers ansQ9A4 = new Answers(9,"All of the above",4);

		List<Answers> ansQ9List = new ArrayList<>();
		ansQ9List.add(ansQ9A1);
		ansQ9List.add(ansQ9A2);
		ansQ9List.add(ansQ9A3);
		ansQ9List.add(ansQ9A4);

		q9.setCorrectAnswerNum(4);
		q9.setAnswers(ansQ9List);
		q9.setExplanation("For floating point literals, we have constant value to represent (10/0.0) infinity either positive or negative and also have NaN (not a number for undefined like 0/0.0), but for the integral type, we don’t have any constant that’s why we get an arithmetic exception.");
		q9.setCorrectAnswer("All of the above");
		q9.setImageHref("JavaQ9.png");

		questionsRepo.save(q9);
		
		Questions q10 = new Questions();
		q10.setQuestion("Which of the following is not an OOPS concept in Java?");
		Answers ansQ10A1 = new Answers(10,"Polymorphism",1);
		Answers ansQ10A2 = new Answers(10,"Inheritance",2);
		Answers ansQ10A3 = new Answers(10,"Compilation",3);
		Answers ansQ10A4 = new Answers(10,"Encapsulation",4);

		List<Answers> ansQ10List = new ArrayList<>();
		ansQ10List.add(ansQ10A1);
		ansQ10List.add(ansQ10A2);
		ansQ10List.add(ansQ10A3);
		ansQ10List.add(ansQ10A4);

		q10.setCorrectAnswerNum(3);
		q10.setAnswers(ansQ10List);
		q10.setExplanation("There are 4 OOPS concepts in Java. Inheritance, Encapsulation, Polymorphism and Abstraction.");
		q10.setCorrectAnswer("Compilation");
		q10.setImageHref("");

		questionsRepo.save(q10);
		
		Questions q11 = new Questions();
		q11.setQuestion("What is not the use of “this” keyword in Java?");
		Answers ansQ11A1 = new Answers(11,"Referring to the instance variable when a local variable has the same name",1);
		Answers ansQ11A2 = new Answers(11,"Passing itself to the method of the same class",2);
		Answers ansQ11A3 = new Answers(11,"Passing itself to another method",3);
		Answers ansQ11A4 = new Answers(11,"Calling another constructor in constructor chaining",4);

		List<Answers> ansQ11List = new ArrayList<>();
		ansQ11List.add(ansQ11A1);
		ansQ11List.add(ansQ11A2);
		ansQ11List.add(ansQ11A3);
		ansQ11List.add(ansQ11A4);

		q11.setCorrectAnswerNum(2);
		q11.setAnswers(ansQ11List);
		q11.setExplanation("“this” is an important keyword in java. It helps to distinguish between local variable and variables passed in the method as parameters.");
		q11.setCorrectAnswer("Passing itself to the method of the same class");
		q11.setImageHref("");

		questionsRepo.save(q11);
		
		Questions q12 = new Questions();
		q12.setQuestion("What will be the output of the following Java program?");
		Answers ansQ12A1 = new Answers(12,"Compilation error",1);
		Answers ansQ12A2 = new Answers(12,"Runtime error",2);
		Answers ansQ12A3 = new Answers(12,"5 6 5 6",3);
		Answers ansQ12A4 = new Answers(12,"5 6 5",4);

		List<Answers> ansQ12List = new ArrayList<>();
		ansQ12List.add(ansQ12A1);
		ansQ12List.add(ansQ12A2);
		ansQ12List.add(ansQ12A3);
		ansQ12List.add(ansQ12A4);

		q12.setCorrectAnswerNum(1);
		q12.setAnswers(ansQ12List);
		q12.setExplanation("Second print statement doesn’t have access to y , scope y was limited to the block defined after initialization of x. Output: Exception in thread main java.lang.Error: Unresolved compilation problem: y cannot be resolved to a variable");
		q12.setCorrectAnswer("Compilation error");
		q12.setImageHref("JavaQ12.png");

		questionsRepo.save(q12);
		
		Questions q13 = new Questions();
		q13.setQuestion("What will be the error in the following Java code?");
		Answers ansQ13A1 = new Answers(13,"b cannot contain value 50",1);
		Answers ansQ13A2 = new Answers(13,"b cannot contain value 100, limited by its range",2);
		Answers ansQ13A3 = new Answers(13,"No error in this code",3);
		Answers ansQ13A4 = new Answers(13,"* operator has converted b * 50 into int, which can not be converted to byte without casting",4);

		List<Answers> ansQ13List = new ArrayList<>();
		ansQ13List.add(ansQ13A1);
		ansQ13List.add(ansQ13A2);
		ansQ13List.add(ansQ13A3);
		ansQ13List.add(ansQ13A4);

		q13.setCorrectAnswerNum(4);
		q13.setAnswers(ansQ13List);
		q13.setExplanation("While evaluating an expression containing int, bytes or shorts, the whole expression is converted to int then evaluated and the result is also of type int.");
		q13.setCorrectAnswer("* operator has converted b * 50 into int, which can not be converted to byte without casting");
		q13.setImageHref("JavaQ13.png");

		questionsRepo.save(q13);

		Questions q14 = new Questions();
		q14.setQuestion("Which of the following is a type of polymorphism in Java Programming?");
		Answers ansQ14A1 = new Answers(14,"Multiple polymorphism",1);
		Answers ansQ14A2 = new Answers(14,"Compile time polymorphism",2);
		Answers ansQ14A3 = new Answers(14,"Multilevel polymorphism",3);
		Answers ansQ14A4 = new Answers(14,"Execution time polymorphism",4);

		List<Answers> ansQ14List = new ArrayList<>();
		ansQ14List.add(ansQ14A1);
		ansQ14List.add(ansQ14A2);
		ansQ14List.add(ansQ14A3);
		ansQ14List.add(ansQ14A4);

		q14.setCorrectAnswerNum(2);
		q14.setAnswers(ansQ14List);
		q14.setExplanation("There are two types of polymorphism in Java. Compile time polymorphism (overloading) and runtime polymorphism (overriding).");
		q14.setCorrectAnswer("Compile time polymorphism");
		q14.setImageHref("");

		questionsRepo.save(q14);

		Questions q15 = new Questions();
		q15.setQuestion("What will be the output of the following Java program?");
		Answers ansQ15A1 = new Answers(15,"0 256",1);
		Answers ansQ15A2 = new Answers(15,"0 64",2);
		Answers ansQ15A3 = new Answers(15,"256 0",3);
		Answers ansQ15A4 = new Answers(15,"64 0",4);

		List<Answers> ansQ15List = new ArrayList<>();
		ansQ15List.add(ansQ15A1);
		ansQ15List.add(ansQ15A2);
		ansQ15List.add(ansQ15A3);
		ansQ15List.add(ansQ15A4);

		q15.setCorrectAnswerNum(3);
		q15.setAnswers(ansQ15List);
		q15.setExplanation("Output: 256 0");
		q15.setCorrectAnswer("256 0");
		q15.setImageHref("JavaQ15.png");

		questionsRepo.save(q15);

		Questions q16 = new Questions();
		q16.setQuestion("What will be the output of the following Java code?");
		Answers ansQ16A1 = new Answers(16,"100",1);
		Answers ansQ16A2 = new Answers(16,"400",2);
		Answers ansQ16A3 = new Answers(16,"200",3);
		Answers ansQ16A4 = new Answers(16,"12",4);

		List<Answers> ansQ16List = new ArrayList<>();
		ansQ16List.add(ansQ16A1);
		ansQ16List.add(ansQ16A2);
		ansQ16List.add(ansQ16A3);
		ansQ16List.add(ansQ16A4);

		q16.setCorrectAnswerNum(3);
		q16.setAnswers(ansQ16List);
		q16.setExplanation("Output: 200");
		q16.setCorrectAnswer("200");
		q16.setImageHref("JavaQ16.png");

		questionsRepo.save(q16);
		

		Questions q17 = new Questions();
		q17.setQuestion("What is Truncation in Java?");
		Answers ansQ17A1 = new Answers(17,"Floating-point value assigned to a Floating type",1);
		Answers ansQ17A2 = new Answers(17,"Floating-point value assigned to an integer type",2);
		Answers ansQ17A3 = new Answers(17,"Integer value assigned to floating type",3);
		Answers ansQ17A4 = new Answers(17,"Integer value assigned to floating type",4);
		
		List<Answers> ansQ17List = new ArrayList<>();
		ansQ17List.add(ansQ17A1);
		ansQ17List.add(ansQ17A2);
		ansQ17List.add(ansQ17A3);
		ansQ17List.add(ansQ17A4);
		
		q17.setCorrectAnswerNum(2);
		q17.setAnswers(ansQ17List);
		q17.setExplanation("None.");
		q17.setCorrectAnswer("Floating-point value assigned to an integer type");
		q17.setImageHref("");
		
		questionsRepo.save(q17);
		
		Questions q18 = new Questions();
		q18.setQuestion("What will be the output of the following Java program?");
		Answers ansQ18A1 = new Answers(18,"1 2 3 4 5",1);
		Answers ansQ18A2 = new Answers(18,"1 2 3 4",2);
		Answers ansQ18A3 = new Answers(18,"1 2",3);
		Answers ansQ18A4 = new Answers(18,"1 2 3",4);
		
		List<Answers> ansQ18List = new ArrayList<>();
		ansQ18List.add(ansQ18A1);
		ansQ18List.add(ansQ18A2);
		ansQ18List.add(ansQ18A3);
		ansQ18List.add(ansQ18A4);
		
		q18.setCorrectAnswerNum(4);
		q18.setAnswers(ansQ18List);
		q18.setExplanation("arr.length() is 5, so the loop is executed for three times. Output: 1 2 3");
		q18.setCorrectAnswer("1 2 3");
		q18.setImageHref("JavaQ18.png");
		
		questionsRepo.save(q18);
		
		Questions q19 = new Questions();
		q19.setQuestion("What will be the output of the following Java code snippet?");
		Answers ansQ19A1 = new Answers(19,"The snippet compiles and runs but does not print anything",1);
		Answers ansQ19A2 = new Answers(19,"The snippet compiles, runs and prints 0",2);
		Answers ansQ19A3 = new Answers(19,"The snippet compiles, runs and prints 1",3);
		Answers ansQ19A4 = new Answers(19,"The snippet does not compile",4);
		
		List<Answers> ansQ19List = new ArrayList<>();
		ansQ19List.add(ansQ19A1);
		ansQ19List.add(ansQ19A2);
		ansQ19List.add(ansQ19A3);
		ansQ19List.add(ansQ19A4);
		
		q19.setCorrectAnswerNum(1);
		q19.setAnswers(ansQ19List);
		q19.setExplanation("As no argument is passed to the code, the length of args is 0. So the code will not print.");
		q19.setCorrectAnswer("The snippet compiles and runs but does not print anything");
		q19.setImageHref("JavaQ19.png");
		
		questionsRepo.save(q19);
		
		Questions q20 = new Questions();
		q20.setQuestion("What is the extension of compiled java classes?");
		Answers ansQ20A1 = new Answers(20,".txt",1);
		Answers ansQ20A2 = new Answers(20,".js",2);
		Answers ansQ20A3 = new Answers(20,".class",3);
		Answers ansQ20A4 = new Answers(20,".java",4);

		List<Answers> ansQ20List = new ArrayList<>();
		ansQ20List.add(ansQ20A1);
		ansQ20List.add(ansQ20A2);
		ansQ20List.add(ansQ20A3);
		ansQ20List.add(ansQ20A4);

		q20.setCorrectAnswerNum(3);
		q20.setAnswers(ansQ20List);
		q20.setExplanation("The compiled java files have .class extension.");
		q20.setCorrectAnswer(".class");
		q20.setImageHref("");

		questionsRepo.save(q20);

		Questions q21 = new Questions();
		q21.setQuestion("Which exception is thrown when java is out of memory?");
		Answers ansQ21A1 = new Answers(21,"MemoryError",1);
		Answers ansQ21A2 = new Answers(21,"OutOfMemoryError",2);
		Answers ansQ21A3 = new Answers(21,"MemoryOutOfBoundsException",3);
		Answers ansQ21A4 = new Answers(21,"MemoryFullException",4);

		List<Answers> ansQ21List = new ArrayList<>();
		ansQ21List.add(ansQ21A1);
		ansQ21List.add(ansQ21A2);
		ansQ21List.add(ansQ21A3);
		ansQ21List.add(ansQ21A4);

		q21.setCorrectAnswerNum(2);
		q21.setAnswers(ansQ21List);
		q21.setExplanation("The Xms flag has no default value, and Xmx typically has a default value of 256MB. A common use for these flags is when you encounter a java.lang.OutOfMemoryError.");
		q21.setCorrectAnswer("OutOfMemoryError");
		q21.setImageHref("");

		questionsRepo.save(q21);

		Questions q22 = new Questions();
		q22.setQuestion("What will be the output of the following Java code?");
		Answers ansQ22A1 = new Answers(22,"abc",1);
		Answers ansQ22A2 = new Answers(22,"a",2);
		Answers ansQ22A3 = new Answers(22,"b",3);
		Answers ansQ22A4 = new Answers(22,"c",4);

		List<Answers> ansQ22List = new ArrayList<>();
		ansQ22List.add(ansQ22A1);
		ansQ22List.add(ansQ22A2);
		ansQ22List.add(ansQ22A3);
		ansQ22List.add(ansQ22A4);

		q22.setCorrectAnswerNum(1);
		q22.setAnswers(ansQ22List);
		q22.setExplanation("String(chars) is a constructor of class string, it initializes string s with the values stored in character array chars, therefore s contains “abc”.");
		q22.setCorrectAnswer("abc");
		q22.setImageHref("JavaQ22.png");

		questionsRepo.save(q22);

		Questions q23 = new Questions();
		q23.setQuestion("Which of these are selection statements in Java?");
		Answers ansQ23A1 = new Answers(23,"break",1);
		Answers ansQ23A2 = new Answers(23,"continue",2);
		Answers ansQ23A3 = new Answers(23,"for()",3);
		Answers ansQ23A4 = new Answers(23,"if()",4);

		List<Answers> ansQ23List = new ArrayList<>();
		ansQ23List.add(ansQ23A1);
		ansQ23List.add(ansQ23A2);
		ansQ23List.add(ansQ23A3);
		ansQ23List.add(ansQ23A4);

		q23.setCorrectAnswerNum(4);
		q23.setAnswers(ansQ23List);
		q23.setExplanation("Continue and break are jump statements, and for is a looping statement.");
		q23.setCorrectAnswer("if()");
		q23.setImageHref("");

		questionsRepo.save(q23);

		Questions q24 = new Questions();
		q24.setQuestion("What will be the output of the following Java program?");
		Answers ansQ24A1 = new Answers(24,"1",1);
		Answers ansQ24A2 = new Answers(24,"120",2);
		Answers ansQ24A3 = new Answers(24,"0",3);
		Answers ansQ24A4 = new Answers(24,"None of the mentioned",4);

		List<Answers> ansQ24List = new ArrayList<>();
		ansQ24List.add(ansQ24A1);
		ansQ24List.add(ansQ24A2);
		ansQ24List.add(ansQ24A3);
		ansQ24List.add(ansQ24A4);

		q24.setCorrectAnswerNum(1);
		q24.setAnswers(ansQ24List);
		q24.setExplanation("Output: 1");
		q24.setCorrectAnswer("1");
		q24.setImageHref("JavaQ24.png");

		questionsRepo.save(q24);

		Questions q25 = new Questions();
		q25.setQuestion("What will be the output of the following Java code?");
		Answers ansQ25A1 = new Answers(25,"0",1);
		Answers ansQ25A2 = new Answers(25,"true",2);
		Answers ansQ25A3 = new Answers(25,"1",3);
		Answers ansQ25A4 = new Answers(25,"false",4);

		List<Answers> ansQ25List = new ArrayList<>();
		ansQ25List.add(ansQ25A1);
		ansQ25List.add(ansQ25A2);
		ansQ25List.add(ansQ25A3);
		ansQ25List.add(ansQ25A4);

		q25.setCorrectAnswerNum(4);
		q25.setAnswers(ansQ25List);
		q25.setExplanation("startsWith() method is case sensitive “hello” and “Hello” are treated differently, hence false is stored in var. Output: false");
		q25.setCorrectAnswer("false");
		q25.setImageHref("JavaQ25.png");

		questionsRepo.save(q25);

		Questions q26 = new Questions();
		q26.setQuestion("Which of these keywords is used to define interfaces in Java?");
		Answers ansQ26A1 = new Answers(26,"intf",1);
		Answers ansQ26A2 = new Answers(26,"Intf",2);
		Answers ansQ26A3 = new Answers(26,"interface",3);
		Answers ansQ26A4 = new Answers(26,"Interface",4);

		List<Answers> ansQ26List = new ArrayList<>();
		ansQ26List.add(ansQ26A1);
		ansQ26List.add(ansQ26A2);
		ansQ26List.add(ansQ26A3);
		ansQ26List.add(ansQ26A4);

		q26.setCorrectAnswerNum(3);
		q26.setAnswers(ansQ26List);
		q26.setExplanation("interface keyword is used to define interfaces in Java.");
		q26.setCorrectAnswer("interface");
		q26.setImageHref("");

		questionsRepo.save(q26);

		Questions q27 = new Questions();
		q27.setQuestion("What will be the output of the following Java program?");
		Answers ansQ27A1 = new Answers(27,"QuizziuQ",1);
		Answers ansQ27A2 = new Answers(27,"ziuQQuiz",2);
		Answers ansQ27A3 = new Answers(27,"Quiz",3);
		Answers ansQ27A4 = new Answers(27,"ziuQ",4);

		List<Answers> ansQ27List = new ArrayList<>();
		ansQ27List.add(ansQ27A1);
		ansQ27List.add(ansQ27A2);
		ansQ27List.add(ansQ27A3);
		ansQ27List.add(ansQ27A4);

		q27.setCorrectAnswerNum(4);
		q27.setAnswers(ansQ27List);
		q27.setExplanation("reverse() method reverses all characters. It returns the reversed object on which it was called. Output: ziuQ");
		q27.setCorrectAnswer("ziuQ");
		q27.setImageHref("JavaQ27.png");

		questionsRepo.save(q27);

		Questions q28 = new Questions();
		q28.setQuestion("What will be the output of the following Java code?");
		Answers ansQ28A1 = new Answers(28,"257",1);
		Answers ansQ28A2 = new Answers(28,"256",2);
		Answers ansQ28A3 = new Answers(28,"1",3);
		Answers ansQ28A4 = new Answers(28,"0",4);

		List<Answers> ansQ28List = new ArrayList<>();
		ansQ28List.add(ansQ28A1);
		ansQ28List.add(ansQ28A2);
		ansQ28List.add(ansQ28A3);
		ansQ28List.add(ansQ28A4);

		q28.setCorrectAnswerNum(3);
		q28.setAnswers(ansQ28List);
		q28.setExplanation("i.byteValue() method returns the value of wrapper i as a byte value. i is 257, range of byte is 256 therefore i value exceeds byte range by 1 hence 1 is returned and stored in x. Output: 1");
		q28.setCorrectAnswer("1");
		q28.setImageHref("JavaQ28.png");

		questionsRepo.save(q28);

		Questions q29 = new Questions();
		q29.setQuestion("What will be the output of the following Java program?");
		Answers ansQ29A1 = new Answers(29,"9.0",1);
		Answers ansQ29A2 = new Answers(29,"8.0",2);
		Answers ansQ29A3 = new Answers(29,"4.0",3);
		Answers ansQ29A4 = new Answers(29,"2.0",4);

		List<Answers> ansQ29List = new ArrayList<>();
		ansQ29List.add(ansQ29A1);
		ansQ29List.add(ansQ29A2);
		ansQ29List.add(ansQ29A3);
		ansQ29List.add(ansQ29A4);

		q29.setCorrectAnswerNum(2);
		q29.setAnswers(ansQ29List);
		q29.setExplanation("Math.pow(x, y) methods returns value of y to the power x, i:e x ^ y, 2.0 ^ 3.0 = 8.0. Output:8.0");
		q29.setCorrectAnswer("8.0");
		q29.setImageHref("JavaQ29.png");

		questionsRepo.save(q29);

		Questions q30 = new Questions();
		q30.setQuestion("Which of the following is a superclass of every class in Java?");
		Answers ansQ30A1 = new Answers(30,"ArrayList",1);
		Answers ansQ30A2 = new Answers(30,"Abstract class",2);
		Answers ansQ30A3 = new Answers(30,"Object class",3);
		Answers ansQ30A4 = new Answers(30,"String",4);

		List<Answers> ansQ30List = new ArrayList<>();
		ansQ30List.add(ansQ30A1);
		ansQ30List.add(ansQ30A2);
		ansQ30List.add(ansQ30A3);
		ansQ30List.add(ansQ30A4);

		q30.setCorrectAnswerNum(3);
		q30.setAnswers(ansQ30List);
		q30.setExplanation("Object class is superclass of every class in Java.");
		q30.setCorrectAnswer("Object class");
		q30.setImageHref("");

		questionsRepo.save(q30);
		
		Questions q31 = new Questions();
		q31.setQuestion("What will be the output of the following Java code?");
		Answers ansQ31A1 = new Answers(31,"3",1);
		Answers ansQ31A2 = new Answers(31,"0",2);
		Answers ansQ31A3 = new Answers(31,"4",3);
		Answers ansQ31A4 = new Answers(31,"3.0",4);

		List<Answers> ansQ31List = new ArrayList<>();
		ansQ31List.add(ansQ31A1);
		ansQ31List.add(ansQ31A2);
		ansQ31List.add(ansQ31A3);
		ansQ31List.add(ansQ31A4);

		q31.setCorrectAnswerNum(3);
		q31.setAnswers(ansQ31List);
		q31.setExplanation("ciel(double X) returns the smallest whole number greater than or equal to variable x. Output: 4");
		q31.setCorrectAnswer("4");
		q31.setImageHref("JavaQ31.png");

		questionsRepo.save(q31);

		Questions q32 = new Questions();
		q32.setQuestion("What will be the output of the following Java program?");
		Answers ansQ32A1 = new Answers(32,"127 Note: Host URL is having length of content 127.",1);
		Answers ansQ32A2 = new Answers(32,"126",2);
		Answers ansQ32A3 = new Answers(32,"Runtime Error",3);
		Answers ansQ32A4 = new Answers(32,"Compilation Error",4);

		List<Answers> ansQ32List = new ArrayList<>();
		ansQ32List.add(ansQ32A1);
		ansQ32List.add(ansQ32A2);
		ansQ32List.add(ansQ32A3);
		ansQ32List.add(ansQ32A4);

		q32.setCorrectAnswerNum(1);
		q32.setAnswers(ansQ32List);
		q32.setExplanation("Output: 127");
		q32.setCorrectAnswer("127");
		q32.setImageHref("JavaQ32.png");

		questionsRepo.save(q32);

		Questions q33 = new Questions();
		q33.setQuestion("Which of the below is not a Java Profiler?");
		Answers ansQ33A1 = new Answers(33,"JProfiler",1);
		Answers ansQ33A2 = new Answers(33,"Eclipse Profiler",2);
		Answers ansQ33A3 = new Answers(33,"JVM",3);
		Answers ansQ33A4 = new Answers(33,"JConsole",4);

		List<Answers> ansQ33List = new ArrayList<>();
		ansQ33List.add(ansQ33A1);
		ansQ33List.add(ansQ33A2);
		ansQ33List.add(ansQ33A3);
		ansQ33List.add(ansQ33A4);

		q33.setCorrectAnswerNum(3);
		q33.setAnswers(ansQ33List);
		q33.setExplanation("Memory leak is like holding a strong reference to an object although it would never be needed anymore. Objects that are reachable but not live are considered memory leaks. Various tools help us to identify memory leaks.");
		q33.setCorrectAnswer("JVM");
		q33.setImageHref("");

		questionsRepo.save(q33);

		Questions q34 = new Questions();
		q34.setQuestion("What will be the output of the following Java program?");
		Answers ansQ34A1 = new Answers(34,"www.sanfoundry.com",1);
		Answers ansQ34A2 = new Answers(34,"https://www.sanfoundry.com/javamcq",2);
		Answers ansQ34A3 = new Answers(34,"sanfoundry",3);
		Answers ansQ34A4 = new Answers(34,"sanfoundry.com",4);

		List<Answers> ansQ34List = new ArrayList<>();
		ansQ34List.add(ansQ34A1);
		ansQ34List.add(ansQ34A2);
		ansQ34List.add(ansQ34A3);
		ansQ34List.add(ansQ34A4);

		q34.setCorrectAnswerNum(2);
		q34.setAnswers(ansQ34List);
		q34.setExplanation("toExternalForm() is used to know the full URL of an URL object. Output: https://www.sanfoundry.com/javamcq");
		q34.setCorrectAnswer("https://www.sanfoundry.com/javamcq");
		q34.setImageHref("JavaQ34.png");

		questionsRepo.save(q34);

		Questions q35 = new Questions();
		q35.setQuestion("What will be the output of the following Java code snippet?");
		Answers ansQ35A1 = new Answers(35,"[A, D, C]",1);
		Answers ansQ35A2 = new Answers(35,"[A, B, C]",2);
		Answers ansQ35A3 = new Answers(35,"[A, B, C, D]",3);
		Answers ansQ35A4 = new Answers(35,"[A, D, B, C]",4);

		List<Answers> ansQ35List = new ArrayList<>();
		ansQ35List.add(ansQ35A1);
		ansQ35List.add(ansQ35A2);
		ansQ35List.add(ansQ35A3);
		ansQ35List.add(ansQ35A4);

		q35.setCorrectAnswerNum(4);
		q35.setAnswers(ansQ35List);
		q35.setExplanation("obj is an object of class ArrayLists hence it is an dynamic array which can increase and decrease its size. obj.add(“X”) adds to the array element X and obj.add(1,”X”) adds element x at index position 1 in the list, Hence obj.add(1,”D”) stores D at index position 1 of obj and shifts the previous value stored at that position by 1. Output: [A, D, B, C].");
		q35.setCorrectAnswer("[A, D, B, C]");
		q35.setImageHref("JavaQ35.png");

		questionsRepo.save(q35);

		Questions q36 = new Questions();
		q36.setQuestion("Which of these packages contains the exception Stack Overflow in Java?");
		Answers ansQ36A1 = new Answers(36,"java.io",1);
		Answers ansQ36A2 = new Answers(36,"java.system",2);
		Answers ansQ36A3 = new Answers(36,"java.lang",3);
		Answers ansQ36A4 = new Answers(36,"java.util",4);

		List<Answers> ansQ36List = new ArrayList<>();
		ansQ36List.add(ansQ36A1);
		ansQ36List.add(ansQ36A2);
		ansQ36List.add(ansQ36A3);
		ansQ36List.add(ansQ36A4);

		q36.setCorrectAnswerNum(3);
		q36.setAnswers(ansQ36List);
		q36.setExplanation("None.");
		q36.setCorrectAnswer("java.lang");
		q36.setImageHref("");

		questionsRepo.save(q36);

		Questions q37 = new Questions();
		q37.setQuestion("What will be the output of the following Java program?");
		Answers ansQ37A1 = new Answers(37,"1 2 5 8",1);
		Answers ansQ37A2 = new Answers(37,"2 1 8 5",2);
		Answers ansQ37A3 = new Answers(37,"1 5 8 2",3);
		Answers ansQ37A4 = new Answers(37,"2 8 5 1",4);

		List<Answers> ansQ37List = new ArrayList<>();
		ansQ37List.add(ansQ37A1);
		ansQ37List.add(ansQ37A2);
		ansQ37List.add(ansQ37A3);
		ansQ37List.add(ansQ37A4);

		q37.setCorrectAnswerNum(1);
		q37.setAnswers(ansQ37List);
		q37.setExplanation("Collections.sort(list) sorts the given list, the list was 2->8->5->1 after sorting it became 1->2->5->8. Output: 1 2 5 8");
		q37.setCorrectAnswer("1 2 5 8");
		q37.setImageHref("JavaQ37.png");

		questionsRepo.save(q37);

		Questions q38 = new Questions();
		q38.setQuestion("Which of these statements is incorrect about Thread?");
		Answers ansQ38A1 = new Answers(38,"start() method is used to begin execution of the thread",1);
		Answers ansQ38A2 = new Answers(38,"run() method is used to begin execution of a thread before start() method in special cases",2);
		Answers ansQ38A3 = new Answers(38,"A thread can be formed by implementing Runnable interface only",3);
		Answers ansQ38A4 = new Answers(38,"A thread can be formed by a class that extends Thread class",4);

		List<Answers> ansQ38List = new ArrayList<>();
		ansQ38List.add(ansQ38A1);
		ansQ38List.add(ansQ38A2);
		ansQ38List.add(ansQ38A3);
		ansQ38List.add(ansQ38A4);

		q38.setCorrectAnswerNum(2);
		q38.setAnswers(ansQ38List);
		q38.setExplanation("run() method is used to define the code that constitutes the new thread, it contains the code to be executed. start() method is used to begin execution of the thread that is execution of run(). run() itself is never used for starting execution of the thread.");
		q38.setCorrectAnswer("run() method is used to begin execution of a thread before start() method in special cases");
		q38.setImageHref("");

		questionsRepo.save(q38);

		Questions q39 = new Questions();
		q39.setQuestion("Which of these keywords are used for the block to be examined for exceptions?");
		Answers ansQ39A1 = new Answers(39,"check",1);
		Answers ansQ39A2 = new Answers(39,"throw",2);
		Answers ansQ39A3 = new Answers(39,"catch",3);
		Answers ansQ39A4 = new Answers(39,"try",4);

		List<Answers> ansQ39List = new ArrayList<>();
		ansQ39List.add(ansQ39A1);
		ansQ39List.add(ansQ39A2);
		ansQ39List.add(ansQ39A3);
		ansQ39List.add(ansQ39A4);

		q39.setCorrectAnswerNum(4);
		q39.setAnswers(ansQ39List);
		q39.setExplanation("try is used for the block that needs to checked for exception.");
		q39.setCorrectAnswer("try");
		q39.setImageHref("");

		questionsRepo.save(q39);

		Questions q40 = new Questions();
		q40.setQuestion("What will be the output of the following Java code?");
		Answers ansQ40A1 = new Answers(40,"truetrue",1);
		Answers ansQ40A2 = new Answers(40,"falsefalse",2);
		Answers ansQ40A3 = new Answers(40,"true",3);
		Answers ansQ40A4 = new Answers(40,"false",4);

		List<Answers> ansQ40List = new ArrayList<>();
		ansQ40List.add(ansQ40A1);
		ansQ40List.add(ansQ40A2);
		ansQ40List.add(ansQ40A3);
		ansQ40List.add(ansQ40A4);

		q40.setCorrectAnswerNum(2);
		q40.setAnswers(ansQ40List);
		q40.setExplanation("This program was previously done by using Runnable interface, here we have used Thread class. This shows both the method are equivalent, we can use any of them to create a thread. Output: falsefalse");
		q40.setCorrectAnswer("falsefalse");
		q40.setImageHref("JavaQ40.png");

		questionsRepo.save(q40);

		Questions q41 = new Questions();
		q41.setQuestion("Which one of the following is not an access modifier?");
		Answers ansQ41A1 = new Answers(41,"Protected",1);
		Answers ansQ41A2 = new Answers(41,"Void",2);
		Answers ansQ41A3 = new Answers(41,"Public",3);
		Answers ansQ41A4 = new Answers(41,"Private",4);

		List<Answers> ansQ41List = new ArrayList<>();
		ansQ41List.add(ansQ41A1);
		ansQ41List.add(ansQ41A2);
		ansQ41List.add(ansQ41A3);
		ansQ41List.add(ansQ41A4);

		q41.setCorrectAnswerNum(2);
		q41.setAnswers(ansQ41List);
		q41.setExplanation("Public, private, protected and default are the access modifiers.");
		q41.setCorrectAnswer("Void");
		q41.setImageHref("");

		questionsRepo.save(q41);

		Questions q42 = new Questions();
		q42.setQuestion("What will be the output of the following Java program?");
		Answers ansQ42A1 = new Answers(42,"2 2",1);
		Answers ansQ42A2 = new Answers(42,"3 3",2);
		Answers ansQ42A3 = new Answers(42,"Runtime Error",3);
		Answers ansQ42A4 = new Answers(42,"Compilation Error",4);

		List<Answers> ansQ42List = new ArrayList<>();
		ansQ42List.add(ansQ42A1);
		ansQ42List.add(ansQ42A2);
		ansQ42List.add(ansQ42A3);
		ansQ42List.add(ansQ42A4);

		q42.setCorrectAnswerNum(4);
		q42.setAnswers(ansQ42List);
		q42.setExplanation("class A has been declared final hence it cannot be inherited by any other class. Hence class B does not have member i, giving compilation error. Output: Exception in thread main java.lang.Error: Unresolved compilation problem: i cannot be resolved or is not a field");
		q42.setCorrectAnswer("Compilation Error");
		q42.setImageHref("JavaQ42.png");

		questionsRepo.save(q42);

		Questions q43 = new Questions();
		q43.setQuestion("What is the numerical range of a char data type in Java?");
		Answers ansQ43A1 = new Answers(43,"0 to 256",1);
		Answers ansQ43A2 = new Answers(43,"-128 to 127",2);
		Answers ansQ43A3 = new Answers(43,"0 to 65535",3);
		Answers ansQ43A4 = new Answers(43,"0 to 32767",4);

		List<Answers> ansQ43List = new ArrayList<>();
		ansQ43List.add(ansQ43A1);
		ansQ43List.add(ansQ43A2);
		ansQ43List.add(ansQ43A3);
		ansQ43List.add(ansQ43A4);

		q43.setCorrectAnswerNum(3);
		q43.setAnswers(ansQ43List);
		q43.setExplanation("Char occupies 16-bit in memory, so it supports 216 i:e from 0 to 65535.");
		q43.setCorrectAnswer("0 to 65535");
		q43.setImageHref("");

		questionsRepo.save(q43);

		Questions q44 = new Questions();
		q44.setQuestion("Which class provides system independent server side implementation?");
		Answers ansQ44A1 = new Answers(44,"Server",1);
		Answers ansQ44A2 = new Answers(44,"ServerReader",2);
		Answers ansQ44A3 = new Answers(44,"Socket",3);
		Answers ansQ44A4 = new Answers(44,"ServerSocket",4);

		List<Answers> ansQ44List = new ArrayList<>();
		ansQ44List.add(ansQ44A1);
		ansQ44List.add(ansQ44A2);
		ansQ44List.add(ansQ44A3);
		ansQ44List.add(ansQ44A4);

		q44.setCorrectAnswerNum(4);
		q44.setAnswers(ansQ44List);
		q44.setExplanation("ServerSocket is a java.net class which provides system independent implementation of server side socket connection.");
		q44.setCorrectAnswer("ServerSocket");
		q44.setImageHref("");

		questionsRepo.save(q44);

		Questions q45 = new Questions();
		q45.setQuestion("What will be the output of the following Java program?");
		Answers ansQ45A1 = new Answers(45,"4 6.4",1);
		Answers ansQ45A2 = new Answers(45,"6.4 6",2);
		Answers ansQ45A3 = new Answers(45,"6.4 6.4",3);
		Answers ansQ45A4 = new Answers(45,"6 6",4);

		List<Answers> ansQ45List = new ArrayList<>();
		ansQ45List.add(ansQ45A1);
		ansQ45List.add(ansQ45A2);
		ansQ45List.add(ansQ45A3);
		ansQ45List.add(ansQ45A4);

		q45.setCorrectAnswerNum(1);
		q45.setAnswers(ansQ45List);
		q45.setExplanation("For obj.add(a,a); ,the function in line number 4 gets executed and value of x is 4. For the next function call, the function in line number 7 gets executed and value of y is 6.4. Output: 4 6.4");
		q45.setCorrectAnswer("4 6.4");
		q45.setImageHref("JavaQ45.png");

		questionsRepo.save(q45);

		Questions q46 = new Questions();
		q46.setQuestion("Which of the following is true about servlets?");
		Answers ansQ46A1 = new Answers(46,"Servlets can use the full functionality of the Java class libraries",1);
		Answers ansQ46A2 = new Answers(46,"Servlets execute within the address space of web server, platform independent and uses the functionality of java class libraries",2);
		Answers ansQ46A3 = new Answers(46,"Servlets execute within the address space of web server",3);
		Answers ansQ46A4 = new Answers(46,"Servlets are platform-independent because they are written in java",4);

		List<Answers> ansQ46List = new ArrayList<>();
		ansQ46List.add(ansQ46A1);
		ansQ46List.add(ansQ46A2);
		ansQ46List.add(ansQ46A3);
		ansQ46List.add(ansQ46A4);

		q46.setCorrectAnswerNum(2);
		q46.setAnswers(ansQ46List);
		q46.setExplanation("Servlets execute within the address space of a web server. Since it is written in java it is platform independent. The full functionality is available through libraries.");
		q46.setCorrectAnswer("Servlets execute within the address space of web server, platform independent and uses the functionality of java class libraries");
		q46.setImageHref("");

		questionsRepo.save(q46);

		
	}
}
