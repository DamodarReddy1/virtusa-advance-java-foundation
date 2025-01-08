/**
 * 
 */
package com.virtusa.ConstructorJavaBasedConfig.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.virtusa.ConstructorJavaBasedConfig.bean.Answer;
import com.virtusa.ConstructorJavaBasedConfig.bean.Question;

/**
 * @author Damodar Reddy10:07:29 PMApr 22, 2020
 * QuestionConfig.java
 */
@Configuration
public class QuestionConfig {
	List <Answer> answers =new ArrayList<Answer>();
	
//	public 	List <Answer> getAnswers()
//	{
//		answers.add(answer1());
//		answers.add(answer2());
//		return answers;
//		
//	}	

	   @Bean
	   @Lazy
	   public Question question(){
		   answers.add(answer1());
		   answers.add(answer2());
	      return new Question(1, "What is java",  answers);
	   }
	   @Bean(name="answer1")
	   @Lazy
	   public Answer answer1(){
	      return new Answer(101, "Java is programming language","Damodar Reddy");
	   }
	@Bean(name="answer2")
	public Answer answer2(){
	      return new Answer(101, "Java is platform independent language","Anwar");
	   }
}
