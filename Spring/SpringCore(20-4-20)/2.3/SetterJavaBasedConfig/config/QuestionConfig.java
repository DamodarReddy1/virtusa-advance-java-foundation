/**
 * 
 */
package com.virtusa.SetterJavaBasedConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.virtusa.SetterJavaBasedConfig.bean.Answer;
import com.virtusa.SetterJavaBasedConfig.bean.Question;

/**
 * @author Damodar Reddy10:07:29 PMApr 22, 2020
 * QuestionConfig.java
 */
@Configuration
public class QuestionConfig {
	@Bean 
	   public Question question(){
	      return new Question();
	   }
	@Bean 
	   public Answer answer(){
	      return new Answer();
	   }

}
