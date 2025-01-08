package com.virtusa.casestudy2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {

	@Autowired
	@Qualifier("iOS")
	MobileProcesser mobileProcesser;
	
	public MobileProcesser getMobileProcesser() {
		return mobileProcesser;
	}

	public void setMobileProcesser(MobileProcesser mobileProcesser) {
		this.mobileProcesser = mobileProcesser;
	}

	public void config()
	{
		System.out.println("octa core , 4 gb ram");
		mobileProcesser.process();
	}
}
