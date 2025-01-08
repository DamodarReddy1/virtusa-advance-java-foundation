/**
 * 
 */
package com.virtusa.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.entity.Mobile;
import com.virtusa.entity.OperatingSystem;

/**
 * @author Damodar Reddy10:09:45 PMApr 8, 2020
 * MobileMain.java
 */
public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setImeiNumber(101);
		mobile.setMobileName("RealMe3 Pro");
		mobile.setRam("4Gb");
		OperatingSystem os=new OperatingSystem();
		os.setOsName("Android");
		os.setVersion(10);
		mobile.setOperatingSytem(os);
		Configuration configuration = new Configuration();
		configuration.configure("hibernatecfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(mobile);
		t.commit();
		session.close();
	}

}
