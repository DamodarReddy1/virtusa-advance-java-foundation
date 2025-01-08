package com.virtusa.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.dao.CustomerDao;
import com.virtusa.model.Customer;

public class CustomerMain {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("customer.cfg.xml");

		CustomerDao customerDao = context.getBean(CustomerDao.class, "customerDao");

		Customer customer1 = (Customer) context.getBean("customer1");

		Customer customer2 = (Customer) context.getBean("customer2");

		customerDao.saveCustomer(customer1);
		customerDao.saveCustomer(customer2);

		//customerDao.updateCustomer(customer2);

		//customerDao.deleteCustomer(customer2);
	}

}
