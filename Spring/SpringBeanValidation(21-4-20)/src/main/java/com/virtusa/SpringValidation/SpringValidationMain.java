/**
 * 
 */
package com.virtusa.SpringValidation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.FieldError;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

/**
 * @author Damodar Reddy7:59:31 PMApr 21, 2020
 * SpringValidationMain.java
 */
public class SpringValidationMain {

	public static void main(String... args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("springuser.xml");
		User user = (User)context.getBean("user");
		UserValidator userValidator = (UserValidator)context.getBean("userValidator");
		Map<String,Object> map = new HashMap<String,Object>(); 
		MapBindingResult err = new MapBindingResult(map, User.class.getName());
		userValidator.validate(user, err);
		System.out.println(err.getErrorCount());

		if( err.hasErrors())
		{
			List<FieldError> list = err.getFieldErrors();
			for(ObjectError objErr : list){
				System.out.println(objErr);
			}
		} 

		
		

		//		DataBinder binder = new DataBinder(user);
//		binder.setValidator(new UserValidator());
//		// bind to the target object
//		binder.bind(propertyValues);
//		// validate the target object
//		binder.validate();
//		// get BindingResult that includes any validation errors
//		BindingResult results = binder.getBindingResult();
	}
}
