package com.xworkz.fooddelivary.tester;

import com.xworkz.fooddelivary.entity.CustomerEntity;
import com.xworkz.fooddelivary.repositary.CustomerRepository;
import com.xworkz.fooddelivary.repositary.CustomerRepositoryImpl;
import com.xworkz.fooddelivary.service.CustomerService;
import com.xworkz.fooddelivary.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerEntity entity = new CustomerEntity("Ramesh", "Rajajinagar", 9865247895l, 5, 30,
				"ramesh.xworkz@gmail.com");

		CustomerRepository repository = new CustomerRepositoryImpl();
		repository.save(entity);

		CustomerService service = new CustomerServiceImpl(repository);
		service.validateAndSave(entity);

	}

}
