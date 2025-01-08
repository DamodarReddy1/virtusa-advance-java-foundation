/**
 * 
 */
package com.virtusa.postConstructAndPreDestory.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.postConstructAndPreDestory.bean.HelloWorld;

/**
 * @author Damodar Reddy12:20:19 AMApr 23, 2020
 * HelloWorldMain.java
 */
public class HelloWorldMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();

	}

}
