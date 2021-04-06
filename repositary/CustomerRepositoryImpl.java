package com.xworkz.fooddelivary.repositary;

import com.xworkz.fooddelivary.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save" + entity);

	}
}