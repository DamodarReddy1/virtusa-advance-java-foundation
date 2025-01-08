package com.virtusa.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.virtusa.model.Customer;

public class CustomerDao {
	
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Transactional
	public void saveCustomer(Customer customer) {
		template.save(customer);

	}
	
	@Transactional
	public void updateCustomer(Customer customer) {
		template.update(customer);
	}

	@Transactional
	public void deleteCustomer(Customer customer) {
		template.delete(customer);
	}

}
