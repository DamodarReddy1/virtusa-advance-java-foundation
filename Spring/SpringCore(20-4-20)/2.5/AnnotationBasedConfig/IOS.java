/**
 * 
 */
package com.virtusa.casestudy2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Damodar Reddy10:13:06 AMApr 20, 2020
 * IOS.java
 */

@Component("iOS")
public class IOS implements MobileProcesser{

	public void process() {

		System.out.println("World very very best Processer");
	}

	
}
