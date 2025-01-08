/**
 * 
 */
package com.virtusa.SetterJavaBasedConfig.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.virtusa.SetterJavaBasedConfig.bean.Answer;
import com.virtusa.SetterJavaBasedConfig.bean.Question;
import com.virtusa.SetterJavaBasedConfig.config.QuestionConfig;

/**
 * @author Damodar Reddy9:58:02 PMApr 22, 2020
 * QuestionMain.java
 */
public class QuestionMain {

	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(QuestionConfig.class);  
		  Question question = ctx.getBean(Question.class);
		  question.setId(1);
		  question.setName("What is java?");
		  List<Answer> answers = new ArrayList<Answer>();
		  Answer answer1 = ctx.getBean(Answer.class);
		  answer1.setBy("Damodar Reddy");
		  answer1.setId(101);
		  answer1.setName("Java is platform independent language");
		  
		  Answer answer2 = ctx.getBean(Answer.class);
		  answer1.setBy("Chaithanya");
		  answer1.setId(102);
		  answer1.setName("Java is programming language");
		  answers.add(answer1);
		  answers.add(answer2);
		  question.setAnswers(answers);
		  System.out.println(question);

	}

}
