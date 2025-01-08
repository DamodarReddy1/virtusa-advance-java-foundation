/**
 * 
 */
package com.virtusa.SpringValidation;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Damodar Reddy7:44:45 PMApr 21, 2020
 * UserValidator.java
 */
public class UserValidator implements Validator {

	private Resource location;
    @Required
    public void setLocation(Resource location) {
            this.location = location;
    }
	@Override
	public boolean supports(Class<?> clazz) {
		
		return User.class.equals(clazz);
	}

	
	@Override
	public void validate(Object ob, Errors err) {
		User user = (User)ob;
		Properties props=null;
		try {
			 props = PropertiesLoaderUtils.loadProperties(location);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String msg1 = props.getProperty("errormsg.name");
		
		ValidationUtils.rejectIfEmpty(err, "name", "errormsg.name",msg1);
		
		if(user.getAge()<18){
			String msg2 = props.getProperty("errormsg.age");
			err.rejectValue("age","errormsg.age",msg2);
		}
		
	}

}
