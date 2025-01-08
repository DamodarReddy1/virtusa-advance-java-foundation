/**
 * 
 */
package com.virtusa.ConstructorJavaBasedConfig.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.virtusa.ConstructorJavaBasedConfig.bean.Answer;
import com.virtusa.ConstructorJavaBasedConfig.bean.Question;
import com.virtusa.ConstructorJavaBasedConfig.config.QuestionConfig;

/**
 * @author Damodar Reddy9:58:02 PMApr 22, 2020
 * QuestionMain.java
 */
public class QuestionMain {


	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(QuestionConfig.class); 
		QuestionConfig qst = new QuestionConfig();
		Answer answer1 = (Answer) ctx.getBean("answer1");
		Answer answer2 = (Answer) ctx.getBean("answer2");
		Question question = ctx.getBean(Question.class);
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(question);

	}

}
