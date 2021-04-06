package com.xworkz.fooddelivary.tester;

import com.xworkz.fooddelivary.constants.VendorType;
import com.xworkz.fooddelivary.entity.HotelVendorEntity;
import com.xworkz.fooddelivary.repositary.HotelVendorRepository;
import com.xworkz.fooddelivary.repositary.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivary.service.HotelVendorService;
import com.xworkz.fooddelivary.service.HotelVendorServiceImpl;

public class HotelVendorTester {
	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("Ramesh", "Banglore", 4, 9658462578l,
				VendorType.PRIVATE_LIMITED, "Navarang Theater", "ramesh.xworkz@gmail.com");

		HotelVendorRepository repository = new HotelVendorRepositoryImpl();
		repository.save(entity);

		HotelVendorService vendorService = new HotelVendorServiceImpl(repository);
		vendorService.validateAndSave(entity);
	}

}
