/**
 * 
 */
package com.virtusa.casestudy2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CaseStudyMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung samsung = applicationContext.getBean(Samsung.class);
		samsung.config();
	}
}
