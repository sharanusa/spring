package com.xworkz.fooddelivary.service;

import com.xworkz.fooddelivary.entity.CustomerEntity;
import com.xworkz.fooddelivary.repositary.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository repository;

	public CustomerServiceImpl(CustomerRepository repository) {
		System.out.println("created" + this.getClass().getName());
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not is valid");
		}
		return false;
	}

}
