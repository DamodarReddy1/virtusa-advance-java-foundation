/**
 * 
 */
package com.virtusa.casestudy2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class Snapdragon implements MobileProcesser{

	public void process() {
		System.out.println("World best Processer");
	}

	
}
